package com.sol.petroleum.headless.rest.api.client.dto.v1_0;

import com.sol.petroleum.headless.rest.api.client.function.UnsafeSupplier;
import com.sol.petroleum.headless.rest.api.client.serdes.v1_0.ItemSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class Item implements Cloneable, Serializable {

	public static Item toDTO(String json) {
		return ItemSerDes.toDTO(json);
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

	public ItemsArray[] getItemsArray() {
		return itemsArray;
	}

	public void setItemsArray(ItemsArray[] itemsArray) {
		this.itemsArray = itemsArray;
	}

	public void setItemsArray(
		UnsafeSupplier<ItemsArray[], Exception> itemsArrayUnsafeSupplier) {

		try {
			itemsArray = itemsArrayUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ItemsArray[] itemsArray;

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
	public Item clone() throws CloneNotSupportedException {
		return (Item)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Item)) {
			return false;
		}

		Item item = (Item)object;

		return Objects.equals(toString(), item.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ItemSerDes.toJSON(this);
	}

}