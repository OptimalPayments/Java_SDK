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

/**
 * The Class HostedPaymentProfile.
 */
public class HostedPaymentProfile implements DomainObject {

  @Expose
  private Id<Profile> id;
  @Expose
  private String merchantCustomerId;
  @Expose
  private String firstName;
  @Expose
  private String lastName;
  @Expose
  private String paymentToken;

  public final Id<Profile> getId() {
    return id;
  }

  public final void setId(final Id<Profile> id) {
    this.id = id;
  }

  public final String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  public final void setMerchantCustomerId(final String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public final String getFirstName() {
    return firstName;
  }

  public final void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public final String getLastName() {
    return lastName;
  }

  public final void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public final String getPaymentToken() {
    return paymentToken;
  }

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
    
    private final HostedPaymentProfile profile = new HostedPaymentProfile();

    public ProfileBuilder(final BLDRT parent) {
      super(parent);
    }
    
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
     * @param id
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> id(final Id<Profile> id) {
      profile.setId(id);
      return this;
    }

    /**
     * Set the merchantCustomerId property.
     *
     * @param merchantCustomerId
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> merchantCustomerId(final String merchantCustomerId) {
      profile.setMerchantCustomerId(merchantCustomerId);
      return this;
    }

    /**
     * Set the firstName property.
     *
     * @param firstName
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> firstName(final String firstName) {
      profile.setFirstName(firstName);
      return this;
    }

    /**
     * Set the lastName property.
     *
     * @param lastName
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> lastName(final String lastName) {
      profile.setLastName(lastName);
      return this;
    }

    /**
     * Set the paymentToken property.
     *
     * @param paymentToken
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> paymentToken(final String paymentToken) {
      profile.setPaymentToken(paymentToken);
      return this;
    }
  }
}
