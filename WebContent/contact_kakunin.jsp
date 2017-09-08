<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>お問合せ内容確認画面</title>
<link rel = "stylesheet" type = "text/css" href = "css/contact_nyuuryoku.css">
</head>

<body>

    <div class ="header">お問合せ内容入力_<b>内容確認</b>_送信完了</div>

<s:form action="CompleteContactAction" method="post">


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

  <input type="submit" value="送信" >

</s:form>

<input type="button" value="トップ画面へ戻る" onClick="location.href='index.jsp'">

<input type="button" value="入力ページに戻る" onClick="location.href='contact_nyuuryoku.jsp'">



</body>


</html>