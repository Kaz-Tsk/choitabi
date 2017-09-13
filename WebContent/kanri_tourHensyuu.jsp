<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- ↓国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ↑国際化 -->
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ツアー編集</title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourHensyuu"
 		var="lang" />
	<link rel = "stylesheet" type = "text/css" href = "./css/kanri_common.css">
</head>

<body>

<h1>ツアー情報編集</h1>
<hr>
	<s:text name="lang.kanri_tourHensyuu.direction"/><br>

<font color="red"><s:property value="errorMsg"/></font>

<!-- ↓ここから編集フォーム（テーブルまるごとと、チェックボックス、「確認」ボタンあります） -->
<form action="ConfirmTourEditingAction">
<table>
   <tr>
   		<th></th>
   		<th><s:text name="lang.kanri_tourHensyuu.before_edit"/></th>
   		<th><s:text name="lang.kanri_tourHensyuu.after_edit"/></th>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.tour_id"/></th>
   		<td><s:property value="currentTourId"/></td>
   		<td><s:text name="lang.kanri_tourHensyuu.direction_for_tour_id"/></td>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.tour_name"/></th>
   		<td><s:property value="currentTourName"/></td>
   		<td><input type="text" name="editTourName" value=<s:property value="currentTourName"/>></input></td>
   </tr>

      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.price"/></th>
   		<td><s:property value="currentPrice"/><s:text name="lang.kanri_tourHensyuu.yen"/></td>
   		<td><input type="text" size="5" name="editPrice" value=<s:property value="currentPrice"/>></input>
   			<s:text name="lang.kanri_tourHensyuu.yen"/></td>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.persons"/></th>
   		<td><s:property value="currentPersons"/><s:text name="lang.kanri_tourHensyuu.persons_number"/></td>
   		<td><input type="text" size="5" name="editPersons" value=<s:property value="currentPersons"/>></input>
   			<s:text name="lang.kanri_tourHensyuu.persons_number"/></td>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.departure"/></th><td>
   		<s:property value="currentDeparture"/></td>
   		<td><input type="text" name="editDeparture" value=<s:property value = "currentDeparture"/>></input></td>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.departure"/></th>
   		<td><s:property value="currentRegion"/></td>
   		<td><input type="text" name="editRegion" value=<s:property value="currentRegion"/>></input></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.prefectures"/></th>
   		<td><s:property value="currentPrefectures"/></td>
   		<td><input type="text" name="editPrefectures" value=<s:property value="currentPrefectures"/>></input></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.theme"/></th>
   		<td><s:property value="currentTheme"/>
   		</td><td><input type="text" name="editTheme" value = <s:property value= "currentTheme"/>></input></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.comment"/></th>
   		<td width="200px"><font size="2px"><s:property value="currentComment"/></font></td>
   		<td><textarea rows="10" cols="30"name="editComment"><s:property value = "currentComment"/></textarea></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.image_url"/></th>
   		<td><s:property value="currentImg"/></td>
   		<td><input type="text" name="editImg" value=<s:property value = "currentImg"/>>
   		    <br><font size="2px"><s:text name="lang.kanri_tourHensyuu.direction_for_image_url"/></font></td>
   </tr>
</table>
<hr>
<label>
	<input type="checkbox" name="deleteCheck" value="true">
		<font color = "red"><s:text name="lang.kanri_tourHensyuu.delete"/></font>
</label>
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
<input type="submit" value=<s:text name="lang.kanri_tourHensyuu.confirm"/>>
</form>
<!-- ここまで編集フォーム -->

    <br>
    <br>
    <s:text name="lang.kanri_tourHensyuu.return_list"/>
    <br>
    <s:text name="lang.kanri_tourHensyuu.return_top"/>
    <br>
    <br>




</body>
</html>