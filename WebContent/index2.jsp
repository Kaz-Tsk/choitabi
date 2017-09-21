<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>choitabi トップ</title>
<link rel = "stylesheet" type = "text/css" href = "./css/index2.css">
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
        ◆テーマで探す
        <div class = "divlink2">　┣ <a href = "./choimesi.jsp">グルメ</a></div>
        <div class = "divlink2">　┣ <a href = "./place.jsp">名所</a></div>
        <div class = "divlink2">　┗ <a href = "./activity.jsp">アクティビティ</a></div>
        <br>
        ◆エリアで探す<br>
        　┣ 東北<br>
        　┣ 関東<br>
        　┣ 関西<br>
        　┗ 九州<br>
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
        <div class = "footerMenu"><div class = "divlink1"><a href = "./companys outline.jsp">会社概要</a></div></div>
        <div class = "footerMenu"><div class = "divlink1"><a href = "./kiyaku.jsp">利用規約</a></div></div>
    </div>
    <div class = "clear"></div>

</div>






</body>
</html>