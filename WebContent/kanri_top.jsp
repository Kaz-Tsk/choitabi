<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理ページトップ</title>
</head>
<body>
<h1>管理者画面トップ</h1>
<font size = "3">
    <br>
    -----管理メニュー-----<br>
    <br>
    <a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectWord" value = ""/></s:url>'>
    ■商品管理　ツアー一覧
    </a><br>



    <br>
    <a href="./kanri_customerList.jsp">■顧客情報一覧</a><br>
    <br>
    <a href="./kanri_history.jsp">■購入履歴一覧</a><br>
    <br>



   <!-- お問い合わせ画面へ遷移 -->
					<br><a href='<s:url action="KanriContactAction">
					<s:param name="pageNum" value="1"/>
					</s:url>'>お問い合わせ</a><br>

</font>



</body>
</html>