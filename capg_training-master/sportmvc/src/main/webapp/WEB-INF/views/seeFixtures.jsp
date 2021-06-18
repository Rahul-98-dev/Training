<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Trainees Details</h1>

<table border="1">

<tr>
<th>Match Id</th>
<th>Player 1 Id</th>
<th>Player 2 Id</th>
<th>Set 1 score of Player1</th>
<th>Set 1 score of Player2</th>
<th>Set 2 score of player1</th>
<th>Set 2 score of player2</th>
<th>Set 3 score of Player1</th>
<th>Set 3 score of player2</th>


<th>Match Result</th>
</tr>


<c:forEach items="${matches}" var="item" >
<tr>
<td>${item.matchId }</td>
<td>${item.PlayerId1 }</td>
<td>${item.PlayerId2}</td>
<td>${item.PlayerId1Set1}</td>
<td>${item.PlayerId2Set1 }</td>
<td>${item.PlayerId1Set2}</td>
<td>${item.PlayerId2Set2}</td>
<td>${item.PlayerId1Set3}</td>
<td>${item.PlayerId2Set3}</td>

<td>${item.result}</td>
</tr>
</c:forEach>

</table>
</body>
</html>