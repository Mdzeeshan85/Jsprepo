<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%request.setAttribute("message","great day"); %>
<c:out value="${message }"></c:out>
<c:set var="mess" value="good day" scope="session"></c:set>
${sessionScope.mess }
<c:out value="today is a${mess }"></c:out>
<% List<String> fruits=Arrays.asList("apple","guava","mango","banana","kiwi");
session.setAttribute("fruitsList",fruits);
%>
<h2>using El</h2>
${fruitsList }<br>
<h2>using c:forEach</h2>
<c:forEach items="${fruitsList }" var="fruit" step="2">
${fruit }<br>
</c:forEach>
</body>
</html>