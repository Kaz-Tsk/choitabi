<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="ja">
<head>
<link rel="stylesheet" type="text/css" href="css/cart_check.css">
<meta charset="UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.pay_check"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><s:text name="lang.pay_check.title" /></title>
<script type="text/javascript" src="./js/cart_check.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
	<div id="pagecover">
		<header>
			<s:include value="header.jsp"></s:include>
		</header>

		<div class="mainbox">
			<h4 style="text-decoration: underline;">
				<s:text name="lang.pay_check.text" />
				&nbsp;
				<s:text name="lang.pay_check.text2" />
			</h4>
			<br>
			<div class="container-fluid">
				<div class="table-responsive">
					<h2>
						<s:text name="lang.pay_check.Itemsinabasket" />
					</h2>
					<table class="table table borderd">
						<tr>
							<th class="col-md-5"><s:text name="lang.pay_check.tour" /></th>
							<th class="col-md-2"><s:text name="lang.pay_check.price" /></th>
							<th class="col-md-2"><s:text name="lang.pay_check.quantity" /></th>
							<th class="col-md-3"><s:text name="lang.pay_check.subtotal" /></th>
						</tr>

						<s:iterator value="cartList">
							<tr>
								<td><s:property value="tour_name" /></td>

								<td><fmt:formatNumber value="${price}"
										pattern="###,###,###" /> <s:text name="lang.cart.yen" /></td>

								<td><s:property value="order_count" /></td>

								<td><fmt:formatNumber value="${sub_total}"
										pattern="###,###,###" /> <s:text name="lang.cart.yen" /></td>
							</tr>

						</s:iterator>
					</table>
					<h2>
						<s:text name="lang.pay_check.breakdown" />
					</h2>
					<h2>
						<s:text name="lang.pay_check.methodofpayment" />
					</h2>
					<table class="table table borderd">
						<tr>
							<th class="col-md-4"><s:text
									name="lang.pay_check.methodofpayment" /></th>
							<td class="col-md-8"><s:text name="lang.pay_check.credit" /><br></td>
						</tr>
					</table>
					<fmt:formatNumber value="${total_price}" pattern="###,###,###" />
				</div>
			</div>
		</div>
		<br>
		<s:form action="PayCompAction">
			<!-- 購入ボタンフォーム -->
			<s:param name="user_id" value="user_id" />
			<s:param name="cartList" value="cartList" />
			<button type="submit" class="btn btn-warning center-block">
				<s:text name="lang.pay_check.totalpayment" />
			</button>
		</s:form>
	</div>
	<footer style="text-align: center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>

</body>
</html>
