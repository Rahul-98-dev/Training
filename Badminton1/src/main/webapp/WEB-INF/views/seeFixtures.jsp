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
<th>Set 1 score</th>
<th>Set 2 score</th>
<th>Set 3 score</th>
<th>Match Result</th>
</tr>
<c:forEach items="${matches}" var="item" >
<tr>
<td>${item.matchId }</td>
<td>${item.leftPlayerId }</td>
<td>${item.rightPlayerId}</td>
<td>${item.firstSet}</td>
<td>${item.secondSet }</td>
<td>${item.thirdSet}</td>
<td>${item.result}</td>
</tr>
</c:forEach>

</table>
</body>
</html>