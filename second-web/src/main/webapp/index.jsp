<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css">
<title>MyNews</title>
</head>
<h1>"My News"</h1>
<body>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="registration">
		 <input type="submit" value="Registration">
	</form>
	<br/>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="autorization">
		 <input type="submit" value="Autorization">
	</form>
</body>
</html>