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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.sol.petroleum.master.data.exception.NoSuchinventoryException;
import com.sol.petroleum.master.data.model.inventory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see inventoryUtil
 * @generated
 */
@ProviderType
public interface inventoryPersistence extends BasePersistence<inventory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link inventoryUtil} to access the inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the inventory where locationCode = &#63; or throws a <code>NoSuchinventoryException</code> if it could not be found.
	 *
	 * @param locationCode the location code
	 * @return the matching inventory
	 * @throws NoSuchinventoryException if a matching inventory could not be found
	 */
	public inventory findBylocationCode(String locationCode)
		throws NoSuchinventoryException;

	/**
	 * Returns the inventory where locationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param locationCode the location code
	 * @return the matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public inventory fetchBylocationCode(String locationCode);

	/**
	 * Returns the inventory where locationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param locationCode the location code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public inventory fetchBylocationCode(
		String locationCode, boolean useFinderCache);

	/**
	 * Removes the inventory where locationCode = &#63; from the database.
	 *
	 * @param locationCode the location code
	 * @return the inventory that was removed
	 */
	public inventory removeBylocationCode(String locationCode)
		throws NoSuchinventoryException;

	/**
	 * Returns the number of inventories where locationCode = &#63;.
	 *
	 * @param locationCode the location code
	 * @return the number of matching inventories
	 */
	public int countBylocationCode(String locationCode);

	/**
	 * Caches the inventory in the entity cache if it is enabled.
	 *
	 * @param inventory the inventory
	 */
	public void cacheResult(inventory inventory);

	/**
	 * Caches the inventories in the entity cache if it is enabled.
	 *
	 * @param inventories the inventories
	 */
	public void cacheResult(java.util.List<inventory> inventories);

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param masterDataInventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	public inventory create(long masterDataInventoryId);

	/**
	 * Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	public inventory remove(long masterDataInventoryId)
		throws NoSuchinventoryException;

	public inventory updateImpl(inventory inventory);

	/**
	 * Returns the inventory with the primary key or throws a <code>NoSuchinventoryException</code> if it could not be found.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	public inventory findByPrimaryKey(long masterDataInventoryId)
		throws NoSuchinventoryException;

	/**
	 * Returns the inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory, or <code>null</code> if a inventory with the primary key could not be found
	 */
	public inventory fetchByPrimaryKey(long masterDataInventoryId);

	/**
	 * Returns all the inventories.
	 *
	 * @return the inventories
	 */
	public java.util.List<inventory> findAll();

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
	public java.util.List<inventory> findAll(int start, int end);

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
	public java.util.List<inventory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<inventory>
			orderByComparator);

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
	public java.util.List<inventory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<inventory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the inventories from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	public int countAll();

}