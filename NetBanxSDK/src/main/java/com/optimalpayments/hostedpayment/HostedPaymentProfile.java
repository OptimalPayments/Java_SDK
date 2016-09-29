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

import com.optimalpayments.common.Id;
import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;
import com.optimalpayments.customervault.Profile;

// TODO: Auto-generated Javadoc
/**
 * The Class HostedPaymentProfile.
 */
public class HostedPaymentProfile implements DomainObject {

  /** The id. */
  @Expose
  private Id<Profile> id;
  
  /** The merchant customer id. */
  @Expose
  private String merchantCustomerId;
  
  /** The first name. */
  @Expose
  private String firstName;
  
  /** The last name. */
  @Expose
  private String lastName;
  
  /** The payment token. */
  @Expose
  private String paymentToken;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Profile> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Profile> id) {
    this.id = id;
  }

  /**
   * Gets the merchant customer id.
   *
   * @return the merchant customer id
   */
  public final String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  /**
   * Sets the merchant customer id.
   *
   * @param merchantCustomerId the new merchant customer id
   */
  public final void setMerchantCustomerId(final String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  /**
   * Gets the first name.
   *
   * @return the first name
   */
  public final String getFirstName() {
    return firstName;
  }

  /**
   * Sets the first name.
   *
   * @param firstName the new first name
   */
  public final void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the last name.
   *
   * @return the last name
   */
  public final String getLastName() {
    return lastName;
  }

  /**
   * Sets the last name.
   *
   * @param lastName the new last name
   */
  public final void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets the payment token.
   *
   * @return the payment token
   */
  public final String getPaymentToken() {
    return paymentToken;
  }

  /**
   * Sets the payment token.
   *
   * @param paymentToken the new payment token
   */
  public final void setPaymentToken(final String paymentToken) {
    this.paymentToken = paymentToken;
  }

  /**
   * The sub-builder class for HostedPaymentProfile.
   *
   * @param <BLDRT> the parent builder
   */
  public static class ProfileBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<HostedPaymentProfile, BLDRT> {
    
    /** The profile. */
    private final HostedPaymentProfile profile = new HostedPaymentProfile();

    /**
     * Instantiates a new profile builder.
     *
     * @param parent the parent
     */
    public ProfileBuilder(final BLDRT parent) {
      super(parent);
    }
    
    /**
     * Instantiates a new profile builder.
     *
     * @param parent the parent
     * @param p the p
     */
    public ProfileBuilder(final BLDRT parent, com.optimalpayments.customervault.Profile p) {
      super(parent);
      profile.setFirstName(p.getFirstName());
      profile.setId(p.getId());
      profile.setLastName(p.getLastName());
      profile.setMerchantCustomerId(p.getMerchantCustomerId());
      profile.setPaymentToken(p.getPaymentToken());
    }

    /**
     * Build this HostedPaymentProfile object.
     *
     * @return HostedPaymentProfile
     */
    @Override
    public final HostedPaymentProfile build() {
      return profile;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> id(final Id<Profile> id) {
      profile.setId(id);
      return this;
    }

    /**
     * Set the merchantCustomerId property.
     *
     * @param merchantCustomerId the merchant customer id
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> merchantCustomerId(final String merchantCustomerId) {
      profile.setMerchantCustomerId(merchantCustomerId);
      return this;
    }

    /**
     * Set the firstName property.
     *
     * @param firstName the first name
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> firstName(final String firstName) {
      profile.setFirstName(firstName);
      return this;
    }

    /**
     * Set the lastName property.
     *
     * @param lastName the last name
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> lastName(final String lastName) {
      profile.setLastName(lastName);
      return this;
    }

    /**
     * Set the paymentToken property.
     *
     * @param paymentToken the payment token
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> paymentToken(final String paymentToken) {
      profile.setPaymentToken(paymentToken);
      return this;
    }
  }
}
