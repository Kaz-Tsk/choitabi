<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sidebar</title>
<link  rel = "stylesheet" type= "text/css" href ="./css/sidebar.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
</head>
<body>
<!-- ここからサイドバー -->
       <ul class = "outline">
            <li>
                <div class = "category">テーマで探す</div>
                <ul class = "menu">
                    <li><a href = "./choimesi.jsp">グルメ</a></li>
                    <li><a href = "./place.jsp">名所</a></li>
                    <li><a href = "./activity.jsp">アクティビティ</a></li>
                </ul>
            </li>
            <li>
                <div class = "category">エリアで探す</div>
                <ul class = "menu">
                    <li><a href = "./touhoku.jsp">東北</a></li>
                    <li><a href = "#">関東</a></li>
                    <li><a href = "#">関西</a></li>
                    <li><a href = "#">九州</a></li>
                </ul>
            </li>
        </ul>
    <script type = "text/javascript" src = "./js/sidebar.js"></script>
		<!-- ここまでサイドバー -->
</body>
</html>