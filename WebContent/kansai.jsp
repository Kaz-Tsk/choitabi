<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<title>関西</title>
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
                <input type = "image" src = "img/osakanokusikatsu.jpg">
                <div class="name">大阪の串かつ
                <br>(関西/大阪府)</div>
                <div class="price">価格:<span class= "price_num">&yen;555</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/obanzai.jpg">
                <div class="name">おばんざい<br>(関西/京都府)</div>
                <div class="price">価格:<span class= "price_num">&yen;441</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/nanbayasakazinja.jpg">
                <div class="name">難波八阪神社<br>(関西/大阪府)</div>
                <div class="price">価格:<span class= "price_num">&yen;5555</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/ryouonzi.jpg">
                <div class="name">龍穏寺<br>(関西/京都府)</div>
                <div class="price">価格:<span class= "price_num">&yen;4419</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/awazisima-parasailing.jpg">
                <div class="name">淡路島パラセーリング<br>(関西/兵庫県)</div>
                <div class="price">価格:<span class= "price_num">&yen;6000</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/hikoneshikouzinyama_hang_gliding.jpg">
                <div class="name">彦根荒神山ハングライダー体験<br>(関西/滋賀県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7000</span></div>
            </div>

        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>