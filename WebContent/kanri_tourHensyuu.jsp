<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー編集</title>
</head>
<body>

<h1>ツアー情報編集</h1>
<hr>
【変更後】欄に情報を入力してください
<!-- ↓ここから編集フォーム（テーブルまるごとと、チェックボックス、「確認」ボタンあります） -->

<s:form>
<table border = "1px" cellspacing = "0px" cellpadding = "10px">
    <tr>
        <th>名称</th>
        <td>変更前</td><td><s:property value="tourName"/></td>
        <td>変更後</td><td><s:textfield name="tourName"/></td>
    </tr>
    <tr>
        <th>価格</th>
        <td>変更前</td><td><s:property value="price"/></td>
        <td>変更後</td><td><s:textfield name="price"/></td>
    </tr>
    <tr>
        <th>定員</th>
        <td>変更前</td><td><s:property value="persons"/></td>
        <td>変更後</td><td><s:textfield name="persons"/></td>
    </tr>
    <tr>
        <th>出発地</th>
        <td>変更前</td><td><s:property value="departure"/></td>
        <td>変更後</td><td><s:textfield name="departure"/></td>
    </tr>
</table>
<br>
<hr>
    <input type = "checkbox" name = "" value = ""><font color = "red">このツアーを削除する</font>
<hr>
    <br>
    <s:submit value="確認画面へ"/>
</s:form>
<!-- ここまで編集フォーム -->

    <br>
    <br>
    ツアー情報一覧にもどる<br>
    管理者トップページにもどる<br>
    <br>




</body>
</html>