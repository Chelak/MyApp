<html>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h4>Hello </h4>
	<h4>${userInfo} </h4>

<div align="center">

	<h2> Product List</h2>
	<button type="button" onclick="window.location.href='/product-list'" >Show Product List</button>
	<h4>${addmessage} </h4>
	<a href="/product">Click Here to add new Product</a>
		<br>
	<c:if test="${!empty productList}">
		<table border="1" width="600px">
			<tr>

				<td>Product Title</td>
				<td>Product Count:</td>
				<td>Product Price:</td>
				<td>Product Description</td>

			</tr>
			<c:forEach items="${productList}" var="product">
				<tr>

					<td><c:out value="${product.productName}" /></td>
					<td><c:out value="${product.productDescription}" /></td>
					<td><c:out value="${product.productCount}" /></td>
					<td><c:out value="${product.productPrice}" /></td>




				</tr>
			</c:forEach>
		</table>
	</c:if>



</div>

</body>
</html>