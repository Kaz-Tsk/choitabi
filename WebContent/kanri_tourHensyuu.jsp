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
	<title>ツアー編集</title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourHensyuu"
 		var="lang" />
	<link rel="stylesheet" type="text/css" href="./css/kanri_common.css">
</head>

<header>
        <jsp:include page="header.jsp"/>
</header>

<body>

<h1>ツアー情報編集</h1>
<hr>
	<s:text name="lang.kanri_tourHensyuu.direction"/><br>

<font color="red"><s:property value="errorMsg"/></font>

<!-- ↓ここから編集フォーム（テーブルまるごとと、チェックボックス、「確認」ボタンあります） -->
<form action="ConfirmTourEditingAction" method="post" enctype="multipart/form-data" >
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
   		<td><input type="text" name="editTourName" value='<s:property value="defaultTourName"/>'></input></td>
   </tr>

      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.price"/></th>
   		<td><s:property value="currentPrice"/><s:text name="lang.kanri_tourHensyuu.yen"/></td>
   		<td><input type="text" size="5" name="editPrice" value='<s:property value="defaultPrice"/>'></input>
   			<s:text name="lang.kanri_tourHensyuu.yen"/></td>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.departure"/></th><td>
   		<s:property value="currentDeparture"/></td>
   		<td><input type="text" name="editDeparture" value='<s:property value = "defaultDeparture"/>'></input></td>
   </tr>
   <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.region"/></th>
   		<td><s:property value="currentRegion"/></td>
   						<td><s:if test='defaultRegion == null'>
						<label><input type="radio" name="editRegion" value="東北" />東北</label>
						<label><input type="radio" name="editRegion" value="関東" />関東</label>
						<label><input type="radio" name="editRegion" value="関西" />関西</label>
						<label><input type="radio" name="editRegion" value="九州" />九州</label>
					</s:if>
					<s:else>
						<s:if test='defaultRegion.equals("東北")'>
							<label><input type="radio" name="editRegion" value="東北" checked/>東北</label>
							<label><input type="radio" name="editRegion" value="関東" />関東</label>
							<label><input type="radio" name="editRegion" value="関西" />関西</label>
							<label><input type="radio" name="editRegion" value="九州" />九州</label>
						</s:if>
						<s:if test='defaultRegion.equals("関東")'>
							<label><input type="radio" name="editRegion" value="東北" />東北</label>
							<label><input type="radio" name="editRegion" value="関東" checked/>関東</label>
							<label><input type="radio" name="editRegion" value="関西" />関西</label>
							<label><input type="radio" name="editRegion" value="九州" />九州</label>
						</s:if>
						<s:if test='defaultRegion.equals("関西")'>
							<label><input type="radio" name="editRegion" value="東北" />東北</label>
							<label><input type="radio" name="editRegion" value="関東" />関東</label>
							<label><input type="radio" name="editRegion" value="関西" checked/>関西</label>
							<label><input type="radio" name="editRegion" value="九州" />九州</label>
						</s:if>
						<s:if test='defaultRegion.equals("九州")'>
							<label><input type="radio" name="editRegion" value="東北" />東北</label>
							<label><input type="radio" name="editRegion" value="関東" />関東</label>
							<label><input type="radio" name="editRegion" value="関西" />関西</label>
							<label><input type="radio" name="editRegion" value="九州" checked/>九州</label>
						</s:if>
					</s:else></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.prefectures"/></th>
   		<td><s:property value="currentPrefectures"/></td>
   		<td><input type="text" name="editPrefectures" value='<s:property value="defaultPrefectures"/>'></input></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.theme"/></th>
   		<td><s:property value="currentTheme"/>
   		</td>
   		<td>
			<s:if test='defaultTheme.equals("グルメ")'>
				<label><input type="radio" name="editTheme" value="グルメ" checked/>グルメ</label>
				<label><input type="radio" name="editTheme" value="名所"/>名所</label>
				<label><input type="radio" name="editTheme" value="アクティビティ"/>アクティビティ</label>
   			</s:if>
			<s:if test='defaultTheme.equals("名所")'>
				<label><input type="radio" name="editTheme" value="グルメ"/>グルメ</label>
				<label><input type="radio" name="editTheme" value="名所" checked/>名所</label>
				<label><input type="radio" name="editTheme" value="アクティビティ"/>アクティビティ</label>
			</s:if>
			<s:if test='defaultTheme.equals("アクティビティ")'>
				<label><input type="radio" name="editTheme" value="グルメ"/>グルメ</label>
				<label><input type="radio" name="editTheme" value="名所"/>名所</label>
				<label><input type="radio" name="editTheme" value="アクティビティ" checked/>アクティビティ</label>
   			</s:if>

   		</td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.comment"/></th>
   		<td width="200px"><font size="2px"><s:property value="currentComment"/></font></td>
   		<td><textarea rows="10" cols="30"name="editComment"><s:property value = "defaultComment"/></textarea></td>
   </tr>
      <tr>
   		<th><s:text name="lang.kanri_tourHensyuu.image_url"/></th>
   		<td><s:property value="currentImg"/></td>
   		<td><input type="file" name="editFile" accept="imag/*">
   		    <br><font size="2px"><s:text name="lang.kanri_tourHensyuu.direction_for_image_url"/></font></td>
   </tr>
</table>
<hr>
<!-- 「このツアーを削除する」のチェックボックス部分 -->
<label>
	<input type="checkbox" name="deleteCheck" value="true">
		<font color = "red"><s:text name="lang.kanri_tourHensyuu.delete"/></font>
</label>
<hr>
<br>
<!-- ↓編集前の情報を、次のアクションにある同名の変数に、一緒に持っていきます -->
	   	<s:hidden name= "currentTourId" property = "currentTourId"/>
	   	<s:hidden name = "currentTourName" property="currentTourName" />
	   	<s:hidden name = "currentPrice" property="currentPrice" />
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
    <!-- 「ツアー一覧に戻る」の部分 -->
    <a href='<s:url action="IndicateTourListAction">
    	<s:param name="currentPage" value="1"/></s:url>'>
    	<s:text name="lang.kanri_tourHensyuu.return_list"/>
    </a>
	<br>
	<br>
    <br>
    <!-- 「管理トップページに戻る」の部分 -->
    <a href='<s:url action="GoManagersTopAction"/>'>
    <s:text name="lang.kanri_tourHensyuu.return_top"/>
    </a>
    <br>
    <br>
	<br>



</body>
</html>