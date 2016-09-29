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
 * The Class Redirect.
 */
public class Redirect implements DomainObject {

  /** The rel. */
  @Expose
  private Rel rel;
  
  /** The return keys. */
  @Expose
  private ArrayList<String> returnKeys;
  
  /** The uri. */
  @Expose
  private String uri;
  
  /** The delimiter. */
  @Expose
  private String delimiter;

  /**
   * Gets the rel.
   *
   * @return the rel
   */
  public Rel getRel() {
    return rel;
  }

  /**
   * Sets the rel.
   *
   * @param rel the new rel
   */
  public void setRel(final Rel rel) {
    this.rel = rel;
  }

  /**
   * Gets the return keys.
   *
   * @return the return keys
   */
  public ArrayList<String> getReturnKeys() {
    return returnKeys;
  }

  /**
   * Sets the return keys.
   *
   * @param returnKeys the new return keys
   */
  public void setReturnKeys(final ArrayList<String> returnKeys) {
    this.returnKeys = returnKeys;
  }

  /**
   * Gets the uri.
   *
   * @return the uri
   */
  public String getUri() {
    return uri;
  }

  /**
   * Sets the uri.
   *
   * @param uri the new uri
   */
  public void setUri(final String uri) {
    this.uri = uri;
  }

  /**
   * Gets the delimiter.
   *
   * @return the delimiter
   */
  public String getDelimiter() {
    return delimiter;
  }

  /**
   * Sets the delimiter.
   *
   * @param delimiter the new delimiter
   */
  public void setDelimiter(final String delimiter) {
    this.delimiter = delimiter;
  }

  /**
   * The sub-builder class for Redirect.
   *
   * @param <BLDRT> the parent builder
   */
  public static class RedirectBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<Redirect, BLDRT> {

    /** The redirect. */
    private final Redirect redirect = new Redirect();
    
    /**
     * Instantiates a new redirect builder.
     *
     * @param parent the parent
     */
    public RedirectBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this Redirect object.
     *
     * @return Redirect
     */
    @Override
    public Redirect build() {
      return redirect;
    }

    /**
     * Set the rel property.
     *
     * @param rel the rel
     * @return RedirectBuilder< BLDRT >
     */
    public RedirectBuilder<BLDRT> rel(final Rel rel) {
      redirect.setRel(rel);
      return this;
    }

    /**
     * Add to the returnKeys property.
     *
     * @param returnKey the return key
     * @return RedirectBuilder< BLDRT >
     */
    public RedirectBuilder<BLDRT> addReturnKey(final String returnKey) {
      ArrayList<String> returnKeys = redirect.getReturnKeys();
      if (null == returnKeys) {
        returnKeys = new ArrayList<String>();
      }
      returnKeys.add(returnKey);
      redirect.setReturnKeys(returnKeys);
      return this;
    }

    /**
     * Set the uri property.
     *
     * @param uri the uri
     * @return RedirectBuilder< BLDRT >
     */
    public RedirectBuilder<BLDRT> uri(final String uri) {
      redirect.setUri(uri);
      return this;
    }

    /**
     * Set the delimiter property.
     *
     * @param delimiter the delimiter
     * @return RedirectBuilder< BLDRT >
     */
    public RedirectBuilder<BLDRT> delimiter(final String delimiter) {
      redirect.setDelimiter(delimiter);
      return this;
    }
  }
}
