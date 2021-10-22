<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Student | Home</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<h1>
				Students
				<a href="students/add" class="btn btn-primary pull-right">Add New Student</a>
			</h1>			
			
			<table class="table table-hover table-striped table-bordered">
				<tr>
					<td>#</td>
					<td>Name</td>
					<td>Email</td>
					<td>Age</td>
					<td>City</td>
					<td>Action</td>
				</tr>
				<c:forEach items="${students}" var="s">
					<tr>
						<td>${s.id}</td>
						<td>${s.name}</td>
						<td>${s.email}</td>
						<td>${s.age}</td>
						<td>${s.city}</td>
						<td>
							<a href="students/edit?id=${s.id}" class="btn btn-primary btn-sm">Edit</a>
							<a href="students/delete?id=${s.id}" class="btn btn-danger btn-sm" 
								onclick="return confirm('Are you sure to delete this record ?');">
								Delete
							</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>