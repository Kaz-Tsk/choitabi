<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="./css/login.css" media="all" />
</head>


<body>

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

<div id="form">
    <p class="form-title">Login</p>
    <form action="post">
        <p>Username</p>
        <p class="username"><input type="text" name="username" maxlength="32" autocomplete="OFF" /></p>
        <p>Password</p>
        <p class="password"><input type="password" name="password" maxlength="32" autocomplete="OFF" /></p>
        <p class="check"><input type="checkbox" name="checkbox" />パスワードを保存</p>
        <p class="submit"><input type="submit" value="Enter" /></p>
    </form>
</div>

<footer>

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