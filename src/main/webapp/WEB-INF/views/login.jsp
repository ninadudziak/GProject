<%--
  Created by IntelliJ IDEA.
  User: Nina
  Date: 15/05/2020
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
</head>
<body>
<form style="background-image: url('/images/South-Indian-Bruschetta-Recipe.jpg'); background-size: cover; background-repeat: no-repeat">
    <div><label style="color: #d1ecf1"> User Name : <input type="text" name="username"/> </label></div>
    <div><label style="color: #d1ecf1"> Password: <input type="password" name="password"/> </label></div>
    <div> <input type="submit" value="Sign In"/></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
