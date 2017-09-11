<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>動作確認テスト</title>
<link rel = "stylesheet" type = "text/css" href = "css/nagao.css">
<script type="text/javascript" src ="js/index.js"></script>
<!-- jqueryの宣言 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="js/jquery.bxslider/jquery.bxslider.js"></script>
<link href="js/jquery.bxslider/jquery.bxslider.css" rel="stylesheet">

<link rel="shortcut icon" href="img/favicon.ico">
</head>
<body>

<!--ヘッダー部分----------------------------------------------->
<div class = "header">
    <div class = "divlink1"><div class = "headerLogo"><a href = "./index.jsp">choitabi</a></div></div>
    <div class = "headerMenuBox">
        <div class = "headerMenu"><div class = "divlink1">choitabiについて</div></div>
        <div class = "headerMenu"><div class = "divlink1">Ｑ＆Ａ/お問い合わせ</div></div>
        <div class = "headerMenu"><div class = "divlink1"><a href = "./login.jsp">ログイン</a></div></div>
    </div>
</div>

<!--↓キャッチフレーズとスクロール画面の部分------------------------->


<div class = "catchPhrase">【ちょいたびで、ちょいといい旅。】</div>

<div class="flame">
            <ul class="bxslider">
            	<li><img src="img/kannontakikouen.jpg"></li>
                <li><img src="img/chickennanban.jpg"></li>
                <li><img src="img/hananukikeikoku.jpg"></li>
                <li><img src="img/iruka_watching_tour.jpg"></li>
                <li><img src="img/sarugakyou_bungee.jpg"></li>
                <li><img src="img/yokosukakaiguncurry.jpg"></li>
                <li><img src="img/paraglider_tandem_flight.jpg"></li>
                <li><img src="img/obanzai.jpg"></li>
            </ul>
    <script type="text/javascript" src ="js/index.js"></script>
</div>

<!--↓ここからメイン画面------------------------------------------>

<!-- ここからサイドバー -->
<div class = "box1">
    <div class = "sidebar">
       <ul class = "outline">
            <li>
                <div class = "category">テーマで探す</div>
                <ul class = "menu">
                    <li><a href = "./gourmet.jsp">グルメ</a></li>
                    <li><a href = "./place.jsp">名所</a></li>
                    <li><a href = "./activity.jsp">アクティビティ</a></li>
                </ul>
            </li>
            <li>
                <div class = "category">エリアで探す</div>
                <ul class = "menu">
                    <li><a href = "./touhoku.jsp">東北</a></li>
                    <li><a href = "#">関東</a></li>
                    <li><a href = "#">関西</a></li>
                    <li><a href = "#">九州</a></li>
                </ul>
            </li>
        </ul>
    <script type = "text/javascript" src = "sidebar.js"></script>
    </div>
</div>
		<!-- ここまでサイドバー -->
<div class = "boxA">
	<div class ="box2">box2</div>
	<div class ="box3">box3</div>
	<div class="clear"></div>
</div>
<div class ="box4">ちょいめし
	<div class="main">
		<div class="sub1">
			<h3>おすすめグルメ</h3>
			<a href="gourmet.jsp"><img class="img" src="img/namerou.jpg"></a>
			<h5>なめろう</h5>
			<p>おいしいよ^^</p>
		</div>
		<div class="sub2">
			<h3>おすすめグルメ</h3>
			<a href="gourmet.jsp"><img class="img" src="img/namieyakizoba.jpg"></a>
			<h5>やきそば</h5>
			<p>おいしいよ^^</p>
		</div>
		<div class="sub3">
			<h3>おすすめグルメ</h3>
			<a href="gourmet.jsp"><img class="img" src="img/osakanokusikatsu.jpg"></a>
			<h5>串カツ</h5>
			<p>うまいで^^</p>
		</div>
		<div class="clear"></div>
	</div>
</div>
<div class ="box5"><a href="place.jsp">エリアで探す</a>
	<div class="main">
		<div class="touhoku">東北
			<a href="touhoku.jsp"><img class="img" src="img/aquamarine_hukusima.jpg"></a>
		</div>
		<div class="kantou">関東
			<a href="kantou.jsp"><img class="img" src="img/irohazaka.jpg"></a>
		</div>
		<div class="kansai">関西
			<a href="kansai.jsp"><img class="img" src="img/ryouonzi.jpg"></a>
		</div>
		<div class="kyushu">九州
			<a href="kyushu.jsp"><img class="img" src="img/mihuneyamarakuen.jpg"></a>
		</div>
		<div class="clear"></div>
	</div>
</div>
<div class ="box6">
	<img class="sea" src="img/sea.jpg">
</div>

</body>
</html>