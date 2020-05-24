<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Nina
  Date: 24/05/2020
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj knajpe</title>
</head>
<body>
<form:form modelAttribute="restaurant" method="post" action="/firstpage/restuarants">
    <form:label path="name">Nazwa</form:label>
    <form:input path="name"/><br>
    <form:errors path="name"/><br>



</form:form>

</body>
</html>
