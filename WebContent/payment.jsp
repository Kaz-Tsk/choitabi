<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>決済ページ</title>
</head>
<body>
<header>
	<s:include value="header.jsp"/>
</header>
	<!--外枠    -->
	<div id="contents">
		<br> <br>

		<div class="container">
			<!-- ログイン時 -->
			<s:if test="%{#session.userId != null}">
			<!-- ここまで -->
				<s:form action="CheckCreditInfomationAction">


					<div class="col-sm-6 col-sm-offset-1">


						<h1 class="credit-info">
							<s:text name="lang.payment.page" />
						</h1>
						<s:text name="lang.payment.inputinfo" />
						<br> <br> <br> <font color="red"><s:property value="errmsg2" /></font>

						<h4 style="color: white;">
							<s:text name="lang.payment.cardNumber" />
						</h4>


						<br> <small><s:text name="lang.payment.cardHankaku" /></small>
						<input type="hidden" name="creditNumber" id="creditNumber" /> <br>
						<input type="text" id="num1" pattern="[0-9]{4}" required
							maxlength="4" size="4">- <input type="text" id="num2"
							pattern="[0-9]{4}" required maxlength="4" size="4">- <input
							type="text" id="num3" pattern="[0-9]{4}" required maxlength="4"
							size="4">- <input type="text" id="num4"
							pattern="[0-9]{3,4}" maxlength="4" size="4"> <br> <br>

						<h4 style="color: white;">
							<s:text name="lang.payment.limit" />
						</h4>
						<br> <select id="expirationMonth" name="expirationMonth">
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
							<option>11</option>
							<option>12</option>
						</select>
						<s:text name="lang.payment.month" />


						<select id="expirationYear" name="expirationYear">

						</select>
						<s:text name="lang.payment.year" />
						<br> <br>


						<h4 style="color: white;">
							<s:text name="lang.payment.username" />
						</h4>
						<br> <input type="text" name="nameE" size="20"
							class="validate[required,custom[onlyLetterSp]] text-input"
							id="nameE" required><br>

						<s:text name="lang.payment.anExample" />
						<s:text name="lang.payment.nameExample" />
						<br> <br>


						<h4 style="color: white;">
							<s:text name="lang.payment.securitycode" />
						</h4>
						<br> <input type="password" name="securityCode" size="4"
							pattern="[0-9]{3,4}" required maxlength="4" /><br>


						<s:text name="lang.payment.anExample" />
						<s:text name="lang.payment.codeExample" />



						<br> <br> <br>
						<!--        ボタンからリンクへ-->
						<div class="col-sm-8">
							<a href="CartSelectAction"><button type="button"
									class="btn btn-primary">
									<s:text name="lang.payment.returncart" />
								</button></a> <input type="submit"
								value="<s:text name="lang.payment.purchase"/>" id="insertButton"
								class="btn btn-warning pull-right" />
						</div>

					</div>

				</s:form>
			</s:if>
			<!-- 未ログイン時 -->
			<s:else>
				<s:text name="lang.payment.afterlogin" />
			</s:else>
			<!-- ここまで -->
		</div>

		<br> <br>


	</div>
</body>
</html>