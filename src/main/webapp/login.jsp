<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>LOGIN FORM</h1>
    <form action="login.jsp" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username">
        <label for="password">Password:</label>
        <input type="text" name="password" id="password">
        <input type="submit" value="Login">
    </form>
</body>
</html>
