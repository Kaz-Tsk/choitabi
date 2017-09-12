<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- ここから国際化 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- ここまで国際化 -->

<jsp:useBean id= "registrationDate" class="java.util.Date"/>

<!DOCTYPE html>
<html>
<head>

<!-- ここから国際化 -->
<fmt:setLocale value="${pageContext.request.locale.language}"/>
<fmt:setBundle basename="com.internousdev.choitabi.property.kanri_history" var="lang"/>
<!-- ここまで国際化 -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/kanri_history.css">
<link href="css/font-awesome.min.css" rel="stylesheet" type='text/css'>

<title>ちょいたび || 管理画面</title>

</head>

<body>

<header>choitabi</header>

	<div id="contents">
		<h3><s:text name="lang.kanri_history.orderSearch"/></h3>
		<div class="toursearch">
			<s:form action="KanriHistoryAction" method="post">
				<p>
					<s:text name="lang.kanri_history.tour_name"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="tour_name">
					<input type="submit" id="submit" value="&#xf002; <s:text name="lang.kanri_history.search"/>">
				</p>
			</s:form>
		</div>

		<div class="tourdisplay">
			<table>
				<tr>
					<th class="notwide"><s:text name="lang.kanri_history.userID"/></th>
					<th><s:text name="lang.kanri_history.user_name"/></th>
					<th class="notwide"><s:text name="lang.kanri_history.tourID"/></th>
					<th><s:text name="lang.kanri_history.tour_name"/></th>
					<th class="notwide"><s:text name="lang.kanri_history.order_count"/></th>
					<th><s:text name="lang.kanri_history.total_price"/></th>
					<th><s:text name="lang.kanri_history.registration_date"/></th>
				</tr>
				<s:iterator value="displayList">
					<tr>
						<td class="notwide"><s:property value="user_id"/></td>
						<td><s:property value="family_name_kanji"/>&nbsp;<s:property value="given_name_kanji"/></td>
						<td class="notwide"><s:property value="tour_id"/></td>
						<td><s:property value="tour_name"/></td>
						<td class="notwide"><s:property value="order_count"/></td>
						<td><fmt:formatNumber value="${total_price}" pattern="###,###,###" /></td>
						<td><fmt:formatDate value="${registration_date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					</tr>
				</s:iterator>
			</table>

			<s:if test="number > 0">

				<div class="center" style="text-align:center;">
					<!-- ページネーション:1ページ目のみ -->
					<s:if test="pageNum == 1">
						<span>&laquo;<s:text name="戻る" /></span>
					</s:if>


					<!-- ページネーション:1ページ目以外 -->
					<s:else>
						<a href='<s:url action="KanriHistoryAction">
							<s:param name="pageNum" value="pageNum-1"/></s:url>'>&laquo;
							<s:text name="戻る" />
						</a>
					</s:else>
					<s:property value="pageNum" />


					<!-- ページネーション:最終ページ -->
					<s:if test="pageNum == maxPage">
						<s:text name="進む" />&raquo;
					</s:if>


					<!-- 最終ページ以外 -->
					<s:else>
						<a href='<s:url action="KanriHistoryAction">
							<s:param name="pageNum" value="pageNum+1"/></s:url>'><s:text name="進む" />&raquo;
						</a>
					</s:else>
				</div>
			</s:if>
		</div>
	</div>

	<footer>AllRight.</footer>
</body>
</html>