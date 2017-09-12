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
                 <a href= "InsertCartAction"><img src="img/chickennanban.jpg"></a>
                <div class="name">チキン南蛮<br>(九州/宮崎県)</div>
                <div class="price">価格:<span class= "price"><span class= "price_num">&yen;443</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/nagasakichanpon.jpg"></a>
                <div class="name">長崎ちゃんぽん<br>(九州/長崎県)</div>
                <div class="price">価格:<span class= "price_num">&yen;777</span></div>
              </div>

                <div class="sub">
                 <a href= "InsertCartAction"><img src="img/kannontakikouen.jpg"></a>
                <div class="name">観音滝公園<br>(九州/鹿児島県)</div>
                <div class="price">価格:<span class= "price_num">&yen;4430</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/mihuneyamarakuen.jpg"></a>
                <div class="name">御船山楽園<br>(九州/佐賀県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7777</span></div>
             </div>

                 <div class="sub">
                 <a href= "InsertCartAction"><img src="img/iruka_watching_tour.jpg"></a>
                <div class="name">イルカウォッチングツアー<br>(九州/熊本県)</div>
                <div class="price">価格:<span class= "price_num">&yen;2250</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/aroma_botanical_candle.jpg"></a>
                <div class="name">アロマ＆ボタニカルキャンドル<br>(九州/福岡県)</div>
                <div class="price">価格:<span class= "price_num">&yen;3500</span></div>
            </div>
        </div>

</body>

<!-- フッター--------------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>