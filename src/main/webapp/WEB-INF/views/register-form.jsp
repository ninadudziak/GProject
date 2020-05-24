<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Nina
  Date: 24/05/2020
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rejestracja</title>
</head>
<body>
<form:form modelAttribute="user" method="post" action="/register">
    <form:label path="username">Nazwa użytkownika: </form:label>
    <form:input path="username"/><br>
    <form:errors path="username" cssClass="ui-state-error"/><br>

    <form:label path="email">Email: </form:label>
    <form:input path="email"/><br>
    <form:errors path="email" cssClass="ui-state-error"/><br>

    <form:label path="password">Hasło: </form:label>
    <form:password path="password"/><br>
    <form:errors path="password" cssClass="ui-state-error"/><br>

    <form:hidden path="id"/>

    <input type="submit" value="Załóż konto"
</form:form>

</body>
</html>
