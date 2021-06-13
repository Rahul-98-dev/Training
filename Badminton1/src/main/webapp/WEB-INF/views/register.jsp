<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>New Registration</title>
<style>
.navbar {
  width: 100%;
  background-color: #555;
  overflow: auto;
}

.navbar a {

 
  float: right;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {

  background-color: #000;
}

.active {
  background-color: #04AA6D;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}

table {
	border-collapse: collapse;
	width: 50%;
}

h2 {
	font-family: verdana;
}

td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(odd) {
	background-color: #f2f2f2
}
</style>
</head>
<body align="center" font="verdana">
<div class="navbar">
<a href="admin_sign_in"><i class="fa fa-fw fa-user"></i>AdminLogin</a>
 <a href="gameinfo"><i class="fa fa-fw fa-envelope"></i>Info</a>  
  <a href="register"><i class="fa fa-fw fa-search"></i>Register</a> 
 <a class="active" href="home"><i class="fa fa-fw fa-home"></i>Home</a>
</div>
<br>
<br>
<br>
	<br>
	<h2>Registration Form</h2>
	<br>
	<form action="savePlayer" method="post">
		<table align="center">

			<tr>
				<td>First Name</td>
			</tr>
			<tr>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
			</tr>
			<tr>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Gender</td>
			</tr>
			<tr>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female</td>
			</tr>
			<tr>
				<td>Age</td>
			</tr>
			<tr>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="add" value="submit" /></td>
			</tr>

		</table>
	</form>

</body>
</html>
