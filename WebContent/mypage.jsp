<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.mypage"
	var="lang" />
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/mypage.css">
<title>mypage</title>
</head>
<body>
<!-- header include -->
	<s:include value="header.jsp"></s:include>

	<!-- main部分 -->
	<div class="main">
		<div class="mypage-container">

				<div class="admin-param">
					<s:action var="select" name="MypageAction"/>
					<s:iterator value="#select.User">
					<div class = "param-box">
					<h2><s:text name="lang.mypage.userdata"/></h2>
					<table >
						<tr>
							<td><s:text name="lang.mypage.name"/></td>
							<td><s:property value="familyNameKanji"/><s:property value="givenNameKanji"/></td>
						</tr>
						<tr>
							<td><s:text name="lang.mypage.address"/></td>
							<td><s:property value="address"/></td>
						</tr>
						<tr>
							<td><s:text name="lang.mypage.mailaddress"/></td>
							<td><s:property value="mailAddress"/></td>
						</tr>
						<tr>
							<td ><s:text name="lang.mypage.telnumber"/></td>
							<td><s:property value="telNumber"/></td>
						</tr>
					</table>
					<br>
					<s:form action = "UserPurchaseHistoryAction">
						<button type= "submit" ><s:text name="lang.mypage.purchasehistory"/></button>
					</s:form>
				</div>



				</s:iterator>
			</div>
		</div>
	</div>
	<!-- footer include -->
<footer style="text-align:center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>
</body>
</html>