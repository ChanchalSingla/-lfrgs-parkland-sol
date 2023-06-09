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

package com.sol.petroleum.master.data.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sol.petroleum.master.data.model.item;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the item service. This utility wraps <code>com.sol.petroleum.master.data.service.persistence.impl.itemPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see itemPersistence
 * @generated
 */
public class itemUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(item item) {
		getPersistence().clearCache(item);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, item> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<item> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<item> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<item> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<item> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static item update(item item) {
		return getPersistence().update(item);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static item update(item item, ServiceContext serviceContext) {
		return getPersistence().update(item, serviceContext);
	}

	/**
	 * Returns the item where itemNumber = &#63; or throws a <code>NoSuchitemException</code> if it could not be found.
	 *
	 * @param itemNumber the item number
	 * @return the matching item
	 * @throws NoSuchitemException if a matching item could not be found
	 */
	public static item findByitemNumber(String itemNumber)
		throws com.sol.petroleum.master.data.exception.NoSuchitemException {

		return getPersistence().findByitemNumber(itemNumber);
	}

	/**
	 * Returns the item where itemNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param itemNumber the item number
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public static item fetchByitemNumber(String itemNumber) {
		return getPersistence().fetchByitemNumber(itemNumber);
	}

	/**
	 * Returns the item where itemNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param itemNumber the item number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public static item fetchByitemNumber(
		String itemNumber, boolean useFinderCache) {

		return getPersistence().fetchByitemNumber(itemNumber, useFinderCache);
	}

	/**
	 * Removes the item where itemNumber = &#63; from the database.
	 *
	 * @param itemNumber the item number
	 * @return the item that was removed
	 */
	public static item removeByitemNumber(String itemNumber)
		throws com.sol.petroleum.master.data.exception.NoSuchitemException {

		return getPersistence().removeByitemNumber(itemNumber);
	}

	/**
	 * Returns the number of items where itemNumber = &#63;.
	 *
	 * @param itemNumber the item number
	 * @return the number of matching items
	 */
	public static int countByitemNumber(String itemNumber) {
		return getPersistence().countByitemNumber(itemNumber);
	}

	/**
	 * Caches the item in the entity cache if it is enabled.
	 *
	 * @param item the item
	 */
	public static void cacheResult(item item) {
		getPersistence().cacheResult(item);
	}

	/**
	 * Caches the items in the entity cache if it is enabled.
	 *
	 * @param items the items
	 */
	public static void cacheResult(List<item> items) {
		getPersistence().cacheResult(items);
	}

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param masterDataItemId the primary key for the new item
	 * @return the new item
	 */
	public static item create(long masterDataItemId) {
		return getPersistence().create(masterDataItemId);
	}

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	public static item remove(long masterDataItemId)
		throws com.sol.petroleum.master.data.exception.NoSuchitemException {

		return getPersistence().remove(masterDataItemId);
	}

	public static item updateImpl(item item) {
		return getPersistence().updateImpl(item);
	}

	/**
	 * Returns the item with the primary key or throws a <code>NoSuchitemException</code> if it could not be found.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	public static item findByPrimaryKey(long masterDataItemId)
		throws com.sol.petroleum.master.data.exception.NoSuchitemException {

		return getPersistence().findByPrimaryKey(masterDataItemId);
	}

	/**
	 * Returns the item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item, or <code>null</code> if a item with the primary key could not be found
	 */
	public static item fetchByPrimaryKey(long masterDataItemId) {
		return getPersistence().fetchByPrimaryKey(masterDataItemId);
	}

	/**
	 * Returns all the items.
	 *
	 * @return the items
	 */
	public static List<item> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>itemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of items
	 */
	public static List<item> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>itemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of items
	 */
	public static List<item> findAll(
		int start, int end, OrderByComparator<item> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>itemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of items
	 */
	public static List<item> findAll(
		int start, int end, OrderByComparator<item> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the items from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static itemPersistence getPersistence() {
		return _persistence;
	}

	private static volatile itemPersistence _persistence;

}