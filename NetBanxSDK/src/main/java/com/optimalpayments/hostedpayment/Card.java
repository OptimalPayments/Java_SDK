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

import com.optimalpayments.common.impl.DomainObject;

/**
 * The Class Card.
 */
public class Card implements DomainObject {

  private String brand;
  private String country;
  private String expiry;
  private String lastDigits;
  private String threeDEnrolment;
  private String type;

  public final String getBrand() {
    return brand;
  }

  public final void setBrand(final String brand) {
    this.brand = brand;
  }

  public final String getCountry() {
    return country;
  }

  public final void setCountry(final String country) {
    this.country = country;
  }

  public final String getExpiry() {
    return expiry;
  }

  public final void setExpiry(final String expiry) {
    this.expiry = expiry;
  }

  public final String getLastDigits() {
    return lastDigits;
  }

  public final void setLastDigits(final String lastDigits) {
    this.lastDigits = lastDigits;
  }

  public final String getThreeDEnrolment() {
    return threeDEnrolment;
  }

  public final void setThreeDEnrolment(final String threeDEnrolment) {
    this.threeDEnrolment = threeDEnrolment;
  }

  public final String getType() {
    return type;
  }

  public final void setType(final String type) {
    this.type = type;
  }
}
