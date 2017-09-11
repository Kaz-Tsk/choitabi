<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
 <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">
 <link rel="stylesheet" type="text/css" href="css/login.css">
<title>login</title>
</head>

<body>
<!-- header include部分 -->
<header style=position:static;><s:include value="header.jsp"/></header>

<!-- main部分 -->
<div class="main">
	<div class="login-box">
		<div class=login-text>
		<h1>LOGIN</h1>
		</div>
		<s:form action="LoginAction">
		<div class=login-form>
			<h2>Mail Address</h2>
			<input type ="email"  name = "mailAddress"  required ="required" placeholder  = "choitabi@tour.ne.jp">
		</div>
		<div class=login-form>
			<h2>Password</h2>
			<input type="password"  name="password" required="required" placeholder="password">
		</div>
		<div class="submit">
			<input type="submit"  value="login" >
		</div>
		</s:form>
	</div>
</div>


<!-- footer include部分 -->
<footer style=margin-top:350px;>
	<s:include value="footer.jsp"></s:include>
</footer>
</body>

</html>