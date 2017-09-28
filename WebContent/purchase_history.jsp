<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" type="text/css" href="css/purchase_history.css">
<title>購入履歴</title>
</head>
<body>
	<!-- header部分 -->
	<header>
		<s:include value="header.jsp" />
	</header>

	<!-- body部分 -->
	<div class= "main">
	<div class="container">
		<h2>
			<s:text name="lang.purchase_history.history" />
		</h2>
		<table>
			<s:if test="%{!UserPurchaseHistoryList.isEmpty()}">
				<tr>
					<th class="table-head"><s:text name="lang.purchase_history.tourname" /></th>
					<th class="table-head"><s:text name="lang.purchase_history.price" /></th>
					<th class="table-head"><s:text name="lang.purchase_history.Number" /></th>
					<th class="table-head"><s:text name="lang.purchase_history.totalprice" /></th>
					<th class="table-head"><s:text name="lang.purchase_history.purchasedata" /></th>
				</tr>
				<s:iterator value="UserPurchaseHistoryList">
					<tr>
						<td class="table-data"><s:property value="tourName" /></td>
						<td class="table-data"><s:property value="price" /></td>
						<td class="table-data"><s:property value="counts" /></td>
						<td class="table-data"><s:property value="subtotal" /></td>
						<td class="table-data"><s:property value="registrationAt" /></td>
					</tr>
				</s:iterator>
			</s:if>
			<s:else>
				<h1>
					<s:text name="lang.purchase_history.Nohistory" />
				</h1>
			</s:else>
		</table>
	</div>
	</div>



	<!-- footer部分 -->
	<footer style="text-align: center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>
</body>
</html>