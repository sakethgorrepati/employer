<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee details</title>
</head>
<body>
<h4 align="left"><a href="home.htm">Home</a></h4>
<h4 align="right"><a href="showLogin.htm">Logout</a></h4>
 <table align="center" border="1">
 <th>Eno </th>
 <th>Ename </th>
 <th>Gender</th>
 <th>Salary </th>
 <th>Username</th>
 <th>City </th>
 <th>State </th>
 
 <c:forEach var="user" items="${allEmployees}">
 <tr>
 
 <td><c:out value="${user.getEno()}"> </c:out></td>
 <td><c:out value="${user.getEname()}"> </c:out></td>
 <td><c:out value="${user.getGender()}"> </c:out></td>
 <td><c:out value="${user.getSalary()}"> </c:out></td>
 <td><c:out value="${user.getUsername()}"> </c:out></td>
 <td><c:out value="${user.address.getCity()}"> </c:out></td>
 <td><c:out value="${user.address.getState()}"> </c:out></td>
 <td><a href="remove.htm?ano=${user.address.getAno()}">delete</a></td>

 
 </tr>
 </c:forEach> 
 </table>
</body>
</html>