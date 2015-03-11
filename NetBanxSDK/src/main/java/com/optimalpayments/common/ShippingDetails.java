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
package com.optimalpayments.common;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.impl.AddressContainer;
import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;


/**
 * The Class ShippingDetails.
 */
public class ShippingDetails extends AddressContainer implements DomainObject {

  @Expose
  private String recipientName;
  @Expose
  private Carrier carrier;
  @Expose
  private ShipMethod shipMethod;

  public final String getRecipientName() {
    return recipientName;
  }

  public final void setRecipientName(final String recipientName) {
    this.recipientName = recipientName;
  }

  public final Carrier getCarrier() {
    return carrier;
  }

  public final void setCarrier(final Carrier carrier) {
    this.carrier = carrier;
  }

  public final ShipMethod getShipMethod() {
    return shipMethod;
  }

  public final void setShipMethod(final ShipMethod shipMethod) {
    this.shipMethod = shipMethod;
  }

  /**
   * The sub-builder class for ShippingDetails.
   *
   * @param <BLDRT> the parent builder
   */
  public static class ShippingDetailsBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<ShippingDetails, BLDRT> {

    private final ShippingDetails shippingDetails = new ShippingDetails();
    private AddressDetails addressDetails = new AddressDetails();

    public ShippingDetailsBuilder(final BLDRT parent) {
      super(parent);
    }

    public ShippingDetailsBuilder(
            final BLDRT parent,
            com.optimalpayments.customervault.Address a) {
      super(parent);
      if (null != a.getAddressDetails()) {
        addressDetails = a.getAddressDetails();
      }
      shippingDetails.setRecipientName(a.getRecipientName());
    }

    /**
     * Build this ShippingDetails object.
     *
     * @return ShippingDetails
     */
    @Override
    public final ShippingDetails build() {
      shippingDetails.setAddressDetails(addressDetails);
      return shippingDetails;
    }

    /**
     * Set the street property.
     *
     * @param street
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> street(final String street) {
      addressDetails.setStreet(street);
      return this;
    }

    /**
     * Set the street2 property.
     *
     * @param street2
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> street2(final String street2) {
      addressDetails.setStreet2(street2);
      return this;
    }

    /**
     * Set the city property.
     *
     * @param city
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> city(final String city) {
      addressDetails.setCity(city);
      return this;
    }

    /**
     * Set the state property.
     *
     * @param state
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> state(final String state) {
      addressDetails.setState(state);
      return this;
    }

    /**
     * Set the country property.
     *
     * @param country
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> country(final String country) {
      addressDetails.setCountry(country);
      return this;
    }

    /**
     * Set the zip property.
     *
     * @param zip
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> zip(final String zip) {
      addressDetails.setZip(zip);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> phone(final String phone) {
      addressDetails.setPhone(phone);
      return this;
    }

    /**
     * Set the carrier property.
     *
     * @param carrier
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> carrier(final Carrier carrier) {
      shippingDetails.setCarrier(carrier);
      return this;
    }

    /**
     * Set the shipMethod property.
     *
     * @param shipMethod
     * @return ShippingDetailsBuilder< BLDRT >
     */
    public final ShippingDetailsBuilder<BLDRT> shipMethod(final ShipMethod shipMethod) {
      shippingDetails.setShipMethod(shipMethod);
      return this;
    }
  }
}
