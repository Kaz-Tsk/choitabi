<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>choitabi トップ</title>
<link rel = "stylesheet" type = "text/css" href = "./css/index2.css">
<!-- jqueryの宣言 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="./js/jquery.bxslider/jquery.bxslider.js"></script>
<link href="./js/jquery.bxslider/jquery.bxslider.css" rel="stylesheet">

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

<div class = "clear"></div>

<!--↓キャッチフレーズとスクロール画面の部分------------------------->


<div class = "catchPhrase">【ちょいたびで、ちょいといい旅。】</div>

    <div class="flame">
            <ul class="bxslider">
                <li><img src="img/fre1.jpg"></li>
                <li><img src="img/himezi.jpg"></li>
                <li><img src="img/hituziyama.jpg"></li>
                <li><img src="img/ita1.jpg"></li>
                <li><img src="img/ryuzin.jpg"></li>
            </ul>

    <script type="text/javascript" src ="index.js"></script>


</div>


<!--↓ここからメイン画面------------------------------------------>
<div class = "mainArea">

    <!--↓検索メニューの部分-->

    <!-- ここからサイドバー -->
       <ul class = "outline">
            <li>
                <div class = "category">テーマで探す</div>
                <ul class = "menu">
                    <li><a href = "#">グルメ</a></li>
                    <li><a href = "#">名所</a></li>
                    <li><a href = "#">アクティビティ</a></li>
                </ul>
            </li>
            <li>
                <div class = "category">エリアで探す</div>
                <ul class = "menu">
                    <li><a href = "#">東北</a></li>
                    <li><a href = "#">関東</a></li>
                    <li><a href = "#">関西</a></li>
                    <li><a href = "#">九州</a></li>
                </ul>
            </li>
        </ul>
    <script type = "text/javascript" src = "script.js"></script>
		<!-- ここまでサイドバー -->

    <!--↓ツアーの一覧を表示する部分---------------------------------->
    <div class = "TourList">
        <div class = "post">
            <h2>東北ツアー</h2>
            <p>新幹線でゆく</p>
                <div class="img">
                    <img class="Tohoku" src="img/touhokutop.jpg">
                </div>
        </div>

        <div class = "post">
            <h2>アクティビティツアー</h2>
            <p>本格的な秋が始まる１０月は色々なアクティビティが目白押し！！</p>
            <img class="nijoujou" src="img/nijoujou.jpg">
        </div>
    </div>
</div>

<div class = "clear"></div>


<!--↓ここからフッター------------------------------------------>
<div class = "footer">

    <div class = "ARRLogo">All Rights Reserved.</div>
    <div class = "footerMenuBox">
        <div class = "footerMenu"><div class = "divlink1"><a href = "./companys outline.jsp">会社概要</a></div></div>
        <div class = "footerMenu"><div class = "divlink1"><a href = "./kiyaku.jsp">利用規約</a></div></div>
    </div>
    <div class = "clear"></div>

</div>






</body>
</html>