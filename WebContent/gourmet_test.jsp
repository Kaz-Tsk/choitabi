<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <sql:setDataSource driver="com.mysql.jdbc.Driver"
    var="db" url="jdbc:mysql://localhost:3306/mysql"
    user="root" password="mysql" />
<sql:query var="rs" dataSource="${db}">select * from tour
</sql:query>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<c:forEach var="rec" items="${rs.rows}" >
<td><c:out value="${rec.tour_id}" /></td>
</c:forEach>
</table>
</body>
</html>