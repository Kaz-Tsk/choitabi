<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- と宣言することで、JSPファイルとして機能させることが出来る -->
<!-- (<%%>を使うとJSPファイルの中でJava言語を使ってプログラムを書くことが出来る) -->

<!-- 国際化 -->
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.cart"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>ツアーリスト（仮）</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap cdn -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- cart.css -->
<link rel="stylesheet" type="text/css" href="css/cart.css">

</head>


<body>

<!-- ------------------------------------- ヘッダーここから -------------------------------------- -->

<header>
	<s:include value="header.jsp"/>
</header>


<section class = "contents">
<section class="guide">
	<h1><s:text name="lang.itemlist.title"/></h1>
	<p><s:text name="lang.itemlist.toptext"/></p>
</section>
<section class="tourList">

	<s:iterator value="tourList">
		<div class='tourContents'>
		<a href = "<s:url action='TourListAction'><s:param name='tour_id' value='%{tour_id}'/></s:url>">
		<div class="photo" style="background-image:url(<s:property value="img"/>);"></div>
		<div class="tourText">
			<h2><s:property value="tour_name"/></h2>
			<p><s:property value="comment"/></p>
		<div class='priceText'>\<script type="text/javascript">decimal_floor(<s:property value="price"/>);</script></div>
		</div>
		</a>
		</div>

	</s:iterator>
	</section>

<!-- ページネーションここから -->

<!-- リストにデータが入っている時-->
<s:if test="number > 0">

<div class="center" style="text-align:center;">
						<!-- ページネーション:1ページ目のみ -->
						<s:if test="pageNum == 1">
						</s:if>

						<!-- ページネーション:1ページ目以外 -->
						<s:else>
							<a class="pagesw" href='<s:url action="TourListAction">
							<s:param name="pageNum" value="pageNum-1"/>
							</s:url>'>＜</a>

						</s:else>

                        <s:property value="pageNum" />


						<!-- ページネーション:最終ページ -->
						<s:if test="pageNum == maxPage">
						</s:if>


						<!-- 最終ページ以外 -->
						<s:else>
							<a class="pagesw" href='<s:url action="TourListAction">
							<s:param name="pageNum" value="pageNum+1"/>
							</s:url>'>＞</a>

						</s:else>


				</div>
		</s:if>
<!-- ページネーションここまで -->
</section>
</body>
</html>