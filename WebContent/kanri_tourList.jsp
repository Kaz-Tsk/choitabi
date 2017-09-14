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
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ツアー情報一覧</title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourList" var="lang"/>
 	<!-- CSSの読み込み -->
	<link rel="stylesheet" type="text/css" href="./css/kanri_common.css">
</head>

<body>
	<h1>ツアー情報一覧</h1>

<!-- ↓ツアー名検索の部分です -->
    <s:text name="lang.kanri_tourList.search_tour_by_name"/>
    <form action="IndicateTourListAction">
		<input type="text" name="selectWord"/>
		<s:hidden name="currentPage" value="1"/>
		<input type="submit" value="<s:text name='lang.kanri_tourList.search'/>">
	</form>

<!-- ツアーの情報が表示されるテーブルです -->
	<table>
		<tr>
			<th><s:text name="lang.kanri_tourList.tour_id"/></th>
			<th><s:text name="lang.kanri_tourList.tour_name"/></th>
			<th><s:text name="lang.kanri_tourList.price"/></th>
			<th><s:text name="lang.kanri_tourList.region"/></th>
			<th><s:text name="lang.kanri_tourList.theme"/></th>
			<th>　　　</th>
		</tr>
		<s:iterator value="currentTourList">
		<tr>
			<td><s:property value="tourId"></s:property></td>
			<td><s:property value="tourName"></s:property></td>
			<td><s:property value="price"></s:property> 円</td>
			<td><s:property value="region"></s:property></td>
			<td><s:property value="theme"/></td>
			<td>
				<a href='<s:url action="EditTourAction">
				<s:param name="currentTourId" value = "tourId"/></s:url>'>
				<s:text name="lang.kanri_tourList.edit"/>
				</a>
			</td>
		</tr>
		</s:iterator>
	</table>
    <br>

<!-- ↓ページの「＜＜1/3＞＞」の部分です -->

	<s:if test="currentPage != 1">
	    <a href='
		    <s:url action="IndicateTourListAction">
		    		<s:param name="selectWord" value="selectWord"/>
		    		<s:param name="currentPage" value="currentPage-1"/>
		    </s:url>'>
		    ＜＜
		</a>
    </s:if>
    <s:else>
    	＜＜
    </s:else>

    <s:property value="currentPage"/> / <s:property value="maxPage"/>

	<s:if test="currentPage < maxPage">
	    <a href='
		    <s:url action="IndicateTourListAction">
		    		<s:param name="selectWord" value="selectWord"/>
		    		<s:param name="currentPage" value="currentPage+1"/>
		    </s:url>'>
		    ＞＞
	    </a>
    </s:if>
    <s:else>
    	＞＞
    </s:else>

<!-- ↓テーブル下の、ツアー新規登録やトップ画面に戻るといったメニューの部分です。 -->
    <br>
    <br>
    <br>
    <a href='<s:url action="GoTourInsertPageAction"></s:url>'>
    	<s:text name="lang.kanri_tourList.add_new_tour"/>
    </a><br>
    <br>
    <br>
    <s:text name="lang.kanri_tourList.return"/>



</body>
</html>