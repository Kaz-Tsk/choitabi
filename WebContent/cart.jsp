<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<!-- 国際化 -->
<fmt:bundle basename="com.internousdev.choitabi.property.cart">
<html>
<head>
<link rel="stylesheet" type="text/css" href="cart.css">
<meta charset="UTF-8">
<title><s:text name="lang.cart.shopping.cart" /></title>
<script src="./js/jquery-3.1.1.min.js"></script>
<script src="./js/cart.js"></script>



</head>
<body>
	<s:include value="header.jsp"></s:include>
<div class="center">
		<div id="side">
		<s:include value="sidebar.jsp" />
		</div>
	<div class="contents">
		<s:if test="list.size() !=0">
			<s:iterator value="list">
				<s:if test="payOffCategory==false">
					<table class="type03">
						<tr>
							<th><s:text name="lang.cart.image" /></th>
							<th><s:text name="lang.cart.name" /></th>
							<th><s:text name="lang.cart.purchase.price" /></th>
							<th><s:text name="lang.cart.purchase.amount" /></th>
							<th><s:text name="lang.cart.purchase.count" /></th>
							<th><s:text name="lang.cart.delete" /></th>
						</tr>
						<tr>
							<td>
								<img src="./images/<s:property value="imgAddress001" /> " class="purchaseimg">
							</td>
							<td>
									<s:property value="itemName" />
							</td>
							<td>
								<font class="pr"><s:property value="purchasePrice" /></font>
						</td>
							<td>
								<font class="am"><s:property value="purchaseAmount" /></font>
							</td>
							<td>
									<s:form action="CartPurchaseUpdateAction" method="post">
										<input type="hidden" name="itemId"
											value="<s:property value="itemId" />">
										<input type="hidden" name="purchasePrice"
											value="<s:property value="purchasePrice" />">
										<select name="purchaseOrderCount"
											onChange="this.form.submit()">
											<option value="<s:property value="purchaseOrderCount" />"
												selected><s:property value="purchaseOrderCount" /></option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
										</select>
									</s:form>
								</td>
							<td>
									<s:form action="CartDeleteAction">
										<s:hidden class="itemId" name="itemId" value="%{itemId}" />
										<s:hidden class="payOffCategory" name="payOffCategory"
											value="%{payOffCategory}" />
										<s:submit label="%{getText('lang.cart.delete')}" type="button" />
									</s:form>
							</td>
						</tr>
					</table>
				</s:if>
			</s:iterator>

			<s:iterator value="list">
				<s:if test="payOffCategory==true">
					<table class="type03">
						<tr>
							<th><s:text name="lang.cart.image" /></th>
							<th><s:text name="lang.cart.name" /></th>
							<th><s:text name="lang.cart.rental.price" /></th>
							<th><s:text name="lang.cart.rental.amount" /></th>
							<th><s:text name="lang.cart.rental.date" /></th>
							<th><s:text name="lang.cart.rental.count" /></th>
							<th><s:text name="lang.cart.delete" /></th>
						</tr>
						<tr>
							<td>
									<img src="./images/<s:property value="imgAddress001" /> " class="rentalimg">
							</td>
							<td>
								<s:property value="itemName" />
							</td>
							<td>
								<font class="pr"><s:property value="rentalPrice" /></font>
							</td>
							<td>
								<font class="am2"><s:property value="rentalAmount" /></font>
							</td>
							<td>
									<s:property value="loanDate" />
							</td>
							<td>
									<s:form action="CartRentalUpdateAction" method="post">
										<input type="hidden" name="userId"
											value="<s:property value="userId" />">
										<input type="hidden" name="itemId"
											value="<s:property value="itemId" />">
										<input type="hidden" name="rentalPrice"
											value="<s:property value="rentalPrice" />">
										<input type="hidden" name="loanDate"
											value="<s:property value="loanDate" />">
										<select name="rentalOrderCount" onChange="this.form.submit()">
											<option value="<s:property value="rentalOrderCount" />"
												selected><s:property value="rentalOrderCount" /></option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
										</select>
									</s:form>
							</td>
							<td>
									<s:form action="CartDeleteAction">
										<s:hidden class="itemId" name="itemId" value="%{itemId}" />
										<s:hidden class="payOffCategory" name="payOffCategory"
											value="%{payOffCategory}" />
										<s:submit label="%{getText('lang.cart.delete')}" type="button"/>
									</s:form>
							</td>
						</tr>
					</table>
				</s:if>
			</s:iterator>
			<div class="total">
					<s:text name="lang.cart.amount" />:
 				<font class="sum"></font>
 				</div>
				<s:form action="SelectCreditcardAction">
						<s:submit type="submit" value="%{getText('lang.cart.payment')}" class="btn" />
				</s:form>
		</s:if>

		<s:else>
					<s:text name="%{getText('lang.cart.empty')}" />
		</s:else>
	<footer>
			<!-- フッター -->
			<div id="footer">
				<c:import url="http://localhost:8080/openconnect/footer.jsp" />
			</div>
		</footer>
		<!-- フッター終了 -->
	</div>
</div>
</body>
</html>
</fmt:bundle>