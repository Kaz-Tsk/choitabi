<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー追加内容確認</title>
</head>
<body>

<h1>ツアー追加　内容確認</h1>

以下の内容でツアーを追加します。よろしいですか？
<hr>
追加ツアー情報
<br>
	<table border = "1px" cellspacing = "0px" cellpadding = "10px" width="360">
	    <tr>
	        <tr>
	        <th>ツアーID</th><td colspan="4">(※自動で入ります)</td>
	    </tr>
	    <tr>
	        <th>ツアー名</th>
	        <td><s:property value = "newTourName"/></td>
	    </tr>
	    <tr>
	        <th>価格</th>
	        <td><s:property value="newPrice"/></td>
	    </tr>
	    <tr>
	        <th>定員</th>
	        <td><s:property value="newPersons"/></td>
	    </tr>
	    <tr>
	        <th>出発地</th>
	        <td><s:property value="newDeparture"/></td>
	    </tr>
	    <tr>
	        <th>エリア</th>
	        <td><s:property value="newRegion"/></td>
	    </tr>
	    <tr>
	        <th>都道府県</th>
	        <td><s:property value="newPrefectures"/></td>
	    </tr>
	    <tr>
	        <th>テーマ</th>
	        <td><s:property value="newTheme"/></td>
	    </tr>
	    <tr>
	        <th>コメント</th>
	        <td width="200px"><font size="2px"><s:property value="newComment"/></font></td>
	    </tr>
	    <tr>
	        <th>画像URL</th>
	        <td><s:property value="newImg"/></td>
	    </tr>
	</table>
<br>
<hr>
<br>
   <a href=
	    '<s:url action="InsertTourAction">
		    <s:param name="editTourId" value="newTourId"/>
		    <s:param name="editTourName" value = "newTourName"/>
		    <s:param name="editPrice" value = "newPrice"/>
		    <s:param name="editPersons" value = "newPersons"/>
		    <s:param name="editDeparture" value = "newDeparture"/>
		    <s:param name="editRegion" value = "newRegion"/>
		    <s:param name="editPrefectures" value="newPrefectures"/>
		    <s:param name="editTheme" value="newTheme"/>
		    <s:param name="editComment" value="newComment"/>
			<s:param name="editImg" value="newImg"/>
	    </s:url>'>
    操作を完了する
    </a>
<br>
<hr>
<br>
    前の画面に戻る<br>
    管理者トップページにもどる<br>
<br>
<br>
<br>


</body>
</html>