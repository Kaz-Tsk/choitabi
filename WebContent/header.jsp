<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="html" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale-1.0">
<link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet">
<style type="text/css">
<!--
a:link { color : #ffffff; }
a:visited { color : #ffffff; }
</style>

<!-- 国際化 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tabiyashi.property.index"
	var="lang" />

<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	type="text/javascript"></script>
<title>choitabi</title>
</head>
<body >
<header >
		<div class="title">
			<h1 class="col-sm-9" style="text-color:#ffffff" >
				<a href="<s:url action="about.jsp"/>"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a>
			</h1>
			<p class="col-sm-3" style="text-align: right" style="text-color:#ffffff">
				<s:property value="Session.get(\"name\")" />
				<br>
			</p>
		</div>
		<nav class="text-right">
			<ul class="list-inline">
				<s:if test="session.get(\"user\").equals(\"login\")">
						<li><a href="<s:url action="about.jsp"/>">choitabiについて</a></li>
					<li><a href="<s:url action="LogoutAction"/>"
						onClick="JavaScript:link1();return false">ログアウト</a></li>
					<li><a href="<s:url action="./login.jsp"/>">ログイン</a></li>
					<li><a href="<s:url action="contact_nyuuryoku.jsp"/>">お問い合わせ</a></li>
				</s:if>
				<s:elseif test="session.get(\"user\").equals(\"success\")">
					<li><a href="<s:url action="about.jsp"/>">choitabiについて</a></li>
					<li><a href="<s:url action=""/>"
						onClick="JavaScript:link1();return false">ログアウト</a></li>
					<li><a href="<s:url action="：；"/>">ログイン</a></li>
					<li><a href="<s:url action="contact_nyuuryoku.jsp"/>">お問い合わせ</a></li>
				</s:elseif>
				<s:elseif test="session.get(\"user\").equals(\"error\")">
                <li><a href="<s:url action="about.jsp"/>">choitabiについて</a></li>
					<li><a href="<s:url action="./login.jsp"/>">ログイン</a></li>
					<li><a href="<s:url action="contact_nyuuryoku.jsp"/>">お問い合わせ</a></li>
				</s:elseif>
				<s:else>
					<li><a href="<s:url action="about.jsp"/>">choitabiについて</a></li>
					<li><a href="<s:url action="./login.jsp"/>">ログイン</a></li>
					<li><a href="<s:url action="contact_nyuuryoku.jsp"/>">お問い合わせ</a></li>
				</s:else>
			</ul>
		</nav>
		<div class="clear">
			<hr />
		</div>
	</header>
	</body>
	</html>