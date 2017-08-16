<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせフォーム</title>
<link rel="stylesheet" href="otoiawasekakuninn.css">
</head>
<body>
<h2>お問い合わせ内容　確認</h2>

<p>以下の内容で送信しますよろしいでしょうか？</p>

<table border="1" cellspacing="0">
<tr>
<td>名前</td><td width="160"></td>
</tr>
<tr>
<td>フリガナ</td><td></td>
</tr>
<tr>
<td>ご返信メールアドレス</td><td></td>
</tr>
<tr>
<td>お問い合わせ内容</td><td></td>
</tr>
</table>



<footer>
        <input type="button" value="内容を修正する" onclick="history.back(-1)">
        <button type="submit" name="submit">送信する</button>
</footer>
</body>
</html>