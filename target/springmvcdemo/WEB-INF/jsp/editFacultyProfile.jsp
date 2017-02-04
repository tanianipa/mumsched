<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
</head>
<body>
<h1>
	Edit Profile Information
</h1>

<%-- <c:url var="addAction" value="/facultyController/faculty/update" ></c:url> --%>

<form:form action="${addAction}" modelAttribute="faculty">
<table>
	<c:if test="${!empty faculty.name}">
	<tr>
		<td>
			<form:label path="facultyId">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="facultyId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="facultyId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="designation">
				<spring:message text="Designation"/>
			</form:label>
		</td>
		<td>
			<form:input path="designation" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="email">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
			<form:input path="email" readonly="true"  disabled="true" />
			<form:hidden path="email" />
		</td>
	</tr>
	<tr>
	<tr>
		<td>
			<form:label path="phone">
				<spring:message text="Phone"/>
			</form:label>
		</td>
		<td>
			<form:input path="phone" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="description">
				<spring:message text="Description"/>
			</form:label>
		</td>
		<td>
			<form:input path="description" />
		</td>
	</tr>
	<tr>
	<td>
	 <form:select path="prefferedBlocks" items="${listOfBlocks}" itemLabel="${blockName}" itemValue="${blockId}" />
  
	</td>
	</tr>
	<tr>
		<td colspan="2">
			
				<input type="submit"
					value="<spring:message text="Save"/>" />
			
		</td>
	</tr>
</table>	
</form:form>
</body>
</html>