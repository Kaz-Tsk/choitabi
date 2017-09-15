<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>choitabi トップ</title>
<!--  <link rel = "stylesheet" type = "text/css" href = "css/index.css">-->
<!-- jqueryの宣言 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="js/jquery.bxslider/jquery.bxslider.js"></script>
<link href="js/jquery.bxslider/jquery.bxslider.css" rel="stylesheet">

<link rel="shortcut icon" href="img/favicon.ico">

</head>



<style>


/*=============*/
/*もみじ落ちてくる-----*/
/*=============*/
/*----------------------------------*/
p.momiji01 img{
width:0px;
position: absolute;
animation: moveM  3s  normal linear;
-webkit-border-radius: 200px;
}
@keyframes moveM {
0% {top:0%;left:0%;opacity:1;width:100px;}
90% {opacity:1;width:100px;}
100% {top:80%;left:50%;opacity:0;width:100px;}
}
/*----------------------------------*/



</style>



<body>

<!--ヘッダー部分----------------------------------------------->
<header>
	<jsp:include page="header.jsp"/>
</header>










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


    <!--↓検索メニューの部分-->

    <!-- ここからサイドバー -->
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
    <script type = "text/javascript" src = "script.js"></script>
    </div>
		<!-- ここまでサイドバー -->

 <!--↓ツアーの一覧を表示する部分---------------------------------->
<div class = "mainArea">
    <div class = "TourList">
        <div class = "post">
            <h2><a href="touhoku.jsp">東北ツアー</a></h2>
            <p><a href="touhoku.jsp">そうだ、東北に</a></p>
                <div class="img">
                    <img class="Tohoku" src="img/touhokutop.jpg">
                </div>
        </div>

        <div class = "post">
            <h2><a href="activity.jsp">アクティビティツアー</a></h2>
            <p><a href="activity.jsp">本格的な秋が始まる１０月は色々なアクティビティが目白押し！！</a></p>
            <img class="raft" src="img/raft.jpg">
        </div>
    </div>
</div>

<div class = "clear"></div>
<div class = "tourgallery">
	<div class="content">
		<img class="sea" src="img/sea.jpg">

	</div>
	<h1></h1>
</div>

<!--↓ここから------------------------------------------>

<article>
	<ul>
		<li>
			<figure class="">
				<img src="img/sea.jpg"  width="400" height="300">
				<figcaption>
					<h2>海</h2>
					<p>海岸線を走る</p>
				</figcaption>
				<a rel="leanModal" href=""></a>
		</li>
	</ul>
</article>

<!--↑ここまで------------------------------------------>


<!--↓ここからフッター------------------------------------------>
<div class = "footer">

    <div class = "ARRLogo">All Rights Reserved.</div>
    <div class = "footerMenuBox">
        <div class = "footerMenu"><div class = "divlink1"><a href = "./companys outline.jsp">会社概要</a></div></div>
        <div class = "footerMenu"><div class = "divlink1"><a href = "./kiyaku.jsp">利用規約</a></div></div>
    </div>
    <div class = "clear"></div>

</div>



<!--もみじ落ちてくる--------------------->
<p class="momiji01">
    <a href = "">
        <img src = "img/momiji.png" width="100px" height="100px">
    </a>
</p>
<!----------------------------------------->




</body>
</html>
