<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pick Color"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Pick a Color</h1>
    <form action="${pageContext.request.contextPath}/show-color.jsp" method="post">
        <input type="text" name="color" id="color">
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
