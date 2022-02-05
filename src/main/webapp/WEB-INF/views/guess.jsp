<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>숫자 맞추기 게임.</h1>
<hr />
<h3>${message }</h3>

<c:if test="${sessionScope.count != null }">
	<form action="guess" method="get">
		<input type="text" name="number" />
		<input type="submit" value="확인" />
	</form>
</c:if>

<a href="guess">게임 다시 시작하기.</a>
</body>
</html>