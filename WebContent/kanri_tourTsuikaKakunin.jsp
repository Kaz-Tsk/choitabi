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
	<title>ツアー追加内容確認</title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourTsuikaKakunin"
 		var="lang" />
	<!-- CSSの読み込み -->
	<link rel = "stylesheet" type = "text/css" href = "./css/kanri_common.css">
</head>

<body>

<h1>ツアー追加　内容確認</h1>
<s:text name="lang.kanri_tourTsuikaKakunin.direction"/>
<hr>
追加ツアー情報
<br>
	<table>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.tour_id"/>
	        </th>
	        <td colspan="4">
	        	<s:text name="lang.kanri_tourTsuikaKakunin.direction_for_tour_id"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.tour_name"/>
	        </th>
	        <td>
	        	<s:property value = "newTourName"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.price"/>
	        </th>
	        <td>
	        	<s:property value="newPrice"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.persons"/>
	        </th>
	        <td>
	        	<s:property value="newPersons"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.departure"/>
	        </th>
	        <td>
	        	<s:property value="newDeparture"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.region"/>
	        </th>
	        <td>
	        	<s:property value="newRegion"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.prefectures"/>
	        </th>
	        <td>
	        	<s:property value="newPrefectures"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.theme"/>
	        </th>
	        <td>
	        	<s:property value="newTheme"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.comment"/>
	        </th>
	        <td width="200px">
	        	<font size="2px"><s:property value="newComment"/></font>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.image_url"/>
	        </th>
	        <td>
	        	<s:property value="newImg"/>
	        </td>
	    </tr>
	    <tr>
	        <th>
	        	<s:text name="lang.kanri_tourTsuikaKakunin.image_preview" />
	        </th>
	        <td>
	        	<img src=<s:property value="newImg"/> height="20%"/>
	        </td>
	    </tr>
	</table>
<br>
<hr>
<br>
<!-- ↓「完了」の項目…JSPを通して、別のアクションにある同名の変数に値を渡しています -->
   <a href=
	    '<s:url action="InsertTourAction">
		    <s:param name="newTourId" value="newTourId"/>
		    <s:param name="newTourName" value = "newTourName"/>
		    <s:param name="newPrice" value = "newPrice"/>
		    <s:param name="newPersons" value = "newPersons"/>
		    <s:param name="newDeparture" value = "newDeparture"/>
		    <s:param name="newRegion" value = "newRegion"/>
		    <s:param name="newPrefectures" value="newPrefectures"/>
		    <s:param name="newTheme" value="newTheme"/>
		    <s:param name="newComment" value="newComment"/>
			<s:param name="newImg" value="newImg"/>
	    </s:url>'>
    <s:text name="lang.kanri_tourTsuikaKakunin.complete"/>
    </a>
<br>
<hr>
<br>
<!-- ↓「入力画面に戻る」の項目 ※別のアクションの同名の変数に値を移しています-->
<!-- 入力済みの情報が残るように、GoTourInsertPageActionにも「new」変数を用意します。 -->
   <a href=
	    '<s:url action="GoTourInsertPageAction">
		    <s:param name="newTourId" value="newTourId"/>
		    <s:param name="newTourName" value = "newTourName"/>
		    <s:param name="newPrice" value = "newPrice"/>
		    <s:param name="newPersons" value = "newPersons"/>
		    <s:param name="newDeparture" value = "newDeparture"/>
		    <s:param name="newRegion" value = "newRegion"/>
		    <s:param name="newPrefectures" value="newPrefectures"/>
		    <s:param name="newTheme" value="newTheme"/>
		    <s:param name="newComment" value="newComment"/>
			<s:param name="newImg" value="newImg"/>
	    </s:url>'>
    <s:text name="lang.kanri_tourTsuikaKakunin.return_input_page"/><br>
    </a>


<!-- ↓「管理トップページに戻る」の項目 -->
	<a href='<s:url action="GoManagersTopAction"/>'>
	<s:text name="lang.kanri_tourTsuikaKakunin.return_top"/>
	</a>
<br>
<br>
<br>


</body>
</html>