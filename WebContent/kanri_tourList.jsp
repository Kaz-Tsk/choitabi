<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
    <a href="<s:url action="IndicateTourListAction"/>">■商品管理　ツアー一覧</a><br>
    <br>
    <a href="./kanri_customerList.jsp">■顧客情報一覧</a><br>
    <br>
    <a href="./kanri_history.jsp">■購入履歴一覧</a><br>
    <br>
    <a href="./kanri_toiawasekakunin.jsp">■問い合わせ一覧</a><br>
    <br>
    【　　ログアウト　　】
</font>



</body>
</html>