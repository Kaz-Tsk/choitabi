<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="html" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang ="ja">


   <head>

     <title><s:text name = "lang.contact_nyuuryoku.Content_of_inquiry_input"/></title>
     <link href ="css/contact_nyuuryoku.css"  rel = "stylesheet" type = "text/css">

     <!-- 国際化：言語コード（ja/en）の取得とプロパティファイルの読み込み -->

     <fmt:setLocale value="${pageContext.request.locale.language}"/>
	 <fmt:setBundle basename="com.internousdev.choitabi.property.contact_nyuuryoku"
 		var="lang" />

    </head>





    <body>

           <%@ include file="header.jsp"%>



<!-- ＊＊＊＊＊＊＊ｓ：フォームに入力されたものをSUBMIT（送信）すると入力されたものまるごとアクションに渡せる＊＊＊＊＊＊-->

                   <s:form action="ComfirmContactAction" method="post">


                           <h1><s:text name = "lang.contact_nyuuryoku.Content_of_inquiry_input"/></h1>
                           <div class = "direction"><s:text name = "lang.contact_nyuuryoku.please_input_contents"/><br></div>


     <!-- 渡ったアクションでERRORがでたらアクションから引っ張ってきたエラーメッセージを表示する文 -->
                           <div class="error"><s:property value="errorMessage"/></div>


     <!-- 渡ったアクションでSUCCESSが出たら、s:textfield/areaに入力されたものを、そのまま次のページのs:propertyで表示する -->



                           <tr>
                               <th><s:text name = "lang.contact_nyuuryoku.contact_name"/></th>
                               <td><s:textfield name = "contact_name" size = "12"/></td>
                           </tr>

                           <tr>
                               <th><s:text name = "lang.contact_nyuuryoku.contact_mailaddress"/></th><td colspan = "4">
                               <s:textfield  name="contact_mailAddress" size = "12"/></td>
                           </tr>

                           <tr>
                           <th><s:text name = "lang.contact_nyuuryoku.contact_contents"/></th><td colspan = "4">
                           <s:textarea name="contact_contents" rows="10" cols="45"/>
                           </tr>

                           <br>
                           <br>


                           <center>
                                   <input type = "submit" value="<s:text name = "lang.contact_nyuuryoku.next_to_confirmation"/>" ></input>
                           </center>

                   </s:form>


<!-- ＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊フォーム終わり＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊ -->

                             <br>
                             <br>
                             <br>


                            <center>
                                    <a href="index.jsp"><s:text name = "lang.contact_nyuuryoku.return_to_top"/></a>
                            </center>


    </body>


</html>