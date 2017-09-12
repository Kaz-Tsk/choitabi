<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ツアー追加</title>
</head>
<body>

<h1>ツアー追加　情報登録画面</h1>
<hr>
    ツアー情報を入力してください
<br>

<!-- ↓ここ一文エラーメッセージです -->
<font color="red"><s:property value="errorMsg"/></font>

<!-- ↓ここから編集フォーム（テーブルまるごとと、チェックボックス、「確認」ボタンあります） -->
<s:form action="ConfirmTourInsertingAction">
<table border = "1px" cellspacing = "0px" cellpadding = "10px" width="420px">
<!-- ↓まだ編集画面丸写し。変数名を変えていきます -->
   <tr>
   		<th>ツアー名</th>
   		<td><input type="text" name="newTourName"></input></td>
   </tr>
   <tr>
   		<th>ツアーID</th><td>(自動で入ります)</td>
   </tr>
      <tr>
   		<th>価格</th>
   		<td><input type="text" size="5" name="newPrice"></input>　円</td>
   </tr>
   <tr>
   		<th>定員</th>
   		<td><input type="text" size="5" name="newPersons"></input>　名</td>
   </tr>
   <tr>
   		<th>出発地</th>
   		<td><input type="text" name="newDeparture"></input></td>
   </tr>
   <tr>
   		<th>エリア</th>
   		<td><input type="text" name="newRegion"></input></td>
   </tr>
      <tr>
   		<th>都道府県</th>
   		<td><input type="text" name="newPrefectures"></input></td>
   </tr>
      <tr>
   		<th>テーマ</th>
   		<td><input type="text" name="newTheme"></input></td>
   </tr>
      <tr>
   		<th>コメント</th>
   		<td><textarea rows="10" cols="30"name="newComment"></textarea></td>
   </tr>
      <tr>
   		<th>画像URL</th>
   		<td><input type="text" name="newImg"></input></td>
   </tr>
</table>
<hr>
<hr>
<br>
<input type="submit" value="確認画面へ">
</s:form>
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