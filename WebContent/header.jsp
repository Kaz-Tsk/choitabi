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
         <s:if test="#session.userFlg==1||#session.userFlg==2">
				    <div class="logo"><a href="<s:url action="MainTopAction"/>"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a></div>
			<div class="navi">
				<div class="navibox"><a href="about.jsp" class="underline"><s:text name="lang.header.about"/></a></div>
				<div class="navibox"><a href="Q&A.jsp" class="underline"><s:text name="lang.header.Q&A"/></a></div>
				<div class="navibox"><a href="LogoutAction" class="underline"><s:text name="lang.header.logout"/></a></div>
				<div class="navibox"><a href="MypageAction" class="underline"><s:text name="lang.header.Mypage"/></a></div>
			</div>
	</s:if>

	<!-- 管理者ログイン時ヘッダー  -->
		<s:elseif test="#session.userFlg==3 ">
			  <div class="logo2"><s:text name="lang.header.Management page"/></div>
		<div class="navi2">
			<div class="navibox2"><a href="kanri_tourList.jsp" class="underline"><s:text name="lang.header.tourlist"/></a></div>
			<div class="navibox2"><a href= "kanri_toiawasekakunin.jsp"class="underline"><s:text name="lang.header.kanritoiawase"/></a></div>
		 <div class="navibox2"><a href="LogoutAction"  class="underline"><s:text name="lang.header.logout"/></a></div>
		</div>
		</s:elseif>


	<!-- 未ログイン時ヘッダー -->
	<s:else>
	   <div class="logo"><a href="index.jsp"><span
					class="glyphicon glyphicon-globe"></span>choitabi</a></div>
		<div class="logout-name"></div>
		<div class="navi">
       <div class="navibox"><a href="about.jsp" class="underline">lang.header.about</a></div>
		<div class="navibox"><a href="Q&A.jsp"  class="underline">lang.header.Q&A</a></div>
		<div class="navibox"><a href="login.jsp"  class="underline">lang.header.login</a></div>
		</div>
	</s:else>
</header>
</body>
</html>
