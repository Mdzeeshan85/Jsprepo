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
//String username=(String)request.getAttribute("username");

out.println("sessionId "+session.getId()+"<br>");
out.println("Maxinactive "+session.getMaxInactiveInterval()+"<br>");
String username=(String)session.getAttribute("username");
session.setMaxInactiveInterval(1);
out.println("welcome "+username+"<br>");
//String password=(String)request.getAttribute("password");
%>
<form action="movieServlet">
<select name="language">
<option value="english">english</option>
<option value="hindi">hindi</option>
<option value="tamil">tamil</option>
<option value="telegue">telegue</option>
</select>
<input type="submit" value="submit">
</form>
</body>
</html>