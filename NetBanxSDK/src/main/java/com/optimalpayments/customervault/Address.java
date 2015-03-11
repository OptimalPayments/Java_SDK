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
package com.optimalpayments.customervault;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.AddressDetails;
import com.optimalpayments.common.Error;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.impl.AddressContainer;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * The Class Address.
 */
public class Address extends AddressContainer implements BaseDomainObject {

  private Id<Address> id;
  @Expose
  private String nickName;
  private Status status;
  @Expose
  private String recipientName;
  private Boolean defaultShippingAddressIndicator;
  private Error error;
  @Expose
  private Id<Profile> profileId;

  public final Id<Address> getId() {
    return id;
  }

  public final void setId(final Id<Address> id) {
    this.id = id;
  }

  public final String getNickName() {
    return nickName;
  }

  public final void setNickName(final String nickName) {
    this.nickName = nickName;
  }

  public final Status getStatus() {
    return status;
  }

  public final void setStatus(final Status status) {
    this.status = status;
  }

  public final String getRecipientName() {
    return recipientName;
  }

  public final void setRecipientName(final String recipientName) {
    this.recipientName = recipientName;
  }

  public final Boolean getDefaultShippingAddressIndicator() {
    return defaultShippingAddressIndicator;
  }

  public final void setDefaultShippingAddressIndicator(
          final Boolean defaultShippingAddressIndicator) {
    this.defaultShippingAddressIndicator = defaultShippingAddressIndicator;
  }

  @Override
  public final Error getError() {
    return error;
  }

  public final void setError(final Error error) {
    this.error = error;
  }

  public final Id<Profile> getProfileId() {
    return profileId;
  }

  public final void setProfileId(final Id<Profile> profileId) {
    this.profileId = profileId;
  }

  /**
   * Get an address builder.
   *
   * @return AddressBuilder
   */
  public static final AddressBuilder builder() {
    return new AddressBuilder();
  }

  /**
   * The builder class for Address.
   */
  public static class AddressBuilder extends BaseBuilder<Address> {

    private final Address address = new Address();
    private final AddressDetails addressDetails = new AddressDetails();

    /**
     * Build this authorization object.
     *
     * @return Authorization
     */
    @Override
    public final Address build() {
      address.setAddressDetails(addressDetails);
      return address;
    }

    /**
     * Set the id property.
     *
     * @param id
     * @return AddressBuilder
     */
    public final AddressBuilder id(final Id<Address> id) {
      address.setId(id);
      return this;
    }

    /**
     * Set the nickName property.
     *
     * @param nickName
     * @return AddressBuilder
     */
    public final AddressBuilder nickName(final String nickName) {
      address.setNickName(nickName);
      return this;
    }

    /**
     * Set the status property.
     *
     * @param status
     * @return AddressBuilder
     */
    public final AddressBuilder status(final Status status) {
      address.setStatus(status);
      return this;
    }

    /**
     * Set the street property.
     *
     * @param street
     * @return AddressBuilder
     */
    public final AddressBuilder street(final String street) {
      addressDetails.setStreet(street);
      return this;
    }

    /**
     * Set the street2 property.
     *
     * @param street2
     * @return AddressBuilder
     */
    public final AddressBuilder street2(final String street2) {
      addressDetails.setStreet2(street2);
      return this;
    }

    /**
     * Set the city property.
     *
     * @param city
     * @return AddressBuilder
     */
    public final AddressBuilder city(final String city) {
      addressDetails.setCity(city);
      return this;
    }

    /**
     * Set the country property.
     *
     * @param country
     * @return AddressBuilder
     */
    public final AddressBuilder country(final String country) {
      addressDetails.setCountry(country);
      return this;
    }

    /**
     * Set the state property.
     *
     * @param state
     * @return AddressBuilder
     */
    public final AddressBuilder state(final String state) {
      addressDetails.setState(state);
      return this;
    }

    /**
     * Set the zip property.
     *
     * @param zip
     * @return AddressBuilder
     */
    public final AddressBuilder zip(final String zip) {
      addressDetails.setZip(zip);
      return this;
    }

    /**
     * Set the recipientName property.
     *
     * @param recipientName
     * @return AddressBuilder
     */
    public final AddressBuilder recipientName(final String recipientName) {
      address.setRecipientName(recipientName);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone
     * @return AddressBuilder
     */
    public final AddressBuilder phone(final String phone) {
      addressDetails.setPhone(phone);
      return this;
    }

    /**
     * Set the profileId property.
     *
     * @param profileId
     * @return AddressBuilder
     */
    public final AddressBuilder profileId(final Id<Profile> profileId) {
      address.setProfileId(profileId);
      return this;
    }
  }
}
