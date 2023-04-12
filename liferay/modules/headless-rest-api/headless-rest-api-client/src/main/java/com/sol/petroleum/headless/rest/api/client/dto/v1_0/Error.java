package com.sol.petroleum.headless.rest.api.client.dto.v1_0;

import com.sol.petroleum.headless.rest.api.client.function.UnsafeSupplier;
import com.sol.petroleum.headless.rest.api.client.serdes.v1_0.ErrorSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@Generated("")
public class Error implements Cloneable, Serializable {

	public static Error toDTO(String json) {
		return ErrorSerDes.toDTO(json);
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<Integer, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer status;

	@Override
	public Error clone() throws CloneNotSupportedException {
		return (Error)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Error)) {
			return false;
		}

		Error error = (Error)object;

		return Objects.equals(toString(), error.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ErrorSerDes.toJSON(this);
	}

}