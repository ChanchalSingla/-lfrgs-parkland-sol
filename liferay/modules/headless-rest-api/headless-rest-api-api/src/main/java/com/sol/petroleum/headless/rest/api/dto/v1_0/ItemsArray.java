package com.sol.petroleum.headless.rest.api.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
@GraphQLName("ItemsArray")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ItemsArray")
public class ItemsArray implements Serializable {

	public static ItemsArray toDTO(String json) {
		return ObjectMapperUtil.readValue(ItemsArray.class, json);
	}

	public static ItemsArray unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ItemsArray.class, json);
	}

	@Schema(example = "Fuel")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@JsonIgnore
	public void setCategory(
		UnsafeSupplier<String, Exception> categoryUnsafeSupplier) {

		try {
			category = categoryUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String category;

	@Schema(example = "0")
	public Integer getInactive() {
		return inactive;
	}

	public void setInactive(Integer inactive) {
		this.inactive = inactive;
	}

	@JsonIgnore
	public void setInactive(
		UnsafeSupplier<Integer, Exception> inactiveUnsafeSupplier) {

		try {
			inactive = inactiveUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer inactive;

	@Schema(example = "SOL")
	public String getInterId() {
		return interId;
	}

	public void setInterId(String interId) {
		this.interId = interId;
	}

	@JsonIgnore
	public void setInterId(
		UnsafeSupplier<String, Exception> interIdUnsafeSupplier) {

		try {
			interId = interIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String interId;

	@Schema(example = "CHVSUPREM20W50QRTS205EA")
	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	@JsonIgnore
	public void setItemNumber(
		UnsafeSupplier<String, Exception> itemNumberUnsafeSupplier) {

		try {
			itemNumber = itemNumberUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String itemNumber;

	@Schema(example = "GCT-S")
	public String getItemTaxSchId() {
		return itemTaxSchId;
	}

	public void setItemTaxSchId(String itemTaxSchId) {
		this.itemTaxSchId = itemTaxSchId;
	}

	@JsonIgnore
	public void setItemTaxSchId(
		UnsafeSupplier<String, Exception> itemTaxSchIdUnsafeSupplier) {

		try {
			itemTaxSchId = itemTaxSchIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String itemTaxSchId;

	@Schema(example = "1")
	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	@JsonIgnore
	public void setItemType(
		UnsafeSupplier<Integer, Exception> itemTypeUnsafeSupplier) {

		try {
			itemType = itemTypeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer itemType;

	@Schema(example = "Diesel")
	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@JsonIgnore
	public void setSubCategory(
		UnsafeSupplier<String, Exception> subCategoryUnsafeSupplier) {

		try {
			subCategory = subCategoryUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String subCategory;

	@Schema(example = "1")
	public Integer getTaxOptions() {
		return taxOptions;
	}

	public void setTaxOptions(Integer taxOptions) {
		this.taxOptions = taxOptions;
	}

	@JsonIgnore
	public void setTaxOptions(
		UnsafeSupplier<Integer, Exception> taxOptionsUnsafeSupplier) {

		try {
			taxOptions = taxOptionsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer taxOptions;

	@Schema(example = "CHV SUPREME MO 20W50 1*1 QT")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@JsonIgnore
	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String title;

	@Schema(example = "EACH")
	public String getUOfMSchedule() {
		return uOfMSchedule;
	}

	public void setUOfMSchedule(String uOfMSchedule) {
		this.uOfMSchedule = uOfMSchedule;
	}

	@JsonIgnore
	public void setUOfMSchedule(
		UnsafeSupplier<String, Exception> uOfMScheduleUnsafeSupplier) {

		try {
			uOfMSchedule = uOfMScheduleUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String uOfMSchedule;

	@Schema(example = "B2C")
	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	@JsonIgnore
	public void setVisibility(
		UnsafeSupplier<String, Exception> visibilityUnsafeSupplier) {

		try {
			visibility = visibilityUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String visibility;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (category != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"category\": ");

			sb.append("\"");

			sb.append(_escape(category));

			sb.append("\"");
		}

		if (inactive != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inactive\": ");

			sb.append(inactive);
		}

		if (interId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"interId\": ");

			sb.append("\"");

			sb.append(_escape(interId));

			sb.append("\"");
		}

		if (itemNumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemNumber\": ");

			sb.append("\"");

			sb.append(_escape(itemNumber));

			sb.append("\"");
		}

		if (itemTaxSchId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemTaxSchId\": ");

			sb.append("\"");

			sb.append(_escape(itemTaxSchId));

			sb.append("\"");
		}

		if (itemType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemType\": ");

			sb.append(itemType);
		}

		if (subCategory != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subCategory\": ");

			sb.append("\"");

			sb.append(_escape(subCategory));

			sb.append("\"");
		}

		if (taxOptions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxOptions\": ");

			sb.append(taxOptions);
		}

		if (title != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(title));

			sb.append("\"");
		}

		if (uOfMSchedule != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uOfMSchedule\": ");

			sb.append("\"");

			sb.append(_escape(uOfMSchedule));

			sb.append("\"");
		}

		if (visibility != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"visibility\": ");

			sb.append("\"");

			sb.append(_escape(visibility));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.sol.petroleum.headless.rest.api.dto.v1_0.ItemsArray",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}