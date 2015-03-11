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
import com.optimalpayments.common.ShippingDetails;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * The Class Authorization.
 */
public class Authorization implements BaseDomainObject {

  private Id<Authorization> id;
  @Expose
  private String merchantRefNum;
  @Expose
  private Integer amount;
  @Expose
  private Boolean settleWithAuth;
  private Integer availableToSettle;
  private String childAccountNum;
  @Expose
  private Card card;
  @Expose
  private Authentication authentication;
  private String authCode;
  private Profile profile;
  @Expose
  private BillingDetails billingDetails;
  @Expose
  private ShippingDetails shippingDetails;
  @Expose
  private Recurring recurring;
  @Expose
  private String customerIp;
  @Expose
  private Boolean dupCheck;
  private ArrayList<String> keywords;
  @Expose
  private MerchantDescriptor merchantDescriptor;
  @Expose
  private AccordD accordD;
  private String description;
  private MasterPass masterPass;
  private String txnTime;
  private String currencyCode;
  private AvsResponse avsResponse;
  private CvvVerification cvvVerification;
  @Expose
  private Status status;
  private ArrayList<Integer> riskReasonCode;
  private AcquirerResponse acquirerResponse;
  private VisaAdditionalAuthData visaAdditionalAuthData;
  private ArrayList<Settlement> settlements;
  private Error error;
  private ArrayList<Link> links;

  public final Id<Authorization> getId() {
    return id;
  }

