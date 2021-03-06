<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- と宣言することで、JSPファイルとして機能させることが出来る -->
<!-- (<%%>を使うとJSPファイルの中でJava言語を使ってプログラムを書くことが出来る) -->

<!-- 国際化 -->
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.cart"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>ツアーサイドバー</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap cdn -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- cart.css -->
<link rel="stylesheet" type="text/css" href="css/sidebar.css">

</head>



<body>


<ul class = "outline">
            <li>
                <div class = "category"><s:text name="lang.test_tour.SearchT"/></div>
                <ul class = "menu">
                    <li><a href='<s:url action="TourListAction"><s:param name="theme" value="%{'グルメ'}"/></s:url>'><s:text name="lang.test_tour.gourmet"/></a></li>
                    <li><a href='<s:url action="TourListAction"><s:param name="theme" value="%{'名所'}"/></s:url>'><s:text name="lang.test_tour.spot"/></a></li>
                    <li><a href='<s:url action="TourListAction"><s:param name="theme" value="%{'アクティビティ'}"/></s:url>'><s:text name="lang.test_tour.activity"/></a></li>
                </ul>
            </li>
            <li>
                <div class = "category"><s:text name="lang.test_tour.SearchA"/></div>
                <ul class = "menu">
                    <li><a href='<s:url action="TourListAction"><s:param name="region" value="%{'東北'}"/></s:url>'><s:text name="lang.test_tour.TOHOKU"/></a></li>
                    <li><a href='<s:url action="TourListAction"><s:param name="region" value="%{'関東'}"/></s:url>'><s:text name="lang.test_tour.KANTO"/></a></li>
                    <li><a href='<s:url action="TourListAction"><s:param name="region" value="%{'関西'}"/></s:url>'><s:text name="lang.test_tour.KANSAI"/></a></li>
                    <li><a href='<s:url action="TourListAction"><s:param name="region" value="%{'九州'}"/></s:url>'><s:text name="lang.test_tour.KYUSYU"/></a></li>
                </ul>
            </li>
        </ul>
    <script type = "text/javascript" src = "./js/sidebar.js"></script>


</body>
</html>