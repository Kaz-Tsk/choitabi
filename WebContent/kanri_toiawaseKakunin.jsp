<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!doctype html>
<html lang="ja">

<head>

  <meta charset="UTF-8">
  <link rel="stylesheet"type="text/css"href="./css/kanri_toiawasekakunin.css">


<!-- 国際化：言語コード(ja/en)の取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_toiawaseKakunin"
 		var="lang" />


</head>


<body>

<h1>お問合せ確認</h1>




			<!-- お問い合わせ内容を表示するテーブル -->
<div class="itemdisplay">
							<th style="width: 10px;"></th>
							<th style="width: 10px;"></th>
							<th style="width: 80px;"></th>


						<!-- ここからイテレータ開始 -->

		<form action="KanriContactAction" method="post">

			 <input type="text" name="searchName" id="searchName" value="<s:property value="searchName"/>">
			 <s:hidden name = "pageNum" value="1"/>
             <input type="submit" value=<s:text name = "lang.struts.search"/>>

		</form>

</div>




						<table>
						<tr>
							<th><s:text name="lang.struts.contact_name"/> | </th>
							<th><s:text name="lang.struts.contact_mailAddress"/> | </th>
							<th><s:text name="lang.struts.contact_contents"/> | </th>
						</tr>
						<s:iterator value="displayList">
						<tr>
							<td class="text-center"><s:property value="contact_name" /></td>
							<td class="text-center"><s:property value="contact_mailAddress" /></td>
							<td class="text-center"><s:property value="contact_contents" /></td>
						</tr>
						</s:iterator>
						</table>
						現在のページ数…<s:property value="pageNum"/><br>
						最大ページ数…<s:property value="maxPage"/>



<!--＊＊＊ ページネーションの記述始まり＊＊＊ -->>

<s:if test= "{ pageNum > 0 }">


<!-- 次へを使うページ -->
                    <s:if test = "pageNum == maxPage">
                    </s:if>
                    <s:else>
                    <a href='<s:url action="KanriContactAction">
					<s:param name="pageNum" value="pageNum+1"/>
					</s:url>'><s:text name="lang.struts.next"/></a>
                    </s:else>

<!-- 前へを使うページ -->

					<s:if test="pageNum == 1">
                    </s:if>
                    <s:else>
					<a href='<s:url action="KanriContactAction">
					<s:param name="pageNum" value="pageNum-1"/>
					</s:url>'><s:text name="lang.struts.back"/></a>
					</s:else>


</s:if>
<!-- ＊＊＊ページネーションの記述終わり＊＊＊ -->






</body>
</html>

