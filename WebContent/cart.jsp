<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- 国際化 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale-1.0">
  	<link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  	<link href="css/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">		<!-- bootstrapの読み込み -->
  	<link href="css/orderddetails.css" rel="stylesheet">
	<!-- 国際化 -->
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.choitabi.property.cart" var="lang" />
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	<script src="https://code.jquery.com/jquery-1.12.4.min.js" type="text/javascript"></script>
	<title>choitabi</title>
</head>

<body style="background-color: #fcfcf0;">
 	<header>
		
	</header>
	<div class="row" style="padding-bottom: 50px;">
		<div class="col-xs-4 col-xs-offset-4 text-center" style="padding-right:0; padding-left: 0;">
			<div class="col-xs-6 col-xs-offset-3" style="sidplay:inline-block; padding:5px 0; color:#fff; background:#2ecc71; border-radius:4px;">
				<s:text name="lang.cart.cartlist"/>
			</div>
		</div>
	</div>
<article>
	<!-- カートの中身を表示するテーブル -->
	<div class="container col-xs-8 col-xs-offset-2">
		<div class="panel panel-success">
			<div class="panel-heading" style="height:50px;">
				<table class="table">
		  			<tr>
		    			<th class="text-center" style="width:25%;"><s:text name="lang.cart.tourname"/></th>
		    			<th class="text-center" style="width:25%;"><s:text name="lang.cart.quantity"/></th>
		    			<th class="text-center" style="width:25%;"><s:text name="lang.cart.unitprice"/></th>
		    			<th class="text-center" style="width:25%;"><s:text name="lang.cart.control"/></th>
					</tr>
				</table>
			</div>
			<div class="panel-body text-center">
				<!-- ここからイテレート -->
				<table class="table">
					<s:iterator value="selectList">
						<tr>
	    					<td style="width:25%;">
	    						<s:property value="tour_name"/>
	    					</td>
	    					<td style="width:25%;">
	    					<div class="col-xs-5">
	    					</div>
	    						<s:form action="UpdateCartProduct">
		    						<s:select list="{\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"}" name="quantity" Value="%{quantity}"  onChange="this.form.submit()"/>
		    						<s:hidden name="cart_id" value="%{cart_id}"/>
	    						</s:form>
	    					</td>
	    					<td style="width:25%;">
	    						<s:property value="unit_price"/><s:text name="lang.cart.yen"/>
	    					</td>
	    					<td style="width:25%;">
	    						<s:form action="DeleteAction">
	    							<s:hidden name="cart_id" value="%{cart_id}" />
	    							<button type="submit" class="btn btn-danger" ><s:text name="lang.cart.delete"/></button>
	    						</s:form>
	    					</td>
						</tr>
					</s:iterator>
				</table>
				<!-- ここまでイテレート -->
				<!-- 合計金額の表示 -->
				<h3><s:text name="total"/><s:text name="lang.cart.yen"/></h3>
				<!-- ここまで -->
				<div style="color:red;"><s:property value="errmsg"/></div>
				<!-- 各アクションを呼ぶためのボタン -->
				<div class="form1">
					<!-- TOP画面へ遷移 -->
					<div class="col-xs-4">
						<s:form action="GoTopAction">
							<button type="submit" class="btn btn-primary"><s:text name="lang.cart.continue"/></button>
						</s:form>
					</div>
					<!-- クレジット情報入力画面へ遷移 -->
					<div class="col-xs-4">
						<s:form action="GoCreditCardinfoAction">
							<s:hidden name="total" value="%{total}"/>
							<button type="submit" class="btn btn-success"><s:text name="lang.cart.next"/></button>
						</s:form>
					</div>
					<!-- カートを空にするアクション -->
					<div class="col-xs-4">
						<s:form action="DeleteAllAction">
							<button type="submit" class="btn btn-danger"><s:text name="lang.cart.deleteall"/></button>
						</s:form>
					</div>
				</div>
				<!-- ここまで -->
			</div>
		</div>
	</div>
</article>
<footer style="width:97%;">
				<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
</footer>

</body>
</html>