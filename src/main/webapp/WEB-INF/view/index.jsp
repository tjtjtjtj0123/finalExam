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
	
	/* 위 condition 객체를 JSON 문자열로 변환함 */
	
	$.ajax({			
		/* 변환된 JSON 문자열을 POST 방식의 Ajax 요청으로 전송함 (url은 "search3") */		
		/* JSON 문자열 형식의 결과가 return되면 그 내용을 이 페이지 하단의 <div> 엘리먼트의 내용으로 출력함 */
		
		
	});
}
</script>
</head>
<body>
이 프로젝트를 다운로드 받고 싶으면 <a href="finalExam.zip">이 링크</a>를 클릭하세요.
<br>
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