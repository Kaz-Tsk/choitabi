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

<script type="text/javascript">

</script>



</head>


<body>

<div class ="header"><b>お問合せ内容入力</b>_内容確認_送信完了</div>





<s:form action="ComfirmContactAction" method="post">



<h1>お問合せ内容入力</h1>
    <div class = "direction">以下のフォームに入力してください<br></div>



     <tr>
        <th>名前</th>
           <td>
           <s:textfield name = "contact_name" size = "12"></s:textfield>    </td>

    </tr>
    <tr>
        <th>メールアドレス</th><td colspan = "4">
            <s:textfield  name="contact_mailAddress" size = "12"></s:textfield>

        </td>
    </tr>
    <tr>
        <th>お問い合わせ内容</th><td colspan = "4">
        <s:textarea name="contact_contents" rows="10" cols="45"></s:textarea>

    </tr>




   <input type = "submit" value="確認画面へ" ></input>

</s:form>

    2013-12-17

<input type="button" value="トップ画面へ戻る" onClick="location.href='index.jsp'">

<input type="button" value="入力ページに戻る" onClick="location.href='contact_nyuuryoku.jsp'">


<br>
<br>
<br>

</body>


</html>