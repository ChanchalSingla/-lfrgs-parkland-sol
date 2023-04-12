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

package com.sol.petroleum.headless.audit.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;sol_audit_apiAudit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see apiAudit
 * @generated
 */
public class apiAuditTable extends BaseTable<apiAuditTable> {

	public static final apiAuditTable INSTANCE = new apiAuditTable();

	public final Column<apiAuditTable, Long> auditId = createColumn(
		"auditId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);

	public final Column<apiAuditTable, String> UUID = createColumn(
		"UUID", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	public final Column<apiAuditTable, Date> createdDate = createColumn(
		"createdDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, String> actionName = createColumn(
		"actionName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, String> sourceType = createColumn(
		"sourceType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, String> statusCode = createColumn(
		"statusCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, String> requestJson = createColumn(
		"requestJson", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, String> responseJson = createColumn(
		"responseJson", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, Date> requestTime = createColumn(
		"requestTime", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<apiAuditTable, Date> responseTime = createColumn(
		"responseTime", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private apiAuditTable() {
		super("sol_audit_apiAudit", apiAuditTable::new);
	}

}