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
import java.util.ArrayList;

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class Callback.
 */
public class Callback implements DomainObject {

  @Expose
  private Format format;
  @Expose
  private Rel rel;
  @Expose
  private Integer retries;
  @Expose
  private ArrayList<String> returnKeys;
  @Expose
  private Boolean synchronous;
  @Expose
  private String uri;
  @Expose
  private String delimiter;

  public final Format getFormat() {
    return format;
  }

  public final void setFormat(final Format format) {
    this.format = format;
  }

  public final Rel getRel() {
    return rel;
  }

  public final void setRel(final Rel rel) {
    this.rel = rel;
  }

  public final Integer getRetries() {
    return retries;
  }

  public final void setRetries(final Integer retries) {
    this.retries = retries;
  }

  public final ArrayList<String> getReturnKeys() {
    return returnKeys;
  }

  public final void setReturnKeys(final ArrayList<String> returnKeys) {
    this.returnKeys = returnKeys;
  }

  public final Boolean getSynchronous() {
    return synchronous;
  }

  public final void setSynchronous(final Boolean synchronous) {
    this.synchronous = synchronous;
  }

  public final String getUri() {
    return uri;
  }

  public final void setUri(final String uri) {
    this.uri = uri;
  }

  public final String getDelimiter() {
    return delimiter;
  }

  public final void setDelimiter(final String delimiter) {
    this.delimiter = delimiter;
  }

  /**
   * The sub-builder class for Callback.
   *
   * @param <BLDRT> the parent builder
   */
  public static class CallbackBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<Callback, BLDRT> {

    private final Callback callback = new Callback();

    public CallbackBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this Callback object.
     *
     * @return Callback
     */
    @Override
    public final Callback build() {
      return callback;
    }

    /**
     * Set the format property.
     *
     * @param format
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> format(final Format format) {
      callback.setFormat(format);
      return this;
    }

    /**
     * Set the rel property.
     *
     * @param rel
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> rel(final Rel rel) {
      callback.setRel(rel);
      return this;
    }

    /**
     * Set the retries property.
     *
     * @param retries
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> retries(final Integer retries) {
      callback.setRetries(retries);
      return this;
    }

    /**
     * Add to the returnKeys property.
     *
     * @param returnKey
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> addReturnKey(final String returnKey) {
      ArrayList<String> returnKeys = callback.getReturnKeys();
      if (null == returnKeys) {
        returnKeys = new ArrayList<String>();
      }
      returnKeys.add(returnKey);
      callback.setReturnKeys(returnKeys);
      return this;
    }

    /**
     * Set the synchronous property.
     *
     * @param synchronous
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> synchronous(final Boolean synchronous) {
      callback.setSynchronous(synchronous);
      return this;
    }

    /**
     * Set the uri property.
     *
     * @param uri
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> uri(final String uri) {
      callback.setUri(uri);
      return this;
    }

    /**
     * Set the delimiter property.
     *
     * @param delimiter
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> delimiter(final String delimiter) {
      callback.setDelimiter(delimiter);
      return this;
    }
  }
}
