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

import com.sol.petroleum.master.data.model.inventory;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the inventory service. This utility wraps <code>com.sol.petroleum.master.data.service.persistence.impl.inventoryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see inventoryPersistence
 * @generated
 */
public class inventoryUtil {

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
	public static void clearCache(inventory inventory) {
		getPersistence().clearCache(inventory);
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
	public static Map<Serializable, inventory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<inventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<inventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<inventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<inventory> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static inventory update(inventory inventory) {
		return getPersistence().update(inventory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static inventory update(
		inventory inventory, ServiceContext serviceContext) {

		return getPersistence().update(inventory, serviceContext);
	}

	/**
	 * Returns the inventory where locationCode = &#63; or throws a <code>NoSuchinventoryException</code> if it could not be found.
	 *
	 * @param locationCode the location code
	 * @return the matching inventory
	 * @throws NoSuchinventoryException if a matching inventory could not be found
	 */
	public static inventory findBylocationCode(String locationCode)
		throws com.sol.petroleum.master.data.exception.
			NoSuchinventoryException {

		return getPersistence().findBylocationCode(locationCode);
	}

	/**
	 * Returns the inventory where locationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param locationCode the location code
	 * @return the matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public static inventory fetchBylocationCode(String locationCode) {
		return getPersistence().fetchBylocationCode(locationCode);
	}

	/**
	 * Returns the inventory where locationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param locationCode the location code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public static inventory fetchBylocationCode(
		String locationCode, boolean useFinderCache) {

		return getPersistence().fetchBylocationCode(
			locationCode, useFinderCache);
	}

	/**
	 * Removes the inventory where locationCode = &#63; from the database.
	 *
	 * @param locationCode the location code
	 * @return the inventory that was removed
	 */
	public static inventory removeBylocationCode(String locationCode)
		throws com.sol.petroleum.master.data.exception.
			NoSuchinventoryException {

		return getPersistence().removeBylocationCode(locationCode);
	}

	/**
	 * Returns the number of inventories where locationCode = &#63;.
	 *
	 * @param locationCode the location code
	 * @return the number of matching inventories
	 */
	public static int countBylocationCode(String locationCode) {
		return getPersistence().countBylocationCode(locationCode);
	}

	/**
	 * Caches the inventory in the entity cache if it is enabled.
	 *
	 * @param inventory the inventory
	 */
	public static void cacheResult(inventory inventory) {
		getPersistence().cacheResult(inventory);
	}

	/**
	 * Caches the inventories in the entity cache if it is enabled.
	 *
	 * @param inventories the inventories
	 */
	public static void cacheResult(List<inventory> inventories) {
		getPersistence().cacheResult(inventories);
	}

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param masterDataInventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	public static inventory create(long masterDataInventoryId) {
		return getPersistence().create(masterDataInventoryId);
	}

	/**
	 * Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	public static inventory remove(long masterDataInventoryId)
		throws com.sol.petroleum.master.data.exception.
			NoSuchinventoryException {

		return getPersistence().remove(masterDataInventoryId);
	}

	public static inventory updateImpl(inventory inventory) {
		return getPersistence().updateImpl(inventory);
	}

	/**
	 * Returns the inventory with the primary key or throws a <code>NoSuchinventoryException</code> if it could not be found.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	public static inventory findByPrimaryKey(long masterDataInventoryId)
		throws com.sol.petroleum.master.data.exception.
			NoSuchinventoryException {

		return getPersistence().findByPrimaryKey(masterDataInventoryId);
	}

	/**
	 * Returns the inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory, or <code>null</code> if a inventory with the primary key could not be found
	 */
	public static inventory fetchByPrimaryKey(long masterDataInventoryId) {
		return getPersistence().fetchByPrimaryKey(masterDataInventoryId);
	}

	/**
	 * Returns all the inventories.
	 *
	 * @return the inventories
	 */
	public static List<inventory> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>inventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @return the range of inventories
	 */
	public static List<inventory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>inventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inventories
	 */
	public static List<inventory> findAll(
		int start, int end, OrderByComparator<inventory> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>inventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of inventories
	 */
	public static List<inventory> findAll(
		int start, int end, OrderByComparator<inventory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the inventories from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static inventoryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile inventoryPersistence _persistence;

}