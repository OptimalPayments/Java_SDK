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


import java.io.IOException;
import java.util.HashMap;

import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.common.impl.Monitor;
import com.optimalpayments.common.impl.Request;

/**
 * The Class CustomerVaultService.
 */
public class CustomerVaultService {

  /**
   * The client.
   */
  private final OptimalApiClient client;

  /**
   * The paths to different features in the API.
   */
  private static final String URI = "customervault/v1";
  private static final String PROFILE_PATH = "/profiles/";
  private static final String ADDRESS_PATH = "/addresses/";
  private static final String CARD_PATH = "/cards/";

  /**
   * Instantiates a new customer vault service.
   *
   * @param client the client
   */
  public CustomerVaultService(final OptimalApiClient client) {
    this.client = client;
  }

  /**
   * Monitor.
   *
   * @return true, if successful
   * @throws IOException
   * @throws OptimalException
   */
  public final boolean monitor() throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri("customervault/monitor")
            .method(Request.RequestType.GET)
            .build();

    Monitor status = client.processRequest(request, Monitor.class);
    return ("READY".equals(status.getStatus()));
  }

  /**
   * Create a Profile.
   *
   * @param profile
   * @return Profile
   * @throws IOException
   * @throws OptimalException
   */
  public final Profile create(final Profile profile) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH))
            .method(Request.RequestType.POST)
            .body(profile)
            .build();

    return client.processRequest(request, Profile.class);
  }

  /**
   * Create an Address.
   *
   * @param address
   * @return Address
   * @throws IOException
   * @throws OptimalException
   */
  public final Address create(final Address address) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + address.getProfileId() + ADDRESS_PATH))
            .method(Request.RequestType.POST)
            .body(address)
            .build();

    final Address returnVal = client.processRequest(request, Address.class);
    returnVal.setProfileId(address.getProfileId());
    return returnVal;
  }

  /**
   * Create a Card.
   *
   * @param card
   * @return Card
   * @throws IOException
   * @throws OptimalException
   */
  public final Card create(final Card card) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH))
            .method(Request.RequestType.POST)
            .body(card)
            .build();

    final Card returnVal = client.processRequest(request, Card.class);
    returnVal.setProfileId(card.getProfileId());
    return returnVal;
  }

  /**
   * Update a Profile.
   *
   * @param profile
   * @return Profile
   * @throws IOException
   * @throws OptimalException
   */
  public final Profile update(final Profile profile) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + profile.getId()))
            .method(Request.RequestType.PUT)
            .body(profile)
            .build();

    return client.processRequest(request, Profile.class);
  }

  /**
   * Update an Address.
   *
   * @param address
   * @return Address
   * @throws IOException
   * @throws OptimalException
   */
  public final Address update(final Address address) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    PROFILE_PATH + address.getProfileId() + ADDRESS_PATH + address.getId()))
            .method(Request.RequestType.PUT)
            .body(address)
            .build();

    final Address returnVal = client.processRequest(request, Address.class);
    returnVal.setProfileId(address.getProfileId());
    return returnVal;
  }

  /**
   * Update a Card.
   *
   * @param card
   * @return Card
   * @throws IOException
   * @throws OptimalException
   */
  public final Card update(final Card card) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH + card.getId()))
            .method(Request.RequestType.PUT)
            .body(card)
            .build();

    final Card returnVal = client.processRequest(request, Card.class);
    returnVal.setProfileId(card.getProfileId());
    return returnVal;
  }

  /**
   * Delete a Profile.
   *
   * @param profile
   * @return boolean
   * @throws IOException
   * @throws OptimalException
   */
  public final boolean delete(Profile profile) 
          throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + profile.getId()))
            .method(Request.RequestType.DELETE)
            .build();

    client.processRequest(request, Profile.class);

    return true;
  }

  /**
   * Delete an Address.
   *
   * @param address
   * @return boolean
   * @throws IOException
   * @throws OptimalException
   */
  public final boolean delete(final Address address) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    PROFILE_PATH + address.getProfileId() + ADDRESS_PATH + address.getId()))
            .method(Request.RequestType.DELETE)
            .build();

    client.processRequest(request, Address.class);

    return true;
  }

  /**
   * Delete a Card.
   *
   * @param card
   * @return boolean
   * @throws IOException
   * @throws OptimalException
   */
  public final boolean delete(final Card card) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH + card.getId()))
            .method(Request.RequestType.DELETE)
            .build();

    client.processRequest(request, Card.class);

    return true;
  }

  /**
   * Get a Profile.
   *
   * @param profile
   * @param includeAddresses indicate whether to include addresses in response
   * @param includeCards indicate whether to include cards in response
   * @return Profile
   * @throws IOException
   * @throws OptimalException
   */
  public final Profile
          lookup(final Profile profile, final boolean includeAddresses, final boolean includeCards)
          throws IOException, OptimalException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    final StringBuilder toInclude = new StringBuilder();
    if (includeAddresses) {
      toInclude.append("addresses");
    }
    if (includeCards) {
      if (toInclude.length() > 0) {
        toInclude.append(",");
      }
      toInclude.append("cards");
    }
    if (toInclude.length() > 0) {
      queryStr.put("fields", toInclude.toString());
    }

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + profile.getId()))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    return client.processRequest(request, Profile.class);
  }

  /**
   * Get a Profile.
   *
   * @param profile the profile
   * @param includeAddresses indicate whether to include addresses in response
   * @return Profile
   * @throws IOException
   * @throws OptimalException
   */
  public final Profile lookup(final Profile profile, final boolean includeAddresses)
          throws IOException, OptimalException {
    return lookup(profile, includeAddresses, false);
  }

  /**
   * Get a Profile.
   *
   * @param profile
   * @return Profile
   * @throws IOException
   * @throws OptimalException
   */
  public final Profile lookup(final Profile profile) throws IOException, OptimalException {
    return lookup(profile, false, false);
  }

  /**
   * Get an Address.
   *
   * @param address
   * @return the authorization
   * @throws IOException
   * @throws OptimalException
   */
  public final Address lookup(final Address address) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    PROFILE_PATH + address.getProfileId() + ADDRESS_PATH + address.getId()))
            .method(Request.RequestType.GET)
            .build();

    final Address returnVal = client.processRequest(request, Address.class);
    returnVal.setProfileId(address.getProfileId());
    return returnVal;
  }

  /**
   * Get a Card.
   *
   * @param card
   * @return the authorization
   * @throws IOException
   * @throws OptimalException
   */
  public final Card lookup(final Card card) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH + card.getId()))
            .method(Request.RequestType.GET)
            .build();

    final Card returnVal = client.processRequest(request, Card.class);
    returnVal.setProfileId(card.getProfileId());
    return returnVal;
  }

  /**
   * Prepare uri.
   *
   * @param path the path
   * @return the string
   * @throws OptimalException
   */
  private String prepareUri(final String path) throws OptimalException {
    return URI + path;
  }
}
