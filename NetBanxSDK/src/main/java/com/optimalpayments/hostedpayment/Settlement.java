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

import com.optimalpayments.common.Error;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * The Class Settlement.
 */
public class Settlement implements BaseDomainObject {

  private Id<Order> id;
  @Expose
  private Integer amount;
  @Expose
  private String merchantRefNum;
  private AuthType authType;
  private Integer confirmationNumber;
  private String currencyCode;
  private String mode;
  private String originalMerchantRefNum;
  private Id<Order> orderId;
  private Error error;

  public Id<Order> getId() {
    return id;
  }

  public void setId(final Id<Order> id) {
    this.id = id;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(final Integer amount) {
    this.amount = amount;
  }

  public String getMerchantRefNum() {
    return merchantRefNum;
  }

  public void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  public AuthType getAuthType() {
    return authType;
  }

  public void setAuthType(final AuthType authType) {
    this.authType = authType;
  }

  public Integer getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(final Integer confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(final String mode) {
    this.mode = mode;
  }

  public String getOriginalMerchantRefNum() {
    return originalMerchantRefNum;
  }

  public void setOriginalMerchantRefNum(final String originalMerchantRefNum) {
    this.originalMerchantRefNum = originalMerchantRefNum;
  }

  public Id<Order> getOrderId() {
    return orderId;
  }

  public void setOrderId(final Id<Order> orderId) {
    this.orderId = orderId;
  }

  @Override
  public Error getError() {
    return error;
  }

  public void setError(final Error error) {
    this.error = error;
  }

  /**
   * Get a settlement builder.
   *
   * @return SettlementBuilder
   */
  public static SettlementBuilder builder() {
    return new SettlementBuilder();
  }

  /**
   * The builder class for Settlement.
   */
  public static class SettlementBuilder extends
          BaseBuilder<Settlement> {
    
    private final Settlement settlement = new Settlement();

    /**
     * Build this Settlement object.
     *
     * @return Settlement
     */
    @Override
    public Settlement build() {
      return settlement;
    }

    /**
     * Set the amount property.
     *
     * @param amount
     * @return SettlementBuilder
     */
    public SettlementBuilder amount(final Integer amount) {
      settlement.setAmount(amount);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum
     * @return SettlementBuilder
     */
    public SettlementBuilder merchantRefNum(final String merchantRefNum) {
      settlement.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the orderId property.
     *
     * @param orderId
     * @return SettlementBuilder
     */
    public SettlementBuilder orderId(final Id<Order> orderId) {
      settlement.setOrderId(orderId);
      return this;
    }
  }
}
