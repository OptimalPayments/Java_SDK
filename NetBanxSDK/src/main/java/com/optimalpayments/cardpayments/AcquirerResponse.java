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

import com.optimalpayments.common.impl.DomainObject;

/**
 * The Class AcquirerResponse.
 */
public class AcquirerResponse implements DomainObject {

  private String code;
  private String responseCode;
  private String avsCode;
  private String balanceResponse;
  private String batchNumber;
  private String effectiveDate;
  private String financingType;
  private String gracePeriod;
  private String plan;
  private String seqNumber;
  private String term;
  private String terminalId;
  private String responseId;
  private String requestId;
  private String description;
  private String authCode;
  private String txnDateTime;
  private String referenceNbr;
  private String responseReasonCode;
  private String cvv2Result;
  private String mid;

  public final String getCode() {
    return code;
  }

  public final void setCode(final String code) {
    this.code = code;
  }

  public final String getResponseCode() {
    return responseCode;
  }

  public final void setResponseCode(final String responseCode) {
    this.responseCode = responseCode;
  }

  public final String getAvsCode() {
    return avsCode;
  }

  public final void setAvsCode(final String avsCode) {
    this.avsCode = avsCode;
  }

  public final String getBalanceResponse() {
    return balanceResponse;
  }

  public final void setBalanceResponse(final String balanceResponse) {
    this.balanceResponse = balanceResponse;
  }

  public final String getBatchNumber() {
    return batchNumber;
  }

  public final void setBatchNumber(final String batchNumber) {
    this.batchNumber = batchNumber;
  }

  public final String getEffectiveDate() {
    return effectiveDate;
  }

  public final void setEffectiveDate(final String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public final String getFinancingType() {
    return financingType;
  }

  public final void setFinancingType(final String financingType) {
    this.financingType = financingType;
  }

  public final String getGracePeriod() {
    return gracePeriod;
  }

  public final void setGracePeriod(final String gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public final String getPlan() {
    return plan;
  }

  public final void setPlan(final String plan) {
    this.plan = plan;
  }

  public final String getSeqNumber() {
    return seqNumber;
  }

  public final void setSeqNumber(final String seqNumber) {
    this.seqNumber = seqNumber;
  }

  public final String getTerm() {
    return term;
  }

  public final void setTerm(final String term) {
    this.term = term;
  }

  public final String getTerminalId() {
    return terminalId;
  }

  public final void setTerminalId(final String terminalId) {
    this.terminalId = terminalId;
  }

  public final String getResponseId() {
    return responseId;
  }

  public final void setResponseId(final String responseId) {
    this.responseId = responseId;
  }

  public final String getRequestId() {
    return requestId;
  }

  public final void setRequestId(final String requestId) {
    this.requestId = requestId;
  }

  public final String getDescription() {
    return description;
  }

  public final void setDescription(final String description) {
    this.description = description;
  }

  public final String getAuthCode() {
    return authCode;
  }

  public final void setAuthCode(final String authCode) {
    this.authCode = authCode;
  }

  public final String getTxnDateTime() {
    return txnDateTime;
  }

  public final void setTxnDateTime(final String txnDateTime) {
    this.txnDateTime = txnDateTime;
  }

  public final String getReferenceNbr() {
    return referenceNbr;
  }

  public final void setReferenceNbr(final String referenceNbr) {
    this.referenceNbr = referenceNbr;
  }

  public final String getResponseReasonCode() {
    return responseReasonCode;
  }

  public final void setResponseReasonCode(final String responseReasonCode) {
    this.responseReasonCode = responseReasonCode;
  }

  public final String getCvv2Result() {
    return cvv2Result;
  }

  public final void setCvv2Result(final String cvv2Result) {
    this.cvv2Result = cvv2Result;
  }

  public final String getMid() {
    return mid;
  }

  public final void setMid(final String mid) {
    this.mid = mid;
  }
}
