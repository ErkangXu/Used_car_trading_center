<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search for your dream car!</title>
</head>
<body>
<form action="searchCars">
<!-- Need to code the searchCar servlet -->
<table>
	<tr><td>Make</td>         <td><input name="make" type="text" ></td> </tr>
	<tr><td>Model</td>        <td><input name="model" type= "text"></td> </tr>
	<tr>
	    <td><input name="bottomLimitYear" type="text"></td>
	    <td> &lt Year &lt</td>
	    <td><input name="upperLimitYear" type="text"></td>
	</tr>
	<tr>
		<td><input name="bottomLimitMileage" type="text"></td>
		<td> &lt Mileage &lt</td>      
		<td><input name="upperLimitMileage" type="text"></td> 
	</tr>
	<tr><td>Color</td>        <td><input name="color" type="text"></td> </tr>
	<tr><td>Transmission</td> <td><select name="transmission">
	            				  <option value="Automatic">Automatic</option>
	            				  <option value="Manual">Manual</option>
	                			  </select></td> </tr>
	<tr>
		<td><input name="bottomLimitPrice" type="text"></td>
		<td> &lt Price &lt</td>        
		<td><input name="upperLimitPrice" type="text"></td> 
	</tr>
	<tr><td> <input type="submit" value="Post it"></td> </tr>
	<tr><td><input type="hidden" name="username" value=user></td></tr>
</table>
</form>
</body>
</html>