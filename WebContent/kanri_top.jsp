<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- ↓国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ↑国際化 -->
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理ページトップ</title>
<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
<fmt:setLocale value="${pageContext.request.locale.language}"/>
<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_top"
 var="lang" />
<!-- CSSの読み込み -->
<link rel = "stylesheet" type = "text/css" href = "./css/kanri_common.css">
</head>

<body>
<h1>管理者画面トップ</h1>
    <hr>
    <br>

    -----管理メニュー-----<br>
    <br>
    <br>
    <a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectWord" value = ""/></s:url>'>
    ■商品管理　ツアー一覧
    </a><br>
    テスト：この下に国際化ver<br>
    <s:text name="lang.kanri_top.tour_management" />
    <s:text name="lang.kanri_top.customer_list" />

    <br>
    <a href="./kanri_customerList.jsp">■顧客情報一覧</a><br>
    <br>
    <a href="./kanri_history.jsp">■購入履歴一覧</a><br>
    <br>

   <!-- お問い合わせ画面へ遷移 -->
					<br><a href='<s:url action="KanriContactAction">
					<s:param name="pageNum" value="1"/>
					</s:url>'>お問い合わせ</a><br>




</body>
</html>