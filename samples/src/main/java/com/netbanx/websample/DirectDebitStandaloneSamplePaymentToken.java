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

import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.optimalpayments.Environment;
import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.common.PayMethod;
import com.optimalpayments.directdebit.StandaloneCredits;

public class DirectDebitStandaloneSamplePaymentToken extends NetBanxServletBase {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    request.setAttribute("isPost", "false");
    request.setAttribute("currency", this.currencyCode);

   }

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    // Initiate a new instance of the DirectDebit StandaloneCredit Service
    //Initialize the NetBanxApiClient
	PrintWriter out = response.getWriter();
    boolean wasSuccessfull = false;
    StandaloneCredits standaloneCreditsResponse=null;
    String radio = request.getParameter("account");
    if(radio.equals("ach"))
    {
    	OptimalApiClient apiClient = new OptimalApiClient(this.apiKey, this.apiPassword, Environment.TEST,this.accountNumber);
    	try {
    	StandaloneCredits standaloneCredits=
    		StandaloneCredits.builder()
    			.merchantRefNum(request.getParameter("merchantRefNum"))
    			.amount(Integer.parseInt(request.getParameter("amount")))
    			.ach()
    				.paymentToken(request.getParameter("paymentToken"))
    				.payMethod(PayMethod.WEB)
    			.done()
    			.build();
    	
    	standaloneCreditsResponse = apiClient.directDebitService().submitStandaloneCredit(standaloneCredits);
    	final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        final Gson gson = gsonBuilder.create();
        
        out.println("response"+gson.toJson(standaloneCreditsResponse));
    
    	
		wasSuccessfull = true;
    				
		} catch (OptimalException e) {
			// TODO Auto-generated catch block
			request.setAttribute("error", e.getMessage());
		}
    	
   	
    	request.setAttribute("standaloneCredits", standaloneCreditsResponse);

        // Create a new hosted payment request
        request.setAttribute("isPost", "true");
        request.setAttribute("currency", this.currencyCode);
        
        if (wasSuccessfull) {
            RequestDispatcher view = request.getRequestDispatcher("status.jsp");
            view.forward(request, response);
          } else {
            RequestDispatcher view = request.getRequestDispatcher("directDebitACHStandaloneCredit.jsp");
            view.forward(request, response);
          }
    
    }
    
    if(radio.equals("eft"))
    {
    	OptimalApiClient apiClient = new OptimalApiClient(this.apiKey, this.apiPassword, Environment.TEST,"1001057670");
    	try {
    		StandaloneCredits standaloneCredits=
    	    		StandaloneCredits.builder()
    			.merchantRefNum(request.getParameter("merchantRefNum"))
    			.amount(Integer.parseInt(request.getParameter("amount")))
    			.eft()
    				.paymentToken(request.getParameter("paymentToken"))
    				
    			.done()
    			.build();
    	
    	standaloneCreditsResponse = apiClient.directDebitService().submitStandaloneCredit(standaloneCredits);
    	final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        final Gson gson = gsonBuilder.create();
        
        out.println("response"+gson.toJson(standaloneCreditsResponse));
		wasSuccessfull = true;
    				
		} catch (OptimalException e) {
			// TODO Auto-generated catch block
			request.setAttribute("error", e.getMessage());
		}
    	
   	
    	request.setAttribute("standaloneCredits", standaloneCreditsResponse);

        // Create a new hosted payment request
        request.setAttribute("isPost", "true");
        request.setAttribute("currency", this.currencyCode);
        
        
    
    }
    if(radio.equals("bacs"))
    {
    	OptimalApiClient apiClient = new OptimalApiClient(this.apiKey, this.apiPassword, Environment.TEST,"1001057660");
    	try {
    		StandaloneCredits standaloneCredits=
    	    		StandaloneCredits.builder()
    			.merchantRefNum(request.getParameter("merchantRefNum"))
    			.amount(Integer.parseInt(request.getParameter("amount")))
    			.bacs()
    				.paymentToken(request.getParameter("paymentToken"))
    				
    			.done()
    			.build();
    	
    	standaloneCreditsResponse = apiClient.directDebitService().submitStandaloneCredit(standaloneCredits);
    	final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        final Gson gson = gsonBuilder.create();
        
        out.println("response"+gson.toJson(standaloneCreditsResponse));
    	wasSuccessfull = true;
    				
		} catch (OptimalException e) {
			// TODO Auto-generated catch block
			request.setAttribute("error", e.getMessage());
		}
    	
   	
    	request.setAttribute("standaloneCredits", standaloneCreditsResponse);

        // Create a new hosted payment request
        request.setAttribute("isPost", "true");
        request.setAttribute("currency", this.currencyCode);
        
    
    }

   
        
  }

}
