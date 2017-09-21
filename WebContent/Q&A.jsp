<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.Q&A"
	var="lang" />
<meta charset="UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/Q&A.css">
<title>Q&A</title>
</head>
<!-- ヘッダー部分------------------------>
<header>
        <jsp:include page="header.jsp"/>
</header>

<body>

<!-- Q&A部分----------------------------------------------------------------- -->
<div class="main">
        <h1>Q&A</h1>
        <br>
        <div class="Q%A">
            <h2><s:text name="lang.Q&A.Q"/></h2>
            <br>
            <h3><s:text name="lang.Q&A.A"/>
            <br><s:text name="lang.Q&A.A2"/>
            <br>--------------------------------------------------------------
            <br>
            <br>
            <h4><s:text name="lang.Q&A.hoka"/></h4>
            </h3>
            <br><h5><a href="FirstContactAction"><s:text name="lang.Q&A.toiawase"/></a></h5>
        </div>
    </div>

</body>

<!-- フッター部分----------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>