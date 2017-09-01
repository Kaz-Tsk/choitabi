<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>

<body>
<header>
<s:include value="header.jsp"></s:include>
</header>




</body>
	<div class="login-box">
		<div class="login-logo">
		</div>
		<div class="login-text">
			<form action="LoginAction">
				<p>mail address</p>
				<input type="text" name="mailadderss"  required="required" placeholder="choitabi@tour.ne.jp" >
				<p>password</p>
				<input type="password" name="password" required="required"  placeholder="password">
				<br>
				<input type="submit"  name="loginbutton" value="login">
			</form>
		</div>
	</div>









<footer>
	<s:include value="footer.jsp"></s:include>
</footer>


</html>