  public final void setId(final Id<Authorization> id) {
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

  public final Boolean getSettleWithAuth() {
    return settleWithAuth;
  }

  public final void setSettleWithAuth(final Boolean settleWithAuth) {
    this.settleWithAuth = settleWithAuth;
  }

  public final Integer getAvailableToSettle() {
    return availableToSettle;
  }

  public final void setAvailableToSettle(final Integer availableToSettle) {
    this.availableToSettle = availableToSettle;
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

  public final Authentication getAuthentication() {
    return authentication;
  }

  public final void setAuthentication(final Authentication authentication) {
    this.authentication = authentication;
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

  public final ShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public final void setShippingDetails(final ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public final Recurring getRecurring() {
    return recurring;
  }

  public final void setRecurring(final Recurring recurring) {
    this.recurring = recurring;
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

  public final ArrayList<String> getKeywords() {
    return keywords;
  }

  public final void getKeywords(final ArrayList<String> keywords) {
    this.keywords = keywords;
  }

  public final MerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public final void setMerchantDescriptor(final MerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public final AccordD getAccordD() {
    return accordD;
  }

  public final void setAccordD(final AccordD accordD) {
    this.accordD = accordD;
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

  public final VisaAdditionalAuthData getVisaAdditionalAuthData() {
    return visaAdditionalAuthData;
  }

  public final void setVisaAdditionalAuthData(
          final VisaAdditionalAuthData visaAdditionalAuthData) {
    this.visaAdditionalAuthData = visaAdditionalAuthData;
  }

  public final ArrayList<Settlement> getSettlements() {
    return settlements;
  }

  public final void setSettlements(final ArrayList<Settlement> settlements) {
    this.settlements = settlements;
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
   * Get an authorization builder.
   *
   * @return AuthorizationBuilder
   */
  public static final AuthorizationBuilder builder() {
    return new AuthorizationBuilder();
  }

  /**
   * The builder class for Authorization.
   */
  public static class AuthorizationBuilder extends BaseBuilder<Authorization> {

    private Card.CardBuilder<AuthorizationBuilder> cardBuilder;
    private Authentication.AuthenticationBuilder<AuthorizationBuilder> authenticationBuilder;
    private BillingDetails.BillingDetailsBuilder<AuthorizationBuilder> billingDetailsBuilder;
    private ShippingDetails.ShippingDetailsBuilder<AuthorizationBuilder> shippingDetailsBuilder;
    private MerchantDescriptor.MerchantDescriptorBuilder<
            AuthorizationBuilder> merchantDescriptorBuilder;
    private AccordD.AccordDBuilder<AuthorizationBuilder> accordDBuilder;
    private final Authorization authorization = new Authorization();

    /**
     * Build this authorization object.
     *
     * @return Authorization
     */
    @Override
    public final Authorization build() {
      if (null != cardBuilder) {
        authorization.setCard(cardBuilder.build());
      }
      if (null != authenticationBuilder) {
        authorization.setAuthentication(authenticationBuilder.build());
      }
      if (null != billingDetailsBuilder) {
        authorization.setBillingDetails(billingDetailsBuilder.build());
      }
      if (null != shippingDetailsBuilder) {
        authorization.setShippingDetails(shippingDetailsBuilder.build());
      }
      if (null != merchantDescriptorBuilder) {
        authorization.setMerchantDescriptor(merchantDescriptorBuilder.build());
      }
      if (null != accordDBuilder) {
        authorization.setAccordD(accordDBuilder.build());
      }
      return authorization;
    }

    /**
     * Set the id property.
     *
     * @param id
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder id(final Id<Authorization> id) {
      authorization.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder merchantRefNum(final String merchantRefNum) {
      authorization.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the amount property.
     *
     * @param amount
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder amount(final Integer amount) {
      authorization.setAmount(amount);
      return this;
    }

    /**
     * Set the settleWithAuth property.
     *
     * @param settleWithAuth
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder settleWithAuth(final Boolean settleWithAuth) {
      authorization.setSettleWithAuth(settleWithAuth);
      return this;
    }

    /**
     * Build a card within this authorization.
     *
     * @return Card.CardBuilder< AuthorizationBuilder >
     */
    public final Card.CardBuilder<AuthorizationBuilder> card() {
      if (null == cardBuilder) {
        cardBuilder = new Card.CardBuilder<AuthorizationBuilder>(this);
      }
      return cardBuilder;
    }
    
    /**
     * Add details from a customer vault card to this card object.
     * 
     * @param c
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder card(final com.optimalpayments.customervault.Card c) {
      cardBuilder = new Card.CardBuilder<AuthorizationBuilder>(this, c);
      return this;
    }

    /**
     * Build an authentication within this authorization.
     *
     * @return Authentication.AuthenticationBuilder< AuthorizationBuilder >
     */
    public final Authentication.AuthenticationBuilder<AuthorizationBuilder> authentication() {
      if (null == authenticationBuilder) {
        authenticationBuilder = new Authentication.AuthenticationBuilder<
                        AuthorizationBuilder>(this);
      }
      return authenticationBuilder;
    }

    /**
     * Build a billingDetails within this authorization.
     *
     * @return BillingDetails.BillingDetailsBuilder< AuthorizationBuilder >
     */
    public final BillingDetails.BillingDetailsBuilder<AuthorizationBuilder> billingDetails() {
      if (null == billingDetailsBuilder) {
        billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                AuthorizationBuilder>(this);
      }
      return billingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this BillingDetails object.
     * 
     * @param a
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder billingDetails(
            final com.optimalpayments.customervault.Address a) {
      billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                AuthorizationBuilder>(this, a);
      return this;
    }

    /**
     * Build a shippingDetails within this authorization.
     *
     * @return ShippingDetails.ShippingDetailsBuilder< AuthorizationBuilder >
     */
    public final ShippingDetails.ShippingDetailsBuilder<AuthorizationBuilder> shippingDetails() {
      if (null == shippingDetailsBuilder) {
        shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<
                AuthorizationBuilder>(this);
      }
      return shippingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this ShippingDetails object.
     * 
     * @param a
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder shippingDetails(
            final com.optimalpayments.customervault.Address a) {
      shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<
                AuthorizationBuilder>(this, a);
      return this;
    }

    /**
     * Set the recurring property.
     *
     * @param recurring
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder recurring(final Recurring recurring) {
      authorization.setRecurring(recurring);
      return this;
    }

    /**
     * Set the customerIp property.
     *
     * @param customerIp
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder customerIp(final String customerIp) {
      authorization.setCustomerIp(customerIp);
      return this;
    }

    /**
     * Set the dupCheck property.
     *
     * @param dupCheck
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder dupCheck(final Boolean dupCheck) {
      authorization.setDupCheck(dupCheck);
      return this;
    }

    /**
     * Build a merchantDescriptor within this authorization.
     *
     * @return MerchantDescriptor.MerchantDescriptorBuilder
     * < AuthorizationBuilder >
     */
    public final MerchantDescriptor.MerchantDescriptorBuilder<AuthorizationBuilder>
            merchantDescriptor() {
      if (null == merchantDescriptorBuilder) {
        merchantDescriptorBuilder = new MerchantDescriptor.MerchantDescriptorBuilder<
                        AuthorizationBuilder>(this);
      }
      return merchantDescriptorBuilder;
    }

    /**
     * Build an accordD within this authorization.
     *
     * @return AccordD.AccordDBuilder< AuthorizationBuilder >
     */
    public final AccordD.AccordDBuilder<AuthorizationBuilder> accordD() {
      if (null == accordDBuilder) {
        accordDBuilder = new AccordD.AccordDBuilder<AuthorizationBuilder>(this);
      }
      return accordDBuilder;
    }

    /**
     * Set the description property.
     *
     * @param description
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder description(final String description) {
      authorization.setDescription(description);
      return this;
    }
  }
}
