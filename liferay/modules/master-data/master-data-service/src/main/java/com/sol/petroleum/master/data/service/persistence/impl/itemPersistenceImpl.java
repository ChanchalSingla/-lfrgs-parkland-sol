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

import com.sol.petroleum.master.data.exception.NoSuchitemException;
import com.sol.petroleum.master.data.model.impl.itemImpl;
import com.sol.petroleum.master.data.model.impl.itemModelImpl;
import com.sol.petroleum.master.data.model.item;
import com.sol.petroleum.master.data.model.itemTable;
import com.sol.petroleum.master.data.service.persistence.impl.constants.sol_master_dataPersistenceConstants;
import com.sol.petroleum.master.data.service.persistence.itemPersistence;
import com.sol.petroleum.master.data.service.persistence.itemUtil;

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
 * The persistence implementation for the item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {itemPersistence.class, BasePersistence.class})
public class itemPersistenceImpl
	extends BasePersistenceImpl<item> implements itemPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>itemUtil</code> to access the item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		itemImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByitemNumber;
	private FinderPath _finderPathCountByitemNumber;

	/**
	 * Returns the item where itemNumber = &#63; or throws a <code>NoSuchitemException</code> if it could not be found.
	 *
	 * @param itemNumber the item number
	 * @return the matching item
	 * @throws NoSuchitemException if a matching item could not be found
	 */
	@Override
	public item findByitemNumber(String itemNumber) throws NoSuchitemException {
		item item = fetchByitemNumber(itemNumber);

		if (item == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("itemNumber=");
			sb.append(itemNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchitemException(sb.toString());
		}

		return item;
	}

	/**
	 * Returns the item where itemNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param itemNumber the item number
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	@Override
	public item fetchByitemNumber(String itemNumber) {
		return fetchByitemNumber(itemNumber, true);
	}

	/**
	 * Returns the item where itemNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param itemNumber the item number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item, or <code>null</code> if a matching item could not be found
	 */
	@Override
	public item fetchByitemNumber(String itemNumber, boolean useFinderCache) {
		itemNumber = Objects.toString(itemNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {itemNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByitemNumber, finderArgs, this);
		}

		if (result instanceof item) {
			item item = (item)result;

			if (!Objects.equals(itemNumber, item.getItemNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ITEM_WHERE);

			boolean bindItemNumber = false;

			if (itemNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_ITEMNUMBER_ITEMNUMBER_3);
			}
			else {
				bindItemNumber = true;

				sb.append(_FINDER_COLUMN_ITEMNUMBER_ITEMNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindItemNumber) {
					queryPos.add(itemNumber);
				}

				List<item> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByitemNumber, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {itemNumber};
							}

							_log.warn(
								"itemPersistenceImpl.fetchByitemNumber(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					item item = list.get(0);

					result = item;

					cacheResult(item);
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
			return (item)result;
		}
	}

	/**
	 * Removes the item where itemNumber = &#63; from the database.
	 *
	 * @param itemNumber the item number
	 * @return the item that was removed
	 */
	@Override
	public item removeByitemNumber(String itemNumber)
		throws NoSuchitemException {

		item item = findByitemNumber(itemNumber);

		return remove(item);
	}

	/**
	 * Returns the number of items where itemNumber = &#63;.
	 *
	 * @param itemNumber the item number
	 * @return the number of matching items
	 */
	@Override
	public int countByitemNumber(String itemNumber) {
		itemNumber = Objects.toString(itemNumber, "");

		FinderPath finderPath = _finderPathCountByitemNumber;

		Object[] finderArgs = new Object[] {itemNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ITEM_WHERE);

			boolean bindItemNumber = false;

			if (itemNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_ITEMNUMBER_ITEMNUMBER_3);
			}
			else {
				bindItemNumber = true;

				sb.append(_FINDER_COLUMN_ITEMNUMBER_ITEMNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindItemNumber) {
					queryPos.add(itemNumber);
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

	private static final String _FINDER_COLUMN_ITEMNUMBER_ITEMNUMBER_2 =
		"item.itemNumber = ?";

	private static final String _FINDER_COLUMN_ITEMNUMBER_ITEMNUMBER_3 =
		"(item.itemNumber IS NULL OR item.itemNumber = '')";

	public itemPersistenceImpl() {
		setModelClass(item.class);

		setModelImplClass(itemImpl.class);
		setModelPKClass(long.class);

		setTable(itemTable.INSTANCE);
	}

	/**
	 * Caches the item in the entity cache if it is enabled.
	 *
	 * @param item the item
	 */
	@Override
	public void cacheResult(item item) {
		entityCache.putResult(itemImpl.class, item.getPrimaryKey(), item);

		finderCache.putResult(
			_finderPathFetchByitemNumber, new Object[] {item.getItemNumber()},
			item);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the items in the entity cache if it is enabled.
	 *
	 * @param items the items
	 */
	@Override
	public void cacheResult(List<item> items) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (items.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (item item : items) {
			if (entityCache.getResult(itemImpl.class, item.getPrimaryKey()) ==
					null) {

				cacheResult(item);
			}
		}
	}

	/**
	 * Clears the cache for all items.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(itemImpl.class);

		finderCache.clearCache(itemImpl.class);
	}

	/**
	 * Clears the cache for the item.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(item item) {
		entityCache.removeResult(itemImpl.class, item);
	}

	@Override
	public void clearCache(List<item> items) {
		for (item item : items) {
			entityCache.removeResult(itemImpl.class, item);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(itemImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(itemImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(itemModelImpl itemModelImpl) {
		Object[] args = new Object[] {itemModelImpl.getItemNumber()};

		finderCache.putResult(
			_finderPathCountByitemNumber, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByitemNumber, args, itemModelImpl);
	}

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param masterDataItemId the primary key for the new item
	 * @return the new item
	 */
	@Override
	public item create(long masterDataItemId) {
		item item = new itemImpl();

		item.setNew(true);
		item.setPrimaryKey(masterDataItemId);

		return item;
	}

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	@Override
	public item remove(long masterDataItemId) throws NoSuchitemException {
		return remove((Serializable)masterDataItemId);
	}

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	@Override
	public item remove(Serializable primaryKey) throws NoSuchitemException {
		Session session = null;

		try {
			session = openSession();

			item item = (item)session.get(itemImpl.class, primaryKey);

			if (item == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchitemException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(item);
		}
		catch (NoSuchitemException noSuchEntityException) {
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
	protected item removeImpl(item item) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(item)) {
				item = (item)session.get(
					itemImpl.class, item.getPrimaryKeyObj());
			}

			if (item != null) {
				session.delete(item);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (item != null) {
			clearCache(item);
		}

		return item;
	}

	@Override
	public item updateImpl(item item) {
		boolean isNew = item.isNew();

		if (!(item instanceof itemModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(item.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(item);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in item proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom item implementation " +
					item.getClass());
		}

		itemModelImpl itemModelImpl = (itemModelImpl)item;

		if (!itemModelImpl.hasSetModifiedDate()) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				item.setModifiedDate(date);
			}
			else {
				item.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(item);
			}
			else {
				item = (item)session.merge(item);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(itemImpl.class, itemModelImpl, false, true);

		cacheUniqueFindersCache(itemModelImpl);

		if (isNew) {
			item.setNew(false);
		}

		item.resetOriginalValues();

		return item;
	}

	/**
	 * Returns the item with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the item
	 * @return the item
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	@Override
	public item findByPrimaryKey(Serializable primaryKey)
		throws NoSuchitemException {

		item item = fetchByPrimaryKey(primaryKey);

		if (item == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchitemException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return item;
	}

	/**
	 * Returns the item with the primary key or throws a <code>NoSuchitemException</code> if it could not be found.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item
	 * @throws NoSuchitemException if a item with the primary key could not be found
	 */
	@Override
	public item findByPrimaryKey(long masterDataItemId)
		throws NoSuchitemException {

		return findByPrimaryKey((Serializable)masterDataItemId);
	}

	/**
	 * Returns the item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param masterDataItemId the primary key of the item
	 * @return the item, or <code>null</code> if a item with the primary key could not be found
	 */
	@Override
	public item fetchByPrimaryKey(long masterDataItemId) {
		return fetchByPrimaryKey((Serializable)masterDataItemId);
	}

	/**
	 * Returns all the items.
	 *
	 * @return the items
	 */
	@Override
	public List<item> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<item> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<item> findAll(
		int start, int end, OrderByComparator<item> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<item> findAll(
		int start, int end, OrderByComparator<item> orderByComparator,
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

		List<item> list = null;

		if (useFinderCache) {
			list = (List<item>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ITEM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ITEM;

				sql = sql.concat(itemModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<item>)QueryUtil.list(
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
	 * Removes all the items from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (item item : findAll()) {
			remove(item);
		}
	}

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ITEM);

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
		return "masterDataItemId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ITEM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return itemModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the item persistence.
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

		_finderPathFetchByitemNumber = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByitemNumber",
			new String[] {String.class.getName()}, new String[] {"itemNumber"},
			true);

		_finderPathCountByitemNumber = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByitemNumber",
			new String[] {String.class.getName()}, new String[] {"itemNumber"},
			false);

		_setitemUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setitemUtilPersistence(null);

		entityCache.removeCache(itemImpl.class.getName());
	}

	private void _setitemUtilPersistence(itemPersistence itemPersistence) {
		try {
			Field field = itemUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, itemPersistence);
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

	private static final String _SQL_SELECT_ITEM = "SELECT item FROM item item";

	private static final String _SQL_SELECT_ITEM_WHERE =
		"SELECT item FROM item item WHERE ";

	private static final String _SQL_COUNT_ITEM =
		"SELECT COUNT(item) FROM item item";

	private static final String _SQL_COUNT_ITEM_WHERE =
		"SELECT COUNT(item) FROM item item WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "item.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No item exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No item exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		itemPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}