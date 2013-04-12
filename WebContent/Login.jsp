<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find your car</title>
</head>
<body>
<h1>Find your car</h1>
<h2>The easiest way to post your car</h2>
<%
	String error_message = "";
	Object error = request.getAttribute("error");
	if (error != null) error_message = error.toString();
%>
<form action="CheckLogin">
<table cellspacing="4">
	<tr>
		<td>Username</td>
		<td><input name="user" type="text" size="20"></td>
		<td style="color: red"><%= error_message %></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input name="password" type="password" size="20"></td>
		<td></td>
	</tr>
	<tr>
		<td><input type="submit" value="Login"></td>
	</tr>
</table>
</form>

<form action="Signup.jsp">
<h2>Sign up NOW!</h2>
<h2>Don't have a account? Join us now!</h2>
<input type="submit" value="Sign up">
</form>

</body>
</html>
