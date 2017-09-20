<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>予約内容確認画面</title>
<link rel = "stylesheet" type = "text/css" href = "./css/yoyaku_kakunin.css">
</head>
<body>

    <div class ="header">予約内容入力_<b>予約内容確認</b>_予約完了</div>

<h1>予約内容確認</h1>
    <div class = "direction">以下の内容で予約いたします。よろしいですか？<br>(※配色等は仮です)</div>


<table>
    <tr>
        <th>お客様氏名</th>
            <th>姓</th><td>例）田中</td>
            <th>名</th><td>例）太郎</td>
    </tr>
    <tr>
        <th>フリガナ</th>
            <th>セイ</th><td>タナカ</td>
            <th>メイ</th><td>タロウ</td>
    </tr>
    <tr>
        <th rowspan = "3">ご住所</th>
        <td colspan = "4" rowspan = "3">
            〒000-0000<br>
            東京都○○区○○　△△-××
        </td>
    </tr>
    <tr>
    </tr>
    <tr>
    </tr>
    <tr>
        <th>お電話番号</th>
        <td colspan = "4">
            000-0000-0000
        </td>
    </tr>
    <tr>
        <th>メールアドレス</th><td colspan = "4">
            aaa @ bbb ...
        </td>
    </tr>
    <tr>
        <th>予約人数</th><td colspan = "4">3　名</td>
    </tr>
    <tr>
        <th>予約日時</th>
        <td colspan = "4">
            10月11日
        </td>
    </tr>

    <tr>
        <th></th><th>合計金額</th><td colspan = "4">○○○○○円</td>
    </tr>
    <tr>
        <th>クレジット会社</th>
        <td colspan = "5">
            VISA
        </td>
    </tr>
    <tr>
        <th>カード番号</th>
        <td colspan = "5">
            0000-0000-0000
        </td>
    </tr>
</table>

<div class = "button1">予約を確定する</div>
<div class = "button2">入力ページに戻る</div>

<br>
<br>
<br>



</body>
</html>