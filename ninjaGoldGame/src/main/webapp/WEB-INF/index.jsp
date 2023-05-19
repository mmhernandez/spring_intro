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

	<div class="d-flex justify-content-between m-5">
		<div class="d-flex align-items-center gap-1 w-25">
			<p class="form-label">Your gold:</p>
			<div class="text-center w-25 rounded form-control bg-light">
				<c:if test="${gold == null}">
					<c:out value="0"/>	
				</c:if>
				<c:if test="${gold != null}">				
					<c:out value="${gold}"/>
				</c:if>
			</div>
		</div>
		<a href="/reset" class="btn btn-secondary">Reset Game</a>
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
			<p>(earns/loses 0-50 gold)</p>
			<input type="submit" value="Risk It!" class="btn btn-warning"/>
		</form>
		<form action="/gold/spa" method="post" class="mx-auto text-center p-3 border border-dark card">
			<h3>Spa</h3>
			<p>(loses 5-20 gold)</p>
			<input type="submit" value="Spend Gold!" class="btn btn-warning"/>
		</form>
	</main>
	<div class="m-5">
		<p class="form-label">Activities:</p>
		<textarea class="form-control p-3 bg-light" rows="10">
			<c:forEach var="each" items="${activity}">
				<c:out value="${each}"/>
			</c:forEach>
		</textarea>
	</div>
	
</body>
</html>