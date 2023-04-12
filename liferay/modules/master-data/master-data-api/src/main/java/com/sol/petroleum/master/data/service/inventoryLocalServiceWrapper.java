/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sol.petroleum.master.data.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link inventoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see inventoryLocalService
 * @generated
 */
public class inventoryLocalServiceWrapper
	implements inventoryLocalService, ServiceWrapper<inventoryLocalService> {

	public inventoryLocalServiceWrapper() {
		this(null);
	}

	public inventoryLocalServiceWrapper(
		inventoryLocalService inventoryLocalService) {

		_inventoryLocalService = inventoryLocalService;
	}

	/**
	 * Adds the inventory to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect inventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventory the inventory
	 * @return the inventory that was added
	 */
	@Override
	public com.sol.petroleum.master.data.model.inventory addinventory(
		com.sol.petroleum.master.data.model.inventory inventory) {

		return _inventoryLocalService.addinventory(inventory);
	}

	@Override
	public com.sol.petroleum.master.data.model.inventory
		addOrUpdateInventoryAudit(
			long companyId, int qtyOnOrder, int qtyBackOrdered,
			int qtyDropShipped, int qtyInUse, int qtyReturned, int qtyDamaged,
			int qtyAllocated, int qtySold, int qtyCommitted, int inactive,
			String interId, String itemNumber, int qtyInService,
			String locationCode, String locationDesc, int qtyOnHand) {

		return _inventoryLocalService.addOrUpdateInventoryAudit(
			companyId, qtyOnOrder, qtyBackOrdered, qtyDropShipped, qtyInUse,
			qtyReturned, qtyDamaged, qtyAllocated, qtySold, qtyCommitted,
			inactive, interId, itemNumber, qtyInService, locationCode,
			locationDesc, qtyOnHand);
	}

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param masterDataInventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	@Override
	public com.sol.petroleum.master.data.model.inventory createinventory(
		long masterDataInventoryId) {

		return _inventoryLocalService.createinventory(masterDataInventoryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the inventory from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect inventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventory the inventory
	 * @return the inventory that was removed
	 */
	@Override
	public com.sol.petroleum.master.data.model.inventory deleteinventory(
		com.sol.petroleum.master.data.model.inventory inventory) {

		return _inventoryLocalService.deleteinventory(inventory);
	}

	/**
	 * Deletes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect inventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws PortalException if a inventory with the primary key could not be found
	 */
	@Override
	public com.sol.petroleum.master.data.model.inventory deleteinventory(
			long masterDataInventoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.deleteinventory(masterDataInventoryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _inventoryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _inventoryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inventoryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _inventoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sol.petroleum.master.data.model.impl.inventoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _inventoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sol.petroleum.master.data.model.impl.inventoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _inventoryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _inventoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _inventoryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.sol.petroleum.master.data.model.inventory fetchinventory(
		long masterDataInventoryId) {

		return _inventoryLocalService.fetchinventory(masterDataInventoryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _inventoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _inventoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sol.petroleum.master.data.model.impl.inventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @return the range of inventories
	 */
	@Override
	public java.util.List<com.sol.petroleum.master.data.model.inventory>
		getinventories(int start, int end) {

		return _inventoryLocalService.getinventories(start, end);
	}

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	@Override
	public int getinventoriesCount() {
		return _inventoryLocalService.getinventoriesCount();
	}

	/**
	 * Returns the inventory with the primary key.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws PortalException if a inventory with the primary key could not be found
	 */
	@Override
	public com.sol.petroleum.master.data.model.inventory getinventory(
			long masterDataInventoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.getinventory(masterDataInventoryId);
	}

	@Override
	public com.sol.petroleum.master.data.model.inventory
		getInventoryByLocationCode(String locationCode) {

		return _inventoryLocalService.getInventoryByLocationCode(locationCode);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _inventoryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the inventory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect inventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventory the inventory
	 * @return the inventory that was updated
	 */
	@Override
	public com.sol.petroleum.master.data.model.inventory updateinventory(
		com.sol.petroleum.master.data.model.inventory inventory) {

		return _inventoryLocalService.updateinventory(inventory);
	}

	@Override
	public inventoryLocalService getWrappedService() {
		return _inventoryLocalService;
	}

	@Override
	public void setWrappedService(inventoryLocalService inventoryLocalService) {
		_inventoryLocalService = inventoryLocalService;
	}

	private inventoryLocalService _inventoryLocalService;

}