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
                <img class = "img" src = "img/hananukikeikoku.jpg">
                <div class="name">花貫渓谷<br>(関東/茨城県)</div>
                <div class="price">価格:1481円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/irohazaka.jpg">
                <div class="name">日光いろは坂<br>(関東/栃木県)</div>
                <div class="price">価格:4649円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/nanbayasakazinja.jpg">
                <div class="name">難波八阪神社<br>(関西/大阪府)</div>
                <div class="price">価格:5555円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/ryouonzi.jpg">
                <div class="name">龍穏寺<br>(関西/京都府)</div>
                <div class="price">価格:4419円</div>
            </div>

            <div class="sub">
                 <img class = "img" src = "img/kannontakikouen.jpg">
                <div class="name">観音滝公園<br>(九州/鹿児島県)</div>
                <div class="price">価格:4430円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/mihuneyamarakuen.jpg">
                <div class="name">御船山楽園<br>(九州/佐賀県)</div>
                <div class="price">価格:7777円</div>
            </div>

            <div class="sub">
                <img class = "img" src = "img/hituziyama.jpg">
                <div class="name">羊山公園<br>(関東/埼玉県)</div>
                <div class="price">価格:9999円</div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>