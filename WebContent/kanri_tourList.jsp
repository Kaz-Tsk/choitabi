<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー情報一覧</title>
</head>
<body>
<h1>ツアー情報一覧</h1>
    <hr>
    <br>
    ツアー検索<br>
    <s:form>
		<s:textfield name="selectWord"></s:textfield>
		<s:submit value="検索"></s:submit>
	</s:form>
	<br>
<table border = "1px" cellspacing = "0px" cellpadding = "10px">
	<tr>
		<th>ツアーID</th>
		<th>ツアー名</th>
		<th>価格</th>
		<th>定員</th>
		<th>最終編集日</th>
		<th>出発地</th>
		<th></th>
	</tr>

	<s:iterator value="currentTourList">
	<tr>
		<td><s:property value="tourId"></s:property></td>
		<td><s:property value="tourName"></s:property></td>
		<td><s:property value="price"></s:property></td>
		<td><s:property value="persons"></s:property></td>
		<td><s:property value="date"></s:property></td>
		<td><s:property value="departure"></s:property></td>
		<td>編集</td>
	</tr>
	</s:iterator>



</table>
    <br>

    <br>
    管理ページトップに戻る<br>
    <br>
    <br>
    <br>



</body>
</html>