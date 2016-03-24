
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head>
    <title>Login Page</title>
</head>
<body>
<div align="center">
<h1>${message}</h1>
<form:form method="post" name="loginForm">
  <table>
    <tr><td>User Email: </td><td><input name="email" type="text"></td></tr>
    <tr><td>Password: </td><td><input name="password" type="password"></td></tr>
    <tr><td colspan="2" align="right"><input type="submit" value="Login"></td></tr>
  </table>
  <div style="color:red">${error}</div>
</form:form>
<a href="registration">Click Here to Register</a>
</div>


</body>
</html>
