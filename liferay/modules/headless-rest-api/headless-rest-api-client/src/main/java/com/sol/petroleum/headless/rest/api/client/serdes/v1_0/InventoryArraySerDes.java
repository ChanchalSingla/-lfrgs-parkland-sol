package com.sol.petroleum.headless.rest.api.client.serdes.v1_0;

import com.sol.petroleum.headless.rest.api.client.dto.v1_0.InventoryArray;
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
public class InventoryArraySerDes {

	public static InventoryArray toDTO(String json) {
		InventoryArrayJSONParser inventoryArrayJSONParser =
			new InventoryArrayJSONParser();

		return inventoryArrayJSONParser.parseToDTO(json);
	}

	public static InventoryArray[] toDTOs(String json) {
		InventoryArrayJSONParser inventoryArrayJSONParser =
			new InventoryArrayJSONParser();

		return inventoryArrayJSONParser.parseToDTOs(json);
	}

	public static String toJSON(InventoryArray inventoryArray) {
		if (inventoryArray == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (inventoryArray.getCompanyId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"companyId\": ");

			sb.append(inventoryArray.getCompanyId());
		}

		if (inventoryArray.getInactive() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inactive\": ");

			sb.append(inventoryArray.getInactive());
		}

		if (inventoryArray.getInterId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"interId\": ");

			sb.append("\"");

			sb.append(_escape(inventoryArray.getInterId()));

