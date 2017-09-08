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
				<table border=1>
					<tr>
						<th>名前</th>
						<td>name</td>
					</tr>
					<tr>
						<th>住所</th>
						<td>address</td>
					</tr>
					<tr>
						<th>メールアドレス</th>
						<td>mail address</td>
					</tr>
					<tr>
						<th>電話番号</th>
						<td>tel number</td>
					</tr>
				</table>
			</div>
		<div class="purchase-history">
	</div>
	</div>

	<!-- footer include -->
	<footer>
		<s:include value="footer.jsp"></s:include>
	</footer>
</body>
</html>