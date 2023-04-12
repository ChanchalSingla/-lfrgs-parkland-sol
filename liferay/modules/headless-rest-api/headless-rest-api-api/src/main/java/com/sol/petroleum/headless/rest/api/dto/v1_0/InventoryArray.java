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
@GraphQLName("InventoryArray")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "InventoryArray")
public class InventoryArray implements Serializable {

	public static InventoryArray toDTO(String json) {
		return ObjectMapperUtil.readValue(InventoryArray.class, json);
	}

	public static InventoryArray unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(InventoryArray.class, json);
	}

	@Schema(example = "2")
	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	@JsonIgnore
	public void setCompanyId(
		UnsafeSupplier<Long, Exception> companyIdUnsafeSupplier) {

		try {
			companyId = companyIdUnsafeSupplier.get();
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
	protected Long companyId;

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

	@Schema(example = "DIEULS100")
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

	@Schema(example = "9-CORP")
	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	@JsonIgnore
	public void setLocationCode(
		UnsafeSupplier<String, Exception> locationCodeUnsafeSupplier) {

		try {
			locationCode = locationCodeUnsafeSupplier.get();
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
	protected String locationCode;

	@Schema(example = "Petrojam (Montego) [78]")
	public String getLocationDesc() {
		return locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	@JsonIgnore
	public void setLocationDesc(
		UnsafeSupplier<String, Exception> locationDescUnsafeSupplier) {

		try {
			locationDesc = locationDescUnsafeSupplier.get();
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
	protected String locationDesc;

	@Schema(example = "0")
	public Integer getQtyAllocated() {
		return qtyAllocated;
	}

	public void setQtyAllocated(Integer qtyAllocated) {
		this.qtyAllocated = qtyAllocated;
	}

	@JsonIgnore
	public void setQtyAllocated(
		UnsafeSupplier<Integer, Exception> qtyAllocatedUnsafeSupplier) {

		try {
			qtyAllocated = qtyAllocatedUnsafeSupplier.get();
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
	protected Integer qtyAllocated;

	@Schema(example = "0")
	public Integer getQtyBackOrdered() {
		return qtyBackOrdered;
	}

	public void setQtyBackOrdered(Integer qtyBackOrdered) {
		this.qtyBackOrdered = qtyBackOrdered;
	}

	@JsonIgnore
	public void setQtyBackOrdered(
		UnsafeSupplier<Integer, Exception> qtyBackOrderedUnsafeSupplier) {

		try {
			qtyBackOrdered = qtyBackOrderedUnsafeSupplier.get();
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
	protected Integer qtyBackOrdered;

	@Schema(example = "0")
	public Integer getQtyCommitted() {
		return qtyCommitted;
	}

	public void setQtyCommitted(Integer qtyCommitted) {
		this.qtyCommitted = qtyCommitted;
	}

	@JsonIgnore
	public void setQtyCommitted(
		UnsafeSupplier<Integer, Exception> qtyCommittedUnsafeSupplier) {

		try {
			qtyCommitted = qtyCommittedUnsafeSupplier.get();
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
	protected Integer qtyCommitted;

	@Schema(example = "0")
	public Integer getQtyDamaged() {
		return qtyDamaged;
	}

	public void setQtyDamaged(Integer qtyDamaged) {
		this.qtyDamaged = qtyDamaged;
	}

	@JsonIgnore
	public void setQtyDamaged(
		UnsafeSupplier<Integer, Exception> qtyDamagedUnsafeSupplier) {

		try {
			qtyDamaged = qtyDamagedUnsafeSupplier.get();
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
	protected Integer qtyDamaged;

	@Schema(example = "0")
	public Integer getQtyDropShipped() {
		return qtyDropShipped;
	}

	public void setQtyDropShipped(Integer qtyDropShipped) {
		this.qtyDropShipped = qtyDropShipped;
	}

	@JsonIgnore
	public void setQtyDropShipped(
		UnsafeSupplier<Integer, Exception> qtyDropShippedUnsafeSupplier) {

		try {
			qtyDropShipped = qtyDropShippedUnsafeSupplier.get();
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
	protected Integer qtyDropShipped;

	@Schema(example = "0")
	public Integer getQtyInService() {
		return qtyInService;
	}

	public void setQtyInService(Integer qtyInService) {
		this.qtyInService = qtyInService;
	}

	@JsonIgnore
	public void setQtyInService(
		UnsafeSupplier<Integer, Exception> qtyInServiceUnsafeSupplier) {

		try {
			qtyInService = qtyInServiceUnsafeSupplier.get();
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
	protected Integer qtyInService;

	@Schema(example = "0")
	public Integer getQtyInUse() {
		return qtyInUse;
	}

	public void setQtyInUse(Integer qtyInUse) {
		this.qtyInUse = qtyInUse;
	}

	@JsonIgnore
	public void setQtyInUse(
		UnsafeSupplier<Integer, Exception> qtyInUseUnsafeSupplier) {

		try {
			qtyInUse = qtyInUseUnsafeSupplier.get();
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
	protected Integer qtyInUse;

	@Schema(example = "400")
	public Integer getQtyOnHand() {
		return qtyOnHand;
	}

	public void setQtyOnHand(Integer qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}

	@JsonIgnore
	public void setQtyOnHand(
		UnsafeSupplier<Integer, Exception> qtyOnHandUnsafeSupplier) {

		try {
			qtyOnHand = qtyOnHandUnsafeSupplier.get();
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
	protected Integer qtyOnHand;

	@Schema(example = "100")
	public Integer getQtyOnOrder() {
		return qtyOnOrder;
	}

	public void setQtyOnOrder(Integer qtyOnOrder) {
		this.qtyOnOrder = qtyOnOrder;
	}

	@JsonIgnore
	public void setQtyOnOrder(
		UnsafeSupplier<Integer, Exception> qtyOnOrderUnsafeSupplier) {

		try {
			qtyOnOrder = qtyOnOrderUnsafeSupplier.get();
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
	protected Integer qtyOnOrder;

	@Schema(example = "0")
	public Integer getQtyReturned() {
		return qtyReturned;
	}

	public void setQtyReturned(Integer qtyReturned) {
		this.qtyReturned = qtyReturned;
	}

	@JsonIgnore
	public void setQtyReturned(
		UnsafeSupplier<Integer, Exception> qtyReturnedUnsafeSupplier) {

		try {
			qtyReturned = qtyReturnedUnsafeSupplier.get();
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
	protected Integer qtyReturned;

	@Schema(example = "0")
	public Integer getQtySold() {
		return qtySold;
	}

	public void setQtySold(Integer qtySold) {
		this.qtySold = qtySold;
	}

	@JsonIgnore
	public void setQtySold(
		UnsafeSupplier<Integer, Exception> qtySoldUnsafeSupplier) {

		try {
			qtySold = qtySoldUnsafeSupplier.get();
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
	protected Integer qtySold;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (companyId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"companyId\": ");

			sb.append(companyId);
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

		if (locationCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locationCode\": ");

			sb.append("\"");

			sb.append(_escape(locationCode));

			sb.append("\"");
		}

		if (locationDesc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locationDesc\": ");

			sb.append("\"");

			sb.append(_escape(locationDesc));

			sb.append("\"");
		}

		if (qtyAllocated != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyAllocated\": ");

			sb.append(qtyAllocated);
		}

		if (qtyBackOrdered != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyBackOrdered\": ");

			sb.append(qtyBackOrdered);
		}

		if (qtyCommitted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyCommitted\": ");

			sb.append(qtyCommitted);
		}

		if (qtyDamaged != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyDamaged\": ");

			sb.append(qtyDamaged);
		}

		if (qtyDropShipped != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyDropShipped\": ");

			sb.append(qtyDropShipped);
		}

		if (qtyInService != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyInService\": ");

			sb.append(qtyInService);
		}

		if (qtyInUse != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyInUse\": ");

			sb.append(qtyInUse);
		}

		if (qtyOnHand != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyOnHand\": ");

			sb.append(qtyOnHand);
		}

		if (qtyOnOrder != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyOnOrder\": ");

			sb.append(qtyOnOrder);
		}

		if (qtyReturned != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtyReturned\": ");

			sb.append(qtyReturned);
		}

		if (qtySold != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qtySold\": ");

			sb.append(qtySold);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.sol.petroleum.headless.rest.api.dto.v1_0.InventoryArray",
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