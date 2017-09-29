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
	<title><s:text name="lang.kanri_tourList.title"/></title>
	<!-- 国際化：ロケールIDの取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_tourList"
 		var="lang" />
 	<!-- CSSの読み込み -->
	<link rel="stylesheet" type="text/css" href="./css/kanri_common.css">
</head>

<header>
        <jsp:include page="header.jsp"/>
</header>

<body>
	<h1><s:text name="lang.kanri_tourList.title"/></h1>
<br>
<!-- ↓ツアー名検索の部分です -->
    ---------------<s:text name="lang.kanri_tourList.search_tour_by_name"/>---------------
    <form action="IndicateTourListAction" method="post">
		<input type="text" name="selectWord"/>
		<s:hidden name="currentPage" value="1"/>
		<input type="submit" value='<s:text name="lang.kanri_tourList.search"/>'>
	</form>
	<!-- テーマで探す -->
	---------------<s:text name="lang.kanri_tourList.search_tour_by_theme"/>---------------<br>
	<!-- すべて -->
	<a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="''"/>
    <s:param name="selectRegion" value="''" />
    </s:url>'>
    <s:text name="lang.kanri_tourList.all"/>
    </a>
	・
	<!-- グルメ -->
	<a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="'グルメ'"/>
    <s:param name="selectRegion" value="''" />
    </s:url>'>
    <s:text name="lang.kanri_tourList.gourmet"/>
    </a>
    ・
    <!-- 名所 -->
	<a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="'名所'"/>
    <s:param name="selectRegion" value="''" />
    </s:url>'>
    <s:text name="lang.kanri_tourList.place"/>
    </a>
    ・
    <!-- アクティビティ -->
    <a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="'アクティビティ'"/>
    <s:param name="selectRegion" value="''" />
    </s:url>'>
    <s:text name="lang.kanri_tourList.activity"/>
    </a>
    <br>
    <!-- エリアで探す -->
    ---------------<s:text name="lang.kanri_tourList.search_tour_by_region"/>---------------<br>
    <!-- すべて -->
	<a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="''"/>
    <s:param name="selectRegion" value="''" />
    </s:url>'>
    <s:text name="lang.kanri_tourList.all"/>
    </a>
	・
	<!-- 東北 -->
	<a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="''"/>
     <s:param name="selectRegion" value="'東北'"/>
    </s:url>'>
    <s:text name="lang.kanri_tourList.tohoku"/>
    </a>
    ・
    <!-- 関東 -->
	<a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="''"/>
    <s:param name="selectRegion" value="'関東'"/>
    </s:url>'>
    <s:text name="lang.kanri_tourList.kanto"/>
    </a>
    ・
    <!-- 関西 -->
    <a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="''"/>
    <s:param name="selectRegion" value="'関西'"/>
    </s:url>'>
    <s:text name="lang.kanri_tourList.kansai"/>
    </a>
    ・
    <!-- 九州 -->
    <a href='<s:url action="IndicateTourListAction">
    <s:param name="currentPage" value="1"/>
    <s:param name="selectTheme" value="''"/>
    <s:param name="selectRegion" value="'九州'"/>
    </s:url>'>
    <s:text name="lang.kanri_tourList.kyushu"/>
    </a>
    <br>


<!-- ツアーの情報が表示されるテーブルです -->
	<table>
		<tr>
			<th><s:text name="lang.kanri_tourList.tour_id"/></th>
			<th width="300px"><s:text name="lang.kanri_tourList.tour_name"/></th>
			<th width="80px"><s:text name="lang.kanri_tourList.price"/></th>
			<th><s:text name="lang.kanri_tourList.region"/></th>
			<th width="140px"><s:text name="lang.kanri_tourList.theme"/></th>
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
				<a href='
					<s:url action="GoTourEditPageAction">
						<s:param name="currentTourId" value ="tourId"/>
						<s:param name="from" value="'tourListPage'"/>
					</s:url>'>
					<input type="submit" value='<s:text name="lang.kanri_tourList.edit"/>'>
				</a>
			</td>
		</tr>
		</s:iterator>
	</table>

<!-- ↓ページの「＜＜2/3＞＞」の部分です -->

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
    	　　
    </s:else>

<!-- ここから、テーブル下の、ツアー新規登録やトップ画面に戻るといったメニューの部分です。 -->
    <br>
    <br>
    <br>
<!-- 「ツアーの新規登録」の項目の部分 -->
    <a href='<s:url action="GoTourInsertPageAction"/>'>
    	<s:text name="lang.kanri_tourList.add_new_tour"/>
    </a>
    <br>
    <br>
    <br>
<!-- 「管理ページトップに戻る」の項目の部分 -->
	<a href='<s:url action="GoManagersTopAction"/>'>
		<s:text name="lang.kanri_tourList.return_top"/>
	</a>
	<br>
	<br>
	<br>


</body>
</html>