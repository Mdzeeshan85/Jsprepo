<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="employeeServlet" method="post">
Enter name<input type="text" name="employeeName">
Enter city<input type="text" name="city">
Enter salary<input type="number" name="salary">
Enter employeeId<input type="text" name="employeeId">

<select name="course">
<option value="java">java</option>
<option value="spring">spring</option>
<option value="Html">Html</option>
</select>
<input type="submit" value="submit">
</form>

</body>
</html>