<%@page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<title>기획사 아티스트</title>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
}
</style>
</head>
<body>
<h1>문제 #1</h1>

<h2>기획사</h2>
<ul>
	<li>이름: ${agent.name}</li>
	<li>대표: ${agent.ceo}</li>
	<li>주소: ${agent.address}</li>
	<li>설립일: ${agent.estDate}</li>
	<li>웹사이트: ${agent.website}</li>
	<li>소속 아티스트: </li>
</ul>

<table>
	<tr><th>ID</th><th>이름</th><th>활동시기</th><th>장르</th><th>구성원</th></tr>
<c:forEach var="artist" items="${artistList}">
	<tr>
		<td><a href="search/artist?id=${artist.id}">${artist.id}</a></td>
		<td>${artist.name}</td>
		<td>${artist.debutYear}~현재</td>
		<td>${artist.genre}</td>
		<td>${artist.members}</td>
	</tr>
</c:forEach>
</table>
<br/>
</body>
</html>