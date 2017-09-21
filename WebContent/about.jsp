<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 国際化 -->
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html >

<html>
<head>
<meta charset="UTF-8">
<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.cart"
	var="lang" />
    <link rel="stylesheet"type="text/css"href="./css/about.css">
    <title>about</title>
</head>


<body>

<!-- ヘッダー部分------------------------------->
<header>
        <jsp:include page="header.jsp"/>
</header>

<img src="img/koyo.jpg">

<!-- about部分---------------------------------------------------------->
<div class="main">
   <div class="midasi">
        <h1><s:text name="lang.about.midasi1" /></h1>
   </div>
       <div class="midasi2">
        <h2><s:text name="lang.about.midasi2" /><br>
           <s:text name="lang.about.midasi2`" /> </h2>

        <h3><s:text name="lang.about.midasi3" /><br>
            <s:text name="lang.about.midasi3`" /><br>
            <s:text name="lang.about.midasi3``" />
        </h3>


        <br>

        <p><s:text name="lang.about.hitokoto" /></p>
</div>

</div>

<!-- フッター部分---------------------------->
    <footer>
          <jsp:include page="footer.jsp"/>
</footer>

</body>
</html>
