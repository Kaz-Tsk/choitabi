<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ja">
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>choitabi</title>
     <link rel="stylesheet" type="text/css"  href="css/header.css">
     <link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<!-- ログイン時ヘッダー -->
	<header>
         <s:if test="#session.userFlg1.">
				    <div class="logo"><a href="<s:url action="MainTopAction"/>"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a></div>
			<div class="navi2">
				<div class="naviloginbox"><a href="about.jsp" class="underline">choitabiについて</a></div>
				<div class="naviloginbox"><a href="Q&A.jsp" class="underline">お問い合わせ</a></div>
				<div class="naviloginbox"><a href="LoginAction" class="underline">ログイン</a></div>
				<div class="naviloginboxright"><a href="LogoutAction" class="underline">ログアウト</a></div>
			</div>
	</s:if>

	<!-- 管理者ログイン時ヘッダー  -->
		<s:elseif test="#session.userFlg.3">
			    <div class="logo"><a href="<s:url action="MainTopAction"/>"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a></div>
		<div class="navi">
			<div class="navibox"><a href="kanri_tourList.jsp" class="underline">ツアー管理</a></div>
			<div class="navibox"><a href= "kanri_toiawasekakunin.jsp"class="underline">管理問い合わせ</a></div>
		 <div class="naviboxright"><a href="LogoutAction"  class="underline">ログアウト</a></div>
		</div>
		</s:elseif>

	<!-- 未ログイン時ヘッダー -->
	<s:else>
	    <div class="logo"><a href="<s:url action="MainTopAction"/>"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a></div>
		<div class="logout-name"></div>
		<div class="navi">
       <div class="navibox"><a href="index.jsp" class="underline">choitabiについて</a></div>
		<div class="navibox"><a href="Q&A.jsp"  class="underline">お問い合わせ</a></div>
		<div class="naviboxright"><a href="login.jsp"  class="underline">ログイン</a></div>
		</div>
	</s:else>
</header>
</body>
</html>