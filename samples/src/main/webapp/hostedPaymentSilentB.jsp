<%@ page import="com.optimalpayments.hostedpayment.Order,java.util.Calendar" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Optimal SDK - Hosted Payment With Silent Post</title>
  </head>
  <body>
    <h1>Hosted Payment Silent Post - Step 2/2</h1>

  	<% Order order = (Order) request.getAttribute("order");  %>
  	
    <form method="post" action="<% out.print(order.getLinks().get("hosted_payment").getUri()); %>">
      <fieldset>
        <legend>Card Details For Order ID: <% out.print(order.getId().getId()); %></legend>
        <div>
          <label>
            Card Number: 
            <input type="input" autocomplete="off" name="cardNum" value="4444333322221111"/>
          </label>
        </div>
        <div>
          <label>
            CVV: 
            <input type="input" autocomplete="off" name="cvdNumber" value="123"/>
          </label>
        </div>
        <div>
          <label>
            Card Expiry: 
            <select name="cardExpiryMonth">
			<%
              int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
              for ( int i = 1; i <= 12; i++) {
                out.print("<option value='" + i + "'" + (i == currentMonth ? " selected" : "") + ">" + i + "</option>");
              }
             %>
			 </select>
          </label>
        </div>
        <div>
          <label>
            Card Expiry: 
            <select name="cardExpiryYear">
			<%
              int currentYear = Calendar.getInstance().get(Calendar.YEAR);
              for (int i = currentYear; i < currentYear + 5; i++) {
                out.print("<option value='" + i + "'" + ">" + i + "</option>");
              }
              %>
            </select>
          </label>
        </div>
      </fieldset>
      <input type="submit" />
    </form>
  </body>
</html>