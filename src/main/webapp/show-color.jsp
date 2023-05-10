<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String userColor = request.getParameter("color");
%>
<html>
<head>
    <title>Show Color</title>
</head>
<style>
    body {
        background-color: <%= userColor %>;
    }
</style>
<body>
</body>
</html>
