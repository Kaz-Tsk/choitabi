<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<link rel="stylesheet" type="text/css" href="css/hover.css" />

<title>グルメ</title>
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
                <div class="hvr-float-shadow"><a href= "InsertCartAction"><img src="img/namieyakizoba.jpg" ></a></div>
                <div class="name">なみえ焼きそば<br>(東北/福島県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1800</span></div>
            </div>

            <div class="sub">
               <div class="hvr-float-shadow"> <a href= "InsertCartAction"><img src="img/zundamochi.jpg"></a></div>
                <div class="name">ずんだ餅<br>(東北/宮城県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1145</span></div>
            </div>

            <div class="sub">
                <div class="hvr-float-shadow"><a href= "InsertCartAction"><img src="img/utunomiyagyouza.jpg"></a></div>
                <div class="name">宇都宮餃子<br>(関東/栃木県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1481</span></div>
            </div>

            <div class="sub">
                <div class="hvr-float-shadow"><a href= "InsertCartAction"><img src="img/yokosukakaiguncurry.jpg"></a></div>
                <div class="name">よこすか海軍カレー<br>(関東/神奈川県)</div>
                <div class="price">価格:<span class= "price_num">&yen;464</span></div>
            </div>

            <div class="sub">
                <div class="hvr-float-shadow"><a href= "InsertCartAction"><img src="img/osakanokusikatsu.jpg"></a></div>
                <div class="name">大阪の串かつ
                <br>(関西/大阪府)</div>
                <div class="price">価格:<span class= "price_num">&yen;555</span></div>
            </div>

            <div class="sub">
               <div class="hvr-float-shadow"> <a href= "InsertCartAction"><img src="img/obanzai.jpg"></a></div>
                <div class="name">おばんざい<br>(関西/京都府)</div>
                <div class="price">価格:<span class= "price_num">&yen;441</span></div>
            </div>

            <div class="sub">
                <div class="hvr-float-shadow"> <a href= "InsertCartAction"><img src="img/chickennanban.jpg"></a></div>
                <div class="name">チキン南蛮<br>(九州/宮崎県)</div>
                <div class="price">価格:<span class= "price_num">&yen;443</span></div>
            </div>

            <div class="sub">
                <div class="hvr-float-shadow"><a href= "InsertCartAction"><img src="img/nagasakichanpon.jpg"></a></div>
                <div class="name">長崎ちゃんぽん<br>(九州/長崎県)</div>
                <div class="price">価格:<span class= "price_num">&yen;777</span></div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>