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
package com.optimalpayments.customervault;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.CardExpiry;
import com.optimalpayments.common.Error;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * The Class Card.
 */
public class Card implements BaseDomainObject {

  private Id<Card> id;
  @Expose
  private String nickName;
  private Status status;
  @Expose
  private String merchantRefNum;
  @Expose
  private String holderName;
  @Expose
  private String cardNum;
  private String cardBin;
  private String lastDigits;
  @Expose
  private CardExpiry cardExpiry;
  private String cardType;
  @Expose
  private Id<Address> billingAddressId;
  private Boolean defaultCardIndicator;
  @Expose
  private String paymentToken;
  private Error error;
  @Expose
  private Id<Profile> profileId;

  public final Id<Card> getId() {
    return id;
  }

  public final void setId(final Id<Card> id) {
    this.id = id;
  }

  public final String getNickName() {
    return nickName;
  }

  public final void setNickName(final String nickName) {
    this.nickName = nickName;
  }

  public final Status getStatus() {
    return status;
  }

  public final void setStatus(final Status status) {
    this.status = status;
  }

  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  public final String getHolderName() {
    return holderName;
  }

  public final void setHolderName(final String holderName) {
    this.holderName = holderName;
  }

  public final String getCardNum() {
    return cardNum;
  }

  public final void setCardNum(final String cardNum) {
    this.cardNum = cardNum;
  }

  public final String getCardBin() {
    return cardBin;
  }

  public final void setCardBin(final String cardBin) {
    this.cardBin = cardBin;
  }

  public final String getLastDigits() {
    return lastDigits;
  }

  public final void setLastDigits(final String lastDigits) {
    this.lastDigits = lastDigits;
  }

  public final CardExpiry getCardExpiry() {
    return cardExpiry;
  }

  public final void setCardExpiry(final CardExpiry cardExpiry) {
    this.cardExpiry = cardExpiry;
  }

  public final String getCardType() {
    return cardType;
  }

  public final void setCardType(final String cardType) {
    this.cardType = cardType;
  }

  public final Id<Address> getBillingAddressId() {
    return billingAddressId;
  }

  public final void setBillingAddressId(final Id<Address> billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  public final Boolean getDefaultCardIndicator() {
    return defaultCardIndicator;
  }

  public final void setDefaultCardIndicator(final Boolean defaultCardIndicator) {
    this.defaultCardIndicator = defaultCardIndicator;
  }

  public final String getPaymentToken() {
    return paymentToken;
  }

  public final void setPaymentToken(final String paymentToken) {
    this.paymentToken = paymentToken;
  }

  @Override
  public final Error getError() {
    return error;
  }

  public final void setError(final Error error) {
    this.error = error;
  }

  public final Id<Profile> getProfileId() {
    return profileId;
  }

  public final void setProfileId(final Id<Profile> profileId) {
    this.profileId = profileId;
  }

  /**
   * Get a card builder.
   *
   * @return CardBuilder
   */
  public static final CardBuilder builder() {
    return new CardBuilder();
  }

  /**
   * The builder class for Card.
   */
  public static class CardBuilder extends BaseBuilder<Card> {

    private final Card card = new Card();
    private CardExpiry.CardExpiryBuilder<CardBuilder> cardExpiryBuilder;

    /**
     * Build this card object.
     *
     * @return Card
     */
    @Override
    public final Card build() {
      if (null != cardExpiryBuilder) {
        card.setCardExpiry(cardExpiryBuilder.build());
      }
      return card;
    }

    /**
     * Set the id property.
     *
     * @param id
     * @return CardBuilder
     */
    public final CardBuilder id(final Id<Card> id) {
      card.setId(id);
      return this;
    }

    /**
     * Set the nickName property.
     *
     * @param nickName
     * @return CardBuilder
     */
    public final CardBuilder nickName(final String nickName) {
      card.setNickName(nickName);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum
     * @return CardBuilder
     */
    public final CardBuilder merchantRefNum(final String merchantRefNum) {
      card.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the holderName property.
     *
     * @param holderName
     * @return CardBuilder
     */
    public final CardBuilder holderName(final String holderName) {
      card.setHolderName(holderName);
      return this;
    }

    /**
     * Set the cardNum property.
     *
     * @param cardNum
     * @return CardBuilder
     */
    public final CardBuilder cardNum(final String cardNum) {
      card.setCardNum(cardNum);
      return this;
    }

    /**
     * Build a cardExpiry within this card.
     *
     * @return CardExpiry.CardExpiryBuilder< CardBuilder >
     */
    public final CardExpiry.CardExpiryBuilder<CardBuilder> cardExpiry() {
      if (null == cardExpiryBuilder) {
        cardExpiryBuilder = new CardExpiry.CardExpiryBuilder<CardBuilder>(this);
      }
      return cardExpiryBuilder;
    }

    public final CardBuilder billingAddressId(final Id<Address> billingAddressId) {
      card.setBillingAddressId(billingAddressId);
      return this;
    }

    public final CardBuilder profileId(final Id<Profile> profileId) {
      card.setProfileId(profileId);
      return this;
    }
  }
}
