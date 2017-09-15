<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8>
<title>購入履歴</title>
</head>
<body>
<!-- header部分 -->
<header><s:include value="header.jsp"/></header>

<!-- body部分 -->
<div class = "container">
	<h1>購入履歴</h1>
	<table class = "history-table">
		<tr>
			<th>
				ツアー名
			</th>
			<th>
				価格
			</th>
		    <th>
				合計金額
		   </th>
		    <th>
				人数
			</th>
		    <th>
		    	 購入日
		    </th>
	    </tr>

	    <s:if test= "#session.userFlg==1 || #session.userFlg == 2">
	    	<s:iterator value="UserPurchaseHistoryList">

	    		<tr>
	    			<td><s:property value="tourName"/></td>
	    			<td><s:property value="Math.floor(price)"/></td>
	    			<td><s:property value="couts"/></td>
	    			<td><s:property value="Math.floor(subtotal)"/></td>
	    			<td><s:property value="registrationAt"/></td>
	    		</tr>
	    	</s:iterator>
	    </s:if>

	    <s:else>
	    	<div class="error-message">
	    	<h1>購入履歴はありません</h1>
	    	</div>
	    </s:else>
     </table>
</div>




<!-- footer部分 -->
<footer><s:include value="footer.jsp"/></footer>
</body>
</html>