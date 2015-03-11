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

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class ShoppingCartItem.
 */
public class ShoppingCartItem implements DomainObject {

  @Expose
  private Integer amount;
  @Expose
  private String description;
  @Expose
  private String sku;
  @Expose
  private Integer quantity;

  public final Integer getAmount() {
    return amount;
  }

  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  public final String getDescription() {
    return description;
  }

  public final void setDescription(final String description) {
    this.description = description;
  }

  public final String getSku() {
    return sku;
  }

  public final void setSku(final String sku) {
    this.sku = sku;
  }

  public final Integer getQuantity() {
    return quantity;
  }

  public final void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The sub-builder class for ShoppingCartItem.
   *
   * @param <BLDRT> the parent builder
   */
  public static class ShoppingCartItemBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<ShoppingCartItem, BLDRT> {
    
    private final ShoppingCartItem shoppingCartItem = new ShoppingCartItem();

    public ShoppingCartItemBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this ShoppingCartItem object.
     *
     * @return ShoppingCartItem
     */
    @Override
    public final ShoppingCartItem build() {
      return shoppingCartItem;
    }

    /**
     * Set the amount property.
     *
     * @param amount
     * @return ShoppingCartItemBuilder< BLDRT >
     */
    public final ShoppingCartItemBuilder<BLDRT> amount(final Integer amount) {
      shoppingCartItem.setAmount(amount);
      return this;
    }

    /**
     * Set the description property.
     *
     * @param description
     * @return ShoppingCartItemBuilder< BLDRT >
     */
    public final ShoppingCartItemBuilder<BLDRT> description(final String description) {
      shoppingCartItem.setDescription(description);
      return this;
    }

    /**
     * Set the sku property.
     *
     * @param sku
     * @return ShoppingCartItemBuilder< BLDRT >
     */
    public final ShoppingCartItemBuilder<BLDRT> sku(final String sku) {
      shoppingCartItem.setSku(sku);
      return this;
    }

    /**
     * Set the quantity property.
     *
     * @param quantity
     * @return ShoppingCartItemBuilder< BLDRT >
     */
    public final ShoppingCartItemBuilder<BLDRT> quantity(final Integer quantity) {
      shoppingCartItem.setQuantity(quantity);
      return this;
    }
  }
}
