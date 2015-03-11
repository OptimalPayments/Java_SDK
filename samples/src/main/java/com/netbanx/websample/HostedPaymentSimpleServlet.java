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

package com.netbanx.websample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.optimalpayments.Environment;
import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.hostedpayment.Order;
import com.optimalpayments.hostedpayment.Rel;

public class HostedPaymentSimpleServlet extends NetBanxServletBase {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    request.setAttribute("isPost", "false");
    request.setAttribute("currency", this.currencyCode);

    RequestDispatcher view = request.getRequestDispatcher("hostedPaymentSimple.jsp");
    view.forward(request, response); 

  }

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    //Initialize the NetBanxApiClient 
    OptimalApiClient apiClient = new OptimalApiClient(this.apiKey, this.apiPassword, Environment.TEST);

    int totalAmount = (int) (Double.valueOf(request.getParameter("amount"))*this.currencyMultiplier);




    try {
      // Build our order object.
      Order order =
          Order.builder()
            .merchantRefNum(request.getParameter("merchant_ref_num"))
            .currencyCode(request.getParameter("currency"))
            .totalAmount(totalAmount)
            .billingDetails()
              .street(request.getParameter("street"))
              .city(request.getParameter("city"))
              .state(request.getParameter("state"))
              .country(request.getParameter("country"))
              .zip(request.getParameter("zip"))
              .useAsShippingAddress(true)
              .done()
            .build();
      Order orderResponse = apiClient.hostedPaymentService().process(order);
      String redirectURL = orderResponse.getLink(Rel.HOSTED_PAYMENT).getUri();

      // Redirect to the hosted payment page.
      response.sendRedirect(redirectURL);
      return;
    } catch (OptimalException ev) { 
      // We caught errors let's display them to the user.
      request.setAttribute("error", ev.getMessage());
    }
  


    // Create a new hosted payment request
    request.setAttribute("isPost", "true");
    request.setAttribute("currency", this.currencyCode);

    RequestDispatcher view = request.getRequestDispatcher("hostedPaymentSimple.jsp");
    view.forward(request, response); 

  }


}