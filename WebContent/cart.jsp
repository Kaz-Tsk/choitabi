<!-- 終わる気がしない -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- と宣言することで、JSPファイルとして機能させることが出来る -->
<!-- (<%%>を使うとJSPファイルの中でJava言語を使ってプログラムを書くことが出来る) -->

<!-- 国際化 -->
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.cart"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>chitabi-カート画面</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap cdn -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- cart.css -->
<link rel="stylesheet" type="text/css" href="css/cart.css">

</head>



<body>

<!-------------- ヘッダー -------------->
<header>
<jsp:include page="header.jsp" />
</header>

	<div id="contents" style="margin-bottom: 50px;">

		<div class="col-sm-12 center">


			<h1>
				<s:text name="lang.cart.itscart" />
			</h1>
		</div>

		<s:if test="%{cartList.size() > 0 && #session.user_id != null}">
			<table class="cartlist">
				<thead>
					<tr>
						<th><s:text name="lang.cart.tour_name" /></th>
						<th><s:text name="lang.cart.price" /></th>
						<th><s:text name="lang.cart.count" /></th>
						<th><s:text name="lang.cart.date" /></th>
						<th><s:text name="lang.cart.price" /></th>
						<th><s:text name="lang.cart.count" /></th>
						<th><s:text name="lang.cart.delete" /></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="cartList">
						<tr>
							<td><img src="<s:property value="imgAddress001"/>" alt=""
								width="100" height="100"></td>
							<td><s:property value="tour_name" /></td>

							<td><fmt:formatNumber value="${price}" pattern="###,###,###" />
								<s:text name="lang.cart.yen" /></td>

							<td><s:property value="quantity" /></td>


							<td><s:property value="date" /></td>
							<td><fmt:formatNumber value="${subTotal}"
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

			<s:form action="GoSettlementAction">
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

<div class = "footer">

    <div class = "ARRLogo">All Rights Reserved.</div>
    <div class = "footerMenuBox">
        <div class = "footerMenu"><a href="./company_overview">会社概要</a></div>
        <div class = "footerMenu"><a href="">利用規約</a></div>
    </div>
    <div class = "clear"></div>
    </div>
</body>
</html>