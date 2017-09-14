<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mypage</title>
</head>
<body>
<!-- header include -->
	<s:include value="header.jsp"></s:include>

	<!-- main部分 -->
	<div class="mypage-container">
		<h2>登録者情報</h2>
			<div class="admin-param">
				<s:action var="select" name="MypageAction"/>
				<s:iterator value="#select.User">
				<table border=1>
					<tr>
						<th>名前</th>
						<td><s:property value="familyNameKanji"/><s:property value="givenNameKanji"/></td>
					</tr>
					<tr>
						<th>住所</th>
						<td><s:property value="address"/></td>
					</tr>
					<tr>
						<th>メールアドレス</th>
						<td><s:property value="mailAddress"/></td>
					</tr>
					<tr>
						<th>電話番号</th>
						<td><s:property value="telNumber"/></td>
					</tr>
				</table>
				</s:iterator>
			</div>
		<div class="purchase-history">
		<button>購入履歴</button>
	</div>
	</div>

	<!-- footer include -->
	<footer style= margin-top:350px>
		<s:include value="footer.jsp"></s:include>
	</footer>
</body>
</html>