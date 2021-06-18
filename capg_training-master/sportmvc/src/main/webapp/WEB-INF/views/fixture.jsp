<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fixtures</title>
<style>
table {
  
  border-collapse: collapse;
  width: 50%;
}
h2{
  font-family: verdana;}
td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(odd){background-color: #f2f2f2}
.error {
	color: red
}
</style>
</head>

<body align="center" font="verdana">

<h2>Match Fixtures</h2>
<br>
<form action="saveFixtures" method="post">
<table align="center">
  
 <tr><td>Match Id</td>
<td><input type="text" name="matchId" /></td><td></td></tr>
<tr>
<td>Player 1 Id</td>
<td><input type="text" name="PlayerId1" /></td><td></td>
</tr>
 <tr>
<td>Player 2 Id</td>
<td><input type="text" name="PlayerId2" /></td><td></td></tr>

 
 <tr><td>First Set Point</td>
<td><input type="text" name="PlayerId1Set1" /></td>
<td><input type="text" name="PlayerId2Set1" /></td>
</tr>
  <tr>
<td>Second Set Point</td>
<td><input type="text" name="PlayerId1Set2" /></td>
<td><input type="text" name="PlayerId2Set2" /></td>
</tr>
 <tr>
<td>Third Set Point</td>
<td><input type="text" name="PlayerId1Set3" /></td>
<td><input type="text" name="PlayerId2Set3" /></td></tr>
<tr>
<td>Match Result</td>
<td><input type="text" name="result" /></td><td></td></tr>
<tr>
<td><input type="submit" name="add" value="submit"/></td><td></td><td></td>
</tr>

</table>
</form>

<body>

</body>
</html>