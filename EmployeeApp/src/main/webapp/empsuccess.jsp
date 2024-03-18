<%@page import="com.employeeapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Employee employee=(Employee) request.getAttribute("employee");
String employeeName=employee.getEmployeeName();
out.println("welcome"+employeeName+"<br");
String city=employee.getCity();
out.println("city"+city+"<br>");
double salary=employee.getSalary();
out.println("salary "+salary+"<br>");
Integer employeeId=employee.getEmployeeId();
out.println("employeeId"+employeeId+"<br>");
String course=employee.getCourse();
out.println("course"+course+"<br>");

%>
</body>
</html>