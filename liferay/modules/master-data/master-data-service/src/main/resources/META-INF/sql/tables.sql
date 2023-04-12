create table sol_master_data_inventory (
	masterDataInventoryId LONG not null primary key,
	itemNumber VARCHAR(75) null,
	companyId LONG,
	interId VARCHAR(75) null,
	locationCode VARCHAR(75) null,
	locationDesc VARCHAR(75) null,
	qtyOnOrder INTEGER,
	qtyBackOrdered INTEGER,
	qtyDropShipped INTEGER,
	qtyInUse INTEGER,
	qtyInService INTEGER,
	qtyReturned INTEGER,
	qtyDamaged INTEGER,
	qtyOnHand INTEGER,
	qtyAllocated INTEGER,
	qtyCommitted INTEGER,
	qtySold INTEGER,
	inactive INTEGER,
	createdDate DATE null,
	modifiedDate DATE null
);

create table sol_master_data_item (
	masterDataItemId LONG not null primary key,
	category VARCHAR(75) null,
	inactive INTEGER,
	interId VARCHAR(75) null,
	itemNumber VARCHAR(75) null,
	itemTaxSchId VARCHAR(75) null,
	itemType INTEGER,
	subCategory VARCHAR(75) null,
	taxOptions INTEGER,
	title VARCHAR(75) null,
	uOfMSchedule VARCHAR(75) null,
	visibility VARCHAR(75) null,
	createdDate DATE null,
	modifiedDate DATE null
);