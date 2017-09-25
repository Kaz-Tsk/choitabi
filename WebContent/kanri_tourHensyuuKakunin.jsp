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
<meta charset="UTF-8">
<title>ツアー編集内容確認</title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourHensyuuKakunin"
 		var="lang" />
 	<!-- CSSの読み込み -->
<link rel = "stylesheet" type = "text/css" href = "./css/kanri_common.css">
</head>

<header>
        <jsp:include page="header.jsp"/>
</header>

<body>

<h1>ツアー情報編集 内容確認</h1>
<hr>

<!-- 画面上部に表示するメッセージの部分------------------------------------------------ -->
<s:if test="deleteCheck.equals('true')">
   <font color = "red"><s:text name="lang.kanri_tourHensyuuKakunin.direction_for_delete"/></font>
</s:if>
<s:else>
    <s:text name="lang.kanri_tourHensyuuKakunin.direction_for_edit"/>
</s:else>
    <br>
    <hr>
<!-- メッセージの部分ここまで---------------------------------------------------------- -->


<!-- 以下、画面真ん中に表示するテーブルの部分------------------------------------------ -->

<s:if test="deleteCheck.equals('true')">
	<table>
	    <tr>
	        <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.tour_id"/></th>
	        <td colspan="4"><s:property value ="currentTourId"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.tour_name"/></th>
	        <td><s:property value = "currentTourName"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.price"/></th>
	        <td><s:property value="currentPrice"/><s:text name="lang.kanri_tourHensyuuKakunin.yen"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.departure"/></th>
	        <td><s:property value="currentDeparture"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.region"/></th>
	        <td><s:property value="currentRegion"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.prefectures"/></th>
	        <td><s:property value="currentPrefectures"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.theme"/></th>
	        <td><s:property value="currentTheme"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.comment"/></th>
	        <td width="200px"><font size="2px"><s:property value="currentComment"/></font></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.image_url"/></th>
	        <td><s:property value="currentImg"/></td>
	    </tr>
	</table>
</s:if>

<s:else>
	<table>
	    <tr>
	        <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.tour_id"/></th>
	        <td colspan="4"><s:property value ="currentTourId"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.tour_name"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value = "currentTourName"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "editTourName"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.price"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value="currentPrice"/><s:text name="lang.kanri_tourHensyuuKakunin.yen"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "EditPrice"/><s:text name="lang.kanri_tourHensyuuKakunin.yen"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.persons"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value="currentPersons"/><s:text name="lang.kanri_tourHensyuuKakunin.persons_number"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "editPersons"/><s:text name="lang.kanri_tourHensyuuKakunin.persons_number"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.departure"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value="currentDeparture"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "editDeparture"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.region"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value="currentRegion"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "editRegion"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.prefectures"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value="currentPrefectures"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "editPrefectures"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.theme"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td><s:property value="currentTheme"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td><s:property value = "editTheme"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.comment"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td width="200px"><font size = "2px"><s:property value="currentComment"/></font></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td width="200px"><font size = "2px"><s:property value="editComment"/></font></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.image_url"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td width="200px"><s:property value="currentImg"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td width="200px"><s:property value = "editImg"/></td>
	    </tr>
	    <tr>
	        <th><s:text name="lang.kanri_tourHensyuuKakunin.image_preview"/></th>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.before_edit"/></td>
	        <td width="300px"><img src='<s:property value="currentImg"/>' height="20%" alt="現在の画像"/></td>
	        <td><s:text name="lang.kanri_tourHensyuuKakunin.after_edit"/></td>
	        <td width="300px"><img src='<s:property value = "editImg"/>' height="20%" alt="編集後の画像"/></td>
	    </tr>
	</table>
</s:else>
<!-- テーブル部分ここまで--------------------------------------------------------- -->

<hr>

<!-- 画面下部のメニュー画面------------------------------------------------------- -->
<br>
<!-- 「完了」の項目 ※次のアクション内にある同名の変数に値を渡します。(ツアーIDだけはcurrentId＝「現在のID」そのままです）-->

	<a href=
	    '<s:url action="UpdateTourAction">
		    <s:param name="editTourId" value="currentTourId"/>
		    <s:param name="editTourName" value = "editTourName"/>
		    <s:param name="editPrice" value = "editPrice"/>
		    <s:param name="editPersons" value = "editPersons"/>
		    <s:param name="editDeparture" value = "editDeparture"/>
		    <s:param name="editRegion" value = "editRegion"/>
		    <s:param name="editPrefectures" value="editPrefectures"/>
		    <s:param name="editTheme" value="editTheme"/>
		    <s:param name="editComment" value="editComment"/>
			<s:param name="editImg" value="editImg"/>
		    <s:param name="deleteCheck" value="deleteCheck"/>
	    </s:url>'>
	    <input type="submit" value='<s:text name="lang.kanri_tourHensyuuKakunin.complete"/>'>
    </a>
<br>
<br>

<hr>


<br>
<!-- ↓「入力画面に戻る」の項目部分 ※別のアクションの同名の変数に値を移しています-->
<!-- 入力済みの情報が残るように、EditTourActionにも入力内容を保持する変数を用意します。 -->
   <a href=
	    '<s:url action="GoTourEditPageAction">

	    	<s:param name="from" value="'confirmingPage'"/>

	    	<s:param name="currentTourId" value="currentTourId"/>
		    <s:param name="currentTourName" value = "currentTourName"/>
		    <s:param name="currentPrice" value = "currentPrice"/>
		    <s:param name="currentPersons" value = "currentPersons"/>
		    <s:param name="currentDeparture" value = "currentDeparture"/>
		    <s:param name="currentRegion" value = "currentRegion"/>
		    <s:param name="currentPrefectures" value="currentPrefectures"/>
		    <s:param name="currentTheme" value="currentTheme"/>
		    <s:param name="currentComment" value="currentComment"/>
			<s:param name="currentImg" value="currentImg"/>

		    <s:param name="editTourName" value = "editTourName"/>
		    <s:param name="editPrice" value = "editPrice"/>
		    <s:param name="editPersons" value = "editPersons"/>
		    <s:param name="editDeparture" value = "editDeparture"/>
		    <s:param name="editRegion" value = "editRegion"/>
		    <s:param name="editPrefectures" value="editPrefectures"/>
		    <s:param name="editTheme" value="editTheme"/>
		    <s:param name="editComment" value="editComment"/>
			<s:param name="editImg" value="editImg"/>
	    </s:url>'>
    <s:text name="lang.kanri_tourHensyuuKakunin.return_input_page"/><br>
    </a>
<br>
<br>
<br>

<!-- 「管理トップページに戻る」の項目部分 -->
	<a href='<s:url action="GoManagersTopAction"/>'>
    <s:text name="lang.kanri_tourHensyuuKakunin.return_top"/><br>
	</a>
<br>
<br>
<br>


</body>
</html>