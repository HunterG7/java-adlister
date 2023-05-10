<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pizza Order"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Order Your Pizza!</h1>
    <form action="${pageContext.request.contextPath}/pizza-order" method="post">
        <label for="crust">Crust Options</label>
        <select name="crust" id="crust">
            <option value="regular">Regular Crust</option>
            <option value="thin">Thin Crust</option>
            <option value="stuffed">Stuffed Crust</option>
        </select>

        <label for="sauce">Sauce Type</label>
        <select name="sauce" id="sauce">
            <option value="marinara">Marinara</option>
            <option value="pesto">Pesto</option>
            <option value="alfredo">Alfredo</option>
        </select>

        <label for="size">Size</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>

        <fieldset> Toppings:
            <input type="checkbox" name="toppings" id="pepperoni" value="pepperoni">
            <label for="pepperoni">Pepperoni</label>
            <input type="checkbox" name="toppings" id="olives" value="olives">
            <label for="olives">Olives</label>
            <input type="checkbox" name="toppings" id="bacon" value="bacon">
            <label for="bacon">Bacon</label>
            <input type="checkbox" name="toppings" id="ham" value="ham">
            <label for="ham">Ham</label>
        </fieldset>

        <label for="address">Address</label>
        <input type="text" name="address" id="address">

        <input type="submit" value="Submit Order">
    </form>
    <c:if test="${address != null}" >
        <h3>Your Order Overview</h3>
        <p>Crust: ${crust}</p>
        <p>Sauce: ${sauce}</p>
        <p>Size: ${size}</p>
        <p>Toppings: </p>
        <c:forEach var="topping" items="${toppings}">
            <span>| ${topping} |</span>
        </c:forEach>
        <br><p>Address: ${address}</p>
    </c:if>

</div>
</body>
</html>
