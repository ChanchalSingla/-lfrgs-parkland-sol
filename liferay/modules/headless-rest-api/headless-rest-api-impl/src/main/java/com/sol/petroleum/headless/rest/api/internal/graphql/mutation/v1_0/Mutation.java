package com.sol.petroleum.headless.rest.api.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import com.sol.petroleum.headless.rest.api.dto.v1_0.Inventory;
import com.sol.petroleum.headless.rest.api.dto.v1_0.Item;
import com.sol.petroleum.headless.rest.api.resource.v1_0.InventoryResource;
import com.sol.petroleum.headless.rest.api.resource.v1_0.ItemResource;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setInventoryResourceComponentServiceObjects(
		ComponentServiceObjects<InventoryResource>
			inventoryResourceComponentServiceObjects) {

		_inventoryResourceComponentServiceObjects =
			inventoryResourceComponentServiceObjects;
	}

	public static void setItemResourceComponentServiceObjects(
		ComponentServiceObjects<ItemResource>
			itemResourceComponentServiceObjects) {

		_itemResourceComponentServiceObjects =
			itemResourceComponentServiceObjects;
	}

	@GraphQLField
	public Response createInventory(
			@GraphQLName("inventory") Inventory inventory)
		throws Exception {

		return _applyComponentServiceObjects(
			_inventoryResourceComponentServiceObjects,
			this::_populateResourceContext,
			inventoryResource -> inventoryResource.createInventory(inventory));
	}

	@GraphQLField
	public Response createItem(@GraphQLName("item") Item item)
		throws Exception {

		return _applyComponentServiceObjects(
			_itemResourceComponentServiceObjects,
			this::_populateResourceContext,
			itemResource -> itemResource.createItem(item));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(InventoryResource inventoryResource)
		throws Exception {

		inventoryResource.setContextAcceptLanguage(_acceptLanguage);
		inventoryResource.setContextCompany(_company);
		inventoryResource.setContextHttpServletRequest(_httpServletRequest);
		inventoryResource.setContextHttpServletResponse(_httpServletResponse);
		inventoryResource.setContextUriInfo(_uriInfo);
		inventoryResource.setContextUser(_user);
		inventoryResource.setGroupLocalService(_groupLocalService);
		inventoryResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(ItemResource itemResource)
		throws Exception {

		itemResource.setContextAcceptLanguage(_acceptLanguage);
		itemResource.setContextCompany(_company);
		itemResource.setContextHttpServletRequest(_httpServletRequest);
		itemResource.setContextHttpServletResponse(_httpServletResponse);
		itemResource.setContextUriInfo(_uriInfo);
		itemResource.setContextUser(_user);
		itemResource.setGroupLocalService(_groupLocalService);
		itemResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<InventoryResource>
		_inventoryResourceComponentServiceObjects;
	private static ComponentServiceObjects<ItemResource>
		_itemResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}