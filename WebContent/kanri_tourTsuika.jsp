<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー追加</title>
<link rel = "stylesheet" type = "text/css" href = "./css/kanri_common.css">
</head>
<body>

<h1>ツアー追加　情報登録画面</h1>
<hr>
    ツアー情報を入力してください
<br>

<!-- ↓ここ一文エラーメッセージです -->
<font color="red"><s:property value="errorMsg"/></font>

<!-- ↓ここから編集フォーム（テーブルまるごとと、チェックボックス、「確認」ボタンあります） -->
<form action="ConfirmTourInsertingAction">
<table>
<!-- ↓まだ編集画面丸写し。変数名を変えていきます -->
   <tr>
   		<th>ツアー名</th>
   		<td><input type="text" size="40" name="newTourName" value=<s:property value="newTourName"/>></input></td>
   </tr>
   <tr>
   		<th>ツアーID</th><td>(自動で入ります)</td>
   </tr>
      <tr>
   		<th>価格</th>
   		<td><input type="text" size="5" name="newPrice" value=<s:property value="newPrice"/>></input>　円</td>
   </tr>
   <tr>
   		<th>定員</th>
   		<td><input type="text" size="5" name="newPersons" value=<s:property value="newPersons"/>></input>　名</td>
   </tr>
   <tr>
   		<th>出発地</th>
   		<td><input type="text" name="newDeparture" value=<s:property value="newDeparture"/>></input></td>
   </tr>
   <tr>
   		<th>エリア</th>
   		<td><input type="text" name="newRegion" value=<s:property value="newRegion"/>></input></td>
   </tr>
      <tr>
   		<th>都道府県</th>
   		<td><input type="text" name="newPrefectures" value=<s:property value="newPrefectures"/>></input></td>
   </tr>
      <tr>
   		<th>テーマ</th>
   		<td><input type="text" name="newTheme" value=<s:property value="newTheme"/>></input></td>
   </tr>
      <tr>
   		<th>コメント</th>
   		<td><textarea rows="10" cols="45"name="newComment"><s:property value="newComment"/></textarea>></td>
   </tr>
      <tr>
   		<th>画像URL</th>
   		<td><input type="text" size="40" name="newImg"
   		     value=<s:property value="newImg"/>></input><br><font size="2px">※指定なしの場合は仮の画像が入ります</font></td>
   </tr>
</table>
<hr>
<hr>
<br>
<input type="submit" value="確認画面へ">
</form>
<!-- ここまで編集フォーム -->
<br>
<hr>
<br>
    ツアー情報一覧にもどる<br>
    管理者トップページにもどる<br>
<br>
<br>
<br>


</body>
</html>