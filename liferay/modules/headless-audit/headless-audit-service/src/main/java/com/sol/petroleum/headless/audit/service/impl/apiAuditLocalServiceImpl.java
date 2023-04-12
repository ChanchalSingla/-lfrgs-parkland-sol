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

package com.sol.petroleum.headless.audit.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.sol.petroleum.headless.audit.model.apiAudit;
import com.sol.petroleum.headless.audit.service.base.apiAuditLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.sol.petroleum.headless.audit.model.apiAudit",
	service = AopService.class
)
public class apiAuditLocalServiceImpl extends apiAuditLocalServiceBaseImpl {
	
	public static Log _log = LogFactoryUtil.getLog(apiAuditLocalServiceImpl.class);
	
	public apiAudit addApiAudit(String UUID, String actionName, String sourceType, int status, String statusCode, String requestJson, String responseJson, Date requestTime, Date responseTime){
		apiAudit addApiAudit = null;
		
long auditId = counterLocalService.increment(apiAudit.class.getName());
		Date createDate = new Date();
		try {
			addApiAudit = apiAuditLocalService.createapiAudit(auditId);
			addApiAudit.setActionName(actionName);
			addApiAudit.setSourceType(sourceType);
			addApiAudit.setRequestJson(requestJson);
			addApiAudit.setResponseJson(responseJson);
			addApiAudit.setUUID(UUID);
			addApiAudit.setRequestTime(requestTime);
			addApiAudit.setResponseTime(responseTime);
			addApiAudit.setStatus(status);
			addApiAudit.setCreatedDate(createDate);
			addApiAudit.setStatusCode(statusCode);
			addApiAudit = apiAuditLocalService.addapiAudit(addApiAudit);
		}catch (Exception e) {
			_log.error("Error in adding the entry to apiAuditService entity", e);
		}
		return addApiAudit;
	}
	
	public void updateApiAudit(String UUID,String responseJson){
		apiAudit addApiAudit = null;
		
		try {
			addApiAudit = apiAuditPersistence.fetchByUUID(UUID);
			addApiAudit.setResponseJson(responseJson);
			addApiAudit.setResponseTime(new Date());
			apiAuditLocalService.updateapiAudit(addApiAudit);
		}catch (Exception e) {
			_log.error("Error while getting apiAuditService entity", e);
		}
	}
	
	public apiAudit getApiAuditRecordByUUID(String UUID) {
		apiAudit apiAudit = null;
		try {
			apiAudit = apiAuditPersistence.fetchByUUID(UUID);
			}
		catch(Exception e) {
			_log.error("Error while getting apiAudit", e);
		}
		return apiAudit;
	}
	
	}
	
