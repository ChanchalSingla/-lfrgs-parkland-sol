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
 * The table class for the &quot;sol_master_data_item&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see item
 * @generated
 */
public class itemTable extends BaseTable<itemTable> {

	public static final itemTable INSTANCE = new itemTable();

	public final Column<itemTable, Long> masterDataItemId = createColumn(
		"masterDataItemId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<itemTable, String> category = createColumn(
		"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, Integer> inactive = createColumn(
		"inactive", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> interId = createColumn(
		"interId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> itemNumber = createColumn(
		"itemNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> itemTaxSchId = createColumn(
		"itemTaxSchId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, Integer> itemType = createColumn(
		"itemType", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> subCategory = createColumn(
		"subCategory", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, Integer> taxOptions = createColumn(
		"taxOptions", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> title = createColumn(
		"title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> uOfMSchedule = createColumn(
		"uOfMSchedule", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, String> visibility = createColumn(
		"visibility", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<itemTable, Date> createdDate = createColumn(
		"createdDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<itemTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private itemTable() {
		super("sol_master_data_item", itemTable::new);
	}

}