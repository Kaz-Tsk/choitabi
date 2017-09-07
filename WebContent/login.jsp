<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>login</title>
</head>

<body>
<!-- header include部分 -->
<header >
<s:include value="header.jsp"></s:include>
</header>

<!-- main部分 -->
	<div class="login-box">
		<div class="login-logo">
		</div>
		<div class="login-text">
			<s:form action="LoginAction">
				<s:textfield name = "mail address"  label= "mail address" required = "repuired" placeholder = "choitabi@tour.ne.jp"/>
				<s:password name="password" required="required" label = "password" placeholder="password"/>
				<br>
				<s:submit  value="login" />
			</s:form>
		</div>
	</div>



<!-- footer include部分 -->
<footer style=margin-top:1000px>
	<s:include value="footer.jsp"></s:include>
</footer>
</body>

</html>