package com.sol.petroleum.headless.rest.api.client.serdes.v1_0;

import com.sol.petroleum.headless.rest.api.client.dto.v1_0.Item;
import com.sol.petroleum.headless.rest.api.client.dto.v1_0.ItemsArray;
import com.sol.petroleum.headless.rest.api.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class ItemSerDes {

	public static Item toDTO(String json) {
		ItemJSONParser itemJSONParser = new ItemJSONParser();

		return itemJSONParser.parseToDTO(json);
	}

	public static Item[] toDTOs(String json) {
		ItemJSONParser itemJSONParser = new ItemJSONParser();

		return itemJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Item item) {
		if (item == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (item.getActionName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"action-name\": ");

			sb.append("\"");

			sb.append(_escape(item.getActionName()));

			sb.append("\"");
		}

		if (item.getItemsArray() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemsArray\": ");

			sb.append("[");

			for (int i = 0; i < item.getItemsArray().length; i++) {
				sb.append(String.valueOf(item.getItemsArray()[i]));

				if ((i + 1) < item.getItemsArray().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (item.getSourceType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"source-type\": ");

			sb.append("\"");

			sb.append(_escape(item.getSourceType()));

			sb.append("\"");
		}

		if (item.getUuid() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uuid\": ");

			sb.append("\"");

			sb.append(_escape(item.getUuid()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ItemJSONParser itemJSONParser = new ItemJSONParser();

		return itemJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Item item) {
		if (item == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (item.getActionName() == null) {
			map.put("action-name", null);
		}
		else {
			map.put("action-name", String.valueOf(item.getActionName()));
		}

		if (item.getItemsArray() == null) {
			map.put("itemsArray", null);
		}
		else {
			map.put("itemsArray", String.valueOf(item.getItemsArray()));
		}

		if (item.getSourceType() == null) {
			map.put("source-type", null);
		}
		else {
			map.put("source-type", String.valueOf(item.getSourceType()));
		}

		if (item.getUuid() == null) {
			map.put("uuid", null);
		}
		else {
			map.put("uuid", String.valueOf(item.getUuid()));
		}

		return map;
	}

	public static class ItemJSONParser extends BaseJSONParser<Item> {

		@Override
		protected Item createDTO() {
			return new Item();
		}

		@Override
		protected Item[] createDTOArray(int size) {
			return new Item[size];
		}

		@Override
		protected void setField(
			Item item, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "action-name")) {
				if (jsonParserFieldValue != null) {
					item.setActionName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "itemsArray")) {
				if (jsonParserFieldValue != null) {
					item.setItemsArray(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ItemsArraySerDes.toDTO((String)object)
						).toArray(
							size -> new ItemsArray[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "source-type")) {
				if (jsonParserFieldValue != null) {
					item.setSourceType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "uuid")) {
				if (jsonParserFieldValue != null) {
					item.setUuid((String)jsonParserFieldValue);
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