<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<title>名所</title>
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
                <input type = "image" src = "img/aquamarine_hukusima.jpg">
                <div class="name">アクアマリンふくしま<br>(東北/福島県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1800</span></div>
            </div>

            <div class="sub">
                <input type = "image" src = "img/oirasekeiryu.jpg">
                <div class="name">奥入瀬渓流<br>(東北/青森県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1145</span></div>
            </div>

            <div class="sub">
                <input type = "image" src = "img/hananukikeikoku.jpg">
                <div class="name">花貫渓谷<br>(関東/茨城県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1481</span></div>
            </div>

            <div class="sub">
                <input type = "image" src = "img/irohazaka.jpg">
                <div class="name">日光いろは坂<br>(関東/栃木県)</div>
                <div class="price">価格:<span class= "price_num">&yen;4649</span></div>
            </div>

            <div class="sub">
                <input type = "image" src = "img/nanbayasakazinja.jpg">
                <div class="name">難波八阪神社<br>(関西/大阪府)</div>
                <div class="price">価格:<span class= "price_num">&yen;5555</span></div>
            </div>

            <div class="sub">
                <input type = "image" src = "img/ryouonzi.jpg">
                <div class="name">龍穏寺<br>(関西/京都府)</div>
                <div class="price">価格:<span class= "price_num">&yen;4419</span></div>
            </div>

            <div class="sub">
                 <input type = "image" src = "img/kannontakikouen.jpg">
                <div class="name">観音滝公園<br>(九州/鹿児島県)</div>
                <div class="price">価格:<span class= "price_num">&yen;4430</span></div>
            </div>

            <div class="sub">
                <input type = "image" src = "img/mihuneyamarakuen.jpg">
                <div class="name">御船山楽園<br>(九州/佐賀県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7777</span></div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>