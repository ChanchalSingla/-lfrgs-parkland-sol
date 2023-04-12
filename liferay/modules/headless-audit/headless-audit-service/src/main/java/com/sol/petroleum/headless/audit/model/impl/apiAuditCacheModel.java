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

package com.sol.petroleum.headless.audit.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.sol.petroleum.headless.audit.model.apiAudit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing apiAudit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class apiAuditCacheModel
	implements CacheModel<apiAudit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof apiAuditCacheModel)) {
			return false;
		}

		apiAuditCacheModel apiAuditCacheModel = (apiAuditCacheModel)object;

		if (auditId == apiAuditCacheModel.auditId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auditId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{auditId=");
		sb.append(auditId);
		sb.append(", UUID=");
		sb.append(UUID);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", actionName=");
		sb.append(actionName);
		sb.append(", sourceType=");
		sb.append(sourceType);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusCode=");
		sb.append(statusCode);
		sb.append(", requestJson=");
		sb.append(requestJson);
		sb.append(", responseJson=");
		sb.append(responseJson);
		sb.append(", requestTime=");
		sb.append(requestTime);
		sb.append(", responseTime=");
		sb.append(responseTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public apiAudit toEntityModel() {
		apiAuditImpl apiAuditImpl = new apiAuditImpl();

		apiAuditImpl.setAuditId(auditId);

		if (UUID == null) {
			apiAuditImpl.setUUID("");
		}
		else {
			apiAuditImpl.setUUID(UUID);
		}

		if (createdDate == Long.MIN_VALUE) {
			apiAuditImpl.setCreatedDate(null);
		}
		else {
			apiAuditImpl.setCreatedDate(new Date(createdDate));
		}

		if (actionName == null) {
			apiAuditImpl.setActionName("");
		}
		else {
			apiAuditImpl.setActionName(actionName);
		}

		if (sourceType == null) {
			apiAuditImpl.setSourceType("");
		}
		else {
			apiAuditImpl.setSourceType(sourceType);
		}

		apiAuditImpl.setStatus(status);

		if (statusCode == null) {
			apiAuditImpl.setStatusCode("");
		}
		else {
			apiAuditImpl.setStatusCode(statusCode);
		}

		if (requestJson == null) {
			apiAuditImpl.setRequestJson("");
		}
		else {
			apiAuditImpl.setRequestJson(requestJson);
		}

		if (responseJson == null) {
			apiAuditImpl.setResponseJson("");
		}
		else {
			apiAuditImpl.setResponseJson(responseJson);
		}

		if (requestTime == Long.MIN_VALUE) {
			apiAuditImpl.setRequestTime(null);
		}
		else {
			apiAuditImpl.setRequestTime(new Date(requestTime));
		}

		if (responseTime == Long.MIN_VALUE) {
			apiAuditImpl.setResponseTime(null);
		}
		else {
			apiAuditImpl.setResponseTime(new Date(responseTime));
		}

		apiAuditImpl.resetOriginalValues();

		return apiAuditImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		auditId = objectInput.readLong();
		UUID = objectInput.readUTF();
		createdDate = objectInput.readLong();
		actionName = objectInput.readUTF();
		sourceType = objectInput.readUTF();

		status = objectInput.readInt();
		statusCode = objectInput.readUTF();
		requestJson = objectInput.readUTF();
		responseJson = objectInput.readUTF();
		requestTime = objectInput.readLong();
		responseTime = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(auditId);

		if (UUID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(UUID);
		}

		objectOutput.writeLong(createdDate);

		if (actionName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actionName);
		}

		if (sourceType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceType);
		}

		objectOutput.writeInt(status);

		if (statusCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusCode);
		}

		if (requestJson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestJson);
		}

		if (responseJson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responseJson);
		}

		objectOutput.writeLong(requestTime);
		objectOutput.writeLong(responseTime);
	}

	public long auditId;

	public String UUID;

	public long createdDate;
	public String actionName;
	public String sourceType;
	public int status;
	public String statusCode;
	public String requestJson;
	public String responseJson;
	public long requestTime;
	public long responseTime;

}