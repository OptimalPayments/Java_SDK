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

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.CardExpiry;
import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class Card.
 */
public class Card implements DomainObject {

  @Expose
  private String paymentToken;
  @Expose
  private String cardNum;
  @Expose
  private String type;
  @Expose
  private String lastDigits;
  @Expose
  private CardExpiry cardExpiry;
  @Expose
  private String cvv;
  @Expose
  private String track1;
  @Expose
  private String track2;

  public final String getPaymentToken() {
    return paymentToken;
  }

  public final void setPaymentToken(final String paymentToken) {
    this.paymentToken = paymentToken;
  }

  public final String getCardNum() {
    return cardNum;
  }

  public final void setCardNum(final String cardNum) {
    this.cardNum = cardNum;
  }

  public final String getType() {
    return type;
  }

  public final void setType(final String type) {
    this.type = type;
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

  public final String getCvv() {
    return cvv;
  }

  public final void setCvv(final String cvv) {
    this.cvv = cvv;
  }

  public final String getTrack1() {
    return track1;
  }

  public final void setTrack1(final String track1) {
    this.track1 = track1;
  }

  public final String getTrack2() {
    return track2;
  }

  public final void setTrack2(final String track2) {
    this.track2 = track2;
  }

  /**
   * The sub-builder class for Card.
   *
   * @param <BLDRT> the parent builder
   */
  public static class CardBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<Card, BLDRT> {

    private final Card card = new Card();
    private CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>> cardExpiryBuilder;

    public CardBuilder(final BLDRT parent) {
      super(parent);
    }
    
    /**
     * Instantiate builder with a customer vault card.
     * @param parent
     * @param c 
     */
    public CardBuilder(final BLDRT parent, com.optimalpayments.customervault.Card c) {
      super(parent);
      card.setCardExpiry(c.getCardExpiry());
      card.setCardNum(c.getCardNum());
      card.setType(c.getCardType());
      card.setLastDigits(c.getLastDigits());
      card.setPaymentToken(c.getPaymentToken());
    }

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
     * Set the paymentToken property.
     *
     * @param paymentToken
     * @return CardBuilder< BLDRT >
     */
    public final CardBuilder<BLDRT> paymentToken(final String paymentToken) {
      card.setPaymentToken(paymentToken);
      return this;
    }

    /**
     * Set the cardNum property.
     *
     * @param cardNum
     * @return CardBuilder< BLDRT >
     */
    public final CardBuilder<BLDRT> cardNum(final String cardNum) {
      card.setCardNum(cardNum);
      return this;
    }

    /**
     * Build a cardExpiry within this card.
     *
     * @return CardExpiry.CardExpiryBuilder< CardBuilder< BLDRT > >
     */
    public final CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>> cardExpiry() {
      if (null == cardExpiryBuilder) {
        cardExpiryBuilder = new CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>>(this);
      }
      return cardExpiryBuilder;
    }

    /**
     * Set the cvv property.
     *
     * @param cvv
     * @return CardBuilder< BLDRT >
     */
    public final CardBuilder<BLDRT> cvv(final String cvv) {
      card.setCvv(cvv);
      return this;
    }
  }
}
