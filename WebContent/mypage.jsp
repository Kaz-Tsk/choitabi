<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
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
	<div class="mypage-container">
		<h2><s:text name="lang.mypage.userdata"/></h2>
			<div class="admin-param">
				<s:action var="select" name="MypageAction"/>
				<s:iterator value="#select.User">
				<table >
					<tr>
						<th><s:text name="lang.mypage.name"/></th>
						<td><s:property value="familyNameKanji"/><s:property value="givenNameKanji"/></td>
					</tr>
					<tr>
						<th><s:text name="lang.mypage.address"/></th>
						<td><s:property value="address"/></td>
					</tr>
					<tr>
						<th><s:text name="lang.mypage.mailaddress"/></th>
						<td><s:property value="mailAddress"/></td>
					</tr>
					<tr>
						<th><s:text name="lang.mypage.telnumber"/></th>
						<td><s:property value="telNumber"/></td>
					</tr>
				</table>
				</s:iterator>
			</div>
		<div class="purchase-history">
		<s:form action = "UserPurchaseHistoryAction">
			<button type= "submit" ><s:text name="lang.mypage.purchasehistory"/></button>
		</s:form>
	</div>
</div>

	<!-- footer include -->
	<footer style= margin-top:350px>
		<s:include value="footer.jsp"></s:include>
	</footer>
</body>
</html>