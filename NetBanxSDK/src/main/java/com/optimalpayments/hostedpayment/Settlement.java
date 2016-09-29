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

// TODO: Auto-generated Javadoc
/**
 * The Class Settlement.
 */
public class Settlement implements BaseDomainObject {

  /** The id. */
  private Id<Order> id;
  
  /** The amount. */
  @Expose
  private Integer amount;
  
  /** The merchant ref num. */
  @Expose
  private String merchantRefNum;
  
  /** The auth type. */
  private AuthType authType;
  
  /** The confirmation number. */
  private Integer confirmationNumber;
  
  /** The currency code. */
  private String currencyCode;
  
  /** The mode. */
  private String mode;
  
  /** The original merchant ref num. */
  private String originalMerchantRefNum;
  
  /** The order id. */
  private Id<Order> orderId;
  
  /** The error. */
  private Error error;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Id<Order> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(final Id<Order> id) {
    this.id = id;
  }

  /**
   * Gets the amount.
   *
   * @return the amount
   */
  public Integer getAmount() {
    return amount;
  }

  /**
   * Sets the amount.
   *
   * @param amount the new amount
   */
  public void setAmount(final Integer amount) {
    this.amount = amount;
  }

  /**
   * Gets the merchant ref num.
   *
   * @return the merchant ref num
   */
  public String getMerchantRefNum() {
    return merchantRefNum;
  }

  /**
   * Sets the merchant ref num.
   *
   * @param merchantRefNum the new merchant ref num
   */
  public void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  /**
   * Gets the auth type.
   *
   * @return the auth type
   */
  public AuthType getAuthType() {
    return authType;
  }

  /**
   * Sets the auth type.
   *
   * @param authType the new auth type
   */
  public void setAuthType(final AuthType authType) {
    this.authType = authType;
  }

  /**
   * Gets the confirmation number.
   *
   * @return the confirmation number
   */
  public Integer getConfirmationNumber() {
    return confirmationNumber;
  }

  /**
   * Sets the confirmation number.
   *
   * @param confirmationNumber the new confirmation number
   */
  public void setConfirmationNumber(final Integer confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  /**
   * Gets the currency code.
   *
   * @return the currency code
   */
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the currency code.
   *
   * @param currencyCode the new currency code
   */
  public void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Gets the mode.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Sets the mode.
   *
   * @param mode the new mode
   */
  public void setMode(final String mode) {
    this.mode = mode;
  }

  /**
   * Gets the original merchant ref num.
   *
   * @return the original merchant ref num
   */
  public String getOriginalMerchantRefNum() {
    return originalMerchantRefNum;
  }

  /**
   * Sets the original merchant ref num.
   *
   * @param originalMerchantRefNum the new original merchant ref num
   */
  public void setOriginalMerchantRefNum(final String originalMerchantRefNum) {
    this.originalMerchantRefNum = originalMerchantRefNum;
  }

  /**
   * Gets the order id.
   *
   * @return the order id
   */
  public Id<Order> getOrderId() {
    return orderId;
  }

  /**
   * Sets the order id.
   *
   * @param orderId the new order id
   */
  public void setOrderId(final Id<Order> orderId) {
    this.orderId = orderId;
  }

  /* (non-Javadoc)
   * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
   */
  @Override
  public Error getError() {
    return error;
  }

  /**
   * Sets the error.
   *
   * @param error the new error
   */
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
    
    /** The settlement. */
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
     * @param amount the amount
     * @return SettlementBuilder
     */
    public SettlementBuilder amount(final Integer amount) {
      settlement.setAmount(amount);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant ref num
     * @return SettlementBuilder
     */
    public SettlementBuilder merchantRefNum(final String merchantRefNum) {
      settlement.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the orderId property.
     *
     * @param orderId the order id
     * @return SettlementBuilder
     */
    public SettlementBuilder orderId(final Id<Order> orderId) {
      settlement.setOrderId(orderId);
      return this;
    }
  }
}
