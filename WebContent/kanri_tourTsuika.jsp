<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー追加</title>
</head>
<body>

<h1>ツアー追加　情報登録画面</h1>
<hr>
    ツアー情報を入力してください
<br>


<s:form action="ConfirmTourInsertingAction">
<table border = "1px" cellspacing = "0px" cellpadding = "10px">
    <tr>
        <th>名称</th><td><input type="text" name="newTourName"></td>
    </tr>
    <tr>
        <th>価格</th><td><input type="text" name="newTourPrice" size="5">　円</td>
    </tr>
    <tr>
        <th>定員</th><td><input type="text" name="newTourPersons" size = "5">　名</td>
    </tr>
    <tr>
        <th>出発地</th><td><input type="text" name="newTourDeparture"></td>
</table>
<br>
<input type="submit" value="確認"/>
</s:form>

<br>
<hr>
<br>
    ツアー情報一覧にもどる<br>
    管理者トップページにもどる<br>
<br>
<br>
<br>


</body>
</html>