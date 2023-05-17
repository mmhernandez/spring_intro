<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Fruit Store</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<h1 class="text-center mt-5 text-danger">Fruit Store</h1>
	<div class="p-2 border border-danger w-50 mx-auto border-5">
		<table class="table mx-auto">
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
			</thead>
			<c:forEach var="fruit" items="${fruits}">
				<c:choose>
					<c:when test="${fruit.name.startsWith('S')}">
						<tr>
							<td class="text-danger"><c:out value="${fruit.name}" /></td>
							<td class="text-danger"><c:out value="${fruit.price}" /></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td><c:out value="${fruit.name}" /></td>
							<td><c:out value="${fruit.price}" /></td>
						</tr>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>