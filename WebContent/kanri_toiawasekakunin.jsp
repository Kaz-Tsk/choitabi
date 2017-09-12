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
</head>
<body>

<h1>
    お問合せ確認</h1>




			<!-- お問い合わせ内容を表示するテーブル -->
<div class="itemdisplay">
							<th style="width: 10px;"></th>
							<th style="width: 10px;"></th>
							<th style="width: 80px;"></th>
            <!-- ここに国際化の記述 -->>

						<!-- ここからイテレータ開始 -->

		<form action="KanriContactAction" method="post">

			 <input type="text" name="searchName" id="searchName" value="<s:property value="searchName"/>">
			 <s:hidden name = "pageNum" value="1"/>
             <input type="submit" value="検索" >
		</form>

		</div>




						<table>
						<tr>
							<th>お客様氏名 | </th>
							<th>メールアドレス | </th>
							<th>お問い合わせ内容 | </th>
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


<!-- 次へを使うページ -->>
                    <s:if test = "pageNum == maxPage">
                    </s:if>
                    <s:else>
                    <a href='<s:url action="KanriContactAction">
					<s:param name="pageNum" value="pageNum+1"/>
					</s:url>'>次へ</a>
                    </s:else>

<!-- 前へを使うページ -->>

					<s:if test="pageNum == 1">
                    </s:if>
                    <s:else>
					<a href='<s:url action="KanriContactAction">
					<s:param name="pageNum" value="pageNum-1"/>
					</s:url>'>前へ</a>
					</s:else>




</s:if>
<!-- ＊＊＊ページネーションの記述終わり＊＊＊ -->>












</div>















</body>
</html>