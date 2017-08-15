<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="login.css" media="all" />
</head>
<body>
<header></header>

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

<footer></footer>

</body>
</html>