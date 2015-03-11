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

/**
 * The Class Transaction.
 */
public class Transaction implements DomainObject {

  @Expose
  private String status;
  private String lastUpdate;
  private AuthType authType;
  private String authCode;
  private String merchantRefNum;
  private ArrayList<Transaction> associatedTransactions;
  private Card card;
  private String confirmationNumber;
  private String currencyCode;
  private Integer amount;
  private String paymentType;
  private Boolean settled;
  private Boolean refunded;
  private Boolean reversed;
  private String dateTime;
  private String cvdVerification;
  private String houseNumberVerification;
  private String zipVerification;
  private ArrayList<Integer> riskReasonCode;
  private Integer errorCode;
  private String errorMessage;

  public final String getStatus() {
    return status;
  }

  public final void setStatus(final String status) {
    this.status = status;
  }

  public final String getLastUpdate() {
    return lastUpdate;
  }

  public final void setLastUpdate(final String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public final AuthType getAuthType() {
    return authType;
  }

  public final void setAuthType(final AuthType authType) {
    this.authType = authType;
  }

  public final String getAuthCode() {
    return authCode;
  }

  public final void setAuthCode(final String authCode) {
    this.authCode = authCode;
  }

  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  public final ArrayList<Transaction> getAssociatedTransactions() {
    return associatedTransactions;
  }

  public final void setAssociatedTransactions(final ArrayList<Transaction> associatedTransactions) {
    this.associatedTransactions = associatedTransactions;
  }

  public final Card getCard() {
    return card;
  }

  public final void setCard(final Card card) {
    this.card = card;
  }

  public final String getConfirmationNumber() {
    return confirmationNumber;
  }

  public final void setConfirmationNumber(final String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  public final String getCurrencyCode() {
    return currencyCode;
  }

  public final void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public final Integer getAmount() {
    return amount;
  }

  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  public final String getPaymentType() {
    return paymentType;
  }

  public final void setPaymentType(final String paymentType) {
    this.paymentType = paymentType;
  }

  public final Boolean getSettled() {
    return settled;
  }

  public final void setSettled(final Boolean settled) {
    this.settled = settled;
  }

  public final Boolean getRefunded() {
    return refunded;
  }

  public final void setRefunded(final Boolean refunded) {
    this.refunded = refunded;
  }

  public final Boolean getReversed() {
    return reversed;
  }

  public final void setReversed(final Boolean reversed) {
    this.reversed = reversed;
  }

  public final String getDateTime() {
    return dateTime;
  }

  public final void setDateTime(final String dateTime) {
    this.dateTime = dateTime;
  }

  public final String getCvdVerification() {
    return cvdVerification;
  }

  public final void setCvdVerification(final String cvdVerification) {
    this.cvdVerification = cvdVerification;
  }

  public final String getHouseNumberVerification() {
    return houseNumberVerification;
  }

  public final void setHouseNumberVerification(final String houseNumberVerification) {
    this.houseNumberVerification = houseNumberVerification;
  }

  public final String getZipVerification() {
    return zipVerification;
  }

  public final void setZipVerification(final String zipVerification) {
    this.zipVerification = zipVerification;
  }

  public final ArrayList<Integer> getRiskReasonCode() {
    return riskReasonCode;
  }

  public final void setRiskReasonCode(final ArrayList<Integer> riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
  }

  public final Integer getErrorCode() {
    return errorCode;
  }

  public final void setErrorCode(final Integer errorCode) {
    this.errorCode = errorCode;
  }

  public final String getErrorMessage() {
    return errorMessage;
  }

  public final void setErrorMessage(final String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
