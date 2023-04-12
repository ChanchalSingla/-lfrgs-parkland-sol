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

import com.sol.petroleum.master.data.exception.NoSuchitemException;
import com.sol.petroleum.master.data.model.item;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see itemUtil
 * @generated
 */
@ProviderType
public interface itemPersistence extends BasePersistence<item> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link itemUtil} to access the item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the item where itemNumber = &#63; or throws a <code>NoSuchitemException</code> if it could not be found.
	 *
	 * @param itemNumber the item number
	 * @return the matching item
	 * @throws NoSuchitemException if a matching item could not be found
	 */
	public item findByitemNumber(String itemNumber) throws NoSuchitemException;

	/**
	 * Returns the item where itemNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param itemNumber the item number
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public item fetchByitemNumber(String itemNumber);

	/**
	 * Returns the item where itemNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param itemNumber the item number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	public item fetchByitemNumber(String itemNumber, boolean useFinderCache);

	/**
	 * Removes the item where itemNumber = &#63; from the database.
	 *
	 * @param itemNumber the item number
	 * @return the item that was removed
	 */
	public item removeByitemNumber(String itemNumber)
		throws NoSuchitemException;

	/**
	 * Returns the number of items where itemNumber = &#63;.
	 *
	 * @param itemNumber the item number
	 * @return the number of matching items
	 */
	public int countByitemNumber(String itemNumber);

	/**
	 * Caches the item in the entity cache if it is enabled.
	 *
	 * @param item the item
	 */
	public void cacheResult(item item);

	/**
	 * Caches the items in the entity cache if it is enabled.
	 *
	 * @param items the items
	 */
	public void cacheResult(java.util.List<item> items);

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param masterDataItemId the primary key for the new item
	 * @return the new item
	 */
	public item create(long masterDataItemId);

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	public item remove(long masterDataItemId) throws NoSuchitemException;

	public item updateImpl(item item);

	/**
	 * Returns the item with the primary key or throws a <code>NoSuchitemException</code> if it could not be found.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	public item findByPrimaryKey(long masterDataItemId)
		throws NoSuchitemException;

	/**
	 * Returns the item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item, or <code>null</code> if a item with the primary key could not be found
	 */
	public item fetchByPrimaryKey(long masterDataItemId);

	/**
	 * Returns all the items.
	 *
	 * @return the items
	 */
	public java.util.List<item> findAll();

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
	public java.util.List<item> findAll(int start, int end);

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
	public java.util.List<item> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<item>
			orderByComparator);

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
	public java.util.List<item> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<item>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the items from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	public int countAll();

}