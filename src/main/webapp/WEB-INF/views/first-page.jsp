<%--
  Created by IntelliJ IDEA.
  User: Nina
  Date: 15/05/2020
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello!</title>
    <link rel="stylesheet" href="../bootstrap-4.5.0-dist/css/bootstrap.min.css" />
</head>
<body>
<sec:authorize access="isAuthenticated()">
    <p>Zalogowany jako: <sec:authentication property="username"/></p>
</sec:authorize>

<p>To jest strona po logowaniu</p>

<sec:authorize access="isAuthenticated()">
<form action="<c:url value="/logout"/>" method="post">
    <input class="fa fa-id-badge" type="submit" value="Wyloguj">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</sec:authorize>
</body>
</html>
