<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="html" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang ="ja">

<head>


   <title>お問合せ内容入力画面</title>
<link rel = "stylesheet" type = "text/css" href = "css/contact_nyuuryoku.css">

</head>


<body>

<div class ="header"><b>お問合せ内容入力</b>_内容確認_送信完了</div>



<s:form action="InsertContactAction" method="post">

<h1>お問合せ内容入力</h1>
    <div class = "direction">以下のフォームに入力してください<br></div>



<table>
    <tr>
        <th>お客様氏名</th>
            <th>姓</th><td><input type = "text" name = "" size = "12"></td>
            <th>名</th><td><input type = "text" name = "" size = "12"></td>
    </tr>
    <tr>
        <th>フリガナ</th>
            <th>セイ</th><td><input type = "text" name = "" size = "12"></td>
            <th>メイ</th><td><input type = "text" name = "" size = "12"></td>
    </tr>
    <tr>
        <th>メールアドレス</th><td colspan = "4">
            <s:textfield name="email"/>

        </td>
    </tr>
    <tr>
        <th>お問い合わせ内容</th><td colspan = "4">
        <textarea rows="10" cols="45"></textarea>
    </tr>

</table>

<input type="submit" value="確認">
<input type="submit" value="トップに戻る">

</s:form>

<br>
<br>
<br>

</body>


</html>