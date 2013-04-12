<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post your car information</title>
</head>
<body>
<%
	String user = "?";
	Object loggedInUser = request.getAttribute("loggedInUser");
	if (loggedInUser != null) user = loggedInUser.toString();
%>
<form action="PostCar">
<table>
	<tr><td>Make</td>         <td><input name="make" type="text" ></td> </tr>
	<tr><td>Model</td>        <td><input name="model" type= "text"></td> </tr>
	<tr><td>Year</td>         <td><input name="year" type="text"></td> </tr>
	<tr><td>Mileage</td>      <td><input name="mileage" type="text"></td> </tr>
	<tr><td>Color</td>        <td><input name="color" type="text"></td> </tr>
	<tr><td>Transmission</td> <td><select name="transmission">
	            				  <option value="Automatic">Automatic</option>
	            				  <option value="Manual">Manual</option>
	                			  </select></td> </tr>
	<tr><td>Price</td>        <td><input name="price" type="text"></td> </tr>
	<tr><td>Drivetrain</td>   <td><input name="drivetrain" type="text"></td> </tr>
	<tr><td>MPG</td>          <td><input name="mpg" type="text"></td> </tr>
	<tr><td>VIN number</td>   <td><input name="vin" type="text"></td> </tr>
	<tr><td> <input type="submit" value="Post it"></td> </tr>
	<tr><td><input type="hidden" name="username" value=user></td></tr>
</table>
</form>
</body>
</html>