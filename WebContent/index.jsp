<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>choitabi トップ</title>
<link rel = "stylesheet" type = "text/css" href = "./css/index.css">
</head>
<body>

<!--ヘッダー部分----------------------------------------------->
<div class = "header">
    <div class = "headerLogo"><a href = "./index.jsp">choitabi</a></div>
    <div class = "headerMenuBox">
        <div class = "headerMenu">
	        choitabiについて　　
	        Ｑ＆Ａ / お問い合わせ　　
	        <a href = "./login.jsp">ログイン</a>
        </div>
    </div>
</div>

<div class = "clear"></div>

<!--↓キャッチフレーズとスクロール画面の部分------------------------->


<div class = "catchPhrase">【キャッチフレーズとか一言コメントとか】</div>
<div class = "scroll">
    (※ここ画面スクロールです)<br>
    <br>
    ※配色は仮でオレンジにしてます。(表示するエリアがわかりやすいように薄く色をつけています)
</div>


<!--↓ここからメイン画面------------------------------------------>
<div class = "mainArea">

    <!--↓検索メニューの部分-->
    <div class = "Column">
        ツアー検索メニュー<br>
        - - - - - - - - - -<br>
        ◆テーマで探す<br>
        　┣ <a href = "./choimesi.jsp">グルメ</a><br>
        　┣ 名所<br>
        　┗ アクティビティ<br>
        <br>
        ◆エリアで探す<br>
        　┣ 東北<br>
        　┣ 関東<br>
        　┗ 関西<br>
    </div>

    <!--↓ツアーの一覧を表示する部分---------------------------------->
    <div class = "TourList">
        (ツアー一覧を表示する部分)<br>
        (枠の大きさ等、表示内容に合わせて調整していきます)
    </div>

</div>

<div class = "clear"></div>


<!--↓ここからフッター------------------------------------------>
<div class = "footer">

    <div class = "ARRLogo">All Rights Reserved.</div>
    <div class = "footerMenuBox">
        <div class = "footerMenu"><a href = "./companys outline.jsp">会社概要</a></div>
        <div class = "footerMenu"><a href = "./kiyaku.jsp">利用規約</a></div>
    </div>
    <div class = "clear"></div>

</div>






</body>
</html>