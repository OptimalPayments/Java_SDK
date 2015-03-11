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

import com.optimalpayments.common.impl.DomainObject;


/**
 * The Class AddressDetails.
 */
public class AddressDetails implements DomainObject {

  @Expose
  protected String street = null;
  @Expose
  protected String street2 = null;
  @Expose
  protected String city = null;
  @Expose
  protected String state = null;
  @Expose
  protected String country = null;
  @Expose
  protected String zip = null;
  @Expose
  protected String phone = null;

  public final String getStreet() {
    return street;
  }

  public final void setStreet(final String street) {
    this.street = street;
  }

  public final String getStreet2() {
    return street2;
  }

  public final void setStreet2(final String street2) {
    this.street2 = street2;
  }

  public final String getCity() {
    return city;
  }

  public final void setCity(final String city) {
    this.city = city;
  }

  public final String getState() {
    return state;
  }

  public final void setState(final String state) {
    this.state = state;
  }

  public final String getCountry() {
    return country;
  }

  public final void setCountry(final String country) {
    this.country = country;
  }

  public final String getZip() {
    return zip;
  }

  public final void setZip(final String zip) {
    this.zip = zip;
  }

  public final String getPhone() {
    return phone;
  }

  public final void setPhone(final String phone) {
    this.phone = phone;
  }
}
