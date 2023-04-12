package com.sol.petroleum.headless.rest.api.client.dto.v1_0;

import com.sol.petroleum.headless.rest.api.client.function.UnsafeSupplier;
import com.sol.petroleum.headless.rest.api.client.serdes.v1_0.InventorySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class Inventory implements Cloneable, Serializable {

	public static Inventory toDTO(String json) {
		return InventorySerDes.toDTO(json);
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public void setActionName(
		UnsafeSupplier<String, Exception> actionNameUnsafeSupplier) {

		try {
			actionName = actionNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String actionName;

	public InventoryArray[] getInventoryArray() {
		return inventoryArray;
	}

	public void setInventoryArray(InventoryArray[] inventoryArray) {
		this.inventoryArray = inventoryArray;
	}

	public void setInventoryArray(
		UnsafeSupplier<InventoryArray[], Exception>
			inventoryArrayUnsafeSupplier) {

		try {
			inventoryArray = inventoryArrayUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected InventoryArray[] inventoryArray;

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public void setSourceType(
		UnsafeSupplier<String, Exception> sourceTypeUnsafeSupplier) {

		try {
			sourceType = sourceTypeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String sourceType;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setUuid(UnsafeSupplier<String, Exception> uuidUnsafeSupplier) {
		try {
			uuid = uuidUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String uuid;

	@Override
	public Inventory clone() throws CloneNotSupportedException {
		return (Inventory)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Inventory)) {
			return false;
		}

		Inventory inventory = (Inventory)object;

		return Objects.equals(toString(), inventory.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return InventorySerDes.toJSON(this);
	}

}