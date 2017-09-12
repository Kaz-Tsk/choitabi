<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/base.css">
<title>アクティビティ</title>
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
                <a href= "InsertCartAction"><img src="img/mogamigawarafting.jpg"></a>
                <div class="name">最上川ラフティング半日コース<br>(東北/山形県県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7000</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/paraglider_tandem_flight.jpg"></a>
                <div class="name">パラグライダータンデムフライト体験<br>(東北/宮城県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7000</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/mobarashi_twin_circuit.jpg"></a>
                <div class="name">茂原ツインサーキット<br>(関東/千葉県)</div>
                <div class="price">価格:<span class= "price_num">&yen;2500</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/sarugakyou_bungee.jpg"></a>
                <div class="name">猿ヶ京バンジー<br>(関東/群馬県)</div>
                <div class="price">価格:<span class= "price_num">&yen;11000</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/awazisima-parasailing.jpg"></a>
                <div class="name">淡路島パラセーリング<br>(関西/兵庫県)</div>
                <div class="price">価格:<span class= "price_num">&yen;6000</span></div>
            </div>

            <div class="sub">
                <a href= "InsertCartAction"><img src="img/hikoneshikouzinyama_hang_gliding.jpg"></a>
                <div class="name">彦根荒神山ハングライダー体験<br>(関西/滋賀県)</div>
                <div class="price">価格:<span class= "price_num">&yen;7000</span></div>
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