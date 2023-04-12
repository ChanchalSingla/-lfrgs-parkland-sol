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

package com.sol.petroleum.master.data.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link item}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see item
 * @generated
 */
public class itemWrapper
	extends BaseModelWrapper<item> implements item, ModelWrapper<item> {

	public itemWrapper(item item) {
		super(item);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("masterDataItemId", getMasterDataItemId());
		attributes.put("category", getCategory());
		attributes.put("inactive", getInactive());
		attributes.put("interId", getInterId());
		attributes.put("itemNumber", getItemNumber());
		attributes.put("itemTaxSchId", getItemTaxSchId());
		attributes.put("itemType", getItemType());
		attributes.put("subCategory", getSubCategory());
		attributes.put("taxOptions", getTaxOptions());
		attributes.put("title", getTitle());
		attributes.put("uOfMSchedule", getUOfMSchedule());
		attributes.put("visibility", getVisibility());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long masterDataItemId = (Long)attributes.get("masterDataItemId");

		if (masterDataItemId != null) {
			setMasterDataItemId(masterDataItemId);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		Integer inactive = (Integer)attributes.get("inactive");

		if (inactive != null) {
			setInactive(inactive);
		}

		String interId = (String)attributes.get("interId");

		if (interId != null) {
			setInterId(interId);
		}

		String itemNumber = (String)attributes.get("itemNumber");

		if (itemNumber != null) {
			setItemNumber(itemNumber);
		}

		String itemTaxSchId = (String)attributes.get("itemTaxSchId");

		if (itemTaxSchId != null) {
			setItemTaxSchId(itemTaxSchId);
		}

		Integer itemType = (Integer)attributes.get("itemType");

		if (itemType != null) {
			setItemType(itemType);
		}

		String subCategory = (String)attributes.get("subCategory");

		if (subCategory != null) {
			setSubCategory(subCategory);
		}

		Integer taxOptions = (Integer)attributes.get("taxOptions");

		if (taxOptions != null) {
			setTaxOptions(taxOptions);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String uOfMSchedule = (String)attributes.get("uOfMSchedule");

		if (uOfMSchedule != null) {
			setUOfMSchedule(uOfMSchedule);
		}

		String visibility = (String)attributes.get("visibility");

		if (visibility != null) {
			setVisibility(visibility);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public item cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category of this item.
	 *
	 * @return the category of this item
	 */
	@Override
	public String getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the created date of this item.
	 *
	 * @return the created date of this item
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the inactive of this item.
	 *
	 * @return the inactive of this item
	 */
	@Override
	public Integer getInactive() {
		return model.getInactive();
	}

	/**
	 * Returns the inter ID of this item.
	 *
	 * @return the inter ID of this item
	 */
	@Override
	public String getInterId() {
		return model.getInterId();
	}

	/**
	 * Returns the item number of this item.
	 *
	 * @return the item number of this item
	 */
	@Override
	public String getItemNumber() {
		return model.getItemNumber();
	}

	/**
	 * Returns the item tax sch ID of this item.
	 *
	 * @return the item tax sch ID of this item
	 */
	@Override
	public String getItemTaxSchId() {
		return model.getItemTaxSchId();
	}

	/**
	 * Returns the item type of this item.
	 *
	 * @return the item type of this item
	 */
	@Override
	public Integer getItemType() {
		return model.getItemType();
	}

	/**
	 * Returns the master data item ID of this item.
	 *
	 * @return the master data item ID of this item
	 */
	@Override
	public long getMasterDataItemId() {
		return model.getMasterDataItemId();
	}

	/**
	 * Returns the modified date of this item.
	 *
	 * @return the modified date of this item
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this item.
	 *
	 * @return the primary key of this item
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sub category of this item.
	 *
	 * @return the sub category of this item
	 */
	@Override
	public String getSubCategory() {
		return model.getSubCategory();
	}

	/**
	 * Returns the tax options of this item.
	 *
	 * @return the tax options of this item
	 */
	@Override
	public Integer getTaxOptions() {
		return model.getTaxOptions();
	}

	/**
	 * Returns the title of this item.
	 *
	 * @return the title of this item
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the u of m schedule of this item.
	 *
	 * @return the u of m schedule of this item
	 */
	@Override
	public String getUOfMSchedule() {
		return model.getUOfMSchedule();
	}

	/**
	 * Returns the visibility of this item.
	 *
	 * @return the visibility of this item
	 */
	@Override
	public String getVisibility() {
		return model.getVisibility();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the category of this item.
	 *
	 * @param category the category of this item
	 */
	@Override
	public void setCategory(String category) {
		model.setCategory(category);
	}

	/**
	 * Sets the created date of this item.
	 *
	 * @param createdDate the created date of this item
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the inactive of this item.
	 *
	 * @param inactive the inactive of this item
	 */
	@Override
	public void setInactive(Integer inactive) {
		model.setInactive(inactive);
	}

	/**
	 * Sets the inter ID of this item.
	 *
	 * @param interId the inter ID of this item
	 */
	@Override
	public void setInterId(String interId) {
		model.setInterId(interId);
	}

	/**
	 * Sets the item number of this item.
	 *
	 * @param itemNumber the item number of this item
	 */
	@Override
	public void setItemNumber(String itemNumber) {
		model.setItemNumber(itemNumber);
	}

	/**
	 * Sets the item tax sch ID of this item.
	 *
	 * @param itemTaxSchId the item tax sch ID of this item
	 */
	@Override
	public void setItemTaxSchId(String itemTaxSchId) {
		model.setItemTaxSchId(itemTaxSchId);
	}

	/**
	 * Sets the item type of this item.
	 *
	 * @param itemType the item type of this item
	 */
	@Override
	public void setItemType(Integer itemType) {
		model.setItemType(itemType);
	}

	/**
	 * Sets the master data item ID of this item.
	 *
	 * @param masterDataItemId the master data item ID of this item
	 */
	@Override
	public void setMasterDataItemId(long masterDataItemId) {
		model.setMasterDataItemId(masterDataItemId);
	}

	/**
	 * Sets the modified date of this item.
	 *
	 * @param modifiedDate the modified date of this item
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this item.
	 *
	 * @param primaryKey the primary key of this item
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sub category of this item.
	 *
	 * @param subCategory the sub category of this item
	 */
	@Override
	public void setSubCategory(String subCategory) {
		model.setSubCategory(subCategory);
	}

	/**
	 * Sets the tax options of this item.
	 *
	 * @param taxOptions the tax options of this item
	 */
	@Override
	public void setTaxOptions(Integer taxOptions) {
		model.setTaxOptions(taxOptions);
	}

	/**
	 * Sets the title of this item.
	 *
	 * @param title the title of this item
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the u of m schedule of this item.
	 *
	 * @param uOfMSchedule the u of m schedule of this item
	 */
	@Override
	public void setUOfMSchedule(String uOfMSchedule) {
		model.setUOfMSchedule(uOfMSchedule);
	}

	/**
	 * Sets the visibility of this item.
	 *
	 * @param visibility the visibility of this item
	 */
	@Override
	public void setVisibility(String visibility) {
		model.setVisibility(visibility);
	}

	@Override
	protected itemWrapper wrap(item item) {
		return new itemWrapper(item);
	}

}