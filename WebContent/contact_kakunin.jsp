
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
             <title><s:text name = "lang.contact_kakunin.inquiry_confirmation"/></title>
             <link rel = "stylesheet" type = "text/css" href = "css/contact_nyuuryoku.css">

             <!-- 国際化：言語コード（ja/en）の取得とプロパティファイルの読み込み -->

	         <fmt:setLocale value="${pageContext.request.locale.language}"/>
	         <fmt:setBundle basename="com.internousdev.choitabi.property.contact_kakunin"
 		      var="lang" />
       </head>



       <body>


             <%@ include file="header.jsp"%>

             <h1><s:text name = "lang.contact_kakunin.inquiry_confirmation"/></h1>
             <div class = "direction"><s:text name = "lang.contact_kakunin.may_i_send_content"/></div>


             <!-- 【表示】入力フォームで入力されたもの(s:textfield/area)を、s:propertyでそのまま表示（表示するだけ） -->
			        <table>

							<tr>
							    <th><s:text name = "lang.contact_kakunin.contact_name"/></th>
								<td><s:property value="contact_name" /></td>
                            </tr>

							<tr>
							    <th><s:text name = "lang.contact_kakunin.contact_mailAddress"/></th>
								<td><s:property value="contact_mailAddress" /></td>
							</tr>

							<tr>
							    <th><s:text name = "lang.contact_kakunin.contact_contents"/></th>
								<td><s:property value="contact_contents" /></td>
                            </tr>

					</table>


                    <br>
                    <br>


<!-- 【隠し】入力jspで入力されたもの(s:textfield/area使用)を、s:paramでデータもってきて、送信ボタンを押すとアクションに渡される -->

                    <center>
                            <a href='<s:url action="CompleteContactAction">
                                     <s:param name="contact_name" value="contact_name"/>
   	                                 <s:param name="contact_mailAddress" value="contact_mailAddress"/>
                                     <s:param name="contact_contents" value="contact_contents"/>
                                     </s:url>'>
                                     <s:text name = "lang.contact_kakunin.submit"/>
                            </a>
                    </center>

<!--【隠し】s:paramで持ってきた、入力jspで入力されたもの(s:textfield/area使用)を、戻るボタンで戻った時にそのまま表示する(情報保持) -->

                     <center>
                             <a href='<s:url action="FirstContactAction">
                                      <s:param name="contact_name" value="contact_name"/>
   	                                  <s:param name="contact_mailAddress" value="contact_mailAddress"/>
                                      <s:param name="contact_contents" value="contact_contents"/>
                                      </s:url>'>
                                      <s:text name = "lang.contact_kakunin.return_to_input"/>
                             </a>
                     </center>


                     <center>
                              <a href="MainTopAction"><s:text name = "lang.contact_kakunin.return_to_top"/></a>
                     </center>

      </body>


</html>