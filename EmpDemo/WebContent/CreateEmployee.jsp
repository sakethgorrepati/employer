<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 align="center">Add Employee</h3>
<h6 align="center" style="color:red">${message}</h6>
<h3 align="center"><a href="showLogin.htm">Login</a></h3>
<spring:form action="create.htm" method="post" commandName="createCommand">
<table align="center" >
<tr>
<td>Number</td>
<td><spring:input path="eno"/></td>

</tr>
<tr>
<td>Name</td>
<td><spring:input path="ename"/></td>

</tr>
<tr>
<td>Gender</td>
<td><spring:radiobuttons path="gender" items="${genderMap}" />

</td>

</tr>
<tr>
<td>Salary</td>
<td><spring:input path="salary"/></td>

</tr>
<tr>
<td>User Name</td>
<td><spring:input path="username"/></td>

</tr>
<tr>
<td>Password</td>
<td><spring:password path="password"/></td>

</tr>
<tr>
<td>Address no</td>
<td><spring:input path="address.ano"/></td>

</tr>
<tr>
<td>City</td>
<td><spring:input path="address.city"/></td>

</tr>
<tr>
<td>State</td>
<td><spring:input path="address.state"/></td>

</tr>

<tr>
<td><input type="reset" value="Clear"></td>
<td><input type="submit" value="Create"></td>

</tr>



</table>


</spring:form>

</body>
</html>