package com.sol.petroleum.headless.rest.api.client.function;

import javax.annotation.Generated;

/**
 * @author Chanchal
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}