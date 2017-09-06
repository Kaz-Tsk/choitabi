<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
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
                <img class = "img" src = "img/utunomiyagyouza.jpg">
                <div class="name">宇都宮餃子<br>(関東/栃木県)</div>
                <div class="price">価格:1481円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/yokosukakaiguncurry.jpg">
                <div class="name">よこすか海軍カレー<br>(関東/神奈川県)</div>
                <div class="price">価格:464円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/osakanokusikatsu.jpg">
                <div class="name">大阪の串かつ
                <br>(関西/大阪府)</div>
                <div class="price">価格:555円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/obanzai.jpg">
                <div class="name">おばんざい<br>(関西/京都府)</div>
                <div class="price">価格:441円</div>
            </div>

            <div class="sub">
                 <img class = "img" src = "img/chickennanban.jpg">
                <div class="name">チキン南蛮<br>(九州/宮崎県)</div>
                <div class="price">価格:443円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/nagasakichanpon.jpg">
                <div class="name">長崎ちゃんぽん<br>(九州/長崎県)</div>
                <div class="price">価格:777円</div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>