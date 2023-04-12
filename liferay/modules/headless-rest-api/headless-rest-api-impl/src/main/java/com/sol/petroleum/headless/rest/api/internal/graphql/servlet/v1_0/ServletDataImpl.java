package com.sol.petroleum.headless.rest.api.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import com.sol.petroleum.headless.rest.api.internal.graphql.mutation.v1_0.Mutation;
import com.sol.petroleum.headless.rest.api.internal.graphql.query.v1_0.Query;
import com.sol.petroleum.headless.rest.api.resource.v1_0.InventoryResource;
import com.sol.petroleum.headless.rest.api.resource.v1_0.ItemResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Chanchal
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setInventoryResourceComponentServiceObjects(
			_inventoryResourceComponentServiceObjects);
		Mutation.setItemResourceComponentServiceObjects(
			_itemResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/headless-rest-api-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<InventoryResource>
		_inventoryResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ItemResource>
		_itemResourceComponentServiceObjects;

}