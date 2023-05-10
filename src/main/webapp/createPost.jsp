<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Please Log In" />
</jsp:include>
<head>
    <title>Create a Blog Post</title>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <h1>Create a Blog Post</h1>
    <form action="${pageContext.request.contextPath}/createPost" method="post">
        <label for="post">Your Post:</label>
        <textarea name="post" id="post" cols="30" rows="10"></textarea>
        <input type="submit" value="Submit">
    </form>
    <c:if test="${post != null}">
        <h3>Your Blog Post:</h3>
        <p>${post}</p>
    </c:if>
</body>
</html>
