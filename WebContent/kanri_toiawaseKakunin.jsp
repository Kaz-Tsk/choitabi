<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<!doctype html>
<html lang="ja">

<head>

      <meta charset="UTF-8">
      <link rel="stylesheet" type="text/css" href="css/kanri_toiawaseKakunin.css">



      <!-- 国際化：言語コード(ja/en)の取得とプロパティファイルの読み込み -->
	  <fmt:setLocale value="${pageContext.request.locale.language}"/>
	  <fmt:setBundle basename="com.internousdev.choitabi.property.kanri_toiawasekakunin"
 		var="lang" />


</head>


<body>

        <%@ include file="header.jsp"%>


       <div id ="contents">

       <h1>お問合せ確認</h1>




	   <!-- ここからイテレータ開始(検索) -->

		               <form action="KanriContactAction" method="post">

			                <input type="text" name="searchName" id="searchName"
			                       value="<s:property value="searchName"/>" placeholder="お客様名を入れてね">
			                <s:hidden name = "pageNum" value="1"/><!-- 改めて1ページ目だよって検索したあとのページに伝える -->
                            <input type="submit" value=<s:text name = "lang.kanri_toiawaseKakunin.search"/>>

		               </form>



       <!-- 全データ表示、検索結果表示 するところ-->
          <div class ="display">

						<table>
						       <tr>
							       <th><s:text name="lang.kanri_toiawaseKakunin.contact_name"/> </th>
							       <th><s:text name="lang.kanri_toiawaseKakunin.contact_mailaddress"/></th>
							       <th><s:text name="lang.kanri_toiawaseKakunin.contact_contents"/></th>
						       </tr>

						       <s:iterator value="displayList">
						       <tr>
							       <td><s:property value="contact_name" /></td>
							       <td><s:property value="contact_mailAddress" /></td>
							       <td><s:property value="contact_contents" /></td>
						       </tr>
						       </s:iterator>
						</table>



                               <br>
                               <br>
						       現在のページ数…<s:property value="pageNum"/>最大ページ数…<s:property value="maxPage"/>
                               <br>
                               <br>


       <!-- ちなみにs:textname→国際化/s:property→前のページのものを表示/div class→cssでレイアウトを整えるためのクラス -->





<!--＊＊＊ ページネーションの記述始まり＊＊＊ -->
           <div class="pagination">


                <s:if test= "{ pageNum > 0 }">


<!-- 次へを使うページ -->
                      <s:if test = "pageNum == maxPage">
                      </s:if>
                      <s:else>
                      <a href='<s:url action="KanriContactAction">
					  <s:param name="pageNum" value="pageNum+1"/>
					  </s:url>'><s:text name="lang.kanri_toiawaseKakunin.next"/></a>
                      </s:else>

<!-- 前へを使うページ -->

					  <s:if test="pageNum == 1">
                      </s:if>
                      <s:else>
					  <a href='<s:url action="KanriContactAction">
					  <s:param name="pageNum" value="pageNum-1"/>
					  </s:url>'><s:text name="lang.kanri_toiawaseKakunin.back"/></a>
					  </s:else>


                 </s:if>
<!-- ＊＊＊ページネーションの記述終わり＊＊＊ -->


          </div>
          </div>
          </div>

</body>

</html>

