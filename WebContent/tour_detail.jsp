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

<title>chitabi-カート画面</title>

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

<!-- ヘッダーここから -->

	<header>
		<s:include value="header.jsp"></s:include>

	</header>

<!-- ここまで -->

<section class="contents">

<s:iterator value="tourList">
<section class="container">
<div class="detail">
	<div class="photoarea">
		<div class="photo01" style="background-image:url(<s:property value='img' />);"></div>
	</div>

	<div class="textarea">
		<h2><s:property value="tour_name" /></h2>
		<div class="price">￥<script type="text/javascript">decimal_floor(<s:property value="price" />);</script></div>
		<p>
		<s:property value="comment" />
		</p>
		<br>
		<span class="back"><a href="TourListAction" class="backlink"><s:text name="lang.itemdetail.backbutton"/></a></span>
			<span class="cart">
			<a href = "<s:url action='InsertCartAction'><s:param name='tour_id' value='%{tour_id}'/></s:url>" class="cartlink"><s:text name="lang.itemdetail.nextbutton"/></a>
			</span>
	</div>
</div>
</section>
</s:iterator>
</section>

<!-- ------------------------------------- フッターここから -------------------------------------- -->


<footer>
	<s:include value="footerload.jsp" />
</footer>
<!-- ------------------------------------- ヘッダーここまで -------------------------------------- -->


</body>
</html>