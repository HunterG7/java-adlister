<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guess Page"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Please guess a number between 1 and 3:</h1>
    <form action="${pageContext.request.contextPath}/guess-outcome.jsp" method="post">
        <input type="text" name="guess" id="guess">
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
