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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;sol_master_data_inventory&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see inventory
 * @generated
 */
public class inventoryTable extends BaseTable<inventoryTable> {

	public static final inventoryTable INSTANCE = new inventoryTable();

	public final Column<inventoryTable, Long> masterDataInventoryId =
		createColumn(
			"masterDataInventoryId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<inventoryTable, String> itemNumber = createColumn(
		"itemNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, String> interId = createColumn(
		"interId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, String> locationCode = createColumn(
		"locationCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, String> locationDesc = createColumn(
		"locationDesc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyOnOrder = createColumn(
		"qtyOnOrder", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyBackOrdered = createColumn(
		"qtyBackOrdered", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyDropShipped = createColumn(
		"qtyDropShipped", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyInUse = createColumn(
		"qtyInUse", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyInService = createColumn(
		"qtyInService", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyReturned = createColumn(
		"qtyReturned", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyDamaged = createColumn(
		"qtyDamaged", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyOnHand = createColumn(
		"qtyOnHand", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyAllocated = createColumn(
		"qtyAllocated", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtyCommitted = createColumn(
		"qtyCommitted", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> qtySold = createColumn(
		"qtySold", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Integer> inactive = createColumn(
		"inactive", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Date> createdDate = createColumn(
		"createdDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<inventoryTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private inventoryTable() {
		super("sol_master_data_inventory", inventoryTable::new);
	}

}