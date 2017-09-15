<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

       <head>

                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <link href="css/contactsend.css" rel="stylesheet" type="text/css">

                    <!-- 国際化：言語コード（ja/en）の取得とプロパティファイルの読み込み -->
                    <fmt:setLocale value="${pageContext.request.locale.language}"/>
                    <fmt:setBundle basename="com.internousdev.choitabi.property.contact_send"
                     var="lang" />

       </head>



       <body>

              <%@ include file="header.jsp"%>


              <table>
                      <h1><s:text name = "lang.contact_send.contact_transmission_completion"/></h1>
                      <h2><s:text name = "lang.contact_send.contact_transmission_completion_simasita"/></h2>
                      <h2>お問い合わせいただいた内容につきましては、<br>
                          3営業日以内にご返信させていただきます。</h2>
                      <h2><s:text name = "lang.contact_send.thankyou"/></h2>
              </table>

                       <a href="index.jsp"><s:text name = "lang.contact_send.return_to_top"/></a>


       </body>


</html>