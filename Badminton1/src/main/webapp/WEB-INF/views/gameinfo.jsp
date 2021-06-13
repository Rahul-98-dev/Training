<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scoring System</title>
</head>
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
body {
	font-family: verdana;
}

.navbar {
	width: 100%;
	background-color: #555;
	overflow: auto;
}
</style>
<body>
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
	<div class="navbar">
		<i class="fa"></i> . <i class="f"></i> . <i class="fe"></i> . <i
			class="a"></i>.
	</div>
	<h3>Scoring System</h3>
	<br>
	<ul>
		<li>A match consists of the best of 3 games of 21 points.</li>
		<br>
		<li>Every time there is a serve there is a point scored.</li>
		<br>
		<li>The side winning a rally adds a point to its score.</li>
		<br>
		<li>At 20 all, the side which gains a 2 point lead first, wins
			that game.</li>
		<br>
		<li>At 29 all, the side scoring the 30th point, wins that game.</li>
		<br>
		<li>The side winning a game serves first in the next game.</li>
	</ul>
	<br>
	<br>
	<div class="navbar">
		<i class="fa"></i> . <i class="f"></i> . <i class="fe"></i> .
	</div>
</body>
</html>