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
【変更後】欄に情報を入力してください<br>

<font color="red"><s:property value="errorMsg"/></font>

<!-- ↓ここから編集フォーム（テーブルまるごとと、チェックボックス、「確認」ボタンあります） -->
<s:form action="ConfirmTourEditingAction">
<table border = "1px" cellspacing = "0px" cellpadding = "10px" width="640px">
   <tr>
   		<th></th><th>変更前</th><th>変更後</th>
   </tr>
   <tr>
   		<th>ツアー名</th><td><s:property value="currentTourName"/></td>
   		<td><input type="text" name="editTourName" value=<s:property value="currentTourName"/>></input></td>
   </tr>
   <tr>
   		<th>ツアーID</th><td><s:property value="currentTourId"/></td><td>(変更不可です)</td>
   </tr>
      <tr>
   		<th>価格</th><td><s:property value="currentPrice"/>円</td>
   		<td><input type="text" size="5" name="editPrice" value=<s:property value="currentPrice"/>></input>　円</td>
   </tr>
   <tr>
   		<th>定員</th><td><s:property value="currentPersons"/>名</td>
   		<td><input type="text" size="5" name="editPersons" value=<s:property value="currentPersons"/>></input>　名</td>
   </tr>
   <tr>
   		<th>出発地</th><td><s:property value="currentDeparture"/></td>
   		<td><input type="text" name="editDeparture" value=<s:property value = "currentDeparture"/>></input></td>
   </tr>
   <tr>
   		<th>エリア</th><td><s:property value="currentRegion"/></td>
   		<td><input type="text" name="editRegion" value=<s:property value="currentRegion"/>></input></td>
   </tr>
      <tr>
   		<th>都道府県</th><td><s:property value="currentPrefectures"/></td>
   		<td><input type="text" name="editPrefectures" value=<s:property value="currentPrefectures"/>></input></td>
   </tr>
      <tr>
   		<th>テーマ</th><td><s:property value="currentTheme"/>
   		</td><td><input type="text" name="editTheme" value = <s:property value= "currentTheme"/>></input></td>
   </tr>
      <tr>
   		<th>コメント</th><td width="200px"><font size="2px"><s:property value="currentComment"/></font></td>
   		<td><textarea rows="10" cols="30"name="editComment"><s:property value = "currentComment"/></textarea></td>
   </tr>
      <tr>
   		<th>画像URL</th><td><s:property value="currentImg"/></td>
   		<td><input type="file" name="editImg" value=<s:property value = "currentImg"/>></td>
   </tr>
</table>
<hr>
<input type="checkbox" name="deleteCheck" value="true"><font color = "red">このツアーを削除する</font>
<hr>
<br>
	   	<s:hidden name= "currentTourId" property = "currentTourId"/>
	   	<s:hidden name = "currentTourName" property="currentTourName" />
	   	<s:hidden name = "currentPrice" property="currentPrice" />
	   	<s:hidden name = "currentPersons" property="currentPersons" />
	   	<s:hidden name = "currentDeparture" property="currentDeparture" />
	    <s:hidden name = "currentRegion" property="currentRegion" />
	   	<s:hidden name = "currentPrefectures" property="currentPrefectures" />
	    <s:hidden name = "currentTheme" property="currentTheme" />
	    <s:hidden name = "currentComment" property="currentComent" />
	    <s:hidden name = "currentImg" property="currentImg" />
<input type="submit" value="確認画面へ">
</s:form>
<!-- ここまで編集フォーム -->

    <br>
    <br>
    ツアー情報一覧にもどる<br>
    管理者トップページにもどる<br>
    <br>




</body>
</html>