<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/index_3.css">
<link rel = "stylesheet" type= "text/css" href = "css/imagehover.css">
<title>ちょいたび</title>
</head>

<header>
        <jsp:include page="header.jsp"/>
</header>

<body>
    <div class= "img_main">
    <img src="img/mihuneyamarakuen.jpg"  height= "280" width="378p">
    <img src="img/zundamochi.jpg" height= "280" width="378p">
    <img src="img/sarugakyou_bungee.jpg" height= "280" width="378p">
    <img src="img/nanbayasakazinja.jpg" height= "280" width="378p">
    <h1>ちょいたびで、ちょいといい旅。</h1>
    </div>

    <div class= "theme_box">
    <h2>テーマで探す</h2>
    <div class="theme_sub">
    <figure class="imghvr-hinge-left" >
  <img src="img/gourmet_pict.png"  height= "150" width="150">
  <figcaption>
    <b>グルメ</b>
  </figcaption>
</figure>
</div>

 <div class="theme_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/place_pict.png" height= "150" width="150">
  <figcaption>
    <b>名所</b>
  </figcaption>
</figure>
</div>

 <div class="theme_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/activity_pict.png" height= "150" width="150">
  <figcaption>
    <b>アクティビティ</b>
  </figcaption>
</figure>
</div>
    </div>

     <div class= "area_box">
    <h2>エリアで探す</h2>
    <div class="area_sub">
    <figure class="imghvr-hinge-left" >
  <img src="img/touhoku_pict.jpg" height= "150" width="150">
  <figcaption>
    <b>東北</b>
  </figcaption>
</figure>
</div>

 <div class="area_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/kantou_pict.jpg" height= "150" width="150">
  <figcaption>
    <b>関東</b>
  </figcaption>
</figure>
</div>

 <div class="area_sub">
<figure class="imghvr-hinge-left"  >
  <img src="img/kansai_pict.jpg" height= "150" width="150">
  <figcaption>
    <b>関西</b>
  </figcaption>
</figure>
</div>

<div class="area_sub">
<figure class="imghvr-hinge-left" >
  <img src="img/kyushu_pict.jpg" height= "150" width="150">
  <figcaption>
    <b>九州</b>
  </figcaption>
</figure>
</div>
    </div>
</body>

<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>