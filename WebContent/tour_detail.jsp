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
<fmt:setBundle basename="com.internousdev.choitabi.property.tour_detail"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>chitabi-ツアー詳細</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap cdn -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- cart.css -->
<link rel="stylesheet" type="text/css" href="css/tour_detail.css">

</head>



<body>

<!-- ヘッダーここから -->

	<header>
		<s:include value="header.jsp" />
	</header>

<div class="center">
<div class="sidebar">
	<s:include value="test_tour.jsp" />
</div>

<!-- ここまで -->

	<div class="contents">

		<div class="subtitle"><s:text name="lang.tour_detail.subtitle" /></div>

		<s:form action="InsertCartAction">
			<s:iterator value="displayList">

						<p class="tour_name">
							<s:property value="tour_name" />
						</p>
						<img src="<s:property value= "img"/>" class= "img">

<table>
  <tr>
    <th>価格</th>
    <td class="tour_price">￥<fmt:formatNumber value="${price}" pattern="###,###,###" />
	<span class="tax"><s:text name="lang.tour_detail.tax"></s:text></span></td>
</tr>
<tr>
<th>出発駅</th>
<td></td>
</tr>
<tr>
<th>場所</th>
<td></td>
</tr>
<tr>
<th><s:text name="lang.tour_detail.comment" /></th>
<td><s:property escape="false" value="comment" /></td></tr>
</table>

					<div id="right-content">

						<div id="item_infomation">

							<p class="tour_detail">
								<s:text name="lang.tour_detail.comment" />
								<!--  国際化対応の”商品詳細”入れ込み -->
							</p>
							<div class="tour_comment" >
								<s:property escape="false" value="comment" />
							</div>
						</div>


							<div class="shopping-cart">

						<input type="hidden" name="tour_id"
							value="<s:property value="tour_id"/>" />


                      <!-- 参加人数 必要か不必要か -->
						<s:text name="lang.tour_detail.persons" />
						<select name="order_count">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
							<option>9</option>
							<option>10</option>
						</select> <input type="submit" class="btn btn-warning"
							value="<s:text name= "lang.tour_detail.cart"/>" />

					</div>


</div>

	</s:iterator>


	</s:form>

    </div>
    </div>



<footer>
	<s:include value="footer.jsp" />
</footer>



</body>
</html>