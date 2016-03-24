<%--
  Created by IntelliJ IDEA.
  User: scelac
  Date: 3/22/16
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Product Page</title>
</head>
<body>
<div align="center">
<form:form method="post" name="addProduct">
  <table>
    <tr><td>Product Title: </td><td><input name="productName" type="text"></td></tr>
    <tr><td>Product Count: </td><td><input name="productCount" type="text"></td></tr>
    <tr><td>Product Price: </td><td><input name="productPrice" type="text"></td></tr>
    <tr><td>Product Description</td><td><input name="productDescription" type="text"></td></tr>
    <tr><td><input type="submit" value="Submit"></td></tr>
  </table>

</form:form>

</div>
</body>
</html>
