%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ja">
<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>choitabi</title>
     <link rel="stylesheet" type="text/css"  href="/css/header.css">
     <link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<!-- ログイン時ヘッダー -->
	<s:if test="session.get(\"user\").equals(\"success\")">
			<div class="logo"><a href="MainTopAction"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a>
			<div class="navi2">
				<div class="naviloginbox"><a href="MainTopAction" class="underline"></div>
				<div class="naviloginbox"><a href="SelectCartAction" class="underline"></div>
				<div class="naviloginbox"><a href="MypageAction" class="underline"></div>
				<div class="naviloginbox"><a href="ComfirmContactAction" class="underline"></div>
				<div class="naviloginbox"><a href="CompleteCartAction" class="underline"></div>
				<div class="naviloginboxright"><a href="LogoutAction" class="underline"></div>
			</div>
			</div>
	</s:if>

	<!-- 管理者ログイン時ヘッダー  -->
		<s:elseif test="session.get(\"user\").equals(\"login\")">
		<div class="logo"><a href="MasterTopAction" class="underline">choitabi</a></div>
		<div class="navi">
			<div class="navibox"><a href="MasterTopAction" class="underline"></div>
			<div class="navibox"><a href="<!--MasterHistoryAction-->" class="underline"></div>
			<div class="navibox"><a href= "<!--MasterContactAction-->"class="underline"></div>
			<div class="navibox"><a href="<!--MasterItemAction-->" class="underline"></div>
			<div class="naviboxright"><a href="LogoutAction"  class="underline"></div>
		</div>
		</s:elseif>

	<!-- 未ログイン時ヘッダー -->
	<s:else>
		<div class="logo"><a href="<s:url action="MainTopAction" />" class="underline">choitabi</a></div>
		<div class="logout-name"></div>
		<div class="navi">
		<div class="navibox"><a href="index.jsp" class="underline"></div>
		<div class="navibox"><a href="<!--UserItemListAction-->" class="underline"></div>
		<div class="navibox"><a href="about.jsp"  class="underline"></div>
		<div class="navibox"><a href="contact_nyuuryoku.jsp"  class="underline"></div>
		<div class="naviboxright"><a href="login.jsp"  class="underline"></div>
		</div>
	</s:else>

</body>
</html>