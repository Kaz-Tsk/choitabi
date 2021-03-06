<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ↓国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ↑国際化 -->
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title><s:text name="lang.kanri_tourTsuikaKakunin.title"/></title>
<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle
	basename="com.internousdev.choitabi.property.kanri_tourTsuikaKakunin"
	var="lang" />
<!-- CSSの読み込み -->
<link rel="stylesheet" type="text/css" href="./css/kanri_common.css">


</head>

<header>
	<jsp:include page="header.jsp" />
</header>

<body>
	<div class="editArea">
		<h1>
			<s:text name="lang.kanri_tourTsuikaKakunin.title" />
		</h1>
		<s:text name="lang.kanri_tourTsuikaKakunin.direction" />
		<hr>
		<table style="word-break: break-all">
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.tour_id" /></th>
				<td><s:text
						name="lang.kanri_tourTsuikaKakunin.direction_for_tour_id" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.tour_name" /></th>
				<td><s:property value="newTourName" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.price" /></th>
				<td><fmt:formatNumber value="${newPrice}" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.departure" /></th>
				<td><s:property value="newDeparture" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.region" /></th>
				<td><s:property value="newRegion" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.prefectures" />
				</th>
				<td><s:property value="newPrefectures" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.theme" /></th>
				<td><s:property value="newTheme" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.comment" /></th>
				<td width="200px"><font size="2px"> <s:property
							value="newComment" /></font></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.image_url" /></th>
				<td><s:property value="NewFileFileName" /></td>
			</tr>
			<tr>
				<th><s:text name="lang.kanri_tourTsuikaKakunin.image_preview" />
				</th>
				<td><img src='<s:property value="newFileFileName"/>'
					height="20%" alt="ツアー画像" /></td>
			</tr>
		</table>
		<br>
		<hr>
		<br>
		<!-- ↓「完了」の項目…JSPを通して、別のアクションにある同名の変数に値を渡しています -->
		<a
			href='<s:url action="InsertTourAction">
		    <s:param name="newTourName" value = "newTourName"/>
		    <s:param name="newPrice" value="newPrice"/>
		    <s:param name="newDeparture" value="newDeparture"/>
		    <s:param name="newRegion" value="newRegion"/>
		    <s:param name="newPrefectures" value="newPrefectures"/>
		    <s:param name="newTheme" value="newTheme"/>
		    <s:param name="newComment" value="newComment"/>

			<s:param name="newFileFileName" value="newFileFileName"/>
	    </s:url>'>
			<input type="submit"
			value='<s:text name="lang.kanri_tourTsuikaKakunin.complete" />'
			onSubmit="return double()" /><br>
		</a> <br> <br>
		<!-- ↓「入力画面に戻る」の項目 ※別のアクションの同名の変数に値を移しています-->
		<!-- 入力済みの情報が残るように、GoTourInsertPageActionにも「new」変数を用意します。 -->
		<a
			href='<s:url action="GoTourInsertPageAction">
		    <s:param name="newTourId" value="newTourId"/>
		    <s:param name="newTourName" value="newTourName"/>
		    <s:param name="newPrice" value="newPrice"/>
		    <s:param name="newDeparture" value="newDeparture"/>
		    <s:param name="newRegion" value="newRegion"/>
		    <s:param name="newPrefectures" value="newPrefectures"/>
		    <s:param name="newTheme" value="newTheme"/>
		    <s:param name="newComment" value="newComment"/>
			<s:param name="newImg" value="newImg"/>
	    </s:url>'>
			<input type="submit"
			value='<s:text name="lang.kanri_tourTsuikaKakunin.return" />'
			onSubmit="return double()" /><br>
		</a>
		<br>
		<br>
		<hr>
		<br>
		<br>
		<!-- 「ツアー一覧に戻る」の部分 -->
		<a
			href='<s:url action="IndicateTourListAction">
    	<s:param name="currentPage" value="1"/></s:url>'>
			<s:text name="lang.kanri_tourHensyuu.return_list" />
		</a>
		<br>
		<br>
		<!-- ↓「管理トップページに戻る」の項目 -->
		<a href='<s:url action="GoManagersTopAction"/>'> <s:text
				name="lang.kanri_tourTsuikaKakunin.return_top" />
		</a>
		<br>
		<br>
		<br>
	</div>


</body>
</html>