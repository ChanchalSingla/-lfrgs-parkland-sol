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

package com.sol.petroleum.headless.audit.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.sol.petroleum.headless.audit.exception.NoSuchapiAuditException;
import com.sol.petroleum.headless.audit.model.apiAudit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the api audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see apiAuditUtil
 * @generated
 */
@ProviderType
public interface apiAuditPersistence extends BasePersistence<apiAudit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link apiAuditUtil} to access the api audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the api audit where UUID = &#63; or throws a <code>NoSuchapiAuditException</code> if it could not be found.
	 *
	 * @param UUID the uuid
	 * @return the matching api audit
	 * @throws NoSuchapiAuditException if a matching api audit could not be found
	 */
	public apiAudit findByUUID(String UUID) throws NoSuchapiAuditException;

	/**
	 * Returns the api audit where UUID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param UUID the uuid
	 * @return the matching api audit, or <code>null</code> if a matching api audit could not be found
	 */
	public apiAudit fetchByUUID(String UUID);

	/**
	 * Returns the api audit where UUID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param UUID the uuid
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching api audit, or <code>null</code> if a matching api audit could not be found
	 */
	public apiAudit fetchByUUID(String UUID, boolean useFinderCache);

	/**
	 * Removes the api audit where UUID = &#63; from the database.
	 *
	 * @param UUID the uuid
	 * @return the api audit that was removed
	 */
	public apiAudit removeByUUID(String UUID) throws NoSuchapiAuditException;

	/**
	 * Returns the number of api audits where UUID = &#63;.
	 *
	 * @param UUID the uuid
	 * @return the number of matching api audits
	 */
	public int countByUUID(String UUID);

	/**
	 * Caches the api audit in the entity cache if it is enabled.
	 *
	 * @param apiAudit the api audit
	 */
	public void cacheResult(apiAudit apiAudit);

	/**
	 * Caches the api audits in the entity cache if it is enabled.
	 *
	 * @param apiAudits the api audits
	 */
	public void cacheResult(java.util.List<apiAudit> apiAudits);

	/**
	 * Creates a new api audit with the primary key. Does not add the api audit to the database.
	 *
	 * @param auditId the primary key for the new api audit
	 * @return the new api audit
	 */
	public apiAudit create(long auditId);

	/**
	 * Removes the api audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditId the primary key of the api audit
	 * @return the api audit that was removed
	 * @throws NoSuchapiAuditException if a api audit with the primary key could not be found
	 */
	public apiAudit remove(long auditId) throws NoSuchapiAuditException;

	public apiAudit updateImpl(apiAudit apiAudit);

	/**
	 * Returns the api audit with the primary key or throws a <code>NoSuchapiAuditException</code> if it could not be found.
	 *
	 * @param auditId the primary key of the api audit
	 * @return the api audit
	 * @throws NoSuchapiAuditException if a api audit with the primary key could not be found
	 */
	public apiAudit findByPrimaryKey(long auditId)
		throws NoSuchapiAuditException;

	/**
	 * Returns the api audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditId the primary key of the api audit
	 * @return the api audit, or <code>null</code> if a api audit with the primary key could not be found
	 */
	public apiAudit fetchByPrimaryKey(long auditId);

	/**
	 * Returns all the api audits.
	 *
	 * @return the api audits
	 */
	public java.util.List<apiAudit> findAll();

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
	public java.util.List<apiAudit> findAll(int start, int end);

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
	public java.util.List<apiAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<apiAudit>
			orderByComparator);

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
	public java.util.List<apiAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<apiAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the api audits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of api audits.
	 *
	 * @return the number of api audits
	 */
	public int countAll();

}