<%@page import="com.employeeappmaven.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Employee employee=(Employee)request.getAttribute("employee"); %>
<%="welcome "+employee.getEmployeeName() %><br>
<%="city "+employee.getCity() %><br>
<%="salary "+employee.getSalary() %><br>
<%="employeeId "+employee.getEmployeeId() %><br>
</body>
</html>