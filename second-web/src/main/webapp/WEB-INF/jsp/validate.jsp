<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css">
<title>MyNews</title>
</head>
<h1>"My News"</h1>
<h2>User validation page</h2>
<body>
	<form action="Controller" method="post">
		<label>Name:<br /> <input type="text" name="name"></label><br />
    	<label>Password:<br /> <input type="password" name="pass"></label><br /> 
    	<input type="hidden" name="command" value="VALIDATION_USER"><br />
		<input type="submit" value="Submit">
	</form>
</body>
</html>