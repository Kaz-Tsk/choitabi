
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="html" uri="/struts-tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>お問合せ内容確認画面</title>
<link rel = "stylesheet" type = "text/css" href = "css/contact_nyuuryoku.css">
<!-- 国際化：言語コード（ja/en）の取得とプロパティファイルの読み込み -->
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.contact_kakunin"
 		var="lang" />

</head>



<body>

    <div class ="header">お問合せ内容入力_<b>内容確認</b>_送信完了</div>


<h1>お問合せ内容確認</h1>
    <div class = "direction">以下の内容で送信します。よろしいですか？<br>(※配色等は仮です)</div>



						<table>

							<tr>
								<td><s:property value="contact_name" /></td>

							</tr>
							<tr>
								<td><s:property value="contact_mailAddress" /></td>
							</tr>
							<tr>
								<td><s:property value="contact_contents" /></td>

							</tr>
						</table>
 <a href='<s:url action="CompleteContactAction">
   	<s:param name="contact_name" value="contact_name"/>
   	<s:param name="contact_mailAddress" value="contact_mailAddress"/>
    <s:param name="contact_contents" value="contact_contents"/>
    </s:url>'>
   送信
    </a>


<input type="button" value="トップ画面へ戻る" onClick="location.href='index.jsp'">

<input type="button" value="入力ページに戻る" onClick="location.href='contact_nyuuryoku.jsp'">



</body>


</html>