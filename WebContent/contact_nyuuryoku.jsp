<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="html" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang ="ja">

<head>

   <title>お問合せ内容入力画面</title>
   <link rel = "stylesheet" type = "text/css" href = "css/contact_nyuuryoku.css">

   <!-- 国際化：言語コード（ja/en）の取得とプロパティファイルの読み込み -->
   <fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.choitabi.property.contact_nyuuryoku"
 		var="lang" />
</head>





<body>

<div class ="header"><b>お問合せ内容入力</b>_内容確認_送信完了</div>




<!-- ＊＊＊＊＊＊＊＊＊フォームに入力されたものをそのままアクションに渡す＊＊＊ ＊＊＊＊＊＊＊-->>


<s:form action="ComfirmContactAction" method="post">


<h1>お問合せ内容入力</h1>
    <div class = "direction">以下のフォームに入力してください<br></div>


<!-- comfirmContactActionから引っ張ってきたエラーメッセージを表示する文 -->
   <tr><s:property value="errorMessage"/></tr>


<!-- アクションでSUCCESSが出たら、s:textに入力されたものを、そのまま次のs:propertyで表示する -->


     <tr>
        <th>名前</th>
           <td><s:textfield name = "contact_name" size = "12"></s:textfield></td>
     </tr>

     <tr>
        <th>メールアドレス</th>
        <td colspan = "4"><s:textfield  name="contact_mailAddress" size = "12"></s:textfield></td>
     </tr>

     <tr>
        <th>お問い合わせ内容</th><td colspan = "4">
             <s:textarea name="contact_contents" rows="10" cols="45"></s:textarea>
     </tr>




   <center><input type = "submit" value="確認画面へ" ></input></center>

</s:form>


<!-- ＊＊＊＊＊＊＊＊＊＊＊フォーム終わり＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊ -->>

<br>
<br>
<br>


 <center><a href="index.jsp">トップページに戻る</a>
         <a href="./contact_nyuuryoku.jsp">入力ページに戻る</a></center>


<br>
<br>
<br>

</body>


</html>