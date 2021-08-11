<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h1>Welcome to Doughnut House!!</h1>
<form action="LoginServlet" method="post">
<label>UserName</label><input type="text" name="userName"/>
<label>Password</label><input type="password" name="password"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>