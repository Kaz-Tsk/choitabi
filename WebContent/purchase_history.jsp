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
	<div class="container">

		<h2>購入履歴</h2>

		<table class="history-table">
			<s:if test="%{!UserPurchaseHistoryList.isEmpty()}">
				<tr>
					<th>ツアー名</th>
					<th>価格</th>
					<th>人数</th>
					<th>合計金額</th>
					<th>購入日</th>
				</tr>
				<s:iterator value="UserPurchaseHistoryList">
					<tr>
						<td><s:property value="tourName" /></td>
						<td><s:property value="price" />円</td>
						<td><s:property value="counts" />人</td>
						<td><s:property value="subtotal" />円</td>
						<td><s:property value="registrationAt" /></td>
					</tr>
				</s:iterator>
			</s:if>

			<s:else>
				<div class="error-message">
					<h1>購入履歴はありません</h1>
				</div>
			</s:else>
		</table>
	</div>



	<!-- footer部分 -->
	<footer style="text-align: center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>
</body>
</html>