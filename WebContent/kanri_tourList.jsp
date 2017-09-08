<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー情報一覧</title>
</head>
<body>
<h1>ツアー情報一覧</h1>
    <hr>
    ツアー名検索<br>
    <s:form action="IndicateTourListAction">
		<s:textfield name="selectWord" property="selectWord"/>
		<s:hidden name="currentPage" value="1"/>
		<s:submit value="検索"/>
	</s:form>
<table border = "1px" cellspacing = "0px" cellpadding = "10px">
	<tr>
		<th>ツアーID</th>
		<th>ツアー名</th>
		<th>価格</th>
		<th>定員</th>
		<th>最終編集日</th>
		<th>出発地</th>
		<th>　　　</th>
	</tr>

	<s:iterator value="currentTourList">
	<tr>
		<td><s:property value="tourId"></s:property></td>
		<td><s:property value="tourName"></s:property></td>
		<td><s:property value="price"></s:property></td>
		<td><s:property value="persons"></s:property></td>
		<td><s:property value="date"></s:property></td>
		<td><s:property value="departure"></s:property></td>
		<td>
			<a href='<s:url action="EditTourAction">
	    	<s:param name="tourId" value = "tourId"/></s:url>'>
  			編集
    		</a>
		</td>
	</tr>
	</s:iterator>
</table>
    <br>
    <a href='<s:url action="GoTourInsertPageAction"></s:url>'>
    ツアーの新規登録を行う
    </a><br>
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

    <s:property value="currentPage"></s:property> / <s:property value="maxPage"></s:property>

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

<!-- ↑「＜＜1/3＞＞」部分ここまで -->

    <br>
    <br>
    管理ページトップに戻る<br>
    <br>
    <br>
    <br>



</body>
</html>