			sb.append("\"");
		}

		if (inventoryArray.getItemNumber() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemNumber\": ");

			sb.append("\"");

			sb.append(_escape(inventoryArray.getItemNumber()));

			sb.append("\"");
		}

		if (inventoryArray.getLocationCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locationCode\": ");

			sb.append("\"");

			sb.append(_escape(inventoryArray.getLocationCode()));

			sb.append("\"");
		}

		if (inventoryArray.getLocationDesc() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locationDesc\": ");

			sb.append("\"");

			sb.append(_escape(inventoryArray.getLocationDesc()));

			sb.append("\"");
		}

		if (inventoryArray.getQtyAllocated() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyAllocated\": ");

			sb.append(inventoryArray.getQtyAllocated());
		}

		if (inventoryArray.getQtyBackOrdered() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyBackOrdered\": ");

			sb.append(inventoryArray.getQtyBackOrdered());
		}

		if (inventoryArray.getQtyCommitted() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyCommitted\": ");

			sb.append(inventoryArray.getQtyCommitted());
		}

		if (inventoryArray.getQtyDamaged() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyDamaged\": ");

			sb.append(inventoryArray.getQtyDamaged());
		}

		if (inventoryArray.getQtyDropShipped() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyDropShipped\": ");

			sb.append(inventoryArray.getQtyDropShipped());
		}

		if (inventoryArray.getQtyInService() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyInService\": ");

			sb.append(inventoryArray.getQtyInService());
		}

		if (inventoryArray.getQtyInUse() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyInUse\": ");

			sb.append(inventoryArray.getQtyInUse());
		}

		if (inventoryArray.getQtyOnHand() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyOnHand\": ");

			sb.append(inventoryArray.getQtyOnHand());
		}

		if (inventoryArray.getQtyOnOrder() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyOnOrder\": ");

			sb.append(inventoryArray.getQtyOnOrder());
		}

		if (inventoryArray.getQtyReturned() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyReturned\": ");

			sb.append(inventoryArray.getQtyReturned());
		}

		if (inventoryArray.getQtySold() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtySold\": ");

			sb.append(inventoryArray.getQtySold());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		InventoryArrayJSONParser inventoryArrayJSONParser =
			new InventoryArrayJSONParser();

		return inventoryArrayJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(InventoryArray inventoryArray) {
		if (inventoryArray == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (inventoryArray.getCompanyId() == null) {
			map.put("companyId", null);
		}
		else {
			map.put("companyId", String.valueOf(inventoryArray.getCompanyId()));
		}

		if (inventoryArray.getInactive() == null) {
			map.put("inactive", null);
		}
		else {
			map.put("inactive", String.valueOf(inventoryArray.getInactive()));
		}

		if (inventoryArray.getInterId() == null) {
			map.put("interId", null);
		}
		else {
			map.put("interId", String.valueOf(inventoryArray.getInterId()));
		}

		if (inventoryArray.getItemNumber() == null) {
			map.put("itemNumber", null);
		}
		else {
			map.put(
				"itemNumber", String.valueOf(inventoryArray.getItemNumber()));
		}

		if (inventoryArray.getLocationCode() == null) {
			map.put("locationCode", null);
		}
		else {
			map.put(
				"locationCode",
				String.valueOf(inventoryArray.getLocationCode()));
		}

		if (inventoryArray.getLocationDesc() == null) {
			map.put("locationDesc", null);
		}
		else {
			map.put(
				"locationDesc",
				String.valueOf(inventoryArray.getLocationDesc()));
		}

		if (inventoryArray.getQtyAllocated() == null) {
			map.put("qtyAllocated", null);
		}
		else {
			map.put(
				"qtyAllocated",
				String.valueOf(inventoryArray.getQtyAllocated()));
		}

		if (inventoryArray.getQtyBackOrdered() == null) {
			map.put("qtyBackOrdered", null);
		}
		else {
			map.put(
				"qtyBackOrdered",
				String.valueOf(inventoryArray.getQtyBackOrdered()));
		}

		if (inventoryArray.getQtyCommitted() == null) {
			map.put("qtyCommitted", null);
		}
		else {
			map.put(
				"qtyCommitted",
				String.valueOf(inventoryArray.getQtyCommitted()));
		}

		if (inventoryArray.getQtyDamaged() == null) {
			map.put("qtyDamaged", null);
		}
		else {
			map.put(
				"qtyDamaged", String.valueOf(inventoryArray.getQtyDamaged()));
		}

		if (inventoryArray.getQtyDropShipped() == null) {
			map.put("qtyDropShipped", null);
		}
		else {
			map.put(
				"qtyDropShipped",
				String.valueOf(inventoryArray.getQtyDropShipped()));
		}

		if (inventoryArray.getQtyInService() == null) {
			map.put("qtyInService", null);
		}
		else {
			map.put(
				"qtyInService",
				String.valueOf(inventoryArray.getQtyInService()));
		}

		if (inventoryArray.getQtyInUse() == null) {
			map.put("qtyInUse", null);
		}
		else {
			map.put("qtyInUse", String.valueOf(inventoryArray.getQtyInUse()));
		}

		if (inventoryArray.getQtyOnHand() == null) {
			map.put("qtyOnHand", null);
		}
		else {
			map.put("qtyOnHand", String.valueOf(inventoryArray.getQtyOnHand()));
		}

		if (inventoryArray.getQtyOnOrder() == null) {
			map.put("qtyOnOrder", null);
		}
		else {
			map.put(
				"qtyOnOrder", String.valueOf(inventoryArray.getQtyOnOrder()));
		}

		if (inventoryArray.getQtyReturned() == null) {
			map.put("qtyReturned", null);
		}
		else {
			map.put(
				"qtyReturned", String.valueOf(inventoryArray.getQtyReturned()));
		}

		if (inventoryArray.getQtySold() == null) {
			map.put("qtySold", null);
		}
		else {
			map.put("qtySold", String.valueOf(inventoryArray.getQtySold()));
		}

		return map;
	}

	public static class InventoryArrayJSONParser
		extends BaseJSONParser<InventoryArray> {

		@Override
		protected InventoryArray createDTO() {
			return new InventoryArray();
		}

		@Override
		protected InventoryArray[] createDTOArray(int size) {
			return new InventoryArray[size];
		}

		@Override
		protected void setField(
			InventoryArray inventoryArray, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "companyId")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setCompanyId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "inactive")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setInactive(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "interId")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setInterId((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "itemNumber")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setItemNumber((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "locationCode")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setLocationCode(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "locationDesc")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setLocationDesc(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyAllocated")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyAllocated(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyBackOrdered")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyBackOrdered(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyCommitted")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyCommitted(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyDamaged")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyDamaged(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyDropShipped")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyDropShipped(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyInService")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyInService(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyInUse")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyInUse(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyOnHand")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyOnHand(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyOnOrder")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyOnOrder(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtyReturned")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtyReturned(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qtySold")) {
				if (jsonParserFieldValue != null) {
					inventoryArray.setQtySold(
						Integer.valueOf((String)jsonParserFieldValue));
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