<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>



</head>

<body>

<header>
		<jsp:include page="header.jsp" />
	</header>

			<s:if test="%{#session.userId != null}">

				<s:form action="CheckCreditInfomationAction">





						<h1>ページ</h1>

						<s:property value="errmsg2" />

						<h4>
							カードナンバー
						</h4>


						<br> <small>かーど</small>
						<input type="hidden" name="creditNumber" id="creditNumber" /> <br>
						<input type="text" id="num1" pattern="[0-9]{4}" required
							maxlength="4" size="4">- <input type="text" id="num2"
							pattern="[0-9]{4}" required maxlength="4" size="4">- <input
							type="text" id="num3" pattern="[0-9]{4}" required maxlength="4"
							size="4">- <input type="text" id="num4"
							pattern="[0-9]{3,4}" maxlength="4" size="4"> <br> <br>

						<h4>
							月
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
						月

						<select id="expirationYear" name="expirationYear">

						</select>
						年
						<br> <br>


						<h4>なまえだよ</h4>
						<br> <input type="text" name="nameE" size="20"
							id="nameE" required><br>

						<br> <br>


						<h4>
							セキュリティーコード
						</h4>
						<br> <input type="password" name="securityCode" size="4"
							pattern="[0-9]{3,4}" required maxlength="4" /><br>



						<br> <br> <br>
						<!--        ボタンからリンクへ-->

							<a href="CartSelectAction"><button type="button"
									class="btn btn-primary">
									かーとに戻る
								</button></a> <input type="submit"
								value="かいもの" id="insertButton"/>



				</s:form>
			</s:if>



</body>
</html>