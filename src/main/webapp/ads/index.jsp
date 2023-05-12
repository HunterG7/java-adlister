<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Ads"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/head.jsp"/>
<c:forEach items="${ads}" var="ad">
    <h1>${title}</h1>
    <p>${description}</p>
</c:forEach>
</body>
</html>
