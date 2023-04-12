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
 * This class is a wrapper for {@link inventory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see inventory
 * @generated
 */
public class inventoryWrapper
	extends BaseModelWrapper<inventory>
	implements inventory, ModelWrapper<inventory> {

	public inventoryWrapper(inventory inventory) {
		super(inventory);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("masterDataInventoryId", getMasterDataInventoryId());
		attributes.put("itemNumber", getItemNumber());
		attributes.put("companyId", getCompanyId());
		attributes.put("interId", getInterId());
		attributes.put("locationCode", getLocationCode());
		attributes.put("locationDesc", getLocationDesc());
		attributes.put("qtyOnOrder", getQtyOnOrder());
		attributes.put("qtyBackOrdered", getQtyBackOrdered());
		attributes.put("qtyDropShipped", getQtyDropShipped());
		attributes.put("qtyInUse", getQtyInUse());
		attributes.put("qtyInService", getQtyInService());
		attributes.put("qtyReturned", getQtyReturned());
		attributes.put("qtyDamaged", getQtyDamaged());
		attributes.put("qtyOnHand", getQtyOnHand());
		attributes.put("qtyAllocated", getQtyAllocated());
		attributes.put("qtyCommitted", getQtyCommitted());
		attributes.put("qtySold", getQtySold());
		attributes.put("inactive", getInactive());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long masterDataInventoryId = (Long)attributes.get(
			"masterDataInventoryId");

		if (masterDataInventoryId != null) {
			setMasterDataInventoryId(masterDataInventoryId);
		}

		String itemNumber = (String)attributes.get("itemNumber");

		if (itemNumber != null) {
			setItemNumber(itemNumber);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String interId = (String)attributes.get("interId");

		if (interId != null) {
			setInterId(interId);
		}

		String locationCode = (String)attributes.get("locationCode");

		if (locationCode != null) {
			setLocationCode(locationCode);
		}

		String locationDesc = (String)attributes.get("locationDesc");

		if (locationDesc != null) {
			setLocationDesc(locationDesc);
		}

		Integer qtyOnOrder = (Integer)attributes.get("qtyOnOrder");

		if (qtyOnOrder != null) {
			setQtyOnOrder(qtyOnOrder);
		}

		Integer qtyBackOrdered = (Integer)attributes.get("qtyBackOrdered");

		if (qtyBackOrdered != null) {
			setQtyBackOrdered(qtyBackOrdered);
		}

		Integer qtyDropShipped = (Integer)attributes.get("qtyDropShipped");

		if (qtyDropShipped != null) {
			setQtyDropShipped(qtyDropShipped);
		}

		Integer qtyInUse = (Integer)attributes.get("qtyInUse");

		if (qtyInUse != null) {
			setQtyInUse(qtyInUse);
		}

		Integer qtyInService = (Integer)attributes.get("qtyInService");

		if (qtyInService != null) {
			setQtyInService(qtyInService);
		}

		Integer qtyReturned = (Integer)attributes.get("qtyReturned");

		if (qtyReturned != null) {
			setQtyReturned(qtyReturned);
		}

		Integer qtyDamaged = (Integer)attributes.get("qtyDamaged");

		if (qtyDamaged != null) {
			setQtyDamaged(qtyDamaged);
		}

		Integer qtyOnHand = (Integer)attributes.get("qtyOnHand");

		if (qtyOnHand != null) {
			setQtyOnHand(qtyOnHand);
		}

		Integer qtyAllocated = (Integer)attributes.get("qtyAllocated");

		if (qtyAllocated != null) {
			setQtyAllocated(qtyAllocated);
		}

		Integer qtyCommitted = (Integer)attributes.get("qtyCommitted");

		if (qtyCommitted != null) {
			setQtyCommitted(qtyCommitted);
		}

		Integer qtySold = (Integer)attributes.get("qtySold");

		if (qtySold != null) {
			setQtySold(qtySold);
		}

		Integer inactive = (Integer)attributes.get("inactive");

		if (inactive != null) {
			setInactive(inactive);
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
	public inventory cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this inventory.
	 *
	 * @return the company ID of this inventory
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the created date of this inventory.
	 *
	 * @return the created date of this inventory
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the inactive of this inventory.
	 *
	 * @return the inactive of this inventory
	 */
	@Override
	public Integer getInactive() {
		return model.getInactive();
	}

	/**
	 * Returns the inter ID of this inventory.
	 *
	 * @return the inter ID of this inventory
	 */
	@Override
	public String getInterId() {
		return model.getInterId();
	}

	/**
	 * Returns the item number of this inventory.
	 *
	 * @return the item number of this inventory
	 */
	@Override
	public String getItemNumber() {
		return model.getItemNumber();
	}

	/**
	 * Returns the location code of this inventory.
	 *
	 * @return the location code of this inventory
	 */
	@Override
	public String getLocationCode() {
		return model.getLocationCode();
	}

	/**
	 * Returns the location desc of this inventory.
	 *
	 * @return the location desc of this inventory
	 */
	@Override
	public String getLocationDesc() {
		return model.getLocationDesc();
	}

	/**
	 * Returns the master data inventory ID of this inventory.
	 *
	 * @return the master data inventory ID of this inventory
	 */
	@Override
	public long getMasterDataInventoryId() {
		return model.getMasterDataInventoryId();
	}

	/**
	 * Returns the modified date of this inventory.
	 *
	 * @return the modified date of this inventory
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this inventory.
	 *
	 * @return the primary key of this inventory
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qty allocated of this inventory.
	 *
	 * @return the qty allocated of this inventory
	 */
	@Override
	public Integer getQtyAllocated() {
		return model.getQtyAllocated();
	}

	/**
	 * Returns the qty back ordered of this inventory.
	 *
	 * @return the qty back ordered of this inventory
	 */
	@Override
	public Integer getQtyBackOrdered() {
		return model.getQtyBackOrdered();
	}

	/**
	 * Returns the qty committed of this inventory.
	 *
	 * @return the qty committed of this inventory
	 */
	@Override
	public Integer getQtyCommitted() {
		return model.getQtyCommitted();
	}

	/**
	 * Returns the qty damaged of this inventory.
	 *
	 * @return the qty damaged of this inventory
	 */
	@Override
	public Integer getQtyDamaged() {
		return model.getQtyDamaged();
	}

	/**
	 * Returns the qty drop shipped of this inventory.
	 *
	 * @return the qty drop shipped of this inventory
	 */
	@Override
	public Integer getQtyDropShipped() {
		return model.getQtyDropShipped();
	}

	/**
	 * Returns the qty in service of this inventory.
	 *
	 * @return the qty in service of this inventory
	 */
	@Override
	public Integer getQtyInService() {
		return model.getQtyInService();
	}

	/**
	 * Returns the qty in use of this inventory.
	 *
	 * @return the qty in use of this inventory
	 */
	@Override
	public Integer getQtyInUse() {
		return model.getQtyInUse();
	}

	/**
	 * Returns the qty on hand of this inventory.
	 *
	 * @return the qty on hand of this inventory
	 */
	@Override
	public Integer getQtyOnHand() {
		return model.getQtyOnHand();
	}

	/**
	 * Returns the qty on order of this inventory.
	 *
	 * @return the qty on order of this inventory
	 */
	@Override
	public Integer getQtyOnOrder() {
		return model.getQtyOnOrder();
	}

	/**
	 * Returns the qty returned of this inventory.
	 *
	 * @return the qty returned of this inventory
	 */
	@Override
	public Integer getQtyReturned() {
		return model.getQtyReturned();
	}

	/**
	 * Returns the qty sold of this inventory.
	 *
	 * @return the qty sold of this inventory
	 */
	@Override
	public Integer getQtySold() {
		return model.getQtySold();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this inventory.
	 *
	 * @param companyId the company ID of this inventory
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the created date of this inventory.
	 *
	 * @param createdDate the created date of this inventory
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the inactive of this inventory.
	 *
	 * @param inactive the inactive of this inventory
	 */
	@Override
	public void setInactive(Integer inactive) {
		model.setInactive(inactive);
	}

	/**
	 * Sets the inter ID of this inventory.
	 *
	 * @param interId the inter ID of this inventory
	 */
	@Override
	public void setInterId(String interId) {
		model.setInterId(interId);
	}

	/**
	 * Sets the item number of this inventory.
	 *
	 * @param itemNumber the item number of this inventory
	 */
	@Override
	public void setItemNumber(String itemNumber) {
		model.setItemNumber(itemNumber);
	}

	/**
	 * Sets the location code of this inventory.
	 *
	 * @param locationCode the location code of this inventory
	 */
	@Override
	public void setLocationCode(String locationCode) {
		model.setLocationCode(locationCode);
	}

	/**
	 * Sets the location desc of this inventory.
	 *
	 * @param locationDesc the location desc of this inventory
	 */
	@Override
	public void setLocationDesc(String locationDesc) {
		model.setLocationDesc(locationDesc);
	}

	/**
	 * Sets the master data inventory ID of this inventory.
	 *
	 * @param masterDataInventoryId the master data inventory ID of this inventory
	 */
	@Override
	public void setMasterDataInventoryId(long masterDataInventoryId) {
		model.setMasterDataInventoryId(masterDataInventoryId);
	}

	/**
	 * Sets the modified date of this inventory.
	 *
	 * @param modifiedDate the modified date of this inventory
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this inventory.
	 *
	 * @param primaryKey the primary key of this inventory
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qty allocated of this inventory.
	 *
	 * @param qtyAllocated the qty allocated of this inventory
	 */
	@Override
	public void setQtyAllocated(Integer qtyAllocated) {
		model.setQtyAllocated(qtyAllocated);
	}

	/**
	 * Sets the qty back ordered of this inventory.
	 *
	 * @param qtyBackOrdered the qty back ordered of this inventory
	 */
	@Override
	public void setQtyBackOrdered(Integer qtyBackOrdered) {
		model.setQtyBackOrdered(qtyBackOrdered);
	}

	/**
	 * Sets the qty committed of this inventory.
	 *
	 * @param qtyCommitted the qty committed of this inventory
	 */
	@Override
	public void setQtyCommitted(Integer qtyCommitted) {
		model.setQtyCommitted(qtyCommitted);
	}

	/**
	 * Sets the qty damaged of this inventory.
	 *
	 * @param qtyDamaged the qty damaged of this inventory
	 */
	@Override
	public void setQtyDamaged(Integer qtyDamaged) {
		model.setQtyDamaged(qtyDamaged);
	}

	/**
	 * Sets the qty drop shipped of this inventory.
	 *
	 * @param qtyDropShipped the qty drop shipped of this inventory
	 */
	@Override
	public void setQtyDropShipped(Integer qtyDropShipped) {
		model.setQtyDropShipped(qtyDropShipped);
	}

	/**
	 * Sets the qty in service of this inventory.
	 *
	 * @param qtyInService the qty in service of this inventory
	 */
	@Override
	public void setQtyInService(Integer qtyInService) {
		model.setQtyInService(qtyInService);
	}

	/**
	 * Sets the qty in use of this inventory.
	 *
	 * @param qtyInUse the qty in use of this inventory
	 */
	@Override
	public void setQtyInUse(Integer qtyInUse) {
		model.setQtyInUse(qtyInUse);
	}

	/**
	 * Sets the qty on hand of this inventory.
	 *
	 * @param qtyOnHand the qty on hand of this inventory
	 */
	@Override
	public void setQtyOnHand(Integer qtyOnHand) {
		model.setQtyOnHand(qtyOnHand);
	}

	/**
	 * Sets the qty on order of this inventory.
	 *
	 * @param qtyOnOrder the qty on order of this inventory
	 */
	@Override
	public void setQtyOnOrder(Integer qtyOnOrder) {
		model.setQtyOnOrder(qtyOnOrder);
	}

	/**
	 * Sets the qty returned of this inventory.
	 *
	 * @param qtyReturned the qty returned of this inventory
	 */
	@Override
	public void setQtyReturned(Integer qtyReturned) {
		model.setQtyReturned(qtyReturned);
	}

	/**
	 * Sets the qty sold of this inventory.
	 *
	 * @param qtySold the qty sold of this inventory
	 */
	@Override
	public void setQtySold(Integer qtySold) {
		model.setQtySold(qtySold);
	}

	@Override
	protected inventoryWrapper wrap(inventory inventory) {
		return new inventoryWrapper(inventory);
	}

}