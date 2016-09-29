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
import java.util.ArrayList;

import com.optimalpayments.common.Error;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.Locale;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.common.ShippingDetails;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
public class Order implements BaseDomainObject {

  /** The id. */
  private Id<Order> id;
  
  /** The merchant ref num. */
  @Expose
  private String merchantRefNum;
  
  /** The currency code. */
  @Expose
  private String currencyCode;
  
  /** The total amount. */
  @Expose
  private Integer totalAmount;
  
  /** The customer ip. */
  @Expose
  private String customerIp;
  
  /** The customer notification email. */
  @Expose
  private String customerNotificationEmail;
  
  /** The merchant notification email. */
  @Expose
  private String merchantNotificationEmail;
  
  /** The due date. */
  @Expose
  private String dueDate;
  
  /** The profile. */
  @Expose
  private HostedPaymentProfile profile;
  
  /** The shopping cart. */
  @Expose
  private ArrayList<ShoppingCartItem> shoppingCart;
  
  /** The ancillary fees. */
  @Expose
  private ArrayList<AncillaryFee> ancillaryFees;
  
  /** The billing details. */
  @Expose
  private BillingDetails billingDetails;
  
  /** The shipping details. */
  @Expose
  private ShippingDetails shippingDetails;
  
  /** The callback. */
  @Expose
  private ArrayList<Callback> callback;
  
  /** The redirect. */
  @Expose
  private ArrayList<Redirect> redirect;
  
  /** The link. */
  @Expose
  private ArrayList<Link> link;
  
  /** The mode. */
  private String mode;
  
  /** The type. */
  private String type;
  
  /** The payment method. */
  @Expose
  private ArrayList<String> paymentMethod;
  
  /** The addendum data. */
  @Expose
  private ArrayList<KeyValuePair> addendumData;
  
  /** The locale. */
  @Expose
  private Locale locale;
  
  /** The extended options. */
  @Expose
  private ArrayList<KeyValuePair> extendedOptions;
  
  /** The associated transactions. */
  private ArrayList<Transaction> associatedTransactions;
  
  /** The transaction. */
  @Expose
  private Transaction transaction;
  
  /** The error. */
  private Error error;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Order> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Order> id) {
    this.id = id;
  }

  /**
   * Gets the merchant ref num.
   *
   * @return the merchant ref num
   */
  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  /**
   * Sets the merchant ref num.
   *
   * @param merchantRefNum the new merchant ref num
   */
  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  /**
   * Gets the currency code.
   *
   * @return the currency code
   */
  public final String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the currency code.
   *
   * @param currencyCode the new currency code
   */
  public final void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Gets the total amount.
   *
   * @return the total amount
   */
  public final Integer getTotalAmount() {
    return totalAmount;
  }

  /**
   * Sets the total amount.
   *
   * @param totalAmount the new total amount
   */
  public final void setTotalAmount(final Integer totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * Gets the customer ip.
   *
   * @return the customer ip
   */
  public final String getCustomerIp() {
    return customerIp;
  }

  /**
   * Sets the customer ip.
   *
   * @param customerIp the new customer ip
   */
  public final void setCustomerIp(final String customerIp) {
    this.customerIp = customerIp;
  }

  /**
   * Gets the customer notification email.
   *
   * @return the customer notification email
   */
  public final String getCustomerNotificationEmail() {
    return customerNotificationEmail;
  }

  /**
   * Sets the customer notification email.
   *
   * @param customerNotificationEmail the new customer notification email
   */
  public final void setCustomerNotificationEmail(final String customerNotificationEmail) {
    this.customerNotificationEmail = customerNotificationEmail;
  }

  /**
   * Gets the merchant notification email.
   *
   * @return the merchant notification email
   */
  public final String getMerchantNotificationEmail() {
    return merchantNotificationEmail;
  }

  /**
   * Sets the merchant notification email.
   *
   * @param merchantNotificationEmail the new merchant notification email
   */
  public final void setMerchantNotificationEmail(final String merchantNotificationEmail) {
    this.merchantNotificationEmail = merchantNotificationEmail;
  }

  /**
   * Gets the due date.
   *
   * @return the due date
   */
  public final String getDueDate() {
    return dueDate;
  }

  /**
   * Sets the due date.
   *
   * @param dueDate the new due date
   */
  public final void setDueDate(final String dueDate) {
    this.dueDate = dueDate;
  }

  /**
   * Gets the profile.
   *
   * @return the profile
   */
  public final HostedPaymentProfile getProfile() {
    return profile;
  }

  /**
   * Sets the profile.
   *
   * @param profile the new profile
   */
  public final void setProfile(final HostedPaymentProfile profile) {
    this.profile = profile;
  }

  /**
   * Gets the shopping cart.
   *
   * @return the shopping cart
   */
  public final ArrayList<ShoppingCartItem> getShoppingCart() {
    return shoppingCart;
  }

  /**
   * Sets the shopping cart.
   *
   * @param shoppingCart the new shopping cart
   */
  public final void setShoppingCart(final ArrayList<ShoppingCartItem> shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  /**
   * Gets the ancillary fees.
   *
   * @return the ancillary fees
   */
  public final ArrayList<AncillaryFee> getAncillaryFees() {
    return ancillaryFees;
  }

  /**
   * Sets the ancillary fees.
   *
   * @param ancillaryFees the new ancillary fees
   */
  public final void setAncillaryFees(final ArrayList<AncillaryFee> ancillaryFees) {
    this.ancillaryFees = ancillaryFees;
  }

  /**
   * Gets the billing details.
   *
   * @return the billing details
   */
  public final BillingDetails getBillingDetails() {
    return billingDetails;
  }

  /**
   * Sets the billing details.
   *
   * @param billingDetails the new billing details
   */
  public final void setBillingDetails(final BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }

  /**
   * Gets the shipping details.
   *
   * @return the shipping details
   */
  public final ShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  /**
   * Sets the shipping details.
   *
   * @param shippingDetails the new shipping details
   */
  public final void setShippingDetails(final ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  /**
   * Gets the callback.
   *
   * @return the callback
   */
  public final ArrayList<Callback> getCallback() {
    return callback;
  }

  /**
   * Sets the callback.
   *
   * @param callback the new callback
   */
  public final void setCallback(final ArrayList<Callback> callback) {
    this.callback = callback;
  }

  /**
   * Gets the redirect.
   *
   * @return the redirect
   */
  public final ArrayList<Redirect> getRedirect() {
    return redirect;
  }

  /**
   * Sets the redirect.
   *
   * @param redirect the new redirect
   */
  public final void setRedirect(final ArrayList<Redirect> redirect) {
    this.redirect = redirect;
  }

  /**
   * Gets the link.
   *
   * @return the link
   */
  public final ArrayList<Link> getLink() {
    return link;
  }

  /**
   * Get a link by rel from the link array.
   *
   * @param rel the rel
   * @return Link
   * @throws OptimalException the optimal exception
   */
  public final Link getLink(final Rel rel) throws OptimalException {
    if (null != getLink()) {
      for (Link tLink : getLink()) {
        if (tLink.getRel().equals(rel)) {
          return tLink;
        }
      }
    }
    throw new OptimalException("Link " + rel.toString() + " not found in order.");
  }

  /**
   * Sets the link.
   *
   * @param link the new link
   */
  public final void setLink(final ArrayList<Link> link) {
    this.link = link;
  }

  /**
   * Gets the mode.
   *
   * @return the mode
   */
  public final String getMode() {
    return mode;
  }

  /**
   * Sets the mode.
   *
   * @param mode the new mode
   */
  public final void setMode(final String mode) {
    this.mode = mode;
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

  /**
   * Gets the payment method.
   *
   * @return the payment method
   */
  public final ArrayList<String> getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * Sets the payment method.
   *
   * @param paymentMethod the new payment method
   */
  public final void setPaymentMethod(final ArrayList<String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Gets the addendum data.
   *
   * @return the addendum data
   */
  public final ArrayList<KeyValuePair> getAddendumData() {
    return addendumData;
  }

  /**
   * Sets the addendum data.
   *
   * @param addendumData the new addendum data
   */
  public final void setAddendumData(final ArrayList<KeyValuePair> addendumData) {
    this.addendumData = addendumData;
  }

  /**
   * Gets the locale.
   *
   * @return the locale
   */
  public final Locale getLocale() {
    return locale;
  }

  /**
   * Sets the locale.
   *
   * @param locale the new locale
   */
  public final void setLocale(final Locale locale) {
    this.locale = locale;
  }

  /**
   * Gets the extended options.
   *
   * @return the extended options
   */
  public final ArrayList<KeyValuePair> getExtendedOptions() {
    return extendedOptions;
  }

  /**
   * Sets the extended options.
   *
   * @param extendedOptions the new extended options
   */
  public final void setExtendedOptions(final ArrayList<KeyValuePair> extendedOptions) {
    this.extendedOptions = extendedOptions;
  }

  /**
   * Gets the associated transactions.
   *
   * @return the associated transactions
   */
  public final ArrayList<Transaction> getAssociatedTransactions() {
    return associatedTransactions;
  }

  /**
   * Sets the associated transactions.
   *
   * @param associatedTransactions the new associated transactions
   */
  public final void setAssociatedTransactions(final ArrayList<Transaction> associatedTransactions) {
    this.associatedTransactions = associatedTransactions;
  }

  /**
   * Gets the transaction.
   *
   * @return the transaction
   */
  public final Transaction getTransaction() {
    return transaction;
  }

  /**
   * Sets the transaction.
   *
   * @param transaction the new transaction
   */
  public final void setTransaction(final Transaction transaction) {
    this.transaction = transaction;
  }

  /* (non-Javadoc)
   * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
   */
  @Override
  public final Error getError() {
    return error;
  }

  /**
   * Sets the error.
   *
   * @param error the new error
   */
  public final void setError(final Error error) {
    this.error = error;
  }

  /**
   * Get an order builder.
   *
   * @return OrderBuilder
   */
  public static final OrderBuilder builder() {
    return new OrderBuilder();
  }

  /**
   * The builder class for Order.
   */
  public static class OrderBuilder extends BaseBuilder<Order> {

    /** The order. */
    private final Order order = new Order();
    
    /** The profile builder. */
    private HostedPaymentProfile.ProfileBuilder<OrderBuilder> profileBuilder;
    
    /** The billing details builder. */
    private BillingDetails.BillingDetailsBuilder<OrderBuilder> billingDetailsBuilder;
    
    /** The shipping details builder. */
    private ShippingDetails.ShippingDetailsBuilder<OrderBuilder> shippingDetailsBuilder;
    
    /** The shopping cart builders. */
    private final ArrayList<
            ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder>> shoppingCartBuilders
            = new ArrayList<ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder>>();
    
    /** The ancillery fee builders. */
    private final ArrayList<AncillaryFee.AncillaryFeeBuilder<OrderBuilder>> ancilleryFeeBuilders
            = new ArrayList<AncillaryFee.AncillaryFeeBuilder<OrderBuilder>>();
    
    /** The callback builders. */
    private final ArrayList<Callback.CallbackBuilder<OrderBuilder>> callbackBuilders
            = new ArrayList<Callback.CallbackBuilder<OrderBuilder>>();
    
    /** The redirect builders. */
    private final ArrayList<Redirect.RedirectBuilder<OrderBuilder>> redirectBuilders
            = new ArrayList<Redirect.RedirectBuilder<OrderBuilder>>();
    
    /** The link builders. */
    private final ArrayList<Link.LinkBuilder<OrderBuilder>> linkBuilders
            = new ArrayList<Link.LinkBuilder<OrderBuilder>>();
    
    /** The addendum data builders. */
    private final ArrayList<KeyValuePair.KeyValuePairBuilder<OrderBuilder>> addendumDataBuilders
            = new ArrayList<KeyValuePair.KeyValuePairBuilder<OrderBuilder>>();
    
    /** The extended options builders. */
    private final ArrayList<KeyValuePair.KeyValuePairBuilder<OrderBuilder>> extendedOptionsBuilders
            = new ArrayList<KeyValuePair.KeyValuePairBuilder<OrderBuilder>>();

    /**
     * Build this order object.
     *
     * @return Order
     */
    @Override
    public final Order build() {
      if (null != profileBuilder) {
        order.setProfile(profileBuilder.build());
      }
      if (null != billingDetailsBuilder) {
        order.setBillingDetails(billingDetailsBuilder.build());
      }
      if (null != shippingDetailsBuilder) {
        order.setShippingDetails(shippingDetailsBuilder.build());
      }
      if (shoppingCartBuilders.size() > 0) {
        final ArrayList<ShoppingCartItem> shoppingCartItems = new ArrayList<ShoppingCartItem>();
        for (ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder> bldr : shoppingCartBuilders) {
          shoppingCartItems.add(bldr.build());
        }
        order.setShoppingCart(shoppingCartItems);
      }
      if (ancilleryFeeBuilders.size() > 0) {
        final ArrayList<AncillaryFee> ancillaryFees = new ArrayList<AncillaryFee>();
        for (AncillaryFee.AncillaryFeeBuilder<OrderBuilder> bldr : ancilleryFeeBuilders) {
          ancillaryFees.add(bldr.build());
        }
        order.setAncillaryFees(ancillaryFees);
      }
      if (callbackBuilders.size() > 0) {
        final ArrayList<Callback> callbacks = new ArrayList<Callback>();
        for (Callback.CallbackBuilder<OrderBuilder> bldr : callbackBuilders) {
          callbacks.add(bldr.build());
        }
        order.setCallback(callbacks);
      }
      if (redirectBuilders.size() > 0) {
        ArrayList<Redirect> redirects = new ArrayList<Redirect>();
        for (Redirect.RedirectBuilder<OrderBuilder> bldr : redirectBuilders) {
          redirects.add(bldr.build());
        }
        order.setRedirect(redirects);
      }
      if (linkBuilders.size() > 0) {
        ArrayList<Link> links = new ArrayList<Link>();
        for (Link.LinkBuilder<OrderBuilder> bldr : linkBuilders) {
          links.add(bldr.build());
        }
        order.setLink(links);
      }
      if (addendumDataBuilders.size() > 0) {
        ArrayList<KeyValuePair> addendumData = new ArrayList<KeyValuePair>();
        for (KeyValuePair.KeyValuePairBuilder<OrderBuilder> bldr : addendumDataBuilders) {
          addendumData.add(bldr.build());
        }
        order.setAddendumData(addendumData);
      }
      if (extendedOptionsBuilders.size() > 0) {
        ArrayList<KeyValuePair> extendedOptions = new ArrayList<KeyValuePair>();
        for (KeyValuePair.KeyValuePairBuilder<OrderBuilder> bldr : extendedOptionsBuilders) {
          extendedOptions.add(bldr.build());
        }
        order.setExtendedOptions(extendedOptions);
      }
      return order;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return OrderBuilder
     */
    public final OrderBuilder id(final Id<Order> id) {
      order.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant ref num
     * @return OrderBuilder
     */
    public final OrderBuilder merchantRefNum(final String merchantRefNum) {
      order.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the currencyCode property.
     *
     * @param currencyCode the currency code
     * @return OrderBuilder
     */
    public final OrderBuilder currencyCode(final String currencyCode) {
      order.setCurrencyCode(currencyCode);
      return this;
    }

    /**
     * Set the totalAmount property.
     *
     * @param totalAmount the total amount
     * @return OrderBuilder
     */
    public final OrderBuilder totalAmount(final Integer totalAmount) {
      order.setTotalAmount(totalAmount);
      return this;
    }

    /**
     * Set the customerIp property.
     *
     * @param customerIp the customer ip
     * @return OrderBuilder
     */
    public final OrderBuilder customerIp(final String customerIp) {
      order.setCustomerIp(customerIp);
      return this;
    }

    /**
     * Set the customerNotificationEmail property.
     *
     * @param customerNotificationEmail the customer notification email
     * @return OrderBuilder
     */
    public final OrderBuilder customerNotificationEmail(final String customerNotificationEmail) {
      order.setCustomerNotificationEmail(customerNotificationEmail);
      return this;
    }

    /**
     * Set the merchantNotificationEmail property.
     *
     * @param merchantNotificationEmail the merchant notification email
     * @return OrderBuilder
     */
    public final OrderBuilder merchantNotificationEmail(final String merchantNotificationEmail) {
      order.setMerchantNotificationEmail(merchantNotificationEmail);
      return this;
    }

    /**
     * Set the dueDate property.
     *
     * @param dueDate the due date
     * @return OrderBuilder
     */
    public final OrderBuilder dueDate(final String dueDate) {
      order.setDueDate(dueDate);
      return this;
    }

    /**
     * Build a profile within this order.
     *
     * @return HostedPaymentProfile.ProfileBuilder< OrderBuilder >
     */
    public final HostedPaymentProfile.ProfileBuilder<OrderBuilder> profile() {
      if (null == profileBuilder) {
        profileBuilder = new HostedPaymentProfile.ProfileBuilder<OrderBuilder>(this);
      }
      return profileBuilder;
    }
    
    /**
     * Add details from a customer vault profile to this Profile object.
     *
     * @param p the p
     * @return VerificationBuilder
     */
    public final OrderBuilder profile(
            final com.optimalpayments.customervault.Profile p) {
      profileBuilder = new HostedPaymentProfile.ProfileBuilder<
                OrderBuilder>(this, p);
      return this;
    }

    /**
     * Add and build a shopping cart item within this order.
     *
     * @return ShoppingCartItem.ShoppingCartItemBuilder< OrderBuilder >
     */
    public final ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder> addShoppingCartItem() {
      ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder> newBldr
              = new ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder>(this);
      shoppingCartBuilders.add(newBldr);
      return newBldr;
    }

    /**
     * Build a ancillary fee within this order.
     *
     * @return AncillaryFee.AncillaryFeeBuilder< OrderBuilder >
     */
    public final AncillaryFee.AncillaryFeeBuilder<OrderBuilder> addAncillaryFee() {
      AncillaryFee.AncillaryFeeBuilder<OrderBuilder> newBldr
              = new AncillaryFee.AncillaryFeeBuilder<OrderBuilder>(this);
      ancilleryFeeBuilders.add(newBldr);
      return newBldr;
    }

    /**
     * Build a billingDetails within this order.
     *
     * @return BillingDetails.BillingDetailsBuilder< OrderBuilder >
     */
    public final BillingDetails.BillingDetailsBuilder<OrderBuilder> billingDetails() {
      if (null == billingDetailsBuilder) {
        billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<OrderBuilder>(this);
      }
      return billingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this BillingDetails object.
     *
     * @param a the a
     * @return OrderBuilder
     */
    public final OrderBuilder billingDetails(
            final com.optimalpayments.customervault.Address a) {
      billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                OrderBuilder>(this, a);
      return this;
    }

    /**
     * Build a shippingDetails within this order.
     *
     * @return ShippingDetails.ShippingDetailsBuilder< OrderBuilder >
     */
    public final ShippingDetails.ShippingDetailsBuilder<OrderBuilder> shippingDetails() {
      if (null == shippingDetailsBuilder) {
        shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<OrderBuilder>(this);
      }
      return shippingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this ShippingDetails object.
     *
     * @param a the a
     * @return OrderBuilder
     */
    public final OrderBuilder shippingDetails(
            final com.optimalpayments.customervault.Address a) {
      shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<
                OrderBuilder>(this, a);
      return this;
    }

    /**
     * Add and build a callback within this order.
     *
     * @return Callback.CallbackBuilder< OrderBuilder >
     */
    public final Callback.CallbackBuilder<OrderBuilder> addCallback() {
      Callback.CallbackBuilder<OrderBuilder> newBldr = new Callback.CallbackBuilder<
              OrderBuilder>(this);
      callbackBuilders.add(newBldr);
      return newBldr;
    }

    /**
     * Add and build a redirect within this order.
     *
     * @return Redirect.RedirectBuilder< OrderBuilder >
     */
    public final Redirect.RedirectBuilder<OrderBuilder> addRedirect() {
      Redirect.RedirectBuilder<OrderBuilder> newBldr = new Redirect.RedirectBuilder<
              OrderBuilder>(this);
      redirectBuilders.add(newBldr);
      return newBldr;
    }

    /**
     * Add and build a link within this order.
     *
     * @return Link.LinkBuilder< OrderBuilder >
     */
    public final Link.LinkBuilder<OrderBuilder> addLink() {
      Link.LinkBuilder<OrderBuilder> newBldr = new Link.LinkBuilder<OrderBuilder>(this);
      linkBuilders.add(newBldr);
      return newBldr;
    }

    /**
     * Add a paymentMethod to this order.
     *
     * @param paymentMethod the payment method
     * @return OrderBuilder
     */
    public final OrderBuilder addPaymentMethod(final String paymentMethod) {
      ArrayList<String> paymentMethods = order.getPaymentMethod();
      if (null == paymentMethods) {
        paymentMethods = new ArrayList<String>();
      }
      paymentMethods.add(paymentMethod);
      order.setPaymentMethod(paymentMethods);
      return this;
    }

    /**
     * Add addendumData to this order.
     *
     * @return KeyValuePair.KeyValuePairBuilder< OrderBuilder >
     */
    public final KeyValuePair.KeyValuePairBuilder<OrderBuilder> addAddendumData() {
      KeyValuePair.KeyValuePairBuilder<OrderBuilder> newBldr
              = new KeyValuePair.KeyValuePairBuilder<OrderBuilder>(this);
      addendumDataBuilders.add(newBldr);
      return newBldr;
    }

    /**
     * Set the locale property.
     *
     * @param locale the locale
     * @return OrderBuilder
     */
    public final OrderBuilder locale(final Locale locale) {
      order.setLocale(locale);
      return this;
    }

    /**
     * Add extendedOptions to this order.
     *
     * @return KeyValuePair.KeyValuePairBuilder< OrderBuilder >
     */
    public final KeyValuePair.KeyValuePairBuilder<OrderBuilder> addExtendedOption() {
      KeyValuePair.KeyValuePairBuilder<OrderBuilder> newBldr
              = new KeyValuePair.KeyValuePairBuilder<OrderBuilder>(this);
      extendedOptionsBuilders.add(newBldr);
      return newBldr;
    }
  }
}
