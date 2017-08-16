<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>予約内容入力画面</title>
<link rel = "stylesheet" type = "text/css" href = "./css/yoyaku_nyuuryoku.css">
</head>
<body>

    <div class ="header"><b>予約内容入力</b>_予約内容確認_予約完了</div>

<h1>予約内容入力</h1>
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
        <th rowspan = "3">ご住所</th>
        <td colspan = "4" rowspan = "3">
            〒<input type = "text" size = "5">-<input type = "text" size = "5"><br>
            <br>
            <textarea rows = "5" cols = "50"></textarea>
        </td>
    </tr>
    <tr>
    </tr>
    <tr>
    </tr>
    <tr>
        <th>お電話番号</th><td colspan = "4">
            <input type = "text" name = "" size = "5"> -
        <input type = "text" name = "" size = "5"> -
        <input type = "text" name = "" size = "5">
        </td>
    </tr>
    <tr>
        <th>メールアドレス</th><td colspan = "4">
            <input type = "text" name = "" size = "20"> @
            <input type = "text" name = "" size = "20">
        </td>
    </tr>
    <tr>
        <th>予約人数</th><td colspan = "4"><input type = "text" name = "" size = "5">　名</td>
    </tr>
    <tr>
        <th>予約日時</th>
        <td colspan = "4">
            <label><input type = "radio" name = "" value ="">10月11日</label>
            <label><input type = "radio" name = "" value ="">10月12日</label>
            <label><input type = "radio" name = "" value ="">10月13日</label>
        </td>
    </tr>

    <tr>
        <th></th><th>合計金額</th><td colspan = "4">○○○○○円</td>
    </tr>
    <tr>
        <th>クレジット会社</th>
        <td colspan = "5">
            <label><input type = "radio" name = "" value ="">VISA</label>
            <label><input type = "radio" name = "" value ="">JCB</label>
            <label><input type = "radio" name = "" value ="">Amex</label>
        </td>
    </tr>
    <tr>
        <th>カード番号</th>
        <td colspan = "5">
            <input type = "password" name = "" size = "5"> -
            <input type = "password" name = "" size = "5"> -
            <input type = "password" name = "" size = "5">
        </td>
    </tr>
</table>

<div class = "button1">確認</div>
<div class = "button2">前のページに戻る</div>

<br>
<br>
<br>



</body>
</html>