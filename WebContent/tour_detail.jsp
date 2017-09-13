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

	<div class="contents">

		<s:form action="InsertCartAction">
			<s:iterator value="displayList">

				<div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<div id="left_content">
						<p class="tour_name">
							<s:property value="tour_name" />
						</p>
						<img src="<s:property value= "img"/>" class= "img-responsive center-block">

						<p class="price">
							￥
							<fmt:formatNumber value="${price}" pattern="###,###,###" />
							<span class="tax"><s:text name="lang.itemdetail.tax"></s:text></span>
						</p>
					</div>
					</div>

                   <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<div id="right-content">

						<div id="item_infomation">

							<p class="item_detail">
								<s:text name="lang.itemdetail.item_detail" />
								<!--  国際化対応の”商品詳細”入れ込み -->
							</p>
							<div class="item_comment" >
								<s:property escape="false" value="comment" />
							</div>
						</div>


							<div class="shopping-cart">

						<input type="hidden" name="tour_id"
							value="<s:property value="tour_id"/>" />

						<s:text name="lang.itemdetail.quantities" />
						<select name="persons">
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
							value="<s:text name= "lang.itemdetail.gocart"/>" />

					</div>


               </div>
	     </div>
	</div>

	</s:iterator>


	</s:form>

    </div>

<!-- ------------------------------------- フッターここから -------------------------------------- -->


<footer>
	<s:include value="footerload.jsp" />
</footer>
<!-- ------------------------------------- ヘッダーここまで -------------------------------------- -->


</body>
</html>