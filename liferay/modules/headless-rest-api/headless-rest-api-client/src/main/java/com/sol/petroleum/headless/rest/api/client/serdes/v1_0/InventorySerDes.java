package com.sol.petroleum.headless.rest.api.client.serdes.v1_0;

import com.sol.petroleum.headless.rest.api.client.dto.v1_0.Inventory;
import com.sol.petroleum.headless.rest.api.client.dto.v1_0.InventoryArray;
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
public class InventorySerDes {

	public static Inventory toDTO(String json) {
		InventoryJSONParser inventoryJSONParser = new InventoryJSONParser();

		return inventoryJSONParser.parseToDTO(json);
	}

	public static Inventory[] toDTOs(String json) {
		InventoryJSONParser inventoryJSONParser = new InventoryJSONParser();

		return inventoryJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Inventory inventory) {
		if (inventory == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (inventory.getActionName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"action-name\": ");

			sb.append("\"");

			sb.append(_escape(inventory.getActionName()));

			sb.append("\"");
		}

		if (inventory.getInventoryArray() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inventoryArray\": ");

			sb.append("[");

			for (int i = 0; i < inventory.getInventoryArray().length; i++) {
				sb.append(String.valueOf(inventory.getInventoryArray()[i]));

				if ((i + 1) < inventory.getInventoryArray().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (inventory.getSourceType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"source-type\": ");

			sb.append("\"");

			sb.append(_escape(inventory.getSourceType()));

			sb.append("\"");
		}

		if (inventory.getUuid() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uuid\": ");

			sb.append("\"");

			sb.append(_escape(inventory.getUuid()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		InventoryJSONParser inventoryJSONParser = new InventoryJSONParser();

		return inventoryJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Inventory inventory) {
		if (inventory == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (inventory.getActionName() == null) {
			map.put("action-name", null);
		}
		else {
			map.put("action-name", String.valueOf(inventory.getActionName()));
		}

		if (inventory.getInventoryArray() == null) {
			map.put("inventoryArray", null);
		}
		else {
			map.put(
				"inventoryArray",
				String.valueOf(inventory.getInventoryArray()));
		}

		if (inventory.getSourceType() == null) {
			map.put("source-type", null);
		}
		else {
			map.put("source-type", String.valueOf(inventory.getSourceType()));
		}

		if (inventory.getUuid() == null) {
			map.put("uuid", null);
		}
		else {
			map.put("uuid", String.valueOf(inventory.getUuid()));
		}

		return map;
	}

	public static class InventoryJSONParser extends BaseJSONParser<Inventory> {

		@Override
		protected Inventory createDTO() {
			return new Inventory();
		}

		@Override
		protected Inventory[] createDTOArray(int size) {
			return new Inventory[size];
		}

		@Override
		protected void setField(
			Inventory inventory, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "action-name")) {
				if (jsonParserFieldValue != null) {
					inventory.setActionName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "inventoryArray")) {
				if (jsonParserFieldValue != null) {
					inventory.setInventoryArray(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> InventoryArraySerDes.toDTO((String)object)
						).toArray(
							size -> new InventoryArray[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "source-type")) {
				if (jsonParserFieldValue != null) {
					inventory.setSourceType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "uuid")) {
				if (jsonParserFieldValue != null) {
					inventory.setUuid((String)jsonParserFieldValue);
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