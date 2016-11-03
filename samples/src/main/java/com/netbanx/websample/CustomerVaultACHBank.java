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
import java.util.Random;

import javax.servlet.http.*;
import javax.servlet.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.optimalpayments.Environment;
import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.common.Locale;
import com.optimalpayments.common.OptimalException;
import com.optimalpayments.customervault.ACHBankAccounts;
import com.optimalpayments.customervault.AccountType;
import com.optimalpayments.customervault.Address;
import com.optimalpayments.customervault.Profile;
import com.optimalpayments.directdebit.Purchases;

public class CustomerVaultACHBank extends NetBanxServletBase {

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

   // Initiate a new instance of the CustomerVault Service
   //Initialize the NetBanxApiClient 
	PrintWriter out = response.getWriter();
    boolean wasSuccessfull = false;
    Purchases purchasesResponse=null;
    OptimalApiClient apiClient = new OptimalApiClient(this.apiKey, this.apiPassword, Environment.TEST, this.accountNumber);
    	try {
    		
    		
    		Profile profile =
    				Profile.builder()
    				.merchantCustomerId(java.util.UUID.randomUUID().toString())
    	            .locale(Locale.EN_US)
    	            .firstName("John")
    	            .lastName("Smith")
    	            .email("john.smith@somedomain.com")
    	            .phone("713-444-5555")
    	            .build();
    	            
    		Profile  profileRes=apiClient.customerVaultService().create(profile);

    	    Address address =
    	    		Address.builder()
    	    		.nickName("home")
    	            .street("100 Queen Street West")
    	            .street2("Unit 201")
    	            .city("Toronto")
    	            .country("CA")
    	            .state("ON")
    	            .zip("M5H 2N2")
    	            .recipientName("Jane Doe")
    	            .phone("647-788-3901")
    	            .profileId(profileRes.getId())
    	            .build();
    	    
    	    Address addressRes=apiClient.customerVaultService().create(address);
    	    
    	    ACHBankAccounts achBankAccounts=
    	    		ACHBankAccounts.builder()
    	    		 .nickName(request.getParameter("nickName"))
    	             .accountNumber(request.getParameter("accountNumber"))
    	             .routingNumber(request.getParameter("routingNumber"))
    	             .accountHolderName(request.getParameter("accountHolderName"))
    	             .billingAddressId(addressRes.getId())
    	             .accountType(AccountType.CHECKING)
    	             .profileId(profileRes.getId())
    	             .build();
    		
    		
    	 ACHBankAccounts achBankAccountsRes= apiClient.customerVaultService().create(achBankAccounts);
    		
    	final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        final Gson gson = gsonBuilder.create();
        
        
        out.println("response"+gson.toJson(achBankAccountsRes));
    	
    	
		wasSuccessfull = true;
    				
		} catch (OptimalException e) {
			// TODO Auto-generated catch block
			request.setAttribute("error", e.getMessage());
			out.println(e.getMessage());
		}
    	
   	
    	request.setAttribute("purchases", purchasesResponse);

        // Create a new hosted payment request
        request.setAttribute("isPost", "true");
        request.setAttribute("currency", this.currencyCode);
        
        if (wasSuccessfull) {
            RequestDispatcher view = request.getRequestDispatcher("status.jsp");
            view.forward(request, response);
          } else {
            RequestDispatcher view = request.getRequestDispatcher("CustomerVaultACHBank.jsp");
            view.forward(request, response);
          }
               
  }
  public String sixDigitRandomNumber() {
      Random rand = new Random();

      int num = rand.nextInt(900000) + 100000;
      return "" + num;

}
  
  public String eightDigitRandomNumber() {
      Random rand = new Random();

      int num = rand.nextInt(90000000) + 10000000;
      return "" + num;

}
  public String threeDigitRandomNumber() {
      Random rand = new Random();

      int num = rand.nextInt(900) + 100;
      return "" + num;

}

}
