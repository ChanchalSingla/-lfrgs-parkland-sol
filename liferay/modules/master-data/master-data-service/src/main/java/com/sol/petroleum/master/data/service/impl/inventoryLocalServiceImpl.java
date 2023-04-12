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

package com.sol.petroleum.master.data.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.sol.petroleum.master.data.model.inventory;
import com.sol.petroleum.master.data.service.base.inventoryLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.sol.petroleum.master.data.model.inventory",
	service = AopService.class
)
public class inventoryLocalServiceImpl extends inventoryLocalServiceBaseImpl {
	
public static Log _log = LogFactoryUtil.getLog(inventoryLocalServiceImpl.class);
	
	public inventory addOrUpdateInventoryAudit(long companyId, int qtyOnOrder, int qtyBackOrdered, int qtyDropShipped, int qtyInUse, int qtyReturned, int qtyDamaged, int qtyAllocated, int qtySold, int qtyCommitted, int inactive, String interId, String itemNumber, int qtyInService, String locationCode, String locationDesc, int qtyOnHand) {
		
		inventory addInventoryAudit  = null;
		try {
		addInventoryAudit = inventoryPersistence.fetchBylocationCode(locationCode);
		}
		catch(Exception e) {
			_log.error("Error While getting inventory by loactionCode", e);
		}
		try {
		if(Validator.isNotNull(addInventoryAudit)){
			addInventoryAudit.setQtyOnOrder(qtyOnOrder);
			addInventoryAudit.setInactive(inactive);
			addInventoryAudit.setInterId(interId);
			addInventoryAudit.setItemNumber(itemNumber);
			addInventoryAudit.setQtyInService(qtyInService);
			addInventoryAudit.setQtyBackOrdered(qtyBackOrdered);
			addInventoryAudit.setQtyDropShipped(qtyDropShipped);
			addInventoryAudit.setLocationCode(locationCode);
			addInventoryAudit.setLocationDesc(locationDesc);
			addInventoryAudit.setQtyOnHand(qtyOnHand);
			addInventoryAudit.setQtyInUse(qtyInUse);
			addInventoryAudit.setQtyReturned(qtyReturned);
			addInventoryAudit.setQtyDamaged(qtyDamaged);
			addInventoryAudit.setQtyAllocated(qtyAllocated);
			addInventoryAudit.setQtySold(qtySold);
			addInventoryAudit.setQtyCommitted(qtyCommitted);
			addInventoryAudit.setCompanyId(companyId);
			addInventoryAudit.setModifiedDate(new Date());
			addInventoryAudit = inventoryLocalService.updateinventory(addInventoryAudit);
		}
		else {
		long masterDataInventoryId = counterLocalService.increment(inventory.class.getName());
		
			addInventoryAudit = inventoryLocalService.createinventory(masterDataInventoryId);
			addInventoryAudit.setQtyOnOrder(qtyOnOrder);
			addInventoryAudit.setInactive(inactive);
			addInventoryAudit.setInterId(interId);
			addInventoryAudit.setItemNumber(itemNumber);
			addInventoryAudit.setQtyInService(qtyInService);
			addInventoryAudit.setQtyBackOrdered(qtyBackOrdered);
			addInventoryAudit.setQtyDropShipped(qtyDropShipped);
			addInventoryAudit.setLocationCode(locationCode);
			addInventoryAudit.setLocationDesc(locationDesc);
			addInventoryAudit.setQtyOnHand(qtyOnHand);
			addInventoryAudit.setQtyInUse(qtyInUse);
			addInventoryAudit.setQtyReturned(qtyReturned);
			addInventoryAudit.setQtyDamaged(qtyDamaged);
			addInventoryAudit.setQtyAllocated(qtyAllocated);
			addInventoryAudit.setQtySold(qtySold);
			addInventoryAudit.setQtyCommitted(qtyCommitted);
			addInventoryAudit.setCompanyId(companyId);
			addInventoryAudit.setCreatedDate(new Date());
			addInventoryAudit.setModifiedDate(new Date());
			addInventoryAudit = inventoryLocalService.addinventory(addInventoryAudit);
		}
		}
		catch (Exception e) {
			_log.error("Error in adding the entry to apiAuditService entity", e);
		}
		return addInventoryAudit;
		
	}
	

	public inventory getInventoryByLocationCode(String locationCode) {
	inventory inventoryvar = null;
	try {
		inventoryvar = inventoryPersistence.fetchBylocationCode(locationCode);
	}
	catch(Exception e) {
		_log.error("Error While getting inventory by loactionCode", e);
	}
	return inventoryvar;
	}
	
}