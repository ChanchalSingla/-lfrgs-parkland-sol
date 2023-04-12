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
 * Provides a wrapper for {@link itemLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see itemLocalService
 * @generated
 */
public class itemLocalServiceWrapper
	implements itemLocalService, ServiceWrapper<itemLocalService> {

	public itemLocalServiceWrapper() {
		this(null);
	}

	public itemLocalServiceWrapper(itemLocalService itemLocalService) {
		_itemLocalService = itemLocalService;
	}

	/**
	 * Adds the item to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect itemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param item the item
	 * @return the item that was added
	 */
	@Override
	public com.sol.petroleum.master.data.model.item additem(
		com.sol.petroleum.master.data.model.item item) {

		return _itemLocalService.additem(item);
	}

	@Override
	public com.sol.petroleum.master.data.model.item addOrUpdtaeItemAudit(
		String category, int inactive, String interId, String itemNumber,
		String itemTaxSchId, int itemType, String subCategory, int taxOptions,
		String title, String uOfMSchedule, String visibility) {

		return _itemLocalService.addOrUpdtaeItemAudit(
			category, inactive, interId, itemNumber, itemTaxSchId, itemType,
			subCategory, taxOptions, title, uOfMSchedule, visibility);
	}

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param masterDataItemId the primary key for the new item
	 * @return the new item
	 */
	@Override
	public com.sol.petroleum.master.data.model.item createitem(
		long masterDataItemId) {

		return _itemLocalService.createitem(masterDataItemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the item from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect itemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param item the item
	 * @return the item that was removed
	 */
	@Override
	public com.sol.petroleum.master.data.model.item deleteitem(
		com.sol.petroleum.master.data.model.item item) {

		return _itemLocalService.deleteitem(item);
	}

	/**
	 * Deletes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect itemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item that was removed
	 * @throws PortalException if a item with the primary key could not be found
	 */
	@Override
	public com.sol.petroleum.master.data.model.item deleteitem(
			long masterDataItemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.deleteitem(masterDataItemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _itemLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _itemLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemLocalService.dynamicQuery();
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

		return _itemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sol.petroleum.master.data.model.impl.itemModelImpl</code>.
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

		return _itemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sol.petroleum.master.data.model.impl.itemModelImpl</code>.
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

		return _itemLocalService.dynamicQuery(
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

		return _itemLocalService.dynamicQueryCount(dynamicQuery);
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

		return _itemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.sol.petroleum.master.data.model.item fetchitem(
		long masterDataItemId) {

		return _itemLocalService.fetchitem(masterDataItemId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _itemLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _itemLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item with the primary key.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item
	 * @throws PortalException if a item with the primary key could not be found
	 */
	@Override
	public com.sol.petroleum.master.data.model.item getitem(
			long masterDataItemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.getitem(masterDataItemId);
	}

	/**
	 * Returns a range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sol.petroleum.master.data.model.impl.itemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of items
	 */
	@Override
	public java.util.List<com.sol.petroleum.master.data.model.item> getitems(
		int start, int end) {

		return _itemLocalService.getitems(start, end);
	}

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	@Override
	public int getitemsCount() {
		return _itemLocalService.getitemsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect itemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param item the item
	 * @return the item that was updated
	 */
	@Override
	public com.sol.petroleum.master.data.model.item updateitem(
		com.sol.petroleum.master.data.model.item item) {

		return _itemLocalService.updateitem(item);
	}

	@Override
	public itemLocalService getWrappedService() {
		return _itemLocalService;
	}

	@Override
	public void setWrappedService(itemLocalService itemLocalService) {
		_itemLocalService = itemLocalService;
	}

	private itemLocalService _itemLocalService;

}