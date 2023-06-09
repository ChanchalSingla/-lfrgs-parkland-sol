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

package com.sol.petroleum.headless.audit.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the apiAudit service. Represents a row in the &quot;sol_audit_apiAudit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.sol.petroleum.headless.audit.model.impl.apiAuditModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.sol.petroleum.headless.audit.model.impl.apiAuditImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see apiAudit
 * @generated
 */
@ProviderType
public interface apiAuditModel extends BaseModel<apiAudit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a api audit model instance should use the {@link apiAudit} interface instead.
	 */

	/**
	 * Returns the primary key of this api audit.
	 *
	 * @return the primary key of this api audit
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this api audit.
	 *
	 * @param primaryKey the primary key of this api audit
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the audit ID of this api audit.
	 *
	 * @return the audit ID of this api audit
	 */
	public long getAuditId();

	/**
	 * Sets the audit ID of this api audit.
	 *
	 * @param auditId the audit ID of this api audit
	 */
	public void setAuditId(long auditId);

	/**
	 * Returns the uuid of this api audit.
	 *
	 * @return the uuid of this api audit
	 */
	@AutoEscape
	public String getUUID();

	/**
	 * Sets the uuid of this api audit.
	 *
	 * @param UUID the uuid of this api audit
	 */
	public void setUUID(String UUID);

	/**
	 * Returns the created date of this api audit.
	 *
	 * @return the created date of this api audit
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this api audit.
	 *
	 * @param createdDate the created date of this api audit
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the action name of this api audit.
	 *
	 * @return the action name of this api audit
	 */
	@AutoEscape
	public String getActionName();

	/**
	 * Sets the action name of this api audit.
	 *
	 * @param actionName the action name of this api audit
	 */
	public void setActionName(String actionName);

	/**
	 * Returns the source type of this api audit.
	 *
	 * @return the source type of this api audit
	 */
	@AutoEscape
	public String getSourceType();

	/**
	 * Sets the source type of this api audit.
	 *
	 * @param sourceType the source type of this api audit
	 */
	public void setSourceType(String sourceType);

	/**
	 * Returns the status of this api audit.
	 *
	 * @return the status of this api audit
	 */
	public int getStatus();

	/**
	 * Sets the status of this api audit.
	 *
	 * @param status the status of this api audit
	 */
	public void setStatus(int status);

	/**
	 * Returns the status code of this api audit.
	 *
	 * @return the status code of this api audit
	 */
	@AutoEscape
	public String getStatusCode();

	/**
	 * Sets the status code of this api audit.
	 *
	 * @param statusCode the status code of this api audit
	 */
	public void setStatusCode(String statusCode);

	/**
	 * Returns the request json of this api audit.
	 *
	 * @return the request json of this api audit
	 */
	@AutoEscape
	public String getRequestJson();

	/**
	 * Sets the request json of this api audit.
	 *
	 * @param requestJson the request json of this api audit
	 */
	public void setRequestJson(String requestJson);

	/**
	 * Returns the response json of this api audit.
	 *
	 * @return the response json of this api audit
	 */
	@AutoEscape
	public String getResponseJson();

	/**
	 * Sets the response json of this api audit.
	 *
	 * @param responseJson the response json of this api audit
	 */
	public void setResponseJson(String responseJson);

	/**
	 * Returns the request time of this api audit.
	 *
	 * @return the request time of this api audit
	 */
	public Date getRequestTime();

	/**
	 * Sets the request time of this api audit.
	 *
	 * @param requestTime the request time of this api audit
	 */
	public void setRequestTime(Date requestTime);

	/**
	 * Returns the response time of this api audit.
	 *
	 * @return the response time of this api audit
	 */
	public Date getResponseTime();

	/**
	 * Sets the response time of this api audit.
	 *
	 * @param responseTime the response time of this api audit
	 */
	public void setResponseTime(Date responseTime);

	@Override
	public apiAudit cloneWithOriginalValues();

}