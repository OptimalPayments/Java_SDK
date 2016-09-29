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

// TODO: Auto-generated Javadoc
/**
 * The Class Callback.
 */
public class Callback implements DomainObject {

  /** The format. */
  @Expose
  private Format format;
  
  /** The rel. */
  @Expose
  private Rel rel;
  
  /** The retries. */
  @Expose
  private Integer retries;
  
  /** The return keys. */
  @Expose
  private ArrayList<String> returnKeys;
  
  /** The synchronous. */
  @Expose
  private Boolean synchronous;
  
  /** The uri. */
  @Expose
  private String uri;
  
  /** The delimiter. */
  @Expose
  private String delimiter;

  /**
   * Gets the format.
   *
   * @return the format
   */
  public final Format getFormat() {
    return format;
  }

  /**
   * Sets the format.
   *
   * @param format the new format
   */
  public final void setFormat(final Format format) {
    this.format = format;
  }

  /**
   * Gets the rel.
   *
   * @return the rel
   */
  public final Rel getRel() {
    return rel;
  }

  /**
   * Sets the rel.
   *
   * @param rel the new rel
   */
  public final void setRel(final Rel rel) {
    this.rel = rel;
  }

  /**
   * Gets the retries.
   *
   * @return the retries
   */
  public final Integer getRetries() {
    return retries;
  }

  /**
   * Sets the retries.
   *
   * @param retries the new retries
   */
  public final void setRetries(final Integer retries) {
    this.retries = retries;
  }

  /**
   * Gets the return keys.
   *
   * @return the return keys
   */
  public final ArrayList<String> getReturnKeys() {
    return returnKeys;
  }

  /**
   * Sets the return keys.
   *
   * @param returnKeys the new return keys
   */
  public final void setReturnKeys(final ArrayList<String> returnKeys) {
    this.returnKeys = returnKeys;
  }

  /**
   * Gets the synchronous.
   *
   * @return the synchronous
   */
  public final Boolean getSynchronous() {
    return synchronous;
  }

  /**
   * Sets the synchronous.
   *
   * @param synchronous the new synchronous
   */
  public final void setSynchronous(final Boolean synchronous) {
    this.synchronous = synchronous;
  }

  /**
   * Gets the uri.
   *
   * @return the uri
   */
  public final String getUri() {
    return uri;
  }

  /**
   * Sets the uri.
   *
   * @param uri the new uri
   */
  public final void setUri(final String uri) {
    this.uri = uri;
  }

  /**
   * Gets the delimiter.
   *
   * @return the delimiter
   */
  public final String getDelimiter() {
    return delimiter;
  }

  /**
   * Sets the delimiter.
   *
   * @param delimiter the new delimiter
   */
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

    /** The callback. */
    private final Callback callback = new Callback();

    /**
     * Instantiates a new callback builder.
     *
     * @param parent the parent
     */
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
     * @param format the format
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> format(final Format format) {
      callback.setFormat(format);
      return this;
    }

    /**
     * Set the rel property.
     *
     * @param rel the rel
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> rel(final Rel rel) {
      callback.setRel(rel);
      return this;
    }

    /**
     * Set the retries property.
     *
     * @param retries the retries
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> retries(final Integer retries) {
      callback.setRetries(retries);
      return this;
    }

    /**
     * Add to the returnKeys property.
     *
     * @param returnKey the return key
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
     * @param synchronous the synchronous
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> synchronous(final Boolean synchronous) {
      callback.setSynchronous(synchronous);
      return this;
    }

    /**
     * Set the uri property.
     *
     * @param uri the uri
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> uri(final String uri) {
      callback.setUri(uri);
      return this;
    }

    /**
     * Set the delimiter property.
     *
     * @param delimiter the delimiter
     * @return CallbackBuilder< BLDRT >
     */
    public final CallbackBuilder<BLDRT> delimiter(final String delimiter) {
      callback.setDelimiter(delimiter);
      return this;
    }
  }
}
