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
import java.util.ArrayList;

import com.optimalpayments.common.DateOfBirth;
import com.optimalpayments.common.Error;
import com.optimalpayments.common.Gender;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.Locale;
import com.optimalpayments.common.impl.BaseBuilder;
import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * The Class Profile.
 */
public class Profile implements BaseDomainObject {

  private Id<Profile> id;
  private Status status;
  @Expose
  private String merchantCustomerId;
  @Expose
  private Locale locale;
  @Expose
  private String firstName;
  @Expose
  private String middleName;
  @Expose
  private String lastName;
  @Expose
  private DateOfBirth dateOfBirth;
  @Expose
  private String ip;
  @Expose
  private Gender gender;
  @Expose
  private String nationality;
  @Expose
  private String email;
  @Expose
  private String phone;
  @Expose
  private String cellPhone;
  private String paymentToken;
  private ArrayList<Address> addresses;
  private ArrayList<Card> cards;
  @Expose
  private Card card;
  private Error error;

  public final Id<Profile> getId() {
    return id;
  }

  public final void setId(final Id<Profile> id) {
    this.id = id;
  }

  public final Status getStatus() {
    return status;
  }

  public final void setStatus(final Status status) {
    this.status = status;
  }

  public final String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  public final void setMerchantCustomerId(final String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public final Locale getLocale() {
    return locale;
  }

  public final void setLocale(final Locale locale) {
    this.locale = locale;
  }

  public final String getFirstName() {
    return firstName;
  }

  public final void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public final String getMiddleName() {
    return middleName;
  }

  public final void setMiddleName(final String middleName) {
    this.middleName = middleName;
  }

  public final String getLastName() {
    return lastName;
  }

  public final void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public final DateOfBirth getDateOfBirth() {
    return dateOfBirth;
  }

  public final void setDateOfBirth(final DateOfBirth dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public final String getIp() {
    return ip;
  }

  public final void setIp(final String ip) {
    this.ip = ip;
  }

  public final Gender getGender() {
    return gender;
  }

  public final void setGender(final Gender gender) {
    this.gender = gender;
  }

  public final String getNationality() {
    return nationality;
  }

  public final void setNationality(final String nationality) {
    this.nationality = nationality;
  }

  public final String getEmail() {
    return email;
  }

  public final void setEmail(final String email) {
    this.email = email;
  }

  public final String getPhone() {
    return phone;
  }

  public final void setPhone(final String phone) {
    this.phone = phone;
  }

  public final String getCellPhone() {
    return cellPhone;
  }

  public final void setCellPhone(final String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public final String getPaymentToken() {
    return paymentToken;
  }

  public final void setPaymentToken(final String paymentToken) {
    this.paymentToken = paymentToken;
  }

  public final ArrayList<Address> getAddresses() {
    return addresses;
  }

  public final void setAddresses(final ArrayList<Address> addresses) {
    this.addresses = addresses;
  }

  public final ArrayList<Card> getCards() {
    return cards;
  }

  public final void setCards(final ArrayList<Card> cards) {
    this.cards = cards;
  }

  public final Card getCard() {
    return card;
  }

  public final void setCard(final Card card) {
    this.card = card;
  }

  @Override
  public final Error getError() {
    return error;
  }

  public final void setError(final Error error) {
    this.error = error;
  }

  /**
   * Get a profile builder.
   *
   * @return ProfileBuilder
   */
  public static final ProfileBuilder builder() {
    return new ProfileBuilder();
  }

  /**
   * The builder class for Profile.
   */
  public static class ProfileBuilder extends BaseBuilder<Profile> {

    private final Profile profile = new Profile();
    private DateOfBirth.DateOfBirthBuilder<ProfileBuilder> dateOfBirthBuilder;
    private Card.CardBuilderSingleUse<ProfileBuilder> cardBuilderSingleUse;

    /**
     * Build this Profile object.
     *
     * @return Profile
     */
    @Override
    public final Profile build() {
      if (null != dateOfBirthBuilder) {
        profile.setDateOfBirth(dateOfBirthBuilder.build());
      }
      if (null != cardBuilderSingleUse) {
        profile.setCard((cardBuilderSingleUse.build()));
      }
      return profile;
    }

    /**
     * Set the id property.
     *
     * @param id
     * @return ProfileBuilder
     */
    public final ProfileBuilder id(final Id<Profile> id) {
      profile.setId(id);
      return this;
    }

    /**
     * Set the merchantCustomerId property.
     *
     * @param merchantCustomerId
     * @return ProfileBuilder
     */
    public final ProfileBuilder merchantCustomerId(final String merchantCustomerId) {
      profile.setMerchantCustomerId(merchantCustomerId);
      return this;
    }

    /**
     * Set the locale property.
     *
     * @param locale
     * @return ProfileBuilder
     */
    public final ProfileBuilder locale(final Locale locale) {
      profile.setLocale(locale);
      return this;
    }

    /**
     * Set the firstName property.
     *
     * @param firstName
     * @return ProfileBuilder
     */
    public final ProfileBuilder firstName(final String firstName) {
      profile.setFirstName(firstName);
      return this;
    }

    /**
     * Set the middleName property.
     *
     * @param middleName
     * @return ProfileBuilder
     */
    public final ProfileBuilder middleName(final String middleName) {
      profile.setMiddleName(middleName);
      return this;
    }

    /**
     * Set the lastName property.
     *
     * @param lastName
     * @return ProfileBuilder
     */
    public final ProfileBuilder lastName(final String lastName) {
      profile.setLastName(lastName);
      return this;
    }

    /**
     * Build a dateOfBirth within this card.
     *
     * @return DateOfBirth.DateOfBirthBuilder< ProfileBuilder >
     */
    public final DateOfBirth.DateOfBirthBuilder<ProfileBuilder> dateOfBirth() {
      if (null == dateOfBirthBuilder) {
        dateOfBirthBuilder = new DateOfBirth.DateOfBirthBuilder<ProfileBuilder>(this);
      }
      return dateOfBirthBuilder;
    }

    /**
     * Build a card within this profile.
     *
     * @return com.optimalpayments.cardpayments.Card.CardBuilder<ProfileBuilder>
     */
    public final Card.CardBuilderSingleUse<ProfileBuilder> card() {
      if (null == cardBuilderSingleUse) {
        cardBuilderSingleUse = new Card.CardBuilderSingleUse<ProfileBuilder>(this);
      }
      return cardBuilderSingleUse;
    }

    /**
     * Set the ip property.
     *
     * @param ip
     * @return ProfileBuilder
     */
    public final ProfileBuilder ip(final String ip) {
      profile.setIp(ip);
      return this;
    }

    /**
     * Set the gender property.
     *
     * @param gender
     * @return ProfileBuilder
     */
    public final ProfileBuilder gender(final Gender gender) {
      profile.setGender(gender);
      return this;
    }

    /**
     * Set the nationality property.
     *
     * @param nationality
     * @return ProfileBuilder
     */
    public final ProfileBuilder nationality(final String nationality) {
      profile.setNationality(nationality);
      return this;
    }

    /**
     * Set the email property.
     *
     * @param email
     * @return ProfileBuilder
     */
    public final ProfileBuilder email(final String email) {
      profile.setEmail(email);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone
     * @return ProfileBuilder
     */
    public final ProfileBuilder phone(final String phone) {
      profile.setPhone(phone);
      return this;
    }

    /**
     * Set the cellPhone property.
     *
     * @param cellPhone
     * @return ProfileBuilder
     */
    public final ProfileBuilder cellPhone(final String cellPhone) {
      profile.setCellPhone(cellPhone);
      return this;
    }
  }
}
