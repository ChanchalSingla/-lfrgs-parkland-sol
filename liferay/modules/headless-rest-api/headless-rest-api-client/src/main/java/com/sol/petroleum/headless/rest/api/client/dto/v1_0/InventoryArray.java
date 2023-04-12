package com.sol.petroleum.headless.rest.api.client.dto.v1_0;

import com.sol.petroleum.headless.rest.api.client.function.UnsafeSupplier;
import com.sol.petroleum.headless.rest.api.client.serdes.v1_0.InventoryArraySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class InventoryArray implements Cloneable, Serializable {

	public static InventoryArray toDTO(String json) {
		return InventoryArraySerDes.toDTO(json);
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setCompanyId(
		UnsafeSupplier<Long, Exception> companyIdUnsafeSupplier) {

		try {
			companyId = companyIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long companyId;

	public Integer getInactive() {
		return inactive;
	}

	public void setInactive(Integer inactive) {
		this.inactive = inactive;
	}

	public void setInactive(
		UnsafeSupplier<Integer, Exception> inactiveUnsafeSupplier) {

		try {
			inactive = inactiveUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer inactive;

	public String getInterId() {
		return interId;
	}

	public void setInterId(String interId) {
		this.interId = interId;
	}

	public void setInterId(
		UnsafeSupplier<String, Exception> interIdUnsafeSupplier) {

		try {
			interId = interIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String interId;

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public void setItemNumber(
		UnsafeSupplier<String, Exception> itemNumberUnsafeSupplier) {

		try {
			itemNumber = itemNumberUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String itemNumber;

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public void setLocationCode(
		UnsafeSupplier<String, Exception> locationCodeUnsafeSupplier) {

		try {
			locationCode = locationCodeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String locationCode;

	public String getLocationDesc() {
		return locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	public void setLocationDesc(
		UnsafeSupplier<String, Exception> locationDescUnsafeSupplier) {

		try {
			locationDesc = locationDescUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String locationDesc;

	public Integer getQtyAllocated() {
		return qtyAllocated;
	}

	public void setQtyAllocated(Integer qtyAllocated) {
		this.qtyAllocated = qtyAllocated;
	}

	public void setQtyAllocated(
		UnsafeSupplier<Integer, Exception> qtyAllocatedUnsafeSupplier) {

		try {
			qtyAllocated = qtyAllocatedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyAllocated;

	public Integer getQtyBackOrdered() {
		return qtyBackOrdered;
	}

	public void setQtyBackOrdered(Integer qtyBackOrdered) {
		this.qtyBackOrdered = qtyBackOrdered;
	}

	public void setQtyBackOrdered(
		UnsafeSupplier<Integer, Exception> qtyBackOrderedUnsafeSupplier) {

		try {
			qtyBackOrdered = qtyBackOrderedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyBackOrdered;

	public Integer getQtyCommitted() {
		return qtyCommitted;
	}

	public void setQtyCommitted(Integer qtyCommitted) {
		this.qtyCommitted = qtyCommitted;
	}

	public void setQtyCommitted(
		UnsafeSupplier<Integer, Exception> qtyCommittedUnsafeSupplier) {

		try {
			qtyCommitted = qtyCommittedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyCommitted;

	public Integer getQtyDamaged() {
		return qtyDamaged;
	}

	public void setQtyDamaged(Integer qtyDamaged) {
		this.qtyDamaged = qtyDamaged;
	}

	public void setQtyDamaged(
		UnsafeSupplier<Integer, Exception> qtyDamagedUnsafeSupplier) {

		try {
			qtyDamaged = qtyDamagedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyDamaged;

	public Integer getQtyDropShipped() {
		return qtyDropShipped;
	}

	public void setQtyDropShipped(Integer qtyDropShipped) {
		this.qtyDropShipped = qtyDropShipped;
	}

	public void setQtyDropShipped(
		UnsafeSupplier<Integer, Exception> qtyDropShippedUnsafeSupplier) {

		try {
			qtyDropShipped = qtyDropShippedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyDropShipped;

	public Integer getQtyInService() {
		return qtyInService;
	}

	public void setQtyInService(Integer qtyInService) {
		this.qtyInService = qtyInService;
	}

	public void setQtyInService(
		UnsafeSupplier<Integer, Exception> qtyInServiceUnsafeSupplier) {

		try {
			qtyInService = qtyInServiceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyInService;

	public Integer getQtyInUse() {
		return qtyInUse;
	}

	public void setQtyInUse(Integer qtyInUse) {
		this.qtyInUse = qtyInUse;
	}

	public void setQtyInUse(
		UnsafeSupplier<Integer, Exception> qtyInUseUnsafeSupplier) {

		try {
			qtyInUse = qtyInUseUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyInUse;

	public Integer getQtyOnHand() {
		return qtyOnHand;
	}

	public void setQtyOnHand(Integer qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}

	public void setQtyOnHand(
		UnsafeSupplier<Integer, Exception> qtyOnHandUnsafeSupplier) {

		try {
			qtyOnHand = qtyOnHandUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyOnHand;

	public Integer getQtyOnOrder() {
		return qtyOnOrder;
	}

	public void setQtyOnOrder(Integer qtyOnOrder) {
		this.qtyOnOrder = qtyOnOrder;
	}

	public void setQtyOnOrder(
		UnsafeSupplier<Integer, Exception> qtyOnOrderUnsafeSupplier) {

		try {
			qtyOnOrder = qtyOnOrderUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyOnOrder;

	public Integer getQtyReturned() {
		return qtyReturned;
	}

	public void setQtyReturned(Integer qtyReturned) {
		this.qtyReturned = qtyReturned;
	}

	public void setQtyReturned(
		UnsafeSupplier<Integer, Exception> qtyReturnedUnsafeSupplier) {

		try {
			qtyReturned = qtyReturnedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtyReturned;

	public Integer getQtySold() {
		return qtySold;
	}

	public void setQtySold(Integer qtySold) {
		this.qtySold = qtySold;
	}

	public void setQtySold(
		UnsafeSupplier<Integer, Exception> qtySoldUnsafeSupplier) {

		try {
			qtySold = qtySoldUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer qtySold;

	@Override
	public InventoryArray clone() throws CloneNotSupportedException {
		return (InventoryArray)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InventoryArray)) {
			return false;
		}

		InventoryArray inventoryArray = (InventoryArray)object;

		return Objects.equals(toString(), inventoryArray.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return InventoryArraySerDes.toJSON(this);
	}

}