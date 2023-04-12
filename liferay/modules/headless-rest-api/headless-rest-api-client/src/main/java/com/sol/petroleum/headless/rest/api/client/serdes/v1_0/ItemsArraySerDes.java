package com.sol.petroleum.headless.rest.api.client.serdes.v1_0;

import com.sol.petroleum.headless.rest.api.client.dto.v1_0.ItemsArray;
import com.sol.petroleum.headless.rest.api.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class ItemsArraySerDes {

	public static ItemsArray toDTO(String json) {
		ItemsArrayJSONParser itemsArrayJSONParser = new ItemsArrayJSONParser();

		return itemsArrayJSONParser.parseToDTO(json);
	}

	public static ItemsArray[] toDTOs(String json) {
		ItemsArrayJSONParser itemsArrayJSONParser = new ItemsArrayJSONParser();

		return itemsArrayJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ItemsArray itemsArray) {
		if (itemsArray == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (itemsArray.getCategory() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"category\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getCategory()));

			sb.append("\"");
		}

		if (itemsArray.getInactive() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inactive\": ");

			sb.append(itemsArray.getInactive());
		}

		if (itemsArray.getInterId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"interId\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getInterId()));

			sb.append("\"");
		}

		if (itemsArray.getItemNumber() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemNumber\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getItemNumber()));

			sb.append("\"");
		}

		if (itemsArray.getItemTaxSchId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemTaxSchId\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getItemTaxSchId()));

			sb.append("\"");
		}

		if (itemsArray.getItemType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemType\": ");

			sb.append(itemsArray.getItemType());
		}

		if (itemsArray.getSubCategory() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subCategory\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getSubCategory()));

			sb.append("\"");
		}

		if (itemsArray.getTaxOptions() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxOptions\": ");

			sb.append(itemsArray.getTaxOptions());
		}

		if (itemsArray.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getTitle()));

			sb.append("\"");
		}

		if (itemsArray.getUOfMSchedule() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uOfMSchedule\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getUOfMSchedule()));

			sb.append("\"");
		}

		if (itemsArray.getVisibility() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"visibility\": ");

			sb.append("\"");

			sb.append(_escape(itemsArray.getVisibility()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ItemsArrayJSONParser itemsArrayJSONParser = new ItemsArrayJSONParser();

		return itemsArrayJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ItemsArray itemsArray) {
		if (itemsArray == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (itemsArray.getCategory() == null) {
			map.put("category", null);
		}
		else {
			map.put("category", String.valueOf(itemsArray.getCategory()));
		}

		if (itemsArray.getInactive() == null) {
			map.put("inactive", null);
		}
		else {
			map.put("inactive", String.valueOf(itemsArray.getInactive()));
		}

		if (itemsArray.getInterId() == null) {
			map.put("interId", null);
		}
		else {
			map.put("interId", String.valueOf(itemsArray.getInterId()));
		}

		if (itemsArray.getItemNumber() == null) {
			map.put("itemNumber", null);
		}
		else {
			map.put("itemNumber", String.valueOf(itemsArray.getItemNumber()));
		}

		if (itemsArray.getItemTaxSchId() == null) {
			map.put("itemTaxSchId", null);
		}
		else {
			map.put(
				"itemTaxSchId", String.valueOf(itemsArray.getItemTaxSchId()));
		}

		if (itemsArray.getItemType() == null) {
			map.put("itemType", null);
		}
		else {
			map.put("itemType", String.valueOf(itemsArray.getItemType()));
		}

		if (itemsArray.getSubCategory() == null) {
			map.put("subCategory", null);
		}
		else {
			map.put("subCategory", String.valueOf(itemsArray.getSubCategory()));
		}

		if (itemsArray.getTaxOptions() == null) {
			map.put("taxOptions", null);
		}
		else {
			map.put("taxOptions", String.valueOf(itemsArray.getTaxOptions()));
		}

		if (itemsArray.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(itemsArray.getTitle()));
		}

		if (itemsArray.getUOfMSchedule() == null) {
			map.put("uOfMSchedule", null);
		}
		else {
			map.put(
				"uOfMSchedule", String.valueOf(itemsArray.getUOfMSchedule()));
		}

		if (itemsArray.getVisibility() == null) {
			map.put("visibility", null);
		}
		else {
			map.put("visibility", String.valueOf(itemsArray.getVisibility()));
		}

		return map;
	}

	public static class ItemsArrayJSONParser
		extends BaseJSONParser<ItemsArray> {

		@Override
		protected ItemsArray createDTO() {
			return new ItemsArray();
		}

		@Override
		protected ItemsArray[] createDTOArray(int size) {
			return new ItemsArray[size];
		}

		@Override
		protected void setField(
			ItemsArray itemsArray, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "category")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setCategory((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "inactive")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setInactive(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "interId")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setInterId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "itemNumber")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setItemNumber((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "itemTaxSchId")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setItemTaxSchId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "itemType")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setItemType(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "subCategory")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setSubCategory((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "taxOptions")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setTaxOptions(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setTitle((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "uOfMSchedule")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setUOfMSchedule((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "visibility")) {
				if (jsonParserFieldValue != null) {
					itemsArray.setVisibility((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}