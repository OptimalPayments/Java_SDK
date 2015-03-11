/*
 * Copyright (c) 2014 Optimal Payments
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.optimalpayments.hostedpayment;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class KeyValuePair.
 */
public class KeyValuePair implements DomainObject {

  @Expose
  private String key;
  @Expose
  private String value;

  public final String getKey() {
    return key;
  }

  public final void setKey(final String key) {
    this.key = key;
  }

  public final String getValue() {
    return value;
  }

  public final void setValue(final String value) {
    this.value = value;
  }

  /**
   * The sub-builder class for KeyValuePair.
   *
   * @param <BLDRT> the parent builder
   */
  public static class KeyValuePairBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<KeyValuePair, BLDRT> {

    private final KeyValuePair keyValuePair = new KeyValuePair();

    public KeyValuePairBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this KeyValuePair object.
     *
     * @return KeyValuePair
     */
    @Override
    public final KeyValuePair build() {
      return keyValuePair;
    }

    /**
     * Set the key property.
     *
     * @param key
     * @return KeyValuePairBuilder< BLDRT >
     */
    public final KeyValuePairBuilder<BLDRT> key(final String key) {
      keyValuePair.setKey(key);
      return this;
    }

    /**
     * Set the value property.
     *
     * @param value
     * @return KeyValuePairBuilder< BLDRT >
     */
    public final KeyValuePairBuilder<BLDRT> value(final String value) {
      keyValuePair.setValue(value);
      return this;
    }

    /**
     * Set the value property.
     *
     * @param value
     * @return KeyValuePairBuilder< BLDRT >
     */
    public final KeyValuePairBuilder<BLDRT> value(final Integer value) {
      keyValuePair.setValue(value.toString());
      return this;
    }

    /**
     * Set the value property.
     *
     * @param value
     * @return KeyValuePairBuilder< BLDRT >
     */
    public final KeyValuePairBuilder<BLDRT> value(final Boolean value) {
      keyValuePair.setValue(value.toString());
      return this;
    }
  }
}
