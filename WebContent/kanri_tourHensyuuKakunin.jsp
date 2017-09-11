<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	        <th>ツアーID</th><td colspan="4"><s:property value ="currentTourId"/></td>
	    </tr>
	    <tr>
	        <th>ツアー名</th>
	        <td><s:property value = "currentTourName"/></td>
	    </tr>
	    <tr>
	        <th>価格</th>
	        <td><s:property value="currentPrice"/></td>
	    </tr>
	    <tr>
	        <th>定員</th>
	        <td><s:property value="currentPersons"/></td>
	    </tr>
	    <tr>
	        <th>出発地</th>
	        <td><s:property value="currentDeparture"/></td>
	    </tr>
	    <tr>
	        <th>エリア</th>
	        <td><s:property value="currentRegion"/></td>
	    </tr>
	    <tr>
	        <th>都道府県</th>
	        <td><s:property value="currentPrefectures"/></td>
	    </tr>
	    <tr>
	        <th>テーマ</th>
	        <td><s:property value="currentTheme"/></td>
	    </tr>
	    <tr>
	        <th>コメント</th>
	        <td width="30px"><s:property value="currentComment"/></td>
	    </tr>
	    <tr>
	        <th>画像URL</th>
	        <td><s:property value="currentImg"/></td>
	    </tr>
	</table>
</s:if>

<s:else>
	変更後のツアー情報
	<table border = "1px" cellspacing = "0px" cellpadding = "10px" width="680px">
	    <tr>
	        <tr>
	        <th>ツアーID</th><td colspan="4"><s:property value ="currentTourId"/></td>
	    </tr>
	    <tr>
	        <th>ツアー名</th>
	        <td>変更前</td><td><s:property value = "currentTourName"/></td>
	        <td>変更後</td><td><s:property value = "editTourName"/></td>
	    </tr>
	    <tr>
	        <th>価格</th>
	        <td>変更前</td><td><s:property value="currentPrice"/></td>
	        <td>変更後</td><td><s:property value = "EditPrice"/></td>
	    </tr>
	    <tr>
	        <th>定員</th>
	        <td>変更前</td><td><s:property value="currentPersons"/></td>
	        <td>変更後</td><td><s:property value = "editPersons"/></td>
	    </tr>
	    <tr>
	        <th>出発地</th>
	        <td>変更前</td><td><s:property value="currentDeparture"/></td>
	        <td>変更後</td><td><s:property value = "editDeparture"/></td>
	    </tr>
	    <tr>
	        <th>エリア</th>
	        <td>変更前</td><td><s:property value="currentRegion"/></td>
	        <td>変更後</td><td><s:property value = "editRegion"/></td>
	    </tr>
	    <tr>
	        <th>都道府県</th>
	        <td>変更前</td><td><s:property value="currentPrefectures"/></td>
	        <td>変更後</td><td><s:property value = "editPrefectures"/></td>
	    </tr>
	    <tr>
	        <th>テーマ</th>
	        <td>変更前</td><td><s:property value="currentTheme"/></td>
	        <td>変更後</td><td><s:property value = "editTheme"/></td>
	    </tr>
	    <tr>
	        <th>コメント</th>
	        <td>変更前</td><td><font size = "2px"><s:property value="currentComment"/></font></td>
	        <td>変更後</td><td><font size = "2px"><s:property value="editComment"/></font></td>
	    </tr>
	    <tr>
	        <th>画像URL</th>
	        <td>変更前</td><td><s:property value="currentImg"/></td>
	        <td>変更後</td><td><s:property value = "editImg"/></td>
	    </tr>
	</table>
</s:else>
<!-- テーブル部分ここまで--------------------------------------------------------- -->

<hr>

<!-- 画面下部のメニュー画面------------------------------------------------------- -->
<br>
    <a href=
	    '<s:url action="UpdateTourAction">
		    <s:param name="editTourId" value="editTourId"/>
		    <s:param name="editTourName" value = "editTourName"/>
		    <s:param name="editPrice" value = "editPrice"/>
		    <s:param name="editPersons" value = "editPersons"/>
		    <s:param name="editDeparture" value = "editDeparture"/>
		    <s:param name="editRegion" value = "editRegion"/>
		    <s:param name="editPrefectures" value="editPrefectures"/>
		    <s:param name="editTheme" value="editTheme"/>
		    <s:param name="editComment" value="editComment"/>
			<s:param name="editImg" value="editImg"/>
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