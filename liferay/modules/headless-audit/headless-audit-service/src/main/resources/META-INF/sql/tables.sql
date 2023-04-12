create table sol_audit_apiAudit (
	auditId LONG not null primary key,
	UUID VARCHAR(75) null,
	createdDate DATE null,
	actionName VARCHAR(75) null,
	sourceType VARCHAR(75) null,
	status INTEGER,
	statusCode VARCHAR(75) null,
	requestJson STRING null,
	responseJson STRING null,
	requestTime DATE null,
	responseTime DATE null
);