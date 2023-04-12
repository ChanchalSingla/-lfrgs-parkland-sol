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

package com.sol.petroleum.headless.audit.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.sol.petroleum.headless.audit.exception.NoSuchapiAuditException;
import com.sol.petroleum.headless.audit.model.apiAudit;
import com.sol.petroleum.headless.audit.model.apiAuditTable;
import com.sol.petroleum.headless.audit.model.impl.apiAuditImpl;
import com.sol.petroleum.headless.audit.model.impl.apiAuditModelImpl;
import com.sol.petroleum.headless.audit.service.persistence.apiAuditPersistence;
import com.sol.petroleum.headless.audit.service.persistence.apiAuditUtil;
import com.sol.petroleum.headless.audit.service.persistence.impl.constants.sol_auditPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the api audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {apiAuditPersistence.class, BasePersistence.class})
public class apiAuditPersistenceImpl
	extends BasePersistenceImpl<apiAudit> implements apiAuditPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>apiAuditUtil</code> to access the api audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		apiAuditImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByUUID;
	private FinderPath _finderPathCountByUUID;

	/**
	 * Returns the api audit where UUID = &#63; or throws a <code>NoSuchapiAuditException</code> if it could not be found.
	 *
	 * @param UUID the uuid
	 * @return the matching api audit
	 * @throws NoSuchapiAuditException if a matching api audit could not be found
	 */
	@Override
	public apiAudit findByUUID(String UUID) throws NoSuchapiAuditException {
		apiAudit apiAudit = fetchByUUID(UUID);

		if (apiAudit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("UUID=");
			sb.append(UUID);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchapiAuditException(sb.toString());
		}

		return apiAudit;
	}

	/**
	 * Returns the api audit where UUID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param UUID the uuid
	 * @return the matching api audit, or <code>null</code> if a matching api audit could not be found
	 */
	@Override
	public apiAudit fetchByUUID(String UUID) {
		return fetchByUUID(UUID, true);
	}

	/**
	 * Returns the api audit where UUID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param UUID the uuid
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching api audit, or <code>null</code> if a matching api audit could not be found
	 */
	@Override
	public apiAudit fetchByUUID(String UUID, boolean useFinderCache) {
		UUID = Objects.toString(UUID, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {UUID};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID, finderArgs, this);
		}

		if (result instanceof apiAudit) {
			apiAudit apiAudit = (apiAudit)result;

			if (!Objects.equals(UUID, apiAudit.getUUID())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_APIAUDIT_WHERE);

			boolean bindUUID = false;

			if (UUID.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUUID = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUUID) {
					queryPos.add(UUID);
				}

				List<apiAudit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {UUID};
							}

							_log.warn(
								"apiAuditPersistenceImpl.fetchByUUID(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					apiAudit apiAudit = list.get(0);

					result = apiAudit;

					cacheResult(apiAudit);
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
			return (apiAudit)result;
		}
	}

	/**
	 * Removes the api audit where UUID = &#63; from the database.
	 *
	 * @param UUID the uuid
	 * @return the api audit that was removed
	 */
	@Override
	public apiAudit removeByUUID(String UUID) throws NoSuchapiAuditException {
		apiAudit apiAudit = findByUUID(UUID);

		return remove(apiAudit);
	}

	/**
	 * Returns the number of api audits where UUID = &#63;.
	 *
	 * @param UUID the uuid
	 * @return the number of matching api audits
	 */
	@Override
	public int countByUUID(String UUID) {
		UUID = Objects.toString(UUID, "");

		FinderPath finderPath = _finderPathCountByUUID;

		Object[] finderArgs = new Object[] {UUID};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APIAUDIT_WHERE);

			boolean bindUUID = false;

			if (UUID.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUUID = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUUID) {
					queryPos.add(UUID);
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

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"apiAudit.UUID = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(apiAudit.UUID IS NULL OR apiAudit.UUID = '')";

	public apiAuditPersistenceImpl() {
		setModelClass(apiAudit.class);

		setModelImplClass(apiAuditImpl.class);
		setModelPKClass(long.class);

		setTable(apiAuditTable.INSTANCE);
	}

	/**
	 * Caches the api audit in the entity cache if it is enabled.
	 *
	 * @param apiAudit the api audit
	 */
	@Override
	public void cacheResult(apiAudit apiAudit) {
		entityCache.putResult(
			apiAuditImpl.class, apiAudit.getPrimaryKey(), apiAudit);

		finderCache.putResult(
			_finderPathFetchByUUID, new Object[] {apiAudit.getUUID()},
			apiAudit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the api audits in the entity cache if it is enabled.
	 *
	 * @param apiAudits the api audits
	 */
	@Override
	public void cacheResult(List<apiAudit> apiAudits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (apiAudits.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (apiAudit apiAudit : apiAudits) {
			if (entityCache.getResult(
					apiAuditImpl.class, apiAudit.getPrimaryKey()) == null) {

				cacheResult(apiAudit);
			}
		}
	}

	/**
	 * Clears the cache for all api audits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(apiAuditImpl.class);

		finderCache.clearCache(apiAuditImpl.class);
	}

	/**
	 * Clears the cache for the api audit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(apiAudit apiAudit) {
		entityCache.removeResult(apiAuditImpl.class, apiAudit);
	}

	@Override
	public void clearCache(List<apiAudit> apiAudits) {
		for (apiAudit apiAudit : apiAudits) {
			entityCache.removeResult(apiAuditImpl.class, apiAudit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(apiAuditImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(apiAuditImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		apiAuditModelImpl apiAuditModelImpl) {

		Object[] args = new Object[] {apiAuditModelImpl.getUUID()};

		finderCache.putResult(_finderPathCountByUUID, args, Long.valueOf(1));
		finderCache.putResult(_finderPathFetchByUUID, args, apiAuditModelImpl);
	}

	/**
	 * Creates a new api audit with the primary key. Does not add the api audit to the database.
	 *
	 * @param auditId the primary key for the new api audit
	 * @return the new api audit
	 */
	@Override
	public apiAudit create(long auditId) {
		apiAudit apiAudit = new apiAuditImpl();

		apiAudit.setNew(true);
		apiAudit.setPrimaryKey(auditId);

		return apiAudit;
	}

	/**
	 * Removes the api audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditId the primary key of the api audit
	 * @return the api audit that was removed
	 * @throws NoSuchapiAuditException if a api audit with the primary key could not be found
	 */
	@Override
	public apiAudit remove(long auditId) throws NoSuchapiAuditException {
		return remove((Serializable)auditId);
	}

	/**
	 * Removes the api audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the api audit
	 * @return the api audit that was removed
	 * @throws NoSuchapiAuditException if a api audit with the primary key could not be found
	 */
	@Override
	public apiAudit remove(Serializable primaryKey)
		throws NoSuchapiAuditException {

		Session session = null;

		try {
			session = openSession();

			apiAudit apiAudit = (apiAudit)session.get(
				apiAuditImpl.class, primaryKey);

			if (apiAudit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchapiAuditException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(apiAudit);
		}
		catch (NoSuchapiAuditException noSuchEntityException) {
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
	protected apiAudit removeImpl(apiAudit apiAudit) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(apiAudit)) {
				apiAudit = (apiAudit)session.get(
					apiAuditImpl.class, apiAudit.getPrimaryKeyObj());
			}

			if (apiAudit != null) {
				session.delete(apiAudit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (apiAudit != null) {
			clearCache(apiAudit);
		}

		return apiAudit;
	}

	@Override
	public apiAudit updateImpl(apiAudit apiAudit) {
		boolean isNew = apiAudit.isNew();

		if (!(apiAudit instanceof apiAuditModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(apiAudit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(apiAudit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in apiAudit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom apiAudit implementation " +
					apiAudit.getClass());
		}

		apiAuditModelImpl apiAuditModelImpl = (apiAuditModelImpl)apiAudit;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(apiAudit);
			}
			else {
				apiAudit = (apiAudit)session.merge(apiAudit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			apiAuditImpl.class, apiAuditModelImpl, false, true);

		cacheUniqueFindersCache(apiAuditModelImpl);

		if (isNew) {
			apiAudit.setNew(false);
		}

		apiAudit.resetOriginalValues();

		return apiAudit;
	}

	/**
	 * Returns the api audit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the api audit
	 * @return the api audit
	 * @throws NoSuchapiAuditException if a api audit with the primary key could not be found
	 */
	@Override
	public apiAudit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchapiAuditException {

		apiAudit apiAudit = fetchByPrimaryKey(primaryKey);

		if (apiAudit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchapiAuditException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return apiAudit;
	}

	/**
	 * Returns the api audit with the primary key or throws a <code>NoSuchapiAuditException</code> if it could not be found.
	 *
	 * @param auditId the primary key of the api audit
	 * @return the api audit
	 * @throws NoSuchapiAuditException if a api audit with the primary key could not be found
	 */
	@Override
	public apiAudit findByPrimaryKey(long auditId)
		throws NoSuchapiAuditException {

		return findByPrimaryKey((Serializable)auditId);
	}

	/**
	 * Returns the api audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditId the primary key of the api audit
	 * @return the api audit, or <code>null</code> if a api audit with the primary key could not be found
	 */
	@Override
	public apiAudit fetchByPrimaryKey(long auditId) {
		return fetchByPrimaryKey((Serializable)auditId);
	}

	/**
	 * Returns all the api audits.
	 *
	 * @return the api audits
	 */
	@Override
	public List<apiAudit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the api audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>apiAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of api audits
	 * @param end the upper bound of the range of api audits (not inclusive)
	 * @return the range of api audits
	 */
	@Override
	public List<apiAudit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the api audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>apiAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of api audits
	 * @param end the upper bound of the range of api audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of api audits
	 */
	@Override
	public List<apiAudit> findAll(
		int start, int end, OrderByComparator<apiAudit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the api audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>apiAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of api audits
	 * @param end the upper bound of the range of api audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of api audits
	 */
	@Override
	public List<apiAudit> findAll(
		int start, int end, OrderByComparator<apiAudit> orderByComparator,
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

		List<apiAudit> list = null;

		if (useFinderCache) {
			list = (List<apiAudit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_APIAUDIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_APIAUDIT;

				sql = sql.concat(apiAuditModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<apiAudit>)QueryUtil.list(
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
	 * Removes all the api audits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (apiAudit apiAudit : findAll()) {
			remove(apiAudit);
		}
	}

	/**
	 * Returns the number of api audits.
	 *
	 * @return the number of api audits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_APIAUDIT);

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
		return "auditId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_APIAUDIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return apiAuditModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the api audit persistence.
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

		_finderPathFetchByUUID = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID",
			new String[] {String.class.getName()}, new String[] {"UUID"}, true);

		_finderPathCountByUUID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID",
			new String[] {String.class.getName()}, new String[] {"UUID"},
			false);

		_setapiAuditUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setapiAuditUtilPersistence(null);

		entityCache.removeCache(apiAuditImpl.class.getName());
	}

	private void _setapiAuditUtilPersistence(
		apiAuditPersistence apiAuditPersistence) {

		try {
			Field field = apiAuditUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, apiAuditPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = sol_auditPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = sol_auditPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = sol_auditPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_APIAUDIT =
		"SELECT apiAudit FROM apiAudit apiAudit";

	private static final String _SQL_SELECT_APIAUDIT_WHERE =
		"SELECT apiAudit FROM apiAudit apiAudit WHERE ";

	private static final String _SQL_COUNT_APIAUDIT =
		"SELECT COUNT(apiAudit) FROM apiAudit apiAudit";

	private static final String _SQL_COUNT_APIAUDIT_WHERE =
		"SELECT COUNT(apiAudit) FROM apiAudit apiAudit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "apiAudit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No apiAudit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No apiAudit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		apiAuditPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}