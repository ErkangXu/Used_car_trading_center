<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Congratulations! Car is posted!</title>
</head>
<body>
<%
	String user = "?";
	Object returningUser = request.getAttribute("returninguser");
	if (returningUser != null) user = returningUser.toString();
%>
<h1>Congratulations,<%=user%>! Car is posted!</h1>
<form action="/Used_car_trading_center/postcars.jsp">
<input name="loggedInUser" type="hidden" value="<%=user%>">
<input name="forward" type="submit" value="Post your car!">
</form>
<a href="/searchcars.jsp">Search for cars</a>
</body>
</html>