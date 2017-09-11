<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<title>関東</title>
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
                <a href="InsertCartAction"><img src= "img/utunomiyagyouza.jpg"></a>
                <div class="name">宇都宮餃子<br>(関東/栃木県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1481</span></div>
            </div>

            <div class="sub">
                <a href="InsertCartAction"><img src= "img/yokosukakaiguncurry.jpg"></a>
                <div class="name">よこすか海軍カレー<br>(関東/神奈川県)</div>
                <div class="price">価格:<span class= "price_num">&yen;464</span></div>
            </div>

            <div class="sub">
                <a href="InsertCartAction"><img src= "img/hananukikeikoku.jpg"></a>
                <div class="name">花貫渓谷<br>(関東/茨城県)</div>
                <div class="price">価格:<span class= "price_num">&yen;1481</span></div>
            </div>

            <div class="sub">
                <a href="InsertCartAction"><img src= "img/irohazaka.jpg"></a>
                <div class="name">日光いろは坂<br>(関東/栃木県)</div>
                <div class="price">価格:<span class= "price_num">&yen;4649</span></div>
            </div>

            <div class="sub">
                <a href="InsertCartAction"><img src= "img/mobarashi_twin_circuit.jpg"></a>
                <div class="name">茂原ツインサーキット<br>(関東/千葉県)</div>
                <div class="price">価格:<span class= "price_num">&yen;2500</span></div>
            </div>

            <div class="sub">
                <a href="InsertCartAction"><img src= "img/sarugakyou_bungee.jpg"></a>
                <div class="name">猿ヶ京バンジー<br>(関東/群馬県)</div>
                <div class="price">価格:<span class= "price_num">&yen;11000</span></div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>