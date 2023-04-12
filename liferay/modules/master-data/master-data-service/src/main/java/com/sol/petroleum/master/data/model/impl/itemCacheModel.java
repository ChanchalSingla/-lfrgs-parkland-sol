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

import com.sol.petroleum.master.data.model.item;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing item in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class itemCacheModel implements CacheModel<item>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof itemCacheModel)) {
			return false;
		}

		itemCacheModel itemCacheModel = (itemCacheModel)object;

		if (masterDataItemId == itemCacheModel.masterDataItemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, masterDataItemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{masterDataItemId=");
		sb.append(masterDataItemId);
		sb.append(", category=");
		sb.append(category);
		sb.append(", inactive=");
		sb.append(inactive);
		sb.append(", interId=");
		sb.append(interId);
		sb.append(", itemNumber=");
		sb.append(itemNumber);
		sb.append(", itemTaxSchId=");
		sb.append(itemTaxSchId);
		sb.append(", itemType=");
		sb.append(itemType);
		sb.append(", subCategory=");
		sb.append(subCategory);
		sb.append(", taxOptions=");
		sb.append(taxOptions);
		sb.append(", title=");
		sb.append(title);
		sb.append(", uOfMSchedule=");
		sb.append(uOfMSchedule);
		sb.append(", visibility=");
		sb.append(visibility);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public item toEntityModel() {
		itemImpl itemImpl = new itemImpl();

		itemImpl.setMasterDataItemId(masterDataItemId);

		if (category == null) {
			itemImpl.setCategory("");
		}
		else {
			itemImpl.setCategory(category);
		}

		itemImpl.setInactive(inactive);

		if (interId == null) {
			itemImpl.setInterId("");
		}
		else {
			itemImpl.setInterId(interId);
		}

		if (itemNumber == null) {
			itemImpl.setItemNumber("");
		}
		else {
			itemImpl.setItemNumber(itemNumber);
		}

		if (itemTaxSchId == null) {
			itemImpl.setItemTaxSchId("");
		}
		else {
			itemImpl.setItemTaxSchId(itemTaxSchId);
		}

		itemImpl.setItemType(itemType);

		if (subCategory == null) {
			itemImpl.setSubCategory("");
		}
		else {
			itemImpl.setSubCategory(subCategory);
		}

		itemImpl.setTaxOptions(taxOptions);

		if (title == null) {
			itemImpl.setTitle("");
		}
		else {
			itemImpl.setTitle(title);
		}

		if (uOfMSchedule == null) {
			itemImpl.setUOfMSchedule("");
		}
		else {
			itemImpl.setUOfMSchedule(uOfMSchedule);
		}

		if (visibility == null) {
			itemImpl.setVisibility("");
		}
		else {
			itemImpl.setVisibility(visibility);
		}

		if (createdDate == Long.MIN_VALUE) {
			itemImpl.setCreatedDate(null);
		}
		else {
			itemImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			itemImpl.setModifiedDate(null);
		}
		else {
			itemImpl.setModifiedDate(new Date(modifiedDate));
		}

		itemImpl.resetOriginalValues();

		return itemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		masterDataItemId = objectInput.readLong();
		category = objectInput.readUTF();

		inactive = objectInput.readInt();
		interId = objectInput.readUTF();
		itemNumber = objectInput.readUTF();
		itemTaxSchId = objectInput.readUTF();

		itemType = objectInput.readInt();
		subCategory = objectInput.readUTF();

		taxOptions = objectInput.readInt();
		title = objectInput.readUTF();
		uOfMSchedule = objectInput.readUTF();
		visibility = objectInput.readUTF();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(masterDataItemId);

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		objectOutput.writeInt(inactive);

		if (interId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(interId);
		}

		if (itemNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(itemNumber);
		}

		if (itemTaxSchId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(itemTaxSchId);
		}

		objectOutput.writeInt(itemType);

		if (subCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategory);
		}

		objectOutput.writeInt(taxOptions);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (uOfMSchedule == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uOfMSchedule);
		}

		if (visibility == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(visibility);
		}

		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long masterDataItemId;
	public String category;
	public int inactive;
	public String interId;
	public String itemNumber;
	public String itemTaxSchId;
	public int itemType;
	public String subCategory;
	public int taxOptions;
	public String title;
	public String uOfMSchedule;
	public String visibility;
	public long createdDate;
	public long modifiedDate;

}