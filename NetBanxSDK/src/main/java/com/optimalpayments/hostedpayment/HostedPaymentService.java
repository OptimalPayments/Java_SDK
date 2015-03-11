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

import java.io.IOException;
import java.util.HashMap;

import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.common.Id;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.common.Pagerator;
import com.optimalpayments.common.impl.Request;
import com.optimalpayments.hostedpayment.impl.OrderPagerator;
import com.optimalpayments.hostedpayment.impl.OrderRebillSerializer;

/**
 * The Class HostedPaymentService.
 */
public class HostedPaymentService {

  /**
   * The client.
   */
  private final OptimalApiClient client;

  /**
   * The paths to different features in the API.
   */
  private static final String URI = "hosted/v1";
  private static final String ORDER_PATH = "/orders";
  private static final String RESEND_CALLBACK = "/resend_callback";
  private static final String REFUND_PATH = "/refund";
  private static final String SETTLEMENT_PATH = "/settlement";
  private static final String URI_SEPARATOR = "/";

  /**
   * Instantiates a new hosted payment service.
   *
   * @param client the client
   */
  public HostedPaymentService(final OptimalApiClient client) {
    this.client = client;
  }

  /**
   * Create an Order.
   *
   * @param order
   * @return Order
   * @throws IOException
   * @throws OptimalException
   */
  public final Order process(final Order order) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH))
            .method(Request.RequestType.POST)
            .body(order)
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Get an order by id.
   *
   * @param id
   * @return Order
   * @throws IOException
   * @throws OptimalException
   */
  public final Order status(final Id<Order> id) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Cancel an order by id.
   * 
   * @param id
   * @return
   * @throws IOException
   * @throws OptimalException 
   */
  public final Order cancel(final Id<Order> id) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + id))
            .method(Request.RequestType.DELETE)
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Cancel held order by id.
   *
   * @param id
   * @return Order
   * @throws IOException
   * @throws OptimalException
   */
  public final Order cancelHeldOrder(final Id<Order> id) throws IOException, OptimalException {
    
    final Order tmpOrder = new Order();
    final Transaction tx = new Transaction();
    tx.setStatus("cancelled");
    tmpOrder.setTransaction(tx);

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + id))
            .method(Request.RequestType.PUT)
            .body(tmpOrder)
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Approve held order by id.
   *
   * @param id
   * @return Order
   * @throws IOException
   * @throws OptimalException
   */
  public final Order approveHeldOrder(final Id<Order> id) throws IOException, OptimalException {

    final Order tmpOrder = new Order();
    final Transaction tx = new Transaction();
    tx.setStatus("success");
    tmpOrder.setTransaction(tx);

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + id))
            .method(Request.RequestType.PUT)
            .body(tmpOrder)
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Resend order callback by id.
   *
   * @param id
   * @return boolean
   * @throws IOException
   * @throws OptimalException
   */
  public final boolean resendCallback(final Id<Order> id) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + id + RESEND_CALLBACK))
            .method(Request.RequestType.GET)
            .build();

    client.processRequest(request, Order.class);
    
    return true;
  }

  /**
   * Refund an order.
   *
   * @param refund
   * @return Refund
   * @throws IOException
   * @throws OptimalException
   */
  public final Refund refund(final Refund refund) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + refund.getOrderId() + REFUND_PATH))
            .method(Request.RequestType.POST)
            .body(refund)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Settle an order.
   *
   * @param settlement
   * @return Settlement
   * @throws IOException
   * @throws OptimalException
   */
  public final Settlement settlement(Settlement settlement) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    ORDER_PATH + URI_SEPARATOR + settlement.getOrderId() + SETTLEMENT_PATH))
            .method(Request.RequestType.POST)
            .body(settlement)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Rebill an existing order.
   *
   * @param order
   * @return Order
   * @throws IOException
   * @throws OptimalException
   */
  public final Order processRebill(Order order) throws IOException, OptimalException {
    if (null == order.getId()) {
      if (null == order.getProfile()) {
        throw new OptimalException("You must specify a profile or id.");
      } else if (null == order.getProfile().getId()
              || null == order.getProfile().getPaymentToken()
              || order.getProfile().getPaymentToken().isEmpty()) {
        throw new OptimalException("You must specify botha a profile id and profile paymentToken");
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH
                    + (null != order.getId()
                            ? URI_SEPARATOR + order.getId()
                            : "")))
            .method(Request.RequestType.POST)
            .body(order)
            .serializer(new OrderRebillSerializer())
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Update a rebilled order.
   *
   * @param order
   * @return Order
   * @throws IOException
   * @throws OptimalException
   */
  public final Order updateRebill(final Order order) throws IOException, OptimalException {

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH + URI_SEPARATOR + order.getId()))
            .method(Request.RequestType.PUT)
            .body(order)
            .serializer(new OrderRebillSerializer())
            .build();

    return client.processRequest(request, Order.class);
  }

  /**
   * Get a report of recent orders.
   *
   * @return Pagerator< Order >
   * @throws OptimalException
   * @throws IOException
   */
  public final Pagerator<Order> orders() throws OptimalException, IOException {
    return orders(0);
  }

  /**
   * Get a report of recent orders.
   *
   * @param count
   * @return Pagerator< Order >
   * @throws OptimalException
   * @throws IOException
   */
  public final Pagerator<Order> orders(final Integer count)
          throws OptimalException, IOException {
    if (count < 0) {
      throw new OptimalException("Invalid count " + count.toString() + ". Positive int expected.");
    }

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (count > 0) {
      queryStr.put("num", count.toString());
    }

    final Request request = Request.builder()
            .uri(prepareUri(ORDER_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();
    
    final OrderPagerator response = client.processRequest(request, OrderPagerator.class);
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
    return URI + path;
  }
}
