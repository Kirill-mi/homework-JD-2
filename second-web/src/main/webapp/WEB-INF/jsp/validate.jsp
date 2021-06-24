<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>MyNews</title>
</head><h1>"My News"</h1>
<body>
<form action="Controller" method="post" >
    <label>Name:
        <input type="text" name="name"><br />
    </label>

    <label>Password:
        <input type="password" name="pass"><br />
    </label>
    <button type="submit" name="type" value="validate">Submit</button>
</form>
</body>
</html>