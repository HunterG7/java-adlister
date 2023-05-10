<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String userGuess = request.getParameter("guess");
    int guess = Integer.parseInt(userGuess);
    Random random = new Random();
    int randomNum = random.nextInt(3) + 1;

    if (guess == randomNum) {
        response.sendRedirect("/correct");
    } else {
        response.sendRedirect("/incorrect");
    }
%>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guess Outcome"/>
    </jsp:include>
</head>
<body>
</body>
</html>
