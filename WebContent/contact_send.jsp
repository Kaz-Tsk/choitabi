<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせ送信完了</title>
 <link rel="stylesheet" type="text/css" href="css/contactsend.css">

<!-- 国際化：言語コード（ja/en）の取得とプロパティファイルの読み込み -->

<fmt:setLocale value="${pageContext.request.locale.language}"/>
<fmt:setBundle basename="com.internousdev.choitabi.property.contact_send"
 var="lang" />

</head>



<body>


<%@ include file="header.jsp"%>



    <div class="end">お問い合わせ送信完了</div>
    <div class="contact">
       <h2>お問い合わせの送信が完了いたしました。</h2>

    <div class="notice">お問い合わせいただいた内容につきましては、<br>
        3営業日以内にご返信させていただきます。</div>

       <h2>ご利用ありがとうございました。</h2>
        </div>


        <a href="index.jsp">トップに戻る</a>


<%@ include file="footer.jsp"%>

</body>
</html>