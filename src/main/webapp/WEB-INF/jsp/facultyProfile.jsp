<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page session="false" %>
<html>
<head>
	<title>Faculty Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<table>
<tr><td>
<h2>Welcome ${faculty.name}</h2></td>
</tr>
<tr><td><h4>${faculty.designation}</h4></td></tr>


</table>
<table>
	
<tr><td>Email </td><td>${faculty.email}</td></tr>
<tr><td>Phone</td><td>${faculty.phone}</td></tr>
<tr><td>${faculty.description}</td></tr>
<tr><td><a href="<c:url value='/facultyController/edit/${faculty.email}' />" >Edit</a></td></tr>

	</table>
<%-- <form id="editProfile" method="post" action="/updateProfile">  
  <input type="submit" value="Edit" >
</form> --%>
</body>
</html>