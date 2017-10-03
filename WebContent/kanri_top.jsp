<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ↓国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ↑国際化 -->
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title><s:text name="lang.kanri_top.title" /></title>
<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_top"
	var="lang" />
<!-- CSSの読み込み -->
<style type="text/css">
.main {
	position: absolute;
	top: 25%;
	left: 25%;
	text-align: center;
}
</style>
</head>

<body>
	<script type="text/javascript">
<!--
	var referrer = document.referrer;
	if(referrer.indexOf("login")>0){
		location.href="kanri_top.jsp";
	}

	// -->
</script>

	<!-- ヘッダー部分------------------------------->
	<header>
		<jsp:include page="header.jsp" />
	</header>
	<div class="main">
		<h1>
			<s:text name="lang.kanri_top.title" />
		</h1>
		<hr>
		<br> -----
		<s:text name="lang.kanri_top.menu" />
		-----<br>
		<!-- ■で囲ってある部分がメニュー項目の表示部分(国際化済み)です ※■は目印です。なくても動きます -->

		<!-- ツアー一覧へ遷移 -->
		<br> <a
			href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectWord" value = ""/></s:url>'>
			■<s:text name="lang.kanri_top.tour_management" />■
		</a> <br>

		<!-- 購入履歴へ遷移 -->
		<br> <a href='<s:url action="KanriHistoryAction"></s:url>'> ■<s:text
				name="lang.kanri_top.purchase_history" />■
		</a> <br>

		<!-- お問い合わせ画面へ遷移 -->
		<br> <a
			href='<s:url action="KanriContactAction">
	<s:param name="pageNum" value="1"/></s:url>'>
			■<s:text name="lang.kanri_top.contact_list" />■
		</a><br>

	</div>
</body>
</html>
