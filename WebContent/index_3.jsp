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
<fmt:setBundle basename="com.internousdev.choitabi.property.index"
	var="lang" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/index_3.css">
<link rel = "stylesheet" type= "text/css" href = "css/imagehover.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/jquery.js"></script>
<title>ちょいたび</title>
</head>

<header>
        <jsp:include page="header.jsp"/>
</header>

<body>



    <div class= "theme_box">
    <h2><s:text name="lang.index.searchT"/></h2>
    <div class="theme_sub">
    <figure class="imghvr-hinge-left" >
  <img src="img/gourmet_pict.png"  height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.gourmet"/></b>
  </figcaption>
</figure>
</div>

 <div class="theme_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/place_pict.png" height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.spot"/></b>
  </figcaption>
</figure>
</div>

 <div class="theme_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/activity_pict.png" height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.activity"/></b>
  </figcaption>
</figure>
</div>
    </div>

     <div class= "area_box">
    <h2><s:text name="lang.index.searchA"/></h2>
    <div class="area_sub">
    <figure class="imghvr-hinge-left" >
  <img src="img/touhoku_pict.jpg" height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.TOHOKU"/></b>
  </figcaption>
</figure>
</div>

 <div class="area_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/kantou_pict.jpg" height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.KANTO"/></b>
  </figcaption>
</figure>
</div>

 <div class="area_sub">
<figure class="imghvr-hinge-left"  >
  <img src="img/kansai_pict.jpg" height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.KANSAI"/></b>
  </figcaption>
</figure>
</div>

<div class="area_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/kyushu_pict.jpg" height= "150" width="150">
  <figcaption>
    <b><s:text name="lang.index.KYUSYU"/></b>
  </figcaption>
</figure>
</div>
    </div>
</body>

<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>