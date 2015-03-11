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

import java.util.ArrayList;

import com.optimalpayments.common.Error;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.Link;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * The Class Refund.
 */
public class Refund implements BaseDomainObject {

  private Id<Refund> id;
  @Expose
  private String merchantRefNum;
  @Expose
  private Integer amount;
  private String childAccountNum;
  @Expose
  private Boolean dupCheck;
  private String txnTime;
  @Expose
  private Status status;
  private ArrayList<Integer> riskReasonCode;
  private AcquirerResponse acquirerResponse;
  private Error error;
  private ArrayList<Link> links;
  private Id<Settlement> settlementId;

  public final Id<Refund> getId() {
    return id;
  }

  public final void setId(final Id<Refund> id) {
    this.id = id;
  }

  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  public final Integer getAmount() {
    return amount;
  }

  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  public final String getChildAccountNum() {
    return childAccountNum;
  }

  public final void setChildAccountNum(final String childAccountNum) {
    this.childAccountNum = childAccountNum;
  }

  public final Boolean getDupCheck() {
    return dupCheck;
  }

  public final void setDupCheck(final Boolean dupCheck) {
    this.dupCheck = dupCheck;
  }

  public final String getTxnTime() {
    return txnTime;
  }

  public final void setTxnTime(final String txnTime) {
    this.txnTime = txnTime;
  }

  public final Status getStatus() {
    return status;
  }

  public final void setStatus(final Status status) {
    this.status = status;
  }

  public final ArrayList<Integer> getRiskReasonCode() {
    return riskReasonCode;
  }

  public final void setRiskReasonCode(final ArrayList<Integer> riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
  }

  public final AcquirerResponse getAcquirerResponse() {
    return acquirerResponse;
  }

  public final void setAcquirerResponse(final AcquirerResponse acquirerResponse) {
    this.acquirerResponse = acquirerResponse;
  }

  @Override
  public final Error getError() {
    return error;
  }

  public final void setError(final Error error) {
    this.error = error;
  }

  public final ArrayList<Link> getLinks() {
    return links;
  }

  public final void setLinks(final ArrayList<Link> links) {
    this.links = links;
  }

  public final Id<Settlement> getSettlementId() {
    return settlementId;
  }

  public final void setSettlementId(final Id<Settlement> settlementId) {
    this.settlementId = settlementId;
  }

  /**
   * Get a Refund builder.
   *
   * @return RefundBuilder
   */
  public static final RefundBuilder builder() {
    return new RefundBuilder();
  }

  /**
   * The builder class for Refund.
   */
  public static class RefundBuilder extends BaseBuilder<Refund> {

    private final Refund refund = new Refund();

    /**
     * Build this Refund object.
     *
     * @return Refund
     */
    @Override
    public final Refund build() {
      return refund;
    }

    /**
     * Set the id property.
     *
     * @param id
     * @return RefundBuilder
     */
    public final RefundBuilder id(final Id<Refund> id) {
      refund.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum
     * @return AuuthorizationBuilder
     */
    public final RefundBuilder merchantRefNum(final String merchantRefNum) {
      refund.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the amount property.
     *
     * @param amount
     * @return AuuthorizationBuilder
     */
    public final RefundBuilder amount(final Integer amount) {
      refund.setAmount(amount);
      return this;
    }

    /**
     * Set the dupCheck property.
     *
     * @param dupCheck
     * @return AuuthorizationBuilder
     */
    public final RefundBuilder dupCheck(final Boolean dupCheck) {
      refund.setDupCheck(dupCheck);
      return this;
    }

    /**
     * Set the settlementId property.
     *
     * @param settlementId
     * @return RefundBuilder
     */
    public final RefundBuilder settlementId(final Id<Settlement> settlementId) {
      refund.setSettlementId(settlementId);
      return this;
    }
  }
}
