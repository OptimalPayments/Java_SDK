/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optimalpayments.hostedpayment;

import com.google.gson.annotations.SerializedName;

// TODO: Auto-generated Javadoc
/**
 * Used by Callback, Link, Redirect.
 */
public enum Rel {

  /** The on success. */
  @SerializedName("on_success")
  ON_SUCCESS,
  
  /** The on decline. */
  @SerializedName("on_decline")
  ON_DECLINE,
  
  /** The on hold. */
  @SerializedName("on_hold")
  ON_HOLD,
  
  /** The on error. */
  @SerializedName("on_error")
  ON_ERROR,
  
  /** The on timeout. */
  @SerializedName("on_timeout")
  ON_TIMEOUT,
  
  /** The cancel url. */
  @SerializedName("cancel_url")
  CANCEL_URL,
  
  /** The return url. */
  @SerializedName("return_url")
  RETURN_URL,
  
  /** The hosted payment. */
  @SerializedName("hosted_payment")
  HOSTED_PAYMENT,
  
  /** The self. */
  @SerializedName("self")
  SELF,
  
  /** The resent callback. */
  @SerializedName("resend_callback")
  RESENT_CALLBACK
}
