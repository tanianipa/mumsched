<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Login</title>
	<style>
	    .error {
	        color: #ff0000;
	    }
	</style>
</head>
<body>
	<c:if test="${success != null}">
		<h2>${success}</h2>
	</c:if>
    <form:form method="POST" modelAttribute="user" action="login">
        <form:input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="username">Username: </label> </td>
                <td><form:input path="username" id="username"/></td>
               
            </tr>
            <tr>
                <td><label for="password">Password: </label> </td>
                <td><form:password path="password" id="password"/></td>
              
            </tr>
            <tr>
                <td colspan="3">
                   
                     <input type="submit" value="login"/>
                  
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
</body>
</html>