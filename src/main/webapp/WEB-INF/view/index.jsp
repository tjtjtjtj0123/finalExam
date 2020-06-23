<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
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
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
var xhttp = new XMLHttpRequest();

function search() {
	var form = document.getElementById("form1");
	var condition = {
		name: form.name.value, 
		genre: form.genre.value, 
		debutYear: form.debutYear.value
	} 	
	var jsonStr = JSON.stringify(condition)
	alert("search condition: " + jsonStr);
	
	$.ajax({			
		type: "POST",
		url: "search3", 
		contentType: "application/json",
		data: jsonStr,
		success: function(responseJson){	
			$("#result").text(JSON.stringify(responseJson))	
	  	},
		error: function(){
			alert("ERROR", arguments);
		}
	});
}
</script>
</head>
<body>
<h1>문제 #2</h1>
<h2>기획사</h2>
<ul>
<c:forEach var="name" items="${companies}" varStatus="status">
	<li>${status.count}. <a href="search1?agentName=${name}">${name}</a>
</c:forEach>
</ul>
<br/>
<hr>

<h1>문제 #3</h1>
<h2>기획사</h2>
<ul>
<c:forEach var="name" items="${companies}" varStatus="status">
	<li>${status.count}. <a href="search2?agentName=${name}">${name}</a>
</c:forEach>
</ul>
<br/>
<hr>

<h1>문제 #4</h1>
<h2>아티스트 검색</h2>
<form id="form1">
	이름: <input type="text" id="name" name="name"/>&nbsp;
	장르: <input type="text" id="genre" name="genre" value="힙합" />&nbsp;
	데뷔: <input type="text" id="debutYear" name="debutYear" />&nbsp;
	<input type="button" value="Search!" onClick="search()" /><br>
</form>
<br/>
검색 결과: <br/>
<div id="result"></div>	
</body>
</html>