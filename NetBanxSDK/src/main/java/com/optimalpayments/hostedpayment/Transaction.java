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

// TODO: Auto-generated Javadoc
/**
 * The Class Transaction.
 */
public class Transaction implements DomainObject {

  /** The status. */
  @Expose
  private String status;
  
  /** The last update. */
  private String lastUpdate;
  
  /** The auth type. */
  private AuthType authType;
  
  /** The auth code. */
  private String authCode;
  
  /** The merchant ref num. */
  private String merchantRefNum;
  
  /** The associated transactions. */
  private ArrayList<Transaction> associatedTransactions;
  
  /** The card. */
  private Card card;
  
  /** The confirmation number. */
  private String confirmationNumber;
  
  /** The currency code. */
  private String currencyCode;
  
  /** The amount. */
  private Integer amount;
  
  /** The payment type. */
  private String paymentType;
  
  /** The settled. */
  private Boolean settled;
  
  /** The refunded. */
  private Boolean refunded;
  
  /** The reversed. */
  private Boolean reversed;
  
  /** The date time. */
  private String dateTime;
  
  /** The cvd verification. */
  private String cvdVerification;
  
  /** The house number verification. */
  private String houseNumberVerification;
  
  /** The zip verification. */
  private String zipVerification;
  
  /** The risk reason code. */
  private ArrayList<Integer> riskReasonCode;
  
  /** The error code. */
  private Integer errorCode;
  
  /** The error message. */
  private String errorMessage;

  /**
   * Gets the status.
   *
   * @return the status
   */
  public final String getStatus() {
    return status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public final void setStatus(final String status) {
    this.status = status;
  }

  /**
   * Gets the last update.
   *
   * @return the last update
   */
  public final String getLastUpdate() {
    return lastUpdate;
  }

  /**
   * Sets the last update.
   *
   * @param lastUpdate the new last update
   */
  public final void setLastUpdate(final String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Gets the auth type.
   *
   * @return the auth type
   */
  public final AuthType getAuthType() {
    return authType;
  }

  /**
   * Sets the auth type.
   *
   * @param authType the new auth type
   */
  public final void setAuthType(final AuthType authType) {
    this.authType = authType;
  }

  /**
   * Gets the auth code.
   *
   * @return the auth code
   */
  public final String getAuthCode() {
    return authCode;
  }

  /**
   * Sets the auth code.
   *
   * @param authCode the new auth code
   */
  public final void setAuthCode(final String authCode) {
    this.authCode = authCode;
  }

  /**
   * Gets the merchant ref num.
   *
   * @return the merchant ref num
   */
  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  /**
   * Sets the merchant ref num.
   *
   * @param merchantRefNum the new merchant ref num
   */
  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  /**
   * Gets the associated transactions.
   *
   * @return the associated transactions
   */
  public final ArrayList<Transaction> getAssociatedTransactions() {
    return associatedTransactions;
  }

  /**
   * Sets the associated transactions.
   *
   * @param associatedTransactions the new associated transactions
   */
  public final void setAssociatedTransactions(final ArrayList<Transaction> associatedTransactions) {
    this.associatedTransactions = associatedTransactions;
  }

  /**
   * Gets the card.
   *
   * @return the card
   */
  public final Card getCard() {
    return card;
  }

  /**
   * Sets the card.
   *
   * @param card the new card
   */
  public final void setCard(final Card card) {
    this.card = card;
  }

  /**
   * Gets the confirmation number.
   *
   * @return the confirmation number
   */
  public final String getConfirmationNumber() {
    return confirmationNumber;
  }

  /**
   * Sets the confirmation number.
   *
   * @param confirmationNumber the new confirmation number
   */
  public final void setConfirmationNumber(final String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  /**
   * Gets the currency code.
   *
   * @return the currency code
   */
  public final String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the currency code.
   *
   * @param currencyCode the new currency code
   */
  public final void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Gets the amount.
   *
   * @return the amount
   */
  public final Integer getAmount() {
    return amount;
  }

  /**
   * Sets the amount.
   *
   * @param amount the new amount
   */
  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  /**
   * Gets the payment type.
   *
   * @return the payment type
   */
  public final String getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the payment type.
   *
   * @param paymentType the new payment type
   */
  public final void setPaymentType(final String paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * Gets the settled.
   *
   * @return the settled
   */
  public final Boolean getSettled() {
    return settled;
  }

  /**
   * Sets the settled.
   *
   * @param settled the new settled
   */
  public final void setSettled(final Boolean settled) {
    this.settled = settled;
  }

  /**
   * Gets the refunded.
   *
   * @return the refunded
   */
  public final Boolean getRefunded() {
    return refunded;
  }

  /**
   * Sets the refunded.
   *
   * @param refunded the new refunded
   */
  public final void setRefunded(final Boolean refunded) {
    this.refunded = refunded;
  }

  /**
   * Gets the reversed.
   *
   * @return the reversed
   */
  public final Boolean getReversed() {
    return reversed;
  }

  /**
   * Sets the reversed.
   *
   * @param reversed the new reversed
   */
  public final void setReversed(final Boolean reversed) {
    this.reversed = reversed;
  }

  /**
   * Gets the date time.
   *
   * @return the date time
   */
  public final String getDateTime() {
    return dateTime;
  }

  /**
   * Sets the date time.
   *
   * @param dateTime the new date time
   */
  public final void setDateTime(final String dateTime) {
    this.dateTime = dateTime;
  }

  /**
   * Gets the cvd verification.
   *
   * @return the cvd verification
   */
  public final String getCvdVerification() {
    return cvdVerification;
  }

  /**
   * Sets the cvd verification.
   *
   * @param cvdVerification the new cvd verification
   */
  public final void setCvdVerification(final String cvdVerification) {
    this.cvdVerification = cvdVerification;
  }

  /**
   * Gets the house number verification.
   *
   * @return the house number verification
   */
  public final String getHouseNumberVerification() {
    return houseNumberVerification;
  }

  /**
   * Sets the house number verification.
   *
   * @param houseNumberVerification the new house number verification
   */
  public final void setHouseNumberVerification(final String houseNumberVerification) {
    this.houseNumberVerification = houseNumberVerification;
  }

  /**
   * Gets the zip verification.
   *
   * @return the zip verification
   */
  public final String getZipVerification() {
    return zipVerification;
  }

  /**
   * Sets the zip verification.
   *
   * @param zipVerification the new zip verification
   */
  public final void setZipVerification(final String zipVerification) {
    this.zipVerification = zipVerification;
  }

  /**
   * Gets the risk reason code.
   *
   * @return the risk reason code
   */
  public final ArrayList<Integer> getRiskReasonCode() {
    return riskReasonCode;
  }

  /**
   * Sets the risk reason code.
   *
   * @param riskReasonCode the new risk reason code
   */
  public final void setRiskReasonCode(final ArrayList<Integer> riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
  }

  /**
   * Gets the error code.
   *
   * @return the error code
   */
  public final Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the error code.
   *
   * @param errorCode the new error code
   */
  public final void setErrorCode(final Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Gets the error message.
   *
   * @return the error message
   */
  public final String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the error message.
   *
   * @param errorMessage the new error message
   */
  public final void setErrorMessage(final String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
