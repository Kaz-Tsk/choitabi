<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<title>九州</title>
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
                 <input type= "image" src = "img/chickennanban.jpg">
                <div class="name">チキン南蛮<br>(九州/宮崎県)</div>
                <div class="price">価格:<span class= "price">443円</span></div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/nagasakichanpon.jpg">
                <div class="name">長崎ちゃんぽん<br>(九州/長崎県)</div>
                <div class="price">価格:777円</div>
              </div>

                <div class="sub">
                 <input type= "image" src = "img/kannontakikouen.jpg">
                <div class="name">観音滝公園<br>(九州/鹿児島県)</div>
                <div class="price">価格:4430円</div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/mihuneyamarakuen.jpg">
                <div class="name">御船山楽園<br>(九州/佐賀県)</div>
                <div class="price">価格:7777円</div>
             </div>

                 <div class="sub">
                 <input type= "image" src = "img/iruka_watching_tour.jpg">
                <div class="name">イルカウォッチングツアー<br>(九州/熊本県)</div>
                <div class="price">価格:2250円</div>
            </div>

            <div class="sub">
                <input type= "image" src = "img/aroma_botanical_candle.jpg">
                <div class="name">アロマ＆ボタニカルキャンドル<br>(九州/福岡県)</div>
                <div class="price">価格:3500円</div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>