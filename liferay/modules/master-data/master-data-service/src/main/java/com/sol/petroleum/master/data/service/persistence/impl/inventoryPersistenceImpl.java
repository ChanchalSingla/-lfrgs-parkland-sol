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

package com.sol.petroleum.master.data.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.sol.petroleum.master.data.exception.NoSuchinventoryException;
import com.sol.petroleum.master.data.model.impl.inventoryImpl;
import com.sol.petroleum.master.data.model.impl.inventoryModelImpl;
import com.sol.petroleum.master.data.model.inventory;
import com.sol.petroleum.master.data.model.inventoryTable;
import com.sol.petroleum.master.data.service.persistence.impl.constants.sol_master_dataPersistenceConstants;
import com.sol.petroleum.master.data.service.persistence.inventoryPersistence;
import com.sol.petroleum.master.data.service.persistence.inventoryUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {inventoryPersistence.class, BasePersistence.class})
public class inventoryPersistenceImpl
	extends BasePersistenceImpl<inventory> implements inventoryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>inventoryUtil</code> to access the inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		inventoryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBylocationCode;
	private FinderPath _finderPathCountBylocationCode;

	/**
	 * Returns the inventory where locationCode = &#63; or throws a <code>NoSuchinventoryException</code> if it could not be found.
	 *
	 * @param locationCode the location code
	 * @return the matching inventory
	 * @throws NoSuchinventoryException if a matching inventory could not be found
	 */
	@Override
	public inventory findBylocationCode(String locationCode)
		throws NoSuchinventoryException {

		inventory inventory = fetchBylocationCode(locationCode);

		if (inventory == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("locationCode=");
			sb.append(locationCode);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchinventoryException(sb.toString());
		}

		return inventory;
	}

	/**
	 * Returns the inventory where locationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param locationCode the location code
	 * @return the matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	@Override
	public inventory fetchBylocationCode(String locationCode) {
		return fetchBylocationCode(locationCode, true);
	}

	/**
	 * Returns the inventory where locationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param locationCode the location code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	@Override
	public inventory fetchBylocationCode(
		String locationCode, boolean useFinderCache) {

		locationCode = Objects.toString(locationCode, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {locationCode};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBylocationCode, finderArgs, this);
		}

		if (result instanceof inventory) {
			inventory inventory = (inventory)result;

			if (!Objects.equals(locationCode, inventory.getLocationCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_INVENTORY_WHERE);

			boolean bindLocationCode = false;

			if (locationCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOCATIONCODE_LOCATIONCODE_3);
			}
			else {
				bindLocationCode = true;

				sb.append(_FINDER_COLUMN_LOCATIONCODE_LOCATIONCODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLocationCode) {
					queryPos.add(locationCode);
				}

				List<inventory> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBylocationCode, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {locationCode};
							}

							_log.warn(
								"inventoryPersistenceImpl.fetchBylocationCode(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					inventory inventory = list.get(0);

					result = inventory;

					cacheResult(inventory);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (inventory)result;
		}
	}

	/**
	 * Removes the inventory where locationCode = &#63; from the database.
	 *
	 * @param locationCode the location code
	 * @return the inventory that was removed
	 */
	@Override
	public inventory removeBylocationCode(String locationCode)
		throws NoSuchinventoryException {

		inventory inventory = findBylocationCode(locationCode);

		return remove(inventory);
	}

	/**
	 * Returns the number of inventories where locationCode = &#63;.
	 *
	 * @param locationCode the location code
	 * @return the number of matching inventories
	 */
	@Override
	public int countBylocationCode(String locationCode) {
		locationCode = Objects.toString(locationCode, "");

		FinderPath finderPath = _finderPathCountBylocationCode;

		Object[] finderArgs = new Object[] {locationCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INVENTORY_WHERE);

			boolean bindLocationCode = false;

			if (locationCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOCATIONCODE_LOCATIONCODE_3);
			}
			else {
				bindLocationCode = true;

				sb.append(_FINDER_COLUMN_LOCATIONCODE_LOCATIONCODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLocationCode) {
					queryPos.add(locationCode);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LOCATIONCODE_LOCATIONCODE_2 =
		"inventory.locationCode = ?";

	private static final String _FINDER_COLUMN_LOCATIONCODE_LOCATIONCODE_3 =
		"(inventory.locationCode IS NULL OR inventory.locationCode = '')";

	public inventoryPersistenceImpl() {
		setModelClass(inventory.class);

		setModelImplClass(inventoryImpl.class);
		setModelPKClass(long.class);

		setTable(inventoryTable.INSTANCE);
	}

	/**
	 * Caches the inventory in the entity cache if it is enabled.
	 *
	 * @param inventory the inventory
	 */
	@Override
	public void cacheResult(inventory inventory) {
		entityCache.putResult(
			inventoryImpl.class, inventory.getPrimaryKey(), inventory);

		finderCache.putResult(
			_finderPathFetchBylocationCode,
			new Object[] {inventory.getLocationCode()}, inventory);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the inventories in the entity cache if it is enabled.
	 *
	 * @param inventories the inventories
	 */
	@Override
	public void cacheResult(List<inventory> inventories) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (inventories.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (inventory inventory : inventories) {
			if (entityCache.getResult(
					inventoryImpl.class, inventory.getPrimaryKey()) == null) {

				cacheResult(inventory);
			}
		}
	}

	/**
	 * Clears the cache for all inventories.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(inventoryImpl.class);

		finderCache.clearCache(inventoryImpl.class);
	}

	/**
	 * Clears the cache for the inventory.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(inventory inventory) {
		entityCache.removeResult(inventoryImpl.class, inventory);
	}

	@Override
	public void clearCache(List<inventory> inventories) {
		for (inventory inventory : inventories) {
			entityCache.removeResult(inventoryImpl.class, inventory);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(inventoryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(inventoryImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		inventoryModelImpl inventoryModelImpl) {

		Object[] args = new Object[] {inventoryModelImpl.getLocationCode()};

		finderCache.putResult(
			_finderPathCountBylocationCode, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBylocationCode, args, inventoryModelImpl);
	}

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param masterDataInventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	@Override
	public inventory create(long masterDataInventoryId) {
		inventory inventory = new inventoryImpl();

		inventory.setNew(true);
		inventory.setPrimaryKey(masterDataInventoryId);

		inventory.setCompanyId(CompanyThreadLocal.getCompanyId());

		return inventory;
	}

	/**
	 * Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	@Override
	public inventory remove(long masterDataInventoryId)
		throws NoSuchinventoryException {

		return remove((Serializable)masterDataInventoryId);
	}

	/**
	 * Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	@Override
	public inventory remove(Serializable primaryKey)
		throws NoSuchinventoryException {

		Session session = null;

		try {
			session = openSession();

			inventory inventory = (inventory)session.get(
				inventoryImpl.class, primaryKey);

			if (inventory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchinventoryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(inventory);
		}
		catch (NoSuchinventoryException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected inventory removeImpl(inventory inventory) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(inventory)) {
				inventory = (inventory)session.get(
					inventoryImpl.class, inventory.getPrimaryKeyObj());
			}

			if (inventory != null) {
				session.delete(inventory);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (inventory != null) {
			clearCache(inventory);
		}

		return inventory;
	}

	@Override
	public inventory updateImpl(inventory inventory) {
		boolean isNew = inventory.isNew();

		if (!(inventory instanceof inventoryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(inventory.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(inventory);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in inventory proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom inventory implementation " +
					inventory.getClass());
		}

		inventoryModelImpl inventoryModelImpl = (inventoryModelImpl)inventory;

		if (!inventoryModelImpl.hasSetModifiedDate()) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				inventory.setModifiedDate(date);
			}
			else {
				inventory.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(inventory);
			}
			else {
				inventory = (inventory)session.merge(inventory);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			inventoryImpl.class, inventoryModelImpl, false, true);

		cacheUniqueFindersCache(inventoryModelImpl);

		if (isNew) {
			inventory.setNew(false);
		}

		inventory.resetOriginalValues();

		return inventory;
	}

	/**
	 * Returns the inventory with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the inventory
	 * @return the inventory
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	@Override
	public inventory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchinventoryException {

		inventory inventory = fetchByPrimaryKey(primaryKey);

		if (inventory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchinventoryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return inventory;
	}

	/**
	 * Returns the inventory with the primary key or throws a <code>NoSuchinventoryException</code> if it could not be found.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws NoSuchinventoryException if a inventory with the primary key could not be found
	 */
	@Override
	public inventory findByPrimaryKey(long masterDataInventoryId)
		throws NoSuchinventoryException {

		return findByPrimaryKey((Serializable)masterDataInventoryId);
	}

	/**
	 * Returns the inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param masterDataInventoryId the primary key of the inventory
	 * @return the inventory, or <code>null</code> if a inventory with the primary key could not be found
	 */
	@Override
	public inventory fetchByPrimaryKey(long masterDataInventoryId) {
		return fetchByPrimaryKey((Serializable)masterDataInventoryId);
	}

	/**
	 * Returns all the inventories.
	 *
	 * @return the inventories
	 */
	@Override
	public List<inventory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<inventory> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<inventory> findAll(
		int start, int end, OrderByComparator<inventory> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<inventory> findAll(
		int start, int end, OrderByComparator<inventory> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<inventory> list = null;

		if (useFinderCache) {
			list = (List<inventory>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_INVENTORY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_INVENTORY;

				sql = sql.concat(inventoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<inventory>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the inventories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (inventory inventory : findAll()) {
			remove(inventory);
		}
	}

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_INVENTORY);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "masterDataInventoryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_INVENTORY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return inventoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the inventory persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBylocationCode = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBylocationCode",
			new String[] {String.class.getName()},
			new String[] {"locationCode"}, true);

		_finderPathCountBylocationCode = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylocationCode",
			new String[] {String.class.getName()},
			new String[] {"locationCode"}, false);

		_setinventoryUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setinventoryUtilPersistence(null);

		entityCache.removeCache(inventoryImpl.class.getName());
	}

	private void _setinventoryUtilPersistence(
		inventoryPersistence inventoryPersistence) {

		try {
			Field field = inventoryUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, inventoryPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = sol_master_dataPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = sol_master_dataPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = sol_master_dataPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_INVENTORY =
		"SELECT inventory FROM inventory inventory";

	private static final String _SQL_SELECT_INVENTORY_WHERE =
		"SELECT inventory FROM inventory inventory WHERE ";

	private static final String _SQL_COUNT_INVENTORY =
		"SELECT COUNT(inventory) FROM inventory inventory";

	private static final String _SQL_COUNT_INVENTORY_WHERE =
		"SELECT COUNT(inventory) FROM inventory inventory WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "inventory.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No inventory exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No inventory exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		inventoryPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}