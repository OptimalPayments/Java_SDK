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

import java.io.IOException;
import java.util.HashMap;

import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.cardpayments.impl.AuthorizationPagerator;
import com.optimalpayments.cardpayments.impl.AuthorizationReversalPagerator;
import com.optimalpayments.cardpayments.impl.RefundPagerator;
import com.optimalpayments.cardpayments.impl.SettlementPagerator;
import com.optimalpayments.cardpayments.impl.VerificationPagerator;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.common.Pagerator;
import com.optimalpayments.common.impl.Monitor;
import com.optimalpayments.common.impl.Request;

/**
 * The Class CardPaymentsService.
 */
public class CardPaymentsService {

  /**
   * The client.
   */
  private final OptimalApiClient client;

  /**
   * The paths to different features in the API.
   */
  private static final String URI = "cardpayments/v1";
  private static final String AUTH_PATH = "/auths/";
  private static final String AUTH_REVERSAL_PATH = "/voidauths/";
  private static final String SETTLEMENT_PATH = "/settlements/";
  private static final String REFUND_PATH = "/refunds/";
  private static final String VERIFY_PATH = "/verifications/";

  private static final String MERCHANT_REF_NUM = "merchantRefNum";
  private static final String LIMIT = "limit";
  private static final String OFFSET = "offset";
  private static final String START_DATE = "startDate";
  private static final String END_DATE = "endDate";

  /**
   * Instantiates a new card payment service.
   *
   * @param client the client
   */
  public CardPaymentsService(final OptimalApiClient client) {
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
            .uri("cardpayments/monitor")
            .method(Request.RequestType.GET)
            .build();

    return ("READY".equals(client.processRequest(request, Monitor.class).getStatus()));
  }

