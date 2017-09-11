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
                <a href="InsertCartAction"><img src= "img/namieyakizoba.jpg"></a>
                <div class="name">なみえ焼きそば<br>(東北/福島県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1800</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/zundamochi.jpg">
                <div class="name">ずんだ餅<br>(東北/宮城県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1145</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/aquamarine_hukusima.jpg">
                <div class="name">アクアマリンふくしま<br>(東北/福島県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1800</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/oirasekeiryu.jpg">
                <div class="name">奥入瀬渓流<br>(東北/青森県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1145</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/mogamigawarafting.jpg">
                <div class="name">最上川ラフティング半日コース<br>(東北/山形県県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7000</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/paraglider_tandem_flight.jpg">
                <div class="name">パラグライダータンデムフライト体験<br>(東北/宮城県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7000</span></div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>