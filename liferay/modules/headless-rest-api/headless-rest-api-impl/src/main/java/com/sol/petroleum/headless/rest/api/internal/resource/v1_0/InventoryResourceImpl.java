package com.sol.petroleum.headless.rest.api.internal.resource.v1_0;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import com.liferay.commerce.inventory.model.CommerceInventoryWarehouse;
import com.liferay.commerce.inventory.service.CommerceInventoryWarehouseItemService;
import com.liferay.commerce.inventory.service.CommerceInventoryWarehouseService;
import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.service.CPDefinitionService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.sol.petroleum.headless.audit.model.apiAudit;
import com.sol.petroleum.headless.audit.service.apiAuditLocalService;
import com.sol.petroleum.headless.rest.api.dto.v1_0.Inventory;
import com.sol.petroleum.headless.rest.api.dto.v1_0.InventoryArray;
import com.sol.petroleum.headless.rest.api.resource.v1_0.InventoryResource;
import com.sol.petroleum.master.data.service.inventoryLocalService;

/**
 * The purpose of this class is to handle operations for Post Inventory API
 * Accessibility : When inventory headless api call, then flow will come to the
 * respective methods of this class.
 *
 * @author Chanchal Singla
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/inventory.properties", scope = ServiceScope.PROTOTYPE, service = InventoryResource.class)
public class InventoryResourceImpl extends BaseInventoryResourceImpl {

	public static Log _log = LogFactoryUtil.getLog(InventoryResourceImpl.class);

	@Context // Injecting Response and Request object
	private HttpServletResponse response;
	@Context
	private HttpServletRequest request;

	@Override
	public Response createInventory(Inventory inventory) throws Exception {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10);
		InventoryArray[] invArray = new InventoryArray[100];
		invArray = inventory.getInventoryArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		for (InventoryArray inventoryArray : invArray) {
			try {
				if (!isAuthenticated(request)) {
					response.setStatus(Response.Status.FORBIDDEN.getStatusCode());
				} else if (inventoryArray.getItemNumber().isEmpty()) {
					response.setStatus(Response.Status.NO_CONTENT.getStatusCode());
				} else if (System.currentTimeMillis() - session.getLastAccessedTime() > session.getMaxInactiveInterval()
						* 1000) {
					response.setStatus(Response.Status.REQUEST_TIMEOUT.getStatusCode());
				} else {
					HttpURLConnection connect = (HttpURLConnection) new URL(SOLHeadlessRestAPIConstant.INVENTORYURL).openConnection();
					connect.setConnectTimeout(5000);
					connect.setReadTimeout(5000);
					connect.setRequestMethod("POST");
					int responseCode = connect.getResponseCode();
					if (responseCode == 598) {
						response.setStatus(responseCode);
					} else {
						performInventoryPostAction(inventoryArray, inventory, inventory.getUuid());
						response.setStatus(Response.Status.OK.getStatusCode());
						jsonObject.put("uuid", inventory.getUuid());
						jsonObject.put("status", response.getStatus());
					}
				}
			} catch (Exception e) {
				response.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			}

			jsonObject.put("status", response.getStatus());
		}
		return Response.status(response.getStatus()).entity(jsonObject.toString()).type(MediaType.APPLICATION_JSON)
				.build();
	}

	/**
	 * This method is used to update or add APIAudits,InventoryAudit and
	 * ciwarehouseitem via CPDefinition ExternalReferenceCode, ciwarehouse
	 * ExternalReferenceCode and uuid
	 *
	 * @param inventoryArray : holds inventory array elements
	 * @param inventory      : holds inventory object
	 * @param uuid           : holds the apiAudit uuid
	 */
	private void performInventoryPostAction(InventoryArray inventoryArray, Inventory inventory, String uuid) throws PortalException {
		CPDefinition cpDefinition = null;
		CommerceInventoryWarehouse commerceInventoryWarehouse = null;

		try {
			cpDefinition = _cpDefinitionService.fetchCPDefinitionByCProductExternalReferenceCode(
					inventoryArray.getItemNumber(), contextCompany.getCompanyId());
		} catch (Exception e) {
			_log.error("Error while fetching cpDefinition", e);
		}

		try {
			commerceInventoryWarehouse = _commerceInventoryWarehouseService
					.fetchByExternalReferenceCode(inventoryArray.getLocationCode(), contextCompany.getCompanyId());
		} catch (Exception e) {
			_log.error("Error while fetching commerceInventoryWarehouse", e);
		}

		if (Validator.isNotNull(cpDefinition)) {
			_apiAuditLocalService.updateApiAudit(uuid,inventory.toString() );
			_inventoryLocalService.addOrUpdateInventoryAudit(inventoryArray.getCompanyId(),
					inventoryArray.getQtyOnOrder(), inventoryArray.getQtyBackOrdered(),
					inventoryArray.getQtyDropShipped(), inventoryArray.getQtyInUse(), inventoryArray.getQtyReturned(),
					inventoryArray.getQtyDamaged(), inventoryArray.getQtyAllocated(), inventoryArray.getQtySold(),
					inventoryArray.getQtyCommitted(), inventoryArray.getInactive(), inventoryArray.getInterId(),
					inventoryArray.getItemNumber(), inventoryArray.getQtyInService(), inventoryArray.getLocationCode(),
					inventoryArray.getLocationDesc(), inventoryArray.getQtyOnHand());

			try {
				if (Validator.isNull(commerceInventoryWarehouse)) {
					_commerceInventoryWarehouseItemService.addCommerceInventoryWarehouseItem(
							inventoryArray.getItemNumber(),
							commerceInventoryWarehouse.getCommerceInventoryWarehouseId(), cpDefinition.getName(),
							inventoryArray.getQtyOnHand());
				} else {
					_commerceInventoryWarehouseItemService.addOrUpdateCommerceInventoryWarehouseItem(
							commerceInventoryWarehouse.getCommerceInventoryWarehouseId(), cpDefinition.getName(),
							inventoryArray.getQtyOnHand());

				}
			} catch (Exception e) {
				_log.error("Error While Adding or updation ciwarehouseitem", e);
			}

		}
	}

	private boolean isAuthenticated(HttpServletRequest request) {
		String authHeader = request.getHeader("Authorization");
		if (authHeader != null && authHeader.startsWith("Basic ")) {
			String credentials = new String(Base64.getDecoder().decode(authHeader.substring(6)));
			String[] parts = credentials.split(":");
			if (parts.length == 2) {
				String username = parts[0];
				String password = parts[1];
				if ("test@liferay.com".equals(username) && "test@".equals(password)) {
					return true;
				}
			}
		}
		return false;
	}

	@Reference
	private apiAuditLocalService _apiAuditLocalService;

	@Reference
	private inventoryLocalService _inventoryLocalService;

	@Reference
	private CommerceInventoryWarehouseItemService _commerceInventoryWarehouseItemService;

	@Reference
	private CommerceInventoryWarehouseService _commerceInventoryWarehouseService;

	@Reference
	private CPDefinitionService _cpDefinitionService;

}