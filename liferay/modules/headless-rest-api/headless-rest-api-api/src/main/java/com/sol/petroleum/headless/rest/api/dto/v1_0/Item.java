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

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
@GraphQLName("Item")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Item")
public class Item implements Serializable {

	public static Item toDTO(String json) {
		return ObjectMapperUtil.readValue(Item.class, json);
	}

	public static Item unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Item.class, json);
	}

	@Schema(example = "get-All-Items")
	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	@JsonIgnore
	public void setActionName(
		UnsafeSupplier<String, Exception> actionNameUnsafeSupplier) {

		try {
			actionName = actionNameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(
		access = JsonProperty.Access.READ_WRITE, value = "action-name"
	)
	protected String actionName;

	@Schema
	@Valid
	public ItemsArray[] getItemsArray() {
		return itemsArray;
	}

	public void setItemsArray(ItemsArray[] itemsArray) {
		this.itemsArray = itemsArray;
	}

	@JsonIgnore
	public void setItemsArray(
		UnsafeSupplier<ItemsArray[], Exception> itemsArrayUnsafeSupplier) {

		try {
			itemsArray = itemsArrayUnsafeSupplier.get();
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
	protected ItemsArray[] itemsArray;

	@Schema(example = "integration")
	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	@JsonIgnore
	public void setSourceType(
		UnsafeSupplier<String, Exception> sourceTypeUnsafeSupplier) {

		try {
			sourceType = sourceTypeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(
		access = JsonProperty.Access.READ_WRITE, value = "source-type"
	)
	protected String sourceType;

	@Schema(example = "HAVHDBRAKEF")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@JsonIgnore
	public void setUuid(UnsafeSupplier<String, Exception> uuidUnsafeSupplier) {
		try {
			uuid = uuidUnsafeSupplier.get();
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
	protected String uuid;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (actionName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"action-name\": ");

			sb.append("\"");

			sb.append(_escape(actionName));

			sb.append("\"");
		}

		if (itemsArray != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemsArray\": ");

			sb.append("[");

			for (int i = 0; i < itemsArray.length; i++) {
				sb.append(String.valueOf(itemsArray[i]));

				if ((i + 1) < itemsArray.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (sourceType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"source-type\": ");

			sb.append("\"");

			sb.append(_escape(sourceType));

			sb.append("\"");
		}

		if (uuid != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uuid\": ");

			sb.append("\"");

			sb.append(_escape(uuid));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.sol.petroleum.headless.rest.api.dto.v1_0.Item",
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