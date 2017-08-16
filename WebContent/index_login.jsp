<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>choitabi ログイントップ</title>
<link rel = "stylesheet" type = "text/css" href = "./css/index.css">
</head>
<body>

<!--ヘッダー部分----------------------------------------------->
<div class = "header">
    <div class = "headerLogo"><div class = "divlink1"><a href = "./index_login.jsp">choitabi</a></div></div>
  		<div class = "headerMenuBox">
  			<div class = "headerMenu">＜ようこそ○○さん＞　　</div>
     	 	<div class = "headerMenu"><div class = "divlink1">choitabiについて</div></div>
     	   	<div class = "headerMenu"><div class = "divlink1">Ｑ＆Ａ/お問い合わせ</div></div>
    	    <div class = "headerMenu"><div class = "divlink1"><a href = "./index.jsp">ログアウト</a></div></div>
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
        　┣ グルメ<br>
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
        <div class = "footerMenu">会社概要</div>
        <div class = "footerMenu">利用規約</div>
    </div>
    <div class = "clear"></div>

</div>






</body>
</html>