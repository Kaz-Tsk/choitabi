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

<!--マウスオーバー時のcssホバー  -------------------------------------------->
<link rel = "stylesheet" type= "text/css" href = "css/imagehover.css">

<!-- カルーセルスライドのcss -------------------------------------------------->
<link rel = "stylesheet" type= "text/css" href = "css/slick-theme.css">
<link rel = "stylesheet" type= "text/css" href = "css/slick.css">

<link rel="shortcut icon" href="img/favicon.ico">

<!--jqueryとslick(カルーセルスライド)のスクリプト  -------------------------------------------->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/slick.min.js"></script>

<title>ちょいたび</title>
</head>

<!-- ヘッダー ------------------------------>
<header>
        <jsp:include page="header.jsp"/>
</header>

<body>

<!-- カルーセルスライドしている画像 --------------------------------------------------------------------------->
<div class="main_img">
     <div class= "img"><img src="img/aquamarine_hukusima.jpg"  height= "280" width="378"></div>
     <div class= "img"><img src="img/hananukikeikoku.jpg" height= "280" width="378"></div>
     <div class= "img"><img src="img/iruka_watching_tour.jpg" height= "280" width="378"></div>
     <div class= "img"><img src="img/mihuneyamarakuen.jpg" height= "280" width="378"></div>
     <div class= "img"><img src="img/oirasekeiryu.jpg" height= "280" width="378"></div>
     <div class= "img"><img src="img/mihuneyamarakuen.jpg" height= "280" width="378"></div>
     <div class= "img"><img src="img/sarugakyou_bungee.jpg" height= "280" width="378"></div>
     <div class= "img"><img src="img/zundamochi.jpg" height= "280" width="378"></div>
</div>

<!-- カルーセルスライドのオプション ----->
<script>
$(function(){
$('.main_img').slick({
	slidesToShow: 4,
	  slidesToScroll: 1,
	  autoplay: true,
	  autoplaySpeed: 2000,
	  arrows:true,
	  dots:true,
	});
});
</script>

<div class= "phrase"><h1>ちょいたびで、ちょいといい旅。</h1></div>

<!-- 検索アイコン↓ -->
    <div class= "theme_box">
    <h2><s:text name="lang.index.searchT"/></h2>
    <div class="theme_sub">
    <figure class="imghvr-hinge-left" >
  <img src="img/gourmet_pict.png"  height= "150" width="150">
  <figcaption>
    <a href='<s:url action="TourListAction"><s:param name="theme" value="%{'グルメ'}"/></s:url>'><s:text name="lang.index.gourmet" /></a>
  </figcaption>
</figure>
</div>

 <div class="theme_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/place_pict.png" height= "150" width="150">
  <figcaption>
    <a href='<s:url action="TourListAction"><s:param name="theme" value="%{'名所'}"/></s:url>'><b><s:text name="lang.index.spot"/></b></a>
  </figcaption>
</figure>
</div>

 <div class="theme_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/activity_pict.png" height= "150" width="150">
  <figcaption>
    <a href='<s:url action="TourListAction"><s:param name="theme" value="%{'アクティビティ'}"/></s:url>'><b><s:text name="lang.index.activity"/></b></a>
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
   <a href='<s:url action="TourListAction"><s:param name="region" value="%{'東北'}"/></s:url>'> <b><s:text name="lang.index.TOHOKU"/></b></a>
  </figcaption>
</figure>
</div>

 <div class="area_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/kantou_pict.jpg" height= "150" width="150">
  <figcaption>
    <a href='<s:url action="TourListAction"><s:param name="region" value="%{'関東'}"/></s:url>'><b><s:text name="lang.index.KANTO"/></b></a>
  </figcaption>
</figure>
</div>

 <div class="area_sub">
<figure class="imghvr-hinge-left"  >
  <img src="img/kansai_pict.jpg" height= "150" width="150">
  <figcaption>
    <a href='<s:url action="TourListAction"><s:param name="region" value="%{'関西'}"/></s:url>'><b><s:text name="lang.index.KANSAI"/></b></a>
  </figcaption>
</figure>
</div>

<div class="area_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/kyushu_pict.jpg" height= "150" width="150">
  <figcaption>
    <a href='<s:url action="TourListAction"><s:param name="region" value="%{'九州'}"/></s:url>'><b><s:text name="lang.index.KYUSYU"/></b></a>
  </figcaption>
</figure>
</div>
    </div>
    <script type="text/javascript" src="js/slick.min.js"></script>
</body>

<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>