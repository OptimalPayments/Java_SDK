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
 * The Class MasterPass.
 */
public class MasterPass implements DomainObject {

  private String payPassWalletIndicator;
  private String authenticationMethod;
  private String cardEnrollmentMethod;
  private String masterCardAssignedId;

  public final String getPayPassWalletIndicator() {
    return payPassWalletIndicator;
  }

  public final void setPayPassWalletIndicator(final String payPassWalletIndicator) {
    this.payPassWalletIndicator = payPassWalletIndicator;
  }

  public final String getAuthenticationMethod() {
    return authenticationMethod;
  }

  public final void setAuthenticationMethod(final String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public final String getCardEnrollmentMethod() {
    return cardEnrollmentMethod;
  }

  public final void setCardEnrollmentMethod(final String cardEnrollmentMethod) {
    this.cardEnrollmentMethod = cardEnrollmentMethod;
  }

  public final String getMasterCardAssignedId() {
    return masterCardAssignedId;
  }

  public final void setMasterCardAssignedId(final String masterCardAssignedId) {
    this.masterCardAssignedId = masterCardAssignedId;
  }
}
