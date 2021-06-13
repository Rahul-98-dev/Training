<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
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

.error {
	color: red
}
</style>
</head>
<br>
<br>
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
	<h2>Admin Login</h2>
	<br>
	<form:form method="POST" modelAttribute="user" action="showdashboard">
		<table align="center">
			<tr>
				<th><form:label path="username">UserName</form:label></th>
				<td><form:input path="username" size="16" maxlength="16" /></td>

			</tr>
			<tr>
				<th><form:label path="password">Password</form:label></th>
				<td><form:password path="password" size="16" maxlength="16" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
		<form:errors path="username" cssClass="error" />
		<form:errors path="password" cssClass="error" />
	</form:form>

</body>

</html>