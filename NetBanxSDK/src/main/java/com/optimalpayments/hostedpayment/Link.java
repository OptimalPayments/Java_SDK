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
 * The Class Link.
 */
public class Link implements DomainObject {

  @Expose
  private Rel rel;
  @Expose
  private ArrayList<String> returnKeys;
  @Expose
  private String uri;

  public final Rel getRel() {
    return rel;
  }

  public final void setRel(final Rel rel) {
    this.rel = rel;
  }

  public final ArrayList<String> getReturnKeys() {
    return returnKeys;
  }

  public final void setReturnKeys(final ArrayList<String> returnKeys) {
    this.returnKeys = returnKeys;
  }

  public final String getUri() {
    return uri;
  }

  public final void setUri(final String uri) {
    this.uri = uri;
  }

  /**
   * The sub-builder class for Link.
   *
   * @param <BLDRT> the parent builder
   */
  public static class LinkBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<Link, BLDRT> {

    private final Link link = new Link();

    public LinkBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this Link object.
     *
     * @return Link
     */
    @Override
    public final Link build() {
      return link;
    }

    /**
     * Set the rel property.
     *
     * @param rel
     * @return LinkBuilder< BLDRT >
     */
    public final LinkBuilder<BLDRT> rel(final Rel rel) {
      link.setRel(rel);
      return this;
    }

    /**
     * Add to the returnKeys property.
     *
     * @param returnKey
     * @return LinkBuilder< BLDRT >
     */
    public final LinkBuilder<BLDRT> addReturnKey(final String returnKey) {
      ArrayList<String> returnKeys = link.getReturnKeys();
      if (null == returnKeys) {
        returnKeys = new ArrayList<String>();
      }
      returnKeys.add(returnKey);
      link.setReturnKeys(returnKeys);
      return this;
    }

    /**
     * Set the uri property.
     *
     * @param uri
     * @return LinkBuilder< BLDRT >
     */
    public final LinkBuilder<BLDRT> uri(final String uri) {
      link.setUri(uri);
      return this;
    }
  }
}