  /**
   * Authorize.
   *
   * @param auth the authorization
   * @return the authorization
   * @throws IOException
   * @throws OptimalException
   */
  public final Authorization authorize(final Authorization auth)
          throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH))
            .method(Request.RequestType.POST)
            .body(auth)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Approve held authorization.
   *
   * @param <T> Authorization
   * @param id
   * @return Authorization
   * @throws IOException
   * @throws OptimalException
   */
  public final <T extends Authorization> Authorization approveHeldAuth(final Id<T> id)
          throws IOException, OptimalException {

    final Authorization tmpAuth = new Authorization();
    tmpAuth.setStatus(Status.COMPLETED);
    
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpAuth)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Cancel held authorization.
   *
   * @param id
   * @return Authorization
   * @throws IOException
   * @throws OptimalException
   */
  public final Authorization cancelHeldAuth(final Id<Authorization> id)
          throws IOException, OptimalException {

    final Authorization tmpAuth = new Authorization();
    tmpAuth.setStatus(Status.CANCELLED);
    
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpAuth)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Reverse an authorization.
   *
   * @param authReversal
   * @return AuthorizationReversal
   * @throws IOException
   * @throws OptimalException
   */
  public final AuthorizationReversal reverseAuth(final AuthorizationReversal authReversal)
          throws IOException,
          OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    AUTH_PATH + authReversal.getAuthorizationId() + AUTH_REVERSAL_PATH))
            .method(Request.RequestType.POST)
            .body(authReversal)
            .build();

    return client.processRequest(request, AuthorizationReversal.class);
  }

  /**
   * Settle an authorization.
   *
   * @param settlement
   * @return Settlement
   * @throws IOException
   * @throws OptimalException
   */
  public final Settlement settlement(final Settlement settlement)
          throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + settlement.getAuthorizationId() + SETTLEMENT_PATH))
            .method(Request.RequestType.POST)
            .body(settlement)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Cancel a settlement.
   *
   * @param id
   * @return Settlement
   * @throws IOException
   * @throws OptimalException
   */
  public final Settlement cancelSettlement(final Id<Settlement> id)
          throws IOException, OptimalException {

    final Settlement tmpSettlement = new Settlement();
    tmpSettlement.setStatus(Status.CANCELLED);
    
    Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpSettlement)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Refund a settlement.
   *
   * @param refund
   * @return Refund
   * @throws IOException
   * @throws OptimalException
   */
  public final Refund refund(final Refund refund) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH + refund.getSettlementId() + REFUND_PATH))
            .method(Request.RequestType.POST)
            .body(refund)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Cancel a refund.
   *
   * @param id
   * @return Refund
   * @throws IOException
   * @throws OptimalException
   */
  public final Refund cancelRefund(final Id<Refund> id) 
          throws IOException, OptimalException {

    final Refund tmpRefund = new Refund();
    tmpRefund.setStatus(Status.CANCELLED);
    
    Request request = Request.builder()
            .uri(prepareUri(REFUND_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpRefund)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Verify a card.
   *
   * @param verify
   * @return Verification
   * @throws IOException
   * @throws OptimalException
   */
  public final Verification verify(final Verification verify) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(VERIFY_PATH))
            .method(Request.RequestType.POST)
            .body(verify)
            .build();

    return client.processRequest(request, Verification.class);
  }

  /**
   * Get an authorization by id.
   *
   * @param id
   * @return Authorization
   * @throws IOException
   * @throws OptimalException
   */
  public final Authorization getAuth(final Id<Authorization> id)
          throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Get matching authorizations.
   *
   * @return Pagerator< Authorization >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Authorization> getAuths()
          throws IOException, OptimalException {
    return getAuths(null, null);
  }

  /**
   * Get matching authorizations.
   *
   * @param auth
   * @return Pagerator< Authorization >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Authorization> getAuths(final Authorization auth)
          throws IOException, OptimalException {
    return getAuths(auth, null);
  }

  /**
   * Get matching authorizations.
   *
   * @param auth
   * @param filter
   * @return Pagerator< Authorization >
   * @throws IOException
   * @throws OptimalException
   */
  public final Pagerator<Authorization> getAuths(final Authorization auth, final Filter filter)
          throws IOException, OptimalException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != auth) {
      if (null != auth.getMerchantRefNum() && !auth.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, auth.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    AuthorizationPagerator response
            = client.processRequest(request, AuthorizationPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an auth reversal by id.
   *
   * @param id
   * @return AuthorizationReversal
   * @throws IOException
   * @throws OptimalException
   */
  public final AuthorizationReversal getAuthReversal(
          final Id<AuthorizationReversal> id) throws IOException, OptimalException {
    
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_REVERSAL_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, AuthorizationReversal.class);
  }

  /**
   * Get matching authorization reversals.
   *
   * @return Pagerator< AuthorizationReversal >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<AuthorizationReversal> getAuthReversals()
          throws IOException, OptimalException {
    return getAuthReversals(null, null);
  }

  /**
   * Get matching authorization reversals.
   *
   * @param authReversal
   * @return Pagerator< AuthorizationReversal >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<AuthorizationReversal>
          getAuthReversals(final AuthorizationReversal authReversal)
          throws IOException, OptimalException {
    return getAuthReversals(authReversal, null);
  }

  /**
   * Get matching authorization reversals.
   *
   * @param authReversal
   * @param filter
   * @return Pagerator< AuthorizationReversal >
   * @throws IOException
   * @throws OptimalException
   */
  public final Pagerator<AuthorizationReversal>
          getAuthReversals(final AuthorizationReversal authReversal, final Filter filter)
          throws IOException, OptimalException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != authReversal) {
      if (null != authReversal.getMerchantRefNum() && !authReversal.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, authReversal.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_REVERSAL_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final AuthorizationReversalPagerator response
            = client.processRequest(request, AuthorizationReversalPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an settlement by id.
   *
   * @param id
   * @return Settlement
   * @throws IOException
   * @throws OptimalException
   */
  public final Settlement getSettlement(final Id<Settlement> id)
          throws IOException, OptimalException {
    
    final Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Get matching settlements.
   *
   * @return Pagerator< Settlement >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Settlement> getSettlements()
          throws IOException, OptimalException {
    return getSettlements(null, null);
  }

  /**
   * Get matching settlements.
   *
   * @param settlement
   * @return Pagerator< Settlement >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Settlement> getSettlements(final Settlement settlement)
          throws IOException, OptimalException {
    return getSettlements(settlement, null);
  }

  /**
   * Get matching settlements.
   *
   * @param settlement
   * @param filter
   * @return Pagerator< Settlement >
   * @throws IOException
   * @throws OptimalException
   */
  public final Pagerator<Settlement>
          getSettlements(final Settlement settlement, final Filter filter)
          throws IOException, OptimalException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != settlement) {
      if (null != settlement.getMerchantRefNum() && !settlement.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, settlement.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final SettlementPagerator response
            = client.processRequest(request, SettlementPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an refund by id.
   *
   * @param id
   * @return Refund
   * @throws IOException
   * @throws OptimalException
   */
  public final Refund getRefund(final Id<Refund> id) throws IOException, OptimalException {
    
    final Request request = Request.builder()
            .uri(prepareUri(REFUND_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Get matching refunds.
   *
   * @return Pagerator< Refund >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Refund> getRefunds()
          throws IOException, OptimalException {
    return getRefunds(null, null);
  }

  /**
   * Get matching refunds.
   *
   * @param refund
   * @return Pagerator< Refund >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Refund> getRefunds(final Refund refund)
          throws IOException, OptimalException {
    return getRefunds(refund, null);
  }

  /**
   * Get matching refunds.
   *
   * @param refund
   * @param filter
   * @return Pagerator< Refund >
   * @throws IOException
   * @throws OptimalException
   */
  public final Pagerator<Refund>
          getRefunds(final Refund refund, final Filter filter)
          throws IOException, OptimalException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != refund) {
      if (null != refund.getMerchantRefNum() && !refund.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, refund.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    Request request = Request.builder()
            .uri(prepareUri(REFUND_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final RefundPagerator response
            = client.processRequest(request, RefundPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an verification by id.
   *
   * @param id
   * @return Verification
   * @throws IOException
   * @throws OptimalException
   */
  public final Verification getVerification(final Id<Verification> id)
          throws IOException, OptimalException {
    
    final Request request = Request.builder()
            .uri(prepareUri(VERIFY_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Verification.class);
  }

  /**
   * Get matching verifications.
   *
   * @return Pagerator< Verification >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Verification> getVerifications()
          throws IOException, OptimalException {
    return getVerifications(null, null);
  }

  /**
   * Get matching verifications.
   *
   * @param verification
   * @return Pagerator< Verification >
   * @throws IOException
   * @throws OptimalException
   *
   */
  public final Pagerator<Verification> getVerifications(final Verification verification)
          throws IOException, OptimalException {
    return getVerifications(verification, null);
  }

  /**
   * Get matching verifications.
   *
   * @param verification
   * @param filter
   * @return Pagerator< Verification >
   * @throws IOException
   * @throws OptimalException
   */
  public final Pagerator<Verification>
          getVerifications(final Verification verification, final Filter filter)
          throws IOException, OptimalException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != verification) {
      if (null != verification.getMerchantRefNum() && !verification.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, verification.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(VERIFY_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final VerificationPagerator response
            = client.processRequest(request, VerificationPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Prepare uri.
   *
   * @param path the path
   * @return the string
   * @throws OptimalException
   */
  private String prepareUri(final String path) throws OptimalException {
    if (null == client.getAccount()) {
      throw new OptimalException("Missing or invalid account.");
    }

    return URI + "/accounts/" + client.getAccount() + path;
  }
}
