<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>お問合せ内容入力画面</title>
<link rel = "stylesheet" type = "text/css" href = "css/contact_nyuuryoku.css">
</head>

<body>

    <div class ="header"><b>お問合せ内容入力</b>_内容確認_送信完了</div>

<h1>お問合せ内容入力</h1>
    <div class = "direction">以下のフォームに入力してください<br>(※配色等は仮です)</div>


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
            <input type = "text" name = "" size = "20"> @
            <input type = "text" name = "" size = "20">
        </td>
    </tr>
    <tr>
        <th>お問い合わせ内容</th><td colspan = "4">
        <textarea rows="10" cols="45"></textarea>
    </tr>

</table>

<div class = "button1">確認</div>
<div class = "button2">前のページに戻る</div>

<br>
<br>
<br>

</body>


</html>