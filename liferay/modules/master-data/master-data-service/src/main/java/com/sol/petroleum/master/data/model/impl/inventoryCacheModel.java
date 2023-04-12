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

package com.sol.petroleum.master.data.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.sol.petroleum.master.data.model.inventory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing inventory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class inventoryCacheModel
	implements CacheModel<inventory>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof inventoryCacheModel)) {
			return false;
		}

		inventoryCacheModel inventoryCacheModel = (inventoryCacheModel)object;

		if (masterDataInventoryId ==
				inventoryCacheModel.masterDataInventoryId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, masterDataInventoryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{masterDataInventoryId=");
		sb.append(masterDataInventoryId);
		sb.append(", itemNumber=");
		sb.append(itemNumber);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", interId=");
		sb.append(interId);
		sb.append(", locationCode=");
		sb.append(locationCode);
		sb.append(", locationDesc=");
		sb.append(locationDesc);
		sb.append(", qtyOnOrder=");
		sb.append(qtyOnOrder);
		sb.append(", qtyBackOrdered=");
		sb.append(qtyBackOrdered);
		sb.append(", qtyDropShipped=");
		sb.append(qtyDropShipped);
		sb.append(", qtyInUse=");
		sb.append(qtyInUse);
		sb.append(", qtyInService=");
		sb.append(qtyInService);
		sb.append(", qtyReturned=");
		sb.append(qtyReturned);
		sb.append(", qtyDamaged=");
		sb.append(qtyDamaged);
		sb.append(", qtyOnHand=");
		sb.append(qtyOnHand);
		sb.append(", qtyAllocated=");
		sb.append(qtyAllocated);
		sb.append(", qtyCommitted=");
		sb.append(qtyCommitted);
		sb.append(", qtySold=");
		sb.append(qtySold);
		sb.append(", inactive=");
		sb.append(inactive);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public inventory toEntityModel() {
		inventoryImpl inventoryImpl = new inventoryImpl();

		inventoryImpl.setMasterDataInventoryId(masterDataInventoryId);

		if (itemNumber == null) {
			inventoryImpl.setItemNumber("");
		}
		else {
			inventoryImpl.setItemNumber(itemNumber);
		}

		inventoryImpl.setCompanyId(companyId);

		if (interId == null) {
			inventoryImpl.setInterId("");
		}
		else {
			inventoryImpl.setInterId(interId);
		}

		if (locationCode == null) {
			inventoryImpl.setLocationCode("");
		}
		else {
			inventoryImpl.setLocationCode(locationCode);
		}

		if (locationDesc == null) {
			inventoryImpl.setLocationDesc("");
		}
		else {
			inventoryImpl.setLocationDesc(locationDesc);
		}

		inventoryImpl.setQtyOnOrder(qtyOnOrder);
		inventoryImpl.setQtyBackOrdered(qtyBackOrdered);
		inventoryImpl.setQtyDropShipped(qtyDropShipped);
		inventoryImpl.setQtyInUse(qtyInUse);
		inventoryImpl.setQtyInService(qtyInService);
		inventoryImpl.setQtyReturned(qtyReturned);
		inventoryImpl.setQtyDamaged(qtyDamaged);
		inventoryImpl.setQtyOnHand(qtyOnHand);
		inventoryImpl.setQtyAllocated(qtyAllocated);
		inventoryImpl.setQtyCommitted(qtyCommitted);
		inventoryImpl.setQtySold(qtySold);
		inventoryImpl.setInactive(inactive);

		if (createdDate == Long.MIN_VALUE) {
			inventoryImpl.setCreatedDate(null);
		}
		else {
			inventoryImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			inventoryImpl.setModifiedDate(null);
		}
		else {
			inventoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		inventoryImpl.resetOriginalValues();

		return inventoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		masterDataInventoryId = objectInput.readLong();
		itemNumber = objectInput.readUTF();

		companyId = objectInput.readLong();
		interId = objectInput.readUTF();
		locationCode = objectInput.readUTF();
		locationDesc = objectInput.readUTF();

		qtyOnOrder = objectInput.readInt();

		qtyBackOrdered = objectInput.readInt();

		qtyDropShipped = objectInput.readInt();

		qtyInUse = objectInput.readInt();

		qtyInService = objectInput.readInt();

		qtyReturned = objectInput.readInt();

		qtyDamaged = objectInput.readInt();

		qtyOnHand = objectInput.readInt();

		qtyAllocated = objectInput.readInt();

		qtyCommitted = objectInput.readInt();

		qtySold = objectInput.readInt();

		inactive = objectInput.readInt();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(masterDataInventoryId);

		if (itemNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(itemNumber);
		}

		objectOutput.writeLong(companyId);

		if (interId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(interId);
		}

		if (locationCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationCode);
		}

		if (locationDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationDesc);
		}

		objectOutput.writeInt(qtyOnOrder);

		objectOutput.writeInt(qtyBackOrdered);

		objectOutput.writeInt(qtyDropShipped);

		objectOutput.writeInt(qtyInUse);

		objectOutput.writeInt(qtyInService);

		objectOutput.writeInt(qtyReturned);

		objectOutput.writeInt(qtyDamaged);

		objectOutput.writeInt(qtyOnHand);

		objectOutput.writeInt(qtyAllocated);

		objectOutput.writeInt(qtyCommitted);

		objectOutput.writeInt(qtySold);

		objectOutput.writeInt(inactive);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long masterDataInventoryId;
	public String itemNumber;
	public long companyId;
	public String interId;
	public String locationCode;
	public String locationDesc;
	public int qtyOnOrder;
	public int qtyBackOrdered;
	public int qtyDropShipped;
	public int qtyInUse;
	public int qtyInService;
	public int qtyReturned;
	public int qtyDamaged;
	public int qtyOnHand;
	public int qtyAllocated;
	public int qtyCommitted;
	public int qtySold;
	public int inactive;
	public long createdDate;
	public long modifiedDate;

}