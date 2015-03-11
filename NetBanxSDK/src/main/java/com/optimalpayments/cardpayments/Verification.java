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
 * The Class Verification.
 */
public class Verification implements BaseDomainObject {

  private Id<Verification> id;
  @Expose
  private String merchantRefNum;
  private String childAccountNum;
  @Expose
  private Card card;
  private String authCode;
  @Expose
  private Profile profile;
  @Expose
  private BillingDetails billingDetails;
  @Expose
  private String customerIp;
  @Expose
  private Boolean dupCheck;
  private MerchantDescriptor merchantDescriptor;
  @Expose
  private String description;
  private MasterPass masterPass;
  private String txnTime;
  private String currencyCode;
  private AvsResponse avsResponse;
  private CvvVerification cvvVerification;
  private Status status;
  private ArrayList<Integer> riskReasonCode;
  private AcquirerResponse acquirerResponse;
  private Error error;
  private ArrayList<Link> links;

  public final Id<Verification> getId() {
    return id;
  }

  public final void setId(final Id<Verification> id) {
    this.id = id;
  }

  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  public final String getChildAccountNum() {
    return childAccountNum;
  }

  public final void setChildAccountNum(final String childAccountNum) {
    this.childAccountNum = childAccountNum;
  }

  public final Card getCard() {
    return card;
  }

  public final void setCard(final Card card) {
    this.card = card;
  }

  public final String getAuthCode() {
    return authCode;
  }

  public final void setAuthCode(final String authCode) {
    this.authCode = authCode;
  }

  public final Profile getProfile() {
    return profile;
  }

  public final void setProfile(final Profile profile) {
    this.profile = profile;
  }

  public final BillingDetails getBillingDetails() {
    return billingDetails;
  }

  public final void setBillingDetails(final BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }

  public final String getCustomerIp() {
    return customerIp;
  }

  public final void setCustomerIp(final String customerIp) {
    this.customerIp = customerIp;
  }

  public final Boolean getDupCheck() {
    return dupCheck;
  }

  public final void setDupCheck(final Boolean dupCheck) {
    this.dupCheck = dupCheck;
  }

  public final MerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public final void setMerchantDescriptor(final MerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public final String getDescription() {
    return description;
  }

  public final void setDescription(final String description) {
    this.description = description;
  }

  public final MasterPass getMasterPass() {
    return masterPass;
  }

  public final void setMasterPass(final MasterPass masterPass) {
    this.masterPass = masterPass;
  }

  public final String getTxnTime() {
    return txnTime;
  }

  public final void setTxnTime(final String txnTime) {
    this.txnTime = txnTime;
  }

  public final String getCurrencyCode() {
    return currencyCode;
  }

  public final void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public final AvsResponse getAvsResponse() {
    return avsResponse;
  }

  public final void setAvsResponse(final AvsResponse avsResponse) {
    this.avsResponse = avsResponse;
  }

  public final CvvVerification getCvvVerification() {
    return cvvVerification;
  }

  public final void setCvvVerification(final CvvVerification cvvVerification) {
    this.cvvVerification = cvvVerification;
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

  /**
   * Get a Verification builder.
   *
   * @return VerificationBuilder
   */
  public static final VerificationBuilder builder() {
    return new VerificationBuilder();
  }

  /**
   * The builder class for Verification.
   */
  public static class VerificationBuilder extends BaseBuilder<Verification> {

    private final Verification verification = new Verification();
    private Card.CardBuilder<VerificationBuilder> cardBuilder;
    private Profile.ProfileBuilder<VerificationBuilder> profileBuilder;
    private BillingDetails.BillingDetailsBuilder<VerificationBuilder> billingDetailsBuilder;
    private MerchantDescriptor.MerchantDescriptorBuilder<
            VerificationBuilder> merchantDescriptorBuilder;

    /**
     * Build this Verification object.
     *
     * @return Verification
     */
    @Override
    public final Verification build() {
      if (null != cardBuilder) {
        verification.setCard(cardBuilder.build());
      }
      if (null != billingDetailsBuilder) {
        verification.setBillingDetails(billingDetailsBuilder.build());
      }
      if (null != merchantDescriptorBuilder) {
        verification.setMerchantDescriptor(merchantDescriptorBuilder.build());
      }
      return verification;
    }

    /**
     * Set the id property.
     *
     * @param id
     * @return VerificationBuilder
     */
    public final VerificationBuilder id(final Id<Verification> id) {
      verification.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum
     * @return AuuthorizationBuilder
     */
    public final VerificationBuilder merchantRefNum(final String merchantRefNum) {
      verification.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Build a card within this Verification.
     *
     * @return Card.CardBuilder< VerificationBuilder >
     */
    public final Card.CardBuilder<VerificationBuilder> card() {
      if (null == cardBuilder) {
        cardBuilder = new Card.CardBuilder<VerificationBuilder>(this);
      }
      return cardBuilder;
    }
    
    /**
     * Add details from a customer vault card to this card object.
     * 
     * @param c
     * @return AuthorizationBuilder
     */
    public final VerificationBuilder card(final com.optimalpayments.customervault.Card c) {
      cardBuilder = new Card.CardBuilder<VerificationBuilder>(this, c);
      return this;
    }

    /**
     * Build a profile within this Verification.
     *
     * @return Profile.ProfileBuilder< VerificationBuilder >
     */
    public final Profile.ProfileBuilder<VerificationBuilder> profile() {
      if (null == profileBuilder) {
        profileBuilder = new Profile.ProfileBuilder<VerificationBuilder>(this);
      }
      return profileBuilder;
    }
    
    /**
     * Add details from a customer vault profile to this Profile object.
     * 
     * @param p
     * @return VerificationBuilder
     */
    public final VerificationBuilder profile(
            final com.optimalpayments.customervault.Profile p) {
      profileBuilder = new Profile.ProfileBuilder<
                VerificationBuilder>(this, p);
      return this;
    }

    /**
     * Build a billingDetails within this Verification.
     *
     * @return BillingDetails.BillingDetailsBuilder< VerificationBuilder >
     */
    public final BillingDetails.BillingDetailsBuilder<VerificationBuilder> billingDetails() {
      if (null == billingDetailsBuilder) {
        billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                VerificationBuilder>(this);
      }
      return billingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this BillingDetails object.
     * 
     * @param a
     * @return VerificationBuilder
     */
    public final VerificationBuilder billingDetails(
            final com.optimalpayments.customervault.Address a) {
      billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                VerificationBuilder>(this, a);
      return this;
    }

    public final VerificationBuilder customerIp(final String customerIp) {
      verification.setCustomerIp(customerIp);
      return this;
    }

    public final VerificationBuilder dupCheck(final Boolean dupCheck) {
      verification.setDupCheck(dupCheck);
      return this;
    }

    /**
     * Build a merchantDescriptor within this Verification.
     *
     * @return MerchantDescriptor.MerchantDescriptorBuilder< VerificationBuilder
     * >
     */
    public final MerchantDescriptor.MerchantDescriptorBuilder<VerificationBuilder>
            merchantDescriptor() {
      if (null == merchantDescriptorBuilder) {
        merchantDescriptorBuilder
                = new MerchantDescriptor.MerchantDescriptorBuilder<
                        VerificationBuilder>(this);
      }
      return merchantDescriptorBuilder;
    }

    public final VerificationBuilder description(final String description) {
      verification.setDescription(description);
      return this;
    }
  }
}
