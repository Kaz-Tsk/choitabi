<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート画面</title>
  <link rel="stylesheet" type="text/css" href="css/cart.css">
</head>

<body>
<div class = "header">
    <div class = "headerLogo">choitabi</div>
    <div class = "headerMenuBox">
        <div class = "headerMenu">
	        <a href="./about.jsp">choitabiについて</a>
	        <a href="./Q&A.jsp">Ｑ＆Ａ / お問い合わせ</a>
	        <a href=".login.jsp">ログイン</a>
        </div>
    </div>
</div>

    <div class="end">カートの商品</div>

    <table border="1" cellpadding="0">
    <tr>
        <td>ツアー名：○○○○</td><td>日程：XX月XX日</td><td>金額：○○○○円</td><td>人数：
        <form style="display:inline">
            <select name="ninzu">
                <option value="">1</option>
                <option value="">2</option>
                <option value="">3</option>
                <option value="">4</option>
                <option value="">5</option>
                <option value="">6</option>
                <option value="">7</option>
                <option value="">8</option>
                <option value="">9</option>
                <option value="">10</option>
            </select>
        </form>
        </td>
        <td><button type="submit" name="" value="">削除</button></td>
        </tr>
    <tr>
        <td>ツアー名：○○○○</td><td>日程：XX月XX日</td><td>金額：○○○○円</td><td>人数：
        <form style="display:inline">
            <select name="ninzu">
                <option value="">1</option>
                <option value="">2</option>
                <option value="">3</option>
                <option value="">4</option>
                <option value="">5</option>
                <option value="">6</option>
                <option value="">7</option>
                <option value="">8</option>
                <option value="">9</option>
                <option value="">10</option>
            </select>
        </form>
        </td><td><button type="submit" name="" value="">削除</button></td>
        </tr>
    </table>

    <div class="total">合計金額：○○○○円</div>
    <div class="kaikei">
        <button type="submit" name="" value="">購入</button></div>

<div class = "footer">

    <div class = "ARRLogo">All Rights Reserved.</div>
    <div class = "footerMenuBox">
        <div class = "footerMenu"><a href="./company_overview">会社概要</a></div>
        <div class = "footerMenu"><a href="">利用規約</a></div>
    </div>
    <div class = "clear"></div>
    </div>
</body>
</html>