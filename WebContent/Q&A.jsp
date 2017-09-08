<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type= "text/css" href = "css/Q&A.css">
<title>Q&A</title>
</head>
<!-- ヘッダー部分---------------------- -->
<header>
        <jsp:include page="header.jsp"/>
</header>

<body>

<!-- Q&A部分----------------------------------------------------------------- -->
<div class="main">
        <h1>Q&A</h1>
        <br>
        <div class="Q%A">
            <h2>Q.キャンセルはできますか？</h2>
            <br>
            <h3>A.可能です。ただし、ツアー当日三日前からのキャンセルは
            <br>キャンセル料金が発生いたします。
            <br>--------------------------------------------------------------
            <br>
            <br>
            <h4>その他お問い合わせは以下のページにお進みください</h4>
            </h3>
            <br><h5><a href="./contact_nyuuryoku.jsp">お問い合わせページへ</a></h5>
        </div>
    </div>

</body>

<!-- フッター部分----------------------- -->
<footer>
          <jsp:include page="footer.jsp"/>
</footer>
</html>