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
	<title>ツアー追加</title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourTsuika"
 		var="lang" />
	<!-- CSSの読み込み -->
	<link rel="stylesheet" type="text/css" href="./css/kanri_common.css">
</head>

<body>

	<h1>新規ツアー登録　情報入力画面</h1>
	<hr>
    	<s:text name="lang.kanri_tourTsuika.direction"/>
	<br>

<!-- ↓ここ一文エラーメッセージです -->
	<font color="red"><s:property value="errorMsg"/></font>

<!-- ↓ここから編集フォーム（テーブルまるごとと、「確認」ボタンあります） -->
	<form action="ConfirmTourInsertingAction">
	<table>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.tour_id"/>
			</th>
			<td>
				<s:text name="lang.kanri_tourTsuika.direction_for_tour_id"/>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.tour_name"/>
			</th>
			<td>
				<input type="text" size="40" name="newTourName" value='<s:property value="newTourName"/>'></input>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.price"/>
			</th>
			<td>
				<input type="text" size="5" name="newPrice" value='<s:property value="newPrice"/>'></input>
				<s:text name="lang.kanri_tourTsuika.yen"/>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.persons"/>
			</th>
			<td>
				<input type="text" size="5" name="newPersons" value='<s:property value="newPersons"/>'></input>
				<s:text name="lang.kanri_tourTsuika.persons_number"/>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.departure"/>
			</th>
			<td>
				<input type="text" name="newDeparture" value='<s:property value="newDeparture"/>'></input>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.region"/>
			</th>
			<td>
				<input type="text" name="newRegion" value='<s:property value="newRegion"/>'></input>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.prefectures"/>
			</th>
			<td>
				<input type="text" name="newPrefectures" value='<s:property value="newPrefectures"/>'></input>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.theme"/>
			</th>
			<td>
				<input type="text" name="newTheme" value='<s:property value="newTheme"/>'></input>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.comment"/>
			</th>
			<td>
				<textarea rows="10" cols="45"name="newComment"><s:property value="newComment"/></textarea>
			</td>
		</tr>
		<tr>
			<th>
				<s:text name="lang.kanri_tourTsuika.image_url"/>
			</th>
			<td><input type="text" size="40" name="newImg" value='<s:property value="newImg"/>'></input>
				<br>
				<font size="2px"><s:text name="lang.kanri_tourTsuika.direction_for_image_url"/></font>
			</td>
		</tr>
	</table>
	<hr>
	<br>
	<input type="submit" value='<s:text name="lang.kanri_tourTsuika.confirm"/>' class="submit_button"/>
	</form>

<!-- ここまで編集フォーム -->

	<br>
	<hr>
	<br>
<!-- ↓「ツアー一覧に戻る」の項目 -->
	<a href='<s:url action="IndicateTourListAction">
		<s:param name="currentPage" value="1"/>
		</s:url>'>
		<s:text name="lang.kanri_tourTsuika.return_list"/>
	</a>
	<br>
    <br>
    <br>
<!-- ↓「管理ページトップに戻る」の項目 -->
	<a href='<s:url action="GoManagersTopAction"/>'>
		<s:text name="lang.kanri_tourTsuika.return_top"/><br>
	</a>
	<br>
	<br>
	<br>


</body>
</html>