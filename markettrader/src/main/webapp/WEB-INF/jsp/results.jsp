<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Currency Fair Market Trader</title>
        <link rel="stylesheet" href="<c:url value='/css/main.css'/>" />
    </head>

    <body>
      	<div id="logo">
      		<span style="padding-right:3px; padding-top: 3px; display:inline-block;">
				<img src="<c:url value='/images/currencyfair.png' />" />
			</span>
		</div>	
		
		<div class="center section">
			Market Trade Monitor
		</div>
		
		<div class="center sectionContent">
			<table>
				<tr>
					<th>User ID</th>
					<th>Currency From</th>
					<th>Currency To</th>
					<th>Amount Buy</th>
					<th>Amount Sell</th>
					<th>Rate</th>
					<th>Originating Country</th>
				</tr>
				<c:forEach items="${trades}" var="trade">
		  			<tr>
		  				<td><c:out value="${trade.userId}" /></td>
		  				<td><c:out value="${trade.currencyFrom}" /></td>
		  				<td><c:out value="${trade.currencyTo}" /></td>
		  				<td class="numeric"><c:out value="${trade.amountBuy}" /></td>
		  				<td class="numeric"><c:out value="${trade.amountSell}" /></td>
		  				<td class="numeric"><c:out value="${trade.rate}" /></td>
		  				<td><c:out value="${trade.originatingCountry}" /></td>
		  			</tr>
				</c:forEach>
			</table>
		</div>	
    </body>
</html>
