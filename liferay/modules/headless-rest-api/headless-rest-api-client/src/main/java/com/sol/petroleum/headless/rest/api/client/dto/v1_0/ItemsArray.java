package com.sol.petroleum.headless.rest.api.client.dto.v1_0;

import com.sol.petroleum.headless.rest.api.client.function.UnsafeSupplier;
import com.sol.petroleum.headless.rest.api.client.serdes.v1_0.ItemsArraySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class ItemsArray implements Cloneable, Serializable {

	public static ItemsArray toDTO(String json) {
		return ItemsArraySerDes.toDTO(json);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCategory(
		UnsafeSupplier<String, Exception> categoryUnsafeSupplier) {

		try {
			category = categoryUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String category;

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

	public String getItemTaxSchId() {
		return itemTaxSchId;
	}

	public void setItemTaxSchId(String itemTaxSchId) {
		this.itemTaxSchId = itemTaxSchId;
	}

	public void setItemTaxSchId(
		UnsafeSupplier<String, Exception> itemTaxSchIdUnsafeSupplier) {

		try {
			itemTaxSchId = itemTaxSchIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String itemTaxSchId;

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public void setItemType(
		UnsafeSupplier<Integer, Exception> itemTypeUnsafeSupplier) {

		try {
			itemType = itemTypeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer itemType;

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public void setSubCategory(
		UnsafeSupplier<String, Exception> subCategoryUnsafeSupplier) {

		try {
			subCategory = subCategoryUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String subCategory;

	public Integer getTaxOptions() {
		return taxOptions;
	}

	public void setTaxOptions(Integer taxOptions) {
		this.taxOptions = taxOptions;
	}

	public void setTaxOptions(
		UnsafeSupplier<Integer, Exception> taxOptionsUnsafeSupplier) {

		try {
			taxOptions = taxOptionsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer taxOptions;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String title;

	public String getUOfMSchedule() {
		return uOfMSchedule;
	}

	public void setUOfMSchedule(String uOfMSchedule) {
		this.uOfMSchedule = uOfMSchedule;
	}

	public void setUOfMSchedule(
		UnsafeSupplier<String, Exception> uOfMScheduleUnsafeSupplier) {

		try {
			uOfMSchedule = uOfMScheduleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String uOfMSchedule;

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public void setVisibility(
		UnsafeSupplier<String, Exception> visibilityUnsafeSupplier) {

		try {
			visibility = visibilityUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String visibility;

	@Override
	public ItemsArray clone() throws CloneNotSupportedException {
		return (ItemsArray)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ItemsArray)) {
			return false;
		}

		ItemsArray itemsArray = (ItemsArray)object;

		return Objects.equals(toString(), itemsArray.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ItemsArraySerDes.toJSON(this);
	}

}