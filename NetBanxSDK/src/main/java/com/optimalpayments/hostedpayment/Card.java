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

// TODO: Auto-generated Javadoc
/**
 * The Class Card.
 */
public class Card implements DomainObject {

  /** The brand. */
  private String brand;
  
  /** The country. */
  private String country;
  
  /** The expiry. */
  private String expiry;
  
  /** The last digits. */
  private String lastDigits;
  
  /** The three d enrolment. */
  private String threeDEnrolment;
  
  /** The type. */
  private String type;

  /**
   * Gets the brand.
   *
   * @return the brand
   */
  public final String getBrand() {
    return brand;
  }

  /**
   * Sets the brand.
   *
   * @param brand the new brand
   */
  public final void setBrand(final String brand) {
    this.brand = brand;
  }

  /**
   * Gets the country.
   *
   * @return the country
   */
  public final String getCountry() {
    return country;
  }

  /**
   * Sets the country.
   *
   * @param country the new country
   */
  public final void setCountry(final String country) {
    this.country = country;
  }

  /**
   * Gets the expiry.
   *
   * @return the expiry
   */
  public final String getExpiry() {
    return expiry;
  }

  /**
   * Sets the expiry.
   *
   * @param expiry the new expiry
   */
  public final void setExpiry(final String expiry) {
    this.expiry = expiry;
  }

  /**
   * Gets the last digits.
   *
   * @return the last digits
   */
  public final String getLastDigits() {
    return lastDigits;
  }

  /**
   * Sets the last digits.
   *
   * @param lastDigits the new last digits
   */
  public final void setLastDigits(final String lastDigits) {
    this.lastDigits = lastDigits;
  }

  /**
   * Gets the three d enrolment.
   *
   * @return the three d enrolment
   */
  public final String getThreeDEnrolment() {
    return threeDEnrolment;
  }

  /**
   * Sets the three d enrolment.
   *
   * @param threeDEnrolment the new three d enrolment
   */
  public final void setThreeDEnrolment(final String threeDEnrolment) {
    this.threeDEnrolment = threeDEnrolment;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public final String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public final void setType(final String type) {
    this.type = type;
  }
}
