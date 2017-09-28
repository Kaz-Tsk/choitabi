<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<script type="text/javascript">
	window.onunload = function(){};//FireFox
	history.forward();
</script>
	<script type="text/javascript">
		location.href("index.jsp");
	</script>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>login</title>
</head>

<body>
	<!-- header include部分 -->
	<header style="position: static;">
		<s:include value="header.jsp" />
	</header>

	<!-- main部分 -->
	<div class="main">
		<div class="login-box">
			<div class=login-text>
				<h1>LOGIN</h1>
			</div>
			<s:form action="LoginAction">
				<div class=login-form>
					<h2>Mail Address</h2>
					<input type="email" name="mailAddress" required="required"
						placeholder="choitabi@tour.ne.jp">
				</div>
				<div class=login-form>
					<h2>Password</h2>
					<input type="password" name="password" required="required"
						placeholder="password">
				</div>
				<div class="submit">
					<button type="submit">LOGIN</button>
				</div>
			</s:form>
		</div>
	</div>

	<!-- footer include部分 -->
	<footer style="text-align: center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>
</body>

</html>