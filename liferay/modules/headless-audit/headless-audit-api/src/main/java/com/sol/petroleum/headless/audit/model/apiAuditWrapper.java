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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link apiAudit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see apiAudit
 * @generated
 */
public class apiAuditWrapper
	extends BaseModelWrapper<apiAudit>
	implements apiAudit, ModelWrapper<apiAudit> {

	public apiAuditWrapper(apiAudit apiAudit) {
		super(apiAudit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("auditId", getAuditId());
		attributes.put("UUID", getUUID());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("actionName", getActionName());
		attributes.put("sourceType", getSourceType());
		attributes.put("status", getStatus());
		attributes.put("statusCode", getStatusCode());
		attributes.put("requestJson", getRequestJson());
		attributes.put("responseJson", getResponseJson());
		attributes.put("requestTime", getRequestTime());
		attributes.put("responseTime", getResponseTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long auditId = (Long)attributes.get("auditId");

		if (auditId != null) {
			setAuditId(auditId);
		}

		String UUID = (String)attributes.get("UUID");

		if (UUID != null) {
			setUUID(UUID);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String actionName = (String)attributes.get("actionName");

		if (actionName != null) {
			setActionName(actionName);
		}

		String sourceType = (String)attributes.get("sourceType");

		if (sourceType != null) {
			setSourceType(sourceType);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String statusCode = (String)attributes.get("statusCode");

		if (statusCode != null) {
			setStatusCode(statusCode);
		}

		String requestJson = (String)attributes.get("requestJson");

		if (requestJson != null) {
			setRequestJson(requestJson);
		}

		String responseJson = (String)attributes.get("responseJson");

		if (responseJson != null) {
			setResponseJson(responseJson);
		}

		Date requestTime = (Date)attributes.get("requestTime");

		if (requestTime != null) {
			setRequestTime(requestTime);
		}

		Date responseTime = (Date)attributes.get("responseTime");

		if (responseTime != null) {
			setResponseTime(responseTime);
		}
	}

	@Override
	public apiAudit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the action name of this api audit.
	 *
	 * @return the action name of this api audit
	 */
	@Override
	public String getActionName() {
		return model.getActionName();
	}

	/**
	 * Returns the audit ID of this api audit.
	 *
	 * @return the audit ID of this api audit
	 */
	@Override
	public long getAuditId() {
		return model.getAuditId();
	}

	/**
	 * Returns the created date of this api audit.
	 *
	 * @return the created date of this api audit
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the primary key of this api audit.
	 *
	 * @return the primary key of this api audit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request json of this api audit.
	 *
	 * @return the request json of this api audit
	 */
	@Override
	public String getRequestJson() {
		return model.getRequestJson();
	}

	/**
	 * Returns the request time of this api audit.
	 *
	 * @return the request time of this api audit
	 */
	@Override
	public Date getRequestTime() {
		return model.getRequestTime();
	}

	/**
	 * Returns the response json of this api audit.
	 *
	 * @return the response json of this api audit
	 */
	@Override
	public String getResponseJson() {
		return model.getResponseJson();
	}

	/**
	 * Returns the response time of this api audit.
	 *
	 * @return the response time of this api audit
	 */
	@Override
	public Date getResponseTime() {
		return model.getResponseTime();
	}

	/**
	 * Returns the source type of this api audit.
	 *
	 * @return the source type of this api audit
	 */
	@Override
	public String getSourceType() {
		return model.getSourceType();
	}

	/**
	 * Returns the status of this api audit.
	 *
	 * @return the status of this api audit
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status code of this api audit.
	 *
	 * @return the status code of this api audit
	 */
	@Override
	public String getStatusCode() {
		return model.getStatusCode();
	}

	/**
	 * Returns the uuid of this api audit.
	 *
	 * @return the uuid of this api audit
	 */
	@Override
	public String getUUID() {
		return model.getUUID();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the action name of this api audit.
	 *
	 * @param actionName the action name of this api audit
	 */
	@Override
	public void setActionName(String actionName) {
		model.setActionName(actionName);
	}

	/**
	 * Sets the audit ID of this api audit.
	 *
	 * @param auditId the audit ID of this api audit
	 */
	@Override
	public void setAuditId(long auditId) {
		model.setAuditId(auditId);
	}

	/**
	 * Sets the created date of this api audit.
	 *
	 * @param createdDate the created date of this api audit
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the primary key of this api audit.
	 *
	 * @param primaryKey the primary key of this api audit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request json of this api audit.
	 *
	 * @param requestJson the request json of this api audit
	 */
	@Override
	public void setRequestJson(String requestJson) {
		model.setRequestJson(requestJson);
	}

	/**
	 * Sets the request time of this api audit.
	 *
	 * @param requestTime the request time of this api audit
	 */
	@Override
	public void setRequestTime(Date requestTime) {
		model.setRequestTime(requestTime);
	}

	/**
	 * Sets the response json of this api audit.
	 *
	 * @param responseJson the response json of this api audit
	 */
	@Override
	public void setResponseJson(String responseJson) {
		model.setResponseJson(responseJson);
	}

	/**
	 * Sets the response time of this api audit.
	 *
	 * @param responseTime the response time of this api audit
	 */
	@Override
	public void setResponseTime(Date responseTime) {
		model.setResponseTime(responseTime);
	}

	/**
	 * Sets the source type of this api audit.
	 *
	 * @param sourceType the source type of this api audit
	 */
	@Override
	public void setSourceType(String sourceType) {
		model.setSourceType(sourceType);
	}

	/**
	 * Sets the status of this api audit.
	 *
	 * @param status the status of this api audit
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status code of this api audit.
	 *
	 * @param statusCode the status code of this api audit
	 */
	@Override
	public void setStatusCode(String statusCode) {
		model.setStatusCode(statusCode);
	}

	/**
	 * Sets the uuid of this api audit.
	 *
	 * @param UUID the uuid of this api audit
	 */
	@Override
	public void setUUID(String UUID) {
		model.setUUID(UUID);
	}

	@Override
	protected apiAuditWrapper wrap(apiAudit apiAudit) {
		return new apiAuditWrapper(apiAudit);
	}

}