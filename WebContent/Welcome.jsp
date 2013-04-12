
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
<%
	String newUserName = "?";
	Object newUser = request.getAttribute("newuser");
	if (newUser != null) newUserName = newUser.toString();
%>
<h1>Hello,<%=newUserName%></h1>
<form action="/postcars.jsp">
<input name="loggedInUser" type="hidden" value="<%=newUserName%>">
<input name="forward" type="submit" value="Post your car!">
</form>
<a href="/searchcars.jsp">Search for cars</a>
</body>
</html>