<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- 国際化 -->
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>

<body>

	<header>
		<s:include value="header.jsp" />
	</header>


<s:text name="lang.payment_confirm.confirm" /><br>
<s:text name="lang.payment_confirm.question" /><br>

<h1><s:text name="lang.payment_confirm.order" /></h1>


		<table class="cartlist">
			<thead>
				<tr>
					<th><s:text name="lang.cart.img" /></th>
					<th><s:text name="lang.cart.itemname" /></th>
					<th><s:text name="lang.cart.price" /></th>
					<th><s:text name="lang.cart.count" /></th>
					<th><s:text name="lang.cart.size" /></th>

				</tr>
			</thead>
			<tbody>
				<s:iterator value="cartList">
					<tr>
						<td><img src="<s:property value="imgAddress001"/>" alt=""
							width="100" height="100"></td>
						<td><s:property value="itemName" /></td>

						<td><fmt:formatNumber value="${price}" pattern="###,###,###" />
							<s:text name="lang.cart.yen" /></td>

						<td><s:property value="order_count" /></td>


						<td><s:property value="size" /></td>

                    </tr>
				</s:iterator>
			</tbody>
		</table>



		<h2 class="text-danger text-right">
			<s:text name="lang.cart.total" />
			<fmt:formatNumber value="${amount}" pattern="###,###,###" />
			<s:text name="lang.cart.tax_include" />
		</h2>






		<s:form action="PurchaseCompleteAction" class="center">

			<input type="hidden" name="creditNumber"
				   value="<s:property value="creditNumber"/>">

			<input type="hidden" name="creditId"
				   value="<s:property value="creditId"/>">
			<input type="hidden" name="amount"
				   value="<s:property value="amount" />">

			<input type="submit"
				   value="<s:text name="%{getText('lang.cart.confirm')}"/>"
				   class="btn btn-warning " />
		</s:form>




		<h1 style="text-align: center">
			<s:text name="lang.payment_confirm.settlementinfo" />
		</h1>




				<!-- 					カードの種類 -->
				<s:text name="lang.payment_confirm.cardtype" />
				：
				<s:property value="creditBrand" />
				<br>
				<!-- 					名義人 -->
				<s:text name="lang.payment_confirm.cardname" />
				：
				<s:property value="nameE" />
				<br>
				<!-- 					カードナンバー -->
				<s:text name="lang.payment_confirm.cardnumber" />
				：
				<s:set var="number">
					<s:property value="creditNumber" />
				</s:set>
				**** **** ****
				${number.length()==16?number.substring(12,16):number.substring(11,15)}
				<br>
				<!-- 					期限　年 -->
				<s:text name="lang.payment_confirm.limit" />
				：
				<s:property value="expirationYear" />
				<br>
				<!-- 					期限　月 -->
				<s:text name="lang.payment_confirm.limit7" />
				：
				<s:property value="expirationMonth" />
				<br>
				<!-- 					セキュリティコード -->
				<s:text name="lang.payment_confirm.securitycode" />
				：
				<s:set var="code">
					<s:property value="securityCode" />
				</s:set>
				<s:set var="three">***</s:set>
				<s:set var="four">****</s:set>
				${code.length()==3?three:four} <br>






</body>
</html>