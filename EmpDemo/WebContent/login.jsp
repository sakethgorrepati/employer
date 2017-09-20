<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee details</title>
</head>
<body>

<h2 style="color:red"align="center">${message}</h2>
<h3 align="center">Login Employee</h3>

<spring:form action="check.htm" commandName="loginCommand">
<table align="center" >

<tr>
<td>User Name</td>
<td><spring:input path="username"/></td>

</tr>
<tr>
<td>Password</td>
<td><spring:password path="password"/></td>

</tr>
<tr>
<td><input type="reset" value="Clear"></td>
<td><input type="submit" value="Login"></td>
<td><a href = "<c:url value = "showCreate.htm"/>">Create Employee</a></td>
</tr>



</table>


</spring:form>

</body>
</html>