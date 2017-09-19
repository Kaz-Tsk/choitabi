<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html >
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.header"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<head>
<link  rel = "stylesheet" type= "text/css" href ="./css/footer.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>
<title>choitabi</title>
</head>
<body>
<div class="footer">
 <div class = "ARRLogo">All Rights Reserved.</div>
    <div class = "link"> <a href = "./company_overview.jsp"><s:text name="lang.index.company"/></a></div>
    <div class = "link"><a href = "./terms_of_use.jsp"><s:text name="lang.index.termsofservice"/></a></div>
</div>
</body>
</html>