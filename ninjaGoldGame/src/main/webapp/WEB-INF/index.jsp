<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold Game</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/style.css"/>
	
</head>
<body>

	<div class="d-flex gap-3 w-25 m-5">
		<label class="form-label w-50">Your gold:</label>
		<input type="number" class="form-control" value="0" disabled/>
	</div>
	<main class="d-flex gap-4 flex-wrap m-5">
		<form action="/gold/farm" method="post" class="mx-auto text-center p-3 border border-dark card">
			<h3>Farm</h3>
			<p>(earns 10-20 gold)</p>
			<input type="submit" value="Find Gold!" class="btn btn-warning"/>
		</form>
		<form action="/gold/cave" method="post" class="mx-auto text-center p-3 border border-dark card">
			<h3>Cave</h3>
			<p>(earns 5-10 gold)</p>
			<input type="submit" value="Find Gold!" class="btn btn-warning"/>
		</form>
		<form action="/gold/house" method="post" class="mx-auto text-center p-3 border border-dark card">
			<h3>House</h3>
			<p>(earns 2-5 gold)</p>
			<input type="submit" value="Find Gold!" class="btn btn-warning"/>
		</form>
		<form action="/gold/quest" method="post" class="mx-auto text-center p-3 border border-dark card">
			<h3>Quest</h3>
			<p>(earns/takes 0-50 gold)</p>
			<input type="submit" value="Find Gold!" class="btn btn-warning"/>
		</form>
	</main>
	<div class="m-5">
		<label for="activity" class="form-label">Activities:</label>
		<textarea name="activity" class="form-control" cols="30" rows="10" disabled>
			<c:forEach var="each" items="${activityLog}">
				<c:out value="${each}"/>
			</c:forEach>
		</textarea>
	</div>
	
</body>
</html>