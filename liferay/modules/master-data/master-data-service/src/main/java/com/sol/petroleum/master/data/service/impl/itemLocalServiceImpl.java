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
import com.sol.petroleum.master.data.model.item;
import com.sol.petroleum.master.data.service.base.itemLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.sol.petroleum.master.data.model.item",
	service = AopService.class
)
public class itemLocalServiceImpl extends itemLocalServiceBaseImpl {
	public static Log _log = LogFactoryUtil.getLog(itemLocalServiceImpl.class);
	
	public item addOrUpdtaeItemAudit(String category, int inactive, String interId, String itemNumber, String itemTaxSchId, int itemType, String subCategory, int taxOptions, String title, String uOfMSchedule, String visibility) {
		
		item addItemAudit  = null;
		try {
			addItemAudit = itemPersistence.fetchByitemNumber(itemNumber);
		}
		catch(Exception e) {
			_log.error("Error while getting apiAuditService entity", e);
		}

		try {
		if(Validator.isNotNull(addItemAudit)) {
			addItemAudit.setCategory(subCategory);
			addItemAudit.setInactive(inactive);
			addItemAudit.setInterId(interId);
			addItemAudit.setItemNumber(itemNumber);
			addItemAudit.setItemTaxSchId(itemTaxSchId);
			addItemAudit.setItemType(itemType);
			addItemAudit.setSubCategory(subCategory);
			addItemAudit.setTaxOptions(taxOptions);
			addItemAudit.setTitle(title);
			addItemAudit.setUOfMSchedule(uOfMSchedule);
			addItemAudit.setVisibility(visibility);
			addItemAudit.setCreatedDate(new Date());
			addItemAudit.setModifiedDate(new Date());
			addItemAudit = itemLocalService.updateitem(addItemAudit);
		}		
		else {
		long masterDataItemId = counterLocalService.increment(item.class.getName());
			addItemAudit = itemLocalService.createitem(masterDataItemId);
			addItemAudit.setCategory(subCategory);
			addItemAudit.setInactive(inactive);
			addItemAudit.setInterId(interId);
			addItemAudit.setItemNumber(itemNumber);
			addItemAudit.setItemTaxSchId(itemTaxSchId);
			addItemAudit.setItemType(itemType);
			addItemAudit.setSubCategory(subCategory);
			addItemAudit.setTaxOptions(taxOptions);
			addItemAudit.setTitle(title);
			addItemAudit.setUOfMSchedule(uOfMSchedule);
			addItemAudit.setVisibility(visibility);
			addItemAudit.setCreatedDate(new Date());
			addItemAudit.setModifiedDate(new Date());
			addItemAudit = itemLocalService.additem(addItemAudit);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			_log.error("Error in adding or updating the entry to apiAuditService entity", e);
		}
		
		return addItemAudit;
		
	}
	
	
	
}