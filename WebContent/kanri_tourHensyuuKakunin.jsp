<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー編集内容確認</title>
</head>
<body>

<h1>ツアー情報編集 内容確認</h1>
<hr>

<!-- 画面上部に表示するメッセージの部分------------------------------------------------ -->
<s:if test="deleteCheck.equals('true')">
   <font color = "red">ツアーの削除を行います。よろしいですか？</font>
</s:if>
<s:else>
    以下の内容でツアーを編集します。よろしいですか？
</s:else>
    <br>
    <hr>
<!-- メッセージの部分ここまで---------------------------------------------------------- -->


<!-- 以下、画面真ん中に表示するテーブルの部分------------------------------------------ -->

<s:if test="deleteCheck.equals('true')">
削除するツアー
	<table border = "1px" cellspacing = "0px" cellpadding = "10px">
	    <tr>
	        <tr>
	        <th>ツアーID</th><td colspan="4"><s:property value ="tourId"/></td>
	    </tr>
	    <tr>
	        <th>ツアー名</th>
	        <td><s:property value = "tourName"/></td>
	    </tr>
	    <tr>
	        <th>価格</th>
	        <td><s:property value="price"/></td>
	    </tr>
	    <tr>
	        <th>定員</th>
	        <td><s:property value="persons"/></td>
	    </tr>
	    <tr>
	        <th>出発地</th>
	        <td><s:property value="departure"/></td>
	    </tr>
	</table>
</s:if>

<s:else>
	変更後のツアー情報
	<table border = "1px" cellspacing = "0px" cellpadding = "10px">
	    <tr>
	        <tr>
	        <th>ツアーID</th><td colspan="4"><s:property value ="tourId"/></td>
	    </tr>
	    <tr>
	        <th>ツアー名</th>
	        <td>変更前</td><td><s:property value = "tourName"/></td>
	        <td>変更後</td><td><s:property value = "editTourName"/></td>
	    </tr>
	    <tr>
	        <th>価格</th>
	        <td>変更前</td><td><s:property value="price"/></td>
	        <td>変更後</td><td><s:property value = "EditPrice"/></td>
	    </tr>
	    <tr>
	        <th>定員</th>
	        <td>変更前</td><td><s:property value="persons"/></td>
	        <td>変更後</td><td><s:property value = "editPersons"/></td>
	    </tr>
	    <tr>
	        <th>出発地</th>
	        <td>変更前</td><td><s:property value="departure"/></td>
	        <td>変更後</td><td><s:property value = "editDeparture"/></td>
	    </tr>
	</table>
</s:else>
<!-- テーブル部分ここまで--------------------------------------------------------- -->

<hr>

<!-- 画面下部のメニュー画面------------------------------------------------------- -->
<br>
    <a href=
	    '<s:url action="UpdateTourAction">
		    <s:param name="editTourId" value="tourId"/>
		    <s:param name="editTourName" value = "editTourName"/>
		    <s:param name="editPrice" value = "editPrice"/>
		    <s:param name="editPersons" value = "editPersons"/>
		    <s:param name="editDeparture" value = "editDeparture"/>
		    <s:param name="deleteCheck" value="deleteCheck"/>
	    </s:url>'>
    操作を完了する
    </a>
<br>



<hr>
<br>
    編集画面に戻る<br>
    取り扱いツアー一覧に戻る<br>
<br>
<br>
<br>


</body>
</html>