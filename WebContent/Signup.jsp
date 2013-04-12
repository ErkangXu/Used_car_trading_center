<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find your car: sign up</title>
</head>
<body>
<h1>Sign up</h1>
<%
	String error_message = "";
	Object error = request.getAttribute("error");
	if (error != null) error_message = error.toString();
%>
<form action=SignUp>
<table>
	<tr>
		<td><input name="username" type="text" value="Username"> </td>
		<td style="color: red"><%= error_message %></td>
	</tr>
</table>
First name<input name="First name" type="text" value="first name">
Last name<input name="Last name" type="text" value="last name">
<h2>Password</h2>
Create your password<input name="password" type="password">
Confirm your password<input name="confirm password" type="password">
<h2>Contact information</h2>
Your email address<input name="email" type="text">
Your phone number <input name="phone number" type="text">
<input name="agreement" type="checkbox" value="agreed"> Check to agree on the service statement
<input name="submit" type="submit" value="Sign up">
</form>
</body>
</html>