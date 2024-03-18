<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.*" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("sessionId "+session.getId()+"<br>");
out.println("Maxinactive "+session.getMaxInactiveInterval()+"<br>");
String username=(String)session.getAttribute("username");
out.println("welcome "+username+"<br>");

List<String>movies=(List<String>) request.getAttribute("movies");
for(String movie:movies){
	out.println(movie);
}
%>
</body>
</html>