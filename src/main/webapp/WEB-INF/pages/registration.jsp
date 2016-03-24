<%--
  Created by IntelliJ IDEA.
  User: scelac
  Date: 3/23/16
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title></title>
</head>
<body>
<div align="center">
<form:form method="post" name="addUser">
<table>
  <tr><td>First Name: </td><td><input name="firstName" type="text"></td></tr>
  <tr><td>Last Name: </td><td><input name="lastName" type="text"></td></tr>
  <tr><td>Email: </td><td><input name="email" type="text"></td></tr>
  <tr><td>Password: </td><td><input name="password" type="password"></td></tr>
  <tr><td><input type="submit" value="Submit"><td></tr>
</table>
</form:form>
</div>
</body>
</html>
