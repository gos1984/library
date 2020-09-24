<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 23.09.2020
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="result" items="${results}">
        <tr>
            <td>${result.id}</td>
            <td>${result.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
