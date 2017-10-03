<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.pay_comp"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><s:text name="lang.pay_comp.title" /></title>
<link rel="stylesheet" type="text/css" href="css/pay_comp.css">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
  type="text/javascript"></script>
</head>
<body>
	<script type="text/javascript">
      window.onunload = function() {
      };//Firefoxにも適用する場合には記述する
      history.forward();
    </script>
	<div id="pagecover">
		<header>
			<s:include value="header.jsp"></s:include>
		</header>
		<div class="main">
			<br>
			<h1 class="thankyou">
				<s:text name="lang.pay_comp.text1" />
			</h1>
			<br>
		</div>
		<script type="text/javascript">
          //History API が使えるブラウザかどうかをチェック
          if (window.history && window.history.pushState) {
            //. ブラウザ履歴に１つ追加
            history.pushState("nohb", null, "");
            $(window).on("popstate", function(event) {
              //. このページで「戻る」を実行
              if (!event.originalEvent.state) {
                //. もう一度履歴を操作して終了
                history.pushState("nohb", null, "");
                window.alert("ブラウザバックは無効です。");
                return;
              }
            });
          }
        </script>
	</div>
	<footer style="text-align: center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>
</body>
</html>
