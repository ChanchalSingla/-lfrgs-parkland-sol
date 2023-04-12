package com.sol.petroleum.headless.rest.api.internal.resource.v1_0;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.service.AssetCategoryLocalService;
import com.liferay.asset.kernel.service.AssetVocabularyLocalService;
import com.liferay.commerce.inventory.service.CommerceInventoryWarehouseItemService;
import com.liferay.commerce.inventory.service.CommerceInventoryWarehouseService;
import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.model.CPDefinitionLocalization;
import com.liferay.commerce.product.model.CPTaxCategory;
import com.liferay.commerce.product.model.CommerceCatalog;
import com.liferay.commerce.product.service.CPDefinitionLocalServiceUtil;
import com.liferay.commerce.product.service.CPDefinitionService;
import com.liferay.commerce.product.service.CPTaxCategoryLocalServiceUtil;
import com.liferay.commerce.product.service.CPTaxCategoryService;
import com.liferay.commerce.product.service.CommerceCatalogLocalService;
import com.liferay.commerce.product.service.persistence.CPDefinitionLocalizationUtil;
import com.liferay.headless.commerce.core.util.DateConfig;
import com.liferay.headless.commerce.core.util.ServiceContextHelper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.sol.petroleum.headless.audit.service.apiAuditLocalService;
import com.sol.petroleum.headless.rest.api.dto.v1_0.Item;
import com.sol.petroleum.headless.rest.api.dto.v1_0.ItemsArray;
import com.sol.petroleum.headless.rest.api.resource.v1_0.ItemResource;
import com.sol.petroleum.master.data.service.itemLocalService;

/**
 * The purpose of this class is to handle operations for Post item API
 * Accessibility : When item headless api call, then flow will come to the
 * respective methods of this class.
 *
 * @author Chanchal Singla
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/item.properties", scope = ServiceScope.PROTOTYPE, service = ItemResource.class)
public class ItemResourceImpl extends BaseItemResourceImpl {

	public static Log _log = LogFactoryUtil.getLog(ItemResourceImpl.class);

	@Context // Injecting Response and Request object
	private HttpServletResponse response;
	@Context
	private HttpServletRequest request;

	@Override
	public Response createItem(Item item) throws Exception {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10);
		int requestStatus = 0;
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		ItemsArray[] itemArray = new ItemsArray[1000];
		itemArray = item.getItemsArray();
		for (ItemsArray itemsArray : itemArray) {
			try {
				if (!isAuthenticated(request)) {
					response.setStatus(Response.Status.FORBIDDEN.getStatusCode());
					requestStatus = Response.Status.FORBIDDEN.getStatusCode();
				} else if (item.getUuid().isEmpty()) {
					response.setStatus(Response.Status.NO_CONTENT.getStatusCode());
					requestStatus = Response.Status.NO_CONTENT.getStatusCode();

				} else if (System.currentTimeMillis() - session.getLastAccessedTime() > session.getMaxInactiveInterval()
						* 1000) {
					response.setStatus(Response.Status.REQUEST_TIMEOUT.getStatusCode());
					requestStatus = Response.Status.REQUEST_TIMEOUT.getStatusCode();
				} else {
					HttpURLConnection connect = (HttpURLConnection) new URL(SOLHeadlessRestAPIConstant.ITEMURL).openConnection();
					connect.setConnectTimeout(5000);
					connect.setReadTimeout(5000);
					connect.setRequestMethod("POST");
					int responseCode = connect.getResponseCode();
					if (responseCode == 598) {
						requestStatus = responseCode;
						response.setStatus(responseCode);
					} else {
						response.setStatus(Response.Status.OK.getStatusCode());
						requestStatus = Response.Status.OK.getStatusCode();
					}
				}
			} catch (Exception e) {
				response.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
				requestStatus = Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
			}

			if (requestStatus == 200) {
				_addOrUpdateProduct(item, itemsArray);
				jsonObject.put("uuid", item.getUuid());
			} else {
				jsonObject.put("status", String.valueOf(requestStatus));
			}
		}
		return Response.status(requestStatus).entity(jsonObject.toString()).type(MediaType.APPLICATION_JSON).build();
	}

	/**
	 * This method is used to add or update in APIAudit,itemAudit and cpDefinition
	 * via CPDefinition ExternalReferenceCode, CPTaxCategory ExternalReferenceCode
	 * and uuid
	 *
	 * @param itemsArray : holds item array elements
	 * @param itemsArray : holds item object
	 */
	private void _addOrUpdateProduct(Item item, ItemsArray itemsArray) throws PortalException {

		_apiAuditLocalService.updateApiAudit(item.getUuid(), item.toString());

		_itemLocalService.addOrUpdtaeItemAudit(itemsArray.getCategory(), itemsArray.getInactive(),
				itemsArray.getInterId(), itemsArray.getItemNumber(), itemsArray.getItemTaxSchId(),
				itemsArray.getItemType(), itemsArray.getSubCategory(), itemsArray.getTaxOptions(),
				itemsArray.getTitle(), itemsArray.getUOfMSchedule(), itemsArray.getVisibility());

		List<CommerceCatalog> commerceCatalog = null;

		DynamicQuery dq = _commerceCatalogLocalService.dynamicQuery();
		dq.add(RestrictionsFactoryUtil.eq("name", itemsArray.getCategory()));
		commerceCatalog = _commerceCatalogLocalService.dynamicQuery(dq);

		ServiceContext serviceContext = _serviceContextHelper.getServiceContext(commerceCatalog.get(0).getGroupId());

		Calendar displayCalendar = CalendarFactoryUtil.getCalendar(serviceContext.getTimeZone());

		DateConfig displayDateConfig = new DateConfig(displayCalendar);

		Calendar expirationCalendar = CalendarFactoryUtil.getCalendar(serviceContext.getTimeZone());

		expirationCalendar.add(Calendar.MONTH, 1);

		DateConfig expirationDateConfig = new DateConfig(expirationCalendar);

		String cpExternalRefCode = itemsArray.getItemNumber();
		int inactive = itemsArray.getInactive();
		String title = itemsArray.getTitle();

		Map<Locale, String> itemName = new HashMap<>();
		itemName.put(serviceContext.getLocale(), title);

		Map<Locale, String> taxTitle = new HashMap<>();
		taxTitle.put(serviceContext.getLocale(), itemsArray.getItemTaxSchId());

		int itemStatus = GetterUtil.getInteger(inactive);
		if (itemStatus == 0) {
			serviceContext.setWorkflowAction(WorkflowConstants.STATUS_APPROVED);
		} else if (itemStatus == 1) {
			serviceContext.setWorkflowAction(WorkflowConstants.STATUS_PENDING);
		} else if (itemStatus == 2) {
			serviceContext.setWorkflowAction(WorkflowConstants.STATUS_DRAFT);
		} else {
			throw new IllegalArgumentException("ItemStatus can only take 0, 1 or 2 as an argument values");
		}

		long cpTaxCategoryId = 0l;
		if (Validator.isNotNull(taxTitle)) {
			try {
				List<CPTaxCategory> cpTaxCategories = null;

				DynamicQuery dqTax = CPTaxCategoryLocalServiceUtil.dynamicQuery();
				dq.add(RestrictionsFactoryUtil.eq("externalReferenceCode", itemsArray.getItemTaxSchId()));
				cpTaxCategories = CPTaxCategoryLocalServiceUtil.dynamicQuery(dqTax);
				cpTaxCategoryId = cpTaxCategories.get(0).getCPTaxCategoryId();
			} catch (Exception e) {
				_log.error("Error While getting cpTaxCategory", e);
			}
		}

		AssetVocabulary assetVocabulary = null;
		AssetCategory assetCategory = null;
		AssetCategory subAssetCategory = null;
		long[] assetCategoryIds = new long[3];

		try {
			assetVocabulary = _assetVocabularyLocalService.fetchGroupVocabulary(serviceContext.getScopeGroupId(),SOLHeadlessRestAPIConstant.VOCABULARY);
			if (Validator.isNotNull(assetVocabulary)) {
				assetCategory = _assetCategoryLocalService.fetchCategory(serviceContext.getScopeGroupId(), 0,
						itemsArray.getCategory(), assetVocabulary.getVocabularyId());
				assetCategoryIds[0] = assetCategory.getCategoryId();
				if (Validator.isNotNull(assetCategory)) {
					subAssetCategory = _assetCategoryLocalService.fetchCategory(serviceContext.getScopeGroupId(),
							assetCategory.getCategoryId(), itemsArray.getSubCategory(),
							assetVocabulary.getVocabularyId());
					assetCategoryIds[1] = subAssetCategory.getCategoryId();
				}
			}
		} catch (Exception e) {
			_log.error("Error While Getting assetCategory", e);
		}

		AssetVocabulary assetVocabularyCustomerType = null;
		AssetCategory assetCategoryCustomerType = null;

		try {
			assetVocabularyCustomerType = _assetVocabularyLocalService
					.fetchGroupVocabulary(serviceContext.getScopeGroupId(),SOLHeadlessRestAPIConstant.CUSTOMERTYPE);
			if (Validator.isNotNull(assetVocabularyCustomerType)) {
				assetCategoryCustomerType = _assetCategoryLocalService.fetchCategory(serviceContext.getScopeGroupId(),
						0, itemsArray.getVisibility(), assetVocabularyCustomerType.getVocabularyId());
				assetCategoryIds[2] = assetCategoryCustomerType.getCategoryId();
			}
		} catch (Exception e) {
			_log.error("Error While Getting assetCustomerType", e);
		}

		serviceContext.setAssetCategoryIds(assetCategoryIds);

		boolean ignoreSKUCombinations = true;
		boolean taxExempt = true;
		boolean neverExpire = true;

		CPDefinition cpDefinition = null;
		if (Validator.isNotNull(cpExternalRefCode)) {
			try {
				cpDefinition = _cpDefinitionService.fetchCPDefinitionByCProductExternalReferenceCode(cpExternalRefCode,
						serviceContext.getCompanyId());
			} catch (Exception e) {
				_log.error("Error while getting cpDefinition", e);
			}
		}

		try {

			if (Validator.isNotNull(cpDefinition)) {
				cpDefinition.setCPTaxCategoryId(cpTaxCategoryId);
				cpDefinition.setStatus(itemStatus);
				CPDefinitionLocalServiceUtil.updateCPDefinition(cpDefinition);

				CPDefinitionLocalization cpDefinitionLocalization = CPDefinitionLocalizationUtil
						.fetchByCPDefinitionId_First(cpDefinition.getCPDefinitionId(), null);
				cpDefinitionLocalization.setName(title);
				CPDefinitionLocalizationUtil.update(cpDefinitionLocalization);
			} else {
				cpDefinition = _cpDefinitionService.addOrUpdateCPDefinition(cpExternalRefCode,
						commerceCatalog.get(0).getGroupId(), itemName, null, null, null, null, null, null,
						SOLHeadlessRestAPIConstant.PRODUCTTYPE, ignoreSKUCombinations, false, false, false, 0D, 0D, 0D,
						0D, 0D, cpTaxCategoryId, taxExempt, false, null, true, displayDateConfig.getMonth(),
						displayDateConfig.getDay(), displayDateConfig.getYear(), displayDateConfig.getHour(),
						displayDateConfig.getMinute(), expirationDateConfig.getMonth(), expirationDateConfig.getDay(),
						expirationDateConfig.getYear(), expirationDateConfig.getHour(),
						expirationDateConfig.getMinute(), neverExpire, title, false, 0, null, null, 0L, itemStatus,
						serviceContext);
			}
		} catch (PortalException e) {
			_log.error("Error While performing addOrUpdateCPDefinition", e);
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
	private AssetCategoryLocalService _assetCategoryLocalService;

	@Reference
	private AssetVocabularyLocalService _assetVocabularyLocalService;

	@Reference
	private CommerceCatalogLocalService _commerceCatalogLocalService;

	@Reference
	private CPDefinitionService _cpDefinitionService;

	@Reference
	private Portal _portal;

	@Reference
	private ServiceContextHelper _serviceContextHelper;

	@Reference
	private apiAuditLocalService _apiAuditLocalService;

	@Reference
	private itemLocalService _itemLocalService;

	@Reference
	private CommerceInventoryWarehouseService _commerceInventoryWarehouseService;

	@Reference
	private CommerceInventoryWarehouseItemService _commerceInventoryWarehouseItemService;

	@Reference
	private CPTaxCategoryService _cpTaxCategoryService;

}