<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<title>東北</title>
</head>

<!-- ヘッダー-------------------------- -->
<header>
        <jsp:include page="header.jsp"/>
</header>

<body>

<!-- サイドバー--------------------------------------------------------------------------------- -->
<div class = "sidebar">
         <jsp:include page="sidebar.jsp"/>
        </div>

<!-- 商品一覧-------------------------------------------------- -->
        <div class="main">
            <div class="sub">
                <img class = "img" src = "img/namieyakizoba.jpg">
                <div class="name">なみえ焼きそば<br>(東北/福島県)</div>
                <div class="price">価格:1800円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/zundamochi.jpg">
                <div class="name">ずんだ餅<br>(東北/宮城県)</div>
                <div class="price">価格:1145円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/aquamarine_hukusima.jpg">
                <div class="name">アクアマリンふくしま<br>(東北/福島県)</div>
                <div class="price">価格:1800円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/oirasekeiryu.jpg">
                <div class="name">奥入瀬渓流<br>(東北/青森県)</div>
                <div class="price">価格:1145円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/mogamigawarafting.jpg">
                <div class="name">最上川ラフティング半日コース<br>(東北/山形県県)</div>
                <div class="price">価格:7000円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/paraglider_tandem_flight.jpg">
                <div class="name">パラグライダータンデムフライト体験<br>(東北/宮城県)</div>
                <div class="price">価格:7000円</div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>