/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optimalpayments.hostedpayment;

import com.google.gson.annotations.SerializedName;

/**
 * Used by Callback, Link, Redirect.
 */
public enum Rel {

  @SerializedName("on_success")
  ON_SUCCESS,
  @SerializedName("on_decline")
  ON_DECLINE,
  @SerializedName("on_hold")
  ON_HOLD,
  @SerializedName("on_error")
  ON_ERROR,
  @SerializedName("on_timeout")
  ON_TIMEOUT,
  @SerializedName("cancel_url")
  CANCEL_URL,
  @SerializedName("return_url")
  RETURN_URL,
  @SerializedName("hosted_payment")
  HOSTED_PAYMENT,
  @SerializedName("self")
  SELF,
  @SerializedName("resend_callback")
  RESENT_CALLBACK
}
