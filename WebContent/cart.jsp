<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!-- 国際化 -->
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 国際化 国の判別 -->
<fmt:setLocale value="${pageContext.request.locale.language }" />
<fmt:setBundle basename="com.internousdev.choitabi.property.cart" var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>choitabi-ちょいたび-商品確認画面(カート)</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Font awesome CSS -->
<link href="path/to/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">

<!-- Bootstrap cdn -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- Custom CSS -->
<link href="css/master.css" rel="stylesheet">

<!-- cart.css -->
<link rel="stylesheet" type="text/css" href="css/cart.css">

</head>

<body>
<!-- ヘッダー -->
<header>
  <s:include value="header.jsp" />
</header>



	<div id="contents" style="margin-top: 100px;">

		<div class="col-sm-12 center">


			<h1 class='kago' style="padding-top: 10px; text-align: center;">
				<s:text name="lang.cart.itscart" />
			</h1>
		</div>

		<s:if test="%{cartList.size() > 0 && #session.user_id != null}">
			<table class="cartlist">
				<thead>
					<tr>
						<th><s:text name="lang.cart.tourname" /></th>
						<th><s:text name="lang.cart.date" /></th>
						<th><s:text name="lang.cart.price" /></th>
						<th><s:text name="lang.cart.count" /></th>
						<th><s:text name="lang.cart.price" /></th>
						<th><s:text name="lang.cart.count" /></th>
						<th><s:text name="lang.cart.delete" /></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="cartList">
						<tr>
							<td><s:property value="tour_name" /></td>

							<td><s:property value="date" /></td>

							<td><fmt:formatNumber value="${price}" pattern="###,###,###" />
								<s:text name="lang.cart.yen" /></td>

							<td><s:property value="quantity" /></td>

							<td><fmt:formatNumber value="${sub_total}"
									pattern="###,###,###" /> <s:text name="lang.cart.yen" /></td>

							<td><s:form action="UpdateCartAction">
									<s:hidden name="cart_id" value="%{cart_id}" />
									<s:hidden name="tour_id" value="%{tour_id}" />
									<div class="row">
										<select name="quantity">
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
											<option>5</option>
											<option>6</option>
											<option>7</option>
											<option>8</option>
											<option>9</option>
											<option>10</option>
										</select>
									</div>
									<div class="count">

										<input type="submit" class="btn btn-primary"
											value="<s:text name="lang.cart.update"/>" />
									</div>
								</s:form> <br> <br></td>
							<td><s:form action="DeleteCartAction">
									<!--  --<input id="order" type="hidden" name="quantity"
								value="<s:property value="quantity"/>">-->
									<s:hidden name="user_id" value="%{user_id}" />
									<s:hidden name="cart_id" value="%{cart_id}" />
									<button type="submit" class="btn btn-default">
										<s:text name="lang.cart.delete" />
									</button>


								</s:form></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<h2 class="text-danger text-right">
				<s:text name="lang.cart.total" />
				<fmt:formatNumber value="${total_price}" pattern="###,###,###" />
				<s:text name="lang.cart.tax_include" />
			</h2>

			<s:form action="GoXXXXXAction">
				<!-- 購入ボタンフォーム -->
				<button type="submit" class="btn btn-warning center-block">
					<s:text name="lang.cart.payment" />
				</button>
			</s:form>
		</s:if>
		<s:else>
			<br>
			<br>
			<br>
			<h1 class='empty'>
				<s:text name="lang.cart.empty" />
			</h1>
		</s:else>

	</div>

<footer>
  <s:include value="footer.jsp" />
 </footer>


	</body>

</html>