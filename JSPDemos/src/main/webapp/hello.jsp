<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JS</h1>
<%String name="ZEESHAN";%>
<!--out.println("welcome "+name);-->
<%="welcome"+name %>

<br>
<% int x=10,y=20; %>
<!--<%out.println("sum "+(x+y)); %>-->
<%="sum "+(x+y) %>
<%!int counter=1; %>
<%=counter++ %>
<%int a=10/0; %>
<br>
<%!String greet(){
	return "welcome back";}%>
	<%=greet() %>
	
</body>
</html>