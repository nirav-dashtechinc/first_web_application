<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Student | Edit</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<h1>Edit Student Form</h1>
			<form action="edit" method="post" onsubmit="return checkInput(event);">
				<input type="hidden" name="id" value="${student.id}" />
				<table class="table">
					<tr>
						<td>Name</td>
						<td><input type="text" class="form-control" id="name" name="name" value="${student.name}" placeholder="Enter name" /></td>
					</tr>
					
					<tr>
						<td>Email</td>
						<td><input type="text" class="form-control" id="email" name="email" value="${student.email}" placeholder="Enter email id" /></td>
					</tr>
					
					<tr>
						<td>City</td>
						<td><input type="text" class="form-control" id="city" name="city" value="${student.city}" placeholder="Enter city" /></td>
					</tr>
					
					<tr>
						<td>Age</td>
						<td><input type="number" class="form-control" id="age" name="age" value="${student.age}" placeholder="Enter age" /></td>
					</tr>
					
					<tr>
						<td></td>
						<td>
							<input type="submit" class="btn btn-success" value="Submit" />
							<a href="/first_web_application/students" class="btn btn-danger">Back</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<script>
			function checkInput(e) {
				var name = document.getElementById("name").value;
				var city = document.getElementById("city").value;
				var email = document.getElementById("email").value;
				var age = document.getElementById("age").value;
				var prevetnForm = false;
				
				if (name === "" || city === "" || email === "" || age === "") {
					prevetnForm = true;
				}
				
				if (prevetnForm === true) {
					alert("Please provide correct data first.");
					return false;
				}
			}
		</script>
	</body>
</html>