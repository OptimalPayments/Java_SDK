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

/**
 * The Class Order.
 */
public class Order implements BaseDomainObject {

  private Id<Order> id;
  @Expose
  private String merchantRefNum;
  @Expose
  private String currencyCode;
  @Expose
  private Integer totalAmount;
  @Expose
  private String customerIp;
  @Expose
  private String customerNotificationEmail;
  @Expose
  private String merchantNotificationEmail;
  @Expose
  private String dueDate;
  @Expose
  private HostedPaymentProfile profile;
  @Expose
  private ArrayList<ShoppingCartItem> shoppingCart;
  @Expose
  private ArrayList<AncillaryFee> ancillaryFees;
  @Expose
  private BillingDetails billingDetails;
  @Expose
  private ShippingDetails shippingDetails;
  @Expose
  private ArrayList<Callback> callback;
  @Expose
  private ArrayList<Redirect> redirect;
  @Expose
  private ArrayList<Link> link;
  private String mode;
  private String type;
  @Expose
  private ArrayList<String> paymentMethod;
  @Expose
  private ArrayList<KeyValuePair> addendumData;
  @Expose
  private Locale locale;
  @Expose
  private ArrayList<KeyValuePair> extendedOptions;
  private ArrayList<Transaction> associatedTransactions;
  @Expose
  private Transaction transaction;
  private Error error;

  public final Id<Order> getId() {
    return id;
  }

  public final void setId(final Id<Order> id) {
    this.id = id;
  }

  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  public final String getCurrencyCode() {
    return currencyCode;
  }

  public final void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public final Integer getTotalAmount() {
    return totalAmount;
  }

  public final void setTotalAmount(final Integer totalAmount) {
    this.totalAmount = totalAmount;
  }

  public final String getCustomerIp() {
    return customerIp;
  }

  public final void setCustomerIp(final String customerIp) {
    this.customerIp = customerIp;
  }

  public final String getCustomerNotificationEmail() {
    return customerNotificationEmail;
  }

  public final void setCustomerNotificationEmail(final String customerNotificationEmail) {
    this.customerNotificationEmail = customerNotificationEmail;
  }

  public final String getMerchantNotificationEmail() {
    return merchantNotificationEmail;
  }

  public final void setMerchantNotificationEmail(final String merchantNotificationEmail) {
    this.merchantNotificationEmail = merchantNotificationEmail;
  }

  public final String getDueDate() {
    return dueDate;
  }

  public final void setDueDate(final String dueDate) {
    this.dueDate = dueDate;
  }

  public final HostedPaymentProfile getProfile() {
    return profile;
  }

  public final void setProfile(final HostedPaymentProfile profile) {
    this.profile = profile;
  }

  public final ArrayList<ShoppingCartItem> getShoppingCart() {
    return shoppingCart;
  }

  public final void setShoppingCart(final ArrayList<ShoppingCartItem> shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public final ArrayList<AncillaryFee> getAncillaryFees() {
    return ancillaryFees;
  }

  public final void setAncillaryFees(final ArrayList<AncillaryFee> ancillaryFees) {
    this.ancillaryFees = ancillaryFees;
  }

  public final BillingDetails getBillingDetails() {
    return billingDetails;
  }

  public final void setBillingDetails(final BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }

  public final ShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public final void setShippingDetails(final ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public final ArrayList<Callback> getCallback() {
    return callback;
  }

  public final void setCallback(final ArrayList<Callback> callback) {
    this.callback = callback;
  }

  public final ArrayList<Redirect> getRedirect() {
    return redirect;
  }

  public final void setRedirect(final ArrayList<Redirect> redirect) {
    this.redirect = redirect;
  }

  public final ArrayList<Link> getLink() {
    return link;
  }

  /**
   * Get a link by rel from the link array.
   *
   * @param rel
   * @return Link
   * @throws OptimalException
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

  public final void setLink(final ArrayList<Link> link) {
    this.link = link;
  }

  public final String getMode() {
    return mode;
  }

  public final void setMode(final String mode) {
    this.mode = mode;
  }

  public final String getType() {
    return type;
  }

  public final void setType(final String type) {
    this.type = type;
  }

  public final ArrayList<String> getPaymentMethod() {
    return paymentMethod;
  }

  public final void setPaymentMethod(final ArrayList<String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public final ArrayList<KeyValuePair> getAddendumData() {
    return addendumData;
  }

  public final void setAddendumData(final ArrayList<KeyValuePair> addendumData) {
    this.addendumData = addendumData;
  }

  public final Locale getLocale() {
    return locale;
  }

  public final void setLocale(final Locale locale) {
    this.locale = locale;
  }

  public final ArrayList<KeyValuePair> getExtendedOptions() {
    return extendedOptions;
  }

  public final void setExtendedOptions(final ArrayList<KeyValuePair> extendedOptions) {
    this.extendedOptions = extendedOptions;
  }

  public final ArrayList<Transaction> getAssociatedTransactions() {
    return associatedTransactions;
  }

  public final void setAssociatedTransactions(final ArrayList<Transaction> associatedTransactions) {
    this.associatedTransactions = associatedTransactions;
  }

  public final Transaction getTransaction() {
    return transaction;
  }

  public final void setTransaction(final Transaction transaction) {
    this.transaction = transaction;
  }

  @Override
  public final Error getError() {
    return error;
  }

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

    private final Order order = new Order();
    private HostedPaymentProfile.ProfileBuilder<OrderBuilder> profileBuilder;
    private BillingDetails.BillingDetailsBuilder<OrderBuilder> billingDetailsBuilder;
    private ShippingDetails.ShippingDetailsBuilder<OrderBuilder> shippingDetailsBuilder;
    private final ArrayList<
            ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder>> shoppingCartBuilders
            = new ArrayList<ShoppingCartItem.ShoppingCartItemBuilder<OrderBuilder>>();
    private final ArrayList<AncillaryFee.AncillaryFeeBuilder<OrderBuilder>> ancilleryFeeBuilders
            = new ArrayList<AncillaryFee.AncillaryFeeBuilder<OrderBuilder>>();
    private final ArrayList<Callback.CallbackBuilder<OrderBuilder>> callbackBuilders
            = new ArrayList<Callback.CallbackBuilder<OrderBuilder>>();
    private final ArrayList<Redirect.RedirectBuilder<OrderBuilder>> redirectBuilders
            = new ArrayList<Redirect.RedirectBuilder<OrderBuilder>>();
    private final ArrayList<Link.LinkBuilder<OrderBuilder>> linkBuilders
            = new ArrayList<Link.LinkBuilder<OrderBuilder>>();
    private final ArrayList<KeyValuePair.KeyValuePairBuilder<OrderBuilder>> addendumDataBuilders
            = new ArrayList<KeyValuePair.KeyValuePairBuilder<OrderBuilder>>();
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
     * @param id
     * @return OrderBuilder
     */
    public final OrderBuilder id(final Id<Order> id) {
      order.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum
     * @return OrderBuilder
     */
    public final OrderBuilder merchantRefNum(final String merchantRefNum) {
      order.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the currencyCode property.
     *
     * @param currencyCode
     * @return OrderBuilder
     */
    public final OrderBuilder currencyCode(final String currencyCode) {
      order.setCurrencyCode(currencyCode);
      return this;
    }

    /**
     * Set the totalAmount property.
     *
     * @param totalAmount
     * @return OrderBuilder
     */
    public final OrderBuilder totalAmount(final Integer totalAmount) {
      order.setTotalAmount(totalAmount);
      return this;
    }

    /**
     * Set the customerIp property.
     *
     * @param customerIp
     * @return OrderBuilder
     */
    public final OrderBuilder customerIp(final String customerIp) {
      order.setCustomerIp(customerIp);
      return this;
    }

    /**
     * Set the customerNotificationEmail property.
     *
     * @param customerNotificationEmail
     * @return OrderBuilder
     */
    public final OrderBuilder customerNotificationEmail(final String customerNotificationEmail) {
      order.setCustomerNotificationEmail(customerNotificationEmail);
      return this;
    }

    /**
     * Set the merchantNotificationEmail property.
     *
     * @param merchantNotificationEmail
     * @return OrderBuilder
     */
    public final OrderBuilder merchantNotificationEmail(final String merchantNotificationEmail) {
      order.setMerchantNotificationEmail(merchantNotificationEmail);
      return this;
    }

    /**
     * Set the dueDate property.
     *
     * @param dueDate
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
     * @param p
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
     * @param a
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
     * @param a
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
     * @param paymentMethod
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
     * @param locale
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
