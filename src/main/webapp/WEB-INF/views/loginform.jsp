<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>관리자 로그인</h1>
${errorMessage } <br />
<form action="login" method="post">
암호 : <input type="password" name="passwd" /> <br />
<input type="submit" />
</form>
</body>
</html>