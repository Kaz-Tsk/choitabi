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
<meta charset="UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.tour_list"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>chitabi-ツアー一覧</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap cdn -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- cart.css -->
<link rel="stylesheet" type="text/css" href="css/tour_list.css">

<!-- 画像を浮かせるcss -->
<link rel="stylesheet" type="text/css" href="css/hover.css" />

</head>



<body>

	<header>
		<s:include value="header.jsp" />
	</header>

	<div class="center">
		<div class="sidebar">
			<s:include value="tour.jsp" />
		</div>


		<div id="contents">


			<div class="subtitle">
				<s:text name="lang.tour_list.cart" />
			</div>

			<div class="display_list">
				<s:iterator value="selectList">
					<div class="template">
						<div class="hvr-float-shadow">
							<div class="tour_img">
								<a
									href="<s:url action="TourDetailAction"><s:param name="tour_id" value="%{tour_id}"/></s:url>"><img
									class="tour_img" src="<s:property value="img"/>" height="250px">
									<s:hidden value="tour_id" /> </a>
							</div>
						</div>
						<div class="tour_name">
							<s:property value="tour_name" />
						</div>
						<div class="tour_price">
							￥
							<fmt:formatNumber value="${price}" pattern="###,###,###" />
						</div>
					</div>
				</s:iterator>
			</div>

		<footer style="padding-top: 110%; text-align: center;">
			<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
		</footer>

		</div>

	</div>




</body>
</html>