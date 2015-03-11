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
package com.optimalpayments.cardpayments;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class Authentication.
 */
public class Authentication implements DomainObject {

  @Expose
  private Integer eci;
  @Expose
  private String cavv;
  @Expose
  private String xid;
  @Expose
  private String threeDEnrollment;
  @Expose
  private String threeDResult;
  @Expose
  private String signatureStatus;

  public final Integer getEci() {
    return eci;
  }

  public final void setEci(final Integer eci) {
    this.eci = eci;
  }

  public final String getCavv() {
    return cavv;
  }

  public final void setCavv(final String cavv) {
    this.cavv = cavv;
  }

  public final String getXid() {
    return xid;
  }

  public final void setXid(final String xid) {
    this.xid = xid;
  }

  public final String getThreeDEnrollment() {
    return threeDEnrollment;
  }

  public final void setThreeDEnrollment(final String threeDEnrollment) {
    this.threeDEnrollment = threeDEnrollment;
  }

  public final String getThreeDResult() {
    return threeDResult;
  }

  public final void setThreeDResult(final String threeDResult) {
    this.threeDResult = threeDResult;
  }

  public final String getSignatureStatus() {
    return signatureStatus;
  }

  public final void setSignatureStatus(final String signatureStatus) {
    this.signatureStatus = signatureStatus;
  }

  /**
   * The sub-builder class for Authentication.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AuthenticationBuilder<BLDRT extends GenericBuilder>
          extends NestedBuilder<Authentication, BLDRT> {

    private final Authentication authentication = new Authentication();

    public AuthenticationBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this authentication object.
     *
     * @return Authentication
     */
    @Override
    public final Authentication build() {
      return authentication;
    }

    /**
     * Set the eci property.
     *
     * @param eci
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> eci(final Integer eci) {
      authentication.setEci(eci);
      return this;
    }

    /**
     * Set the cavv property.
     *
     * @param cavv
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> cavv(final String cavv) {
      authentication.setCavv(cavv);
      return this;
    }

    /**
     * Set the xid property.
     *
     * @param xid
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> xid(
            final String xid) {
      authentication.setXid(xid);
      return this;
    }

    /**
     * Set the threeDEnrollment property.
     *
     * @param threeDEnrollment
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> threeDEnrollment(final String threeDEnrollment) {
      authentication.setThreeDEnrollment(threeDEnrollment);
      return this;
    }

    /**
     * Set the threeDResult property.
     *
     * @param threeDResult
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> threeDResult(final String threeDResult) {
      authentication.setThreeDResult(threeDResult);
      return this;
    }

    /**
     * Set the signatureStatus property.
     *
     * @param signatureStatus
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> signatureStatus(final String signatureStatus) {
      authentication.setSignatureStatus(signatureStatus);
      return this;
    }
  }
}
