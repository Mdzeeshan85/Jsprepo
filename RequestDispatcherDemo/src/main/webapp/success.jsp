<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Employee Details</i></h1>
<%
String username=(String)request.getAttribute("username");
String city=(String)request.getAttribute("city");
double salary=(Double)request.getAttribute("salary");//
String course=(String)request.getAttribute("course");
Long mobile=(Long)request.getAttribute("mobile");
String[] hobbies=(String[])request.getAttribute("hobbies"); //

out.println("name: "+username+"<br>");
out.println("city: "+city+"<br>");
 out.println("salary: "+salary+"<br>");//
out.println("selected course: "+course+"<br>");
out.println("mobile: "+mobile+"<br>");
out.println("hobbies ");
for(String hobby:hobbies){ 
out.println("hobby: "+hobby.toUpperCase()+"<br>");//
}
%>
</body>
</html>