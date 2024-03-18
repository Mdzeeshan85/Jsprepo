<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doctorServlet" method="post">
Enter Name<input type="text" name="doctorName">
Enter doctorId<input type="text" name="doctorId">
Enter fees<input type="number" name="fees">
Enter ratings<input type="number" name="ratings">
Enter experience<input type="text" name="experience">
<select name="speciality">
<option value="ortho">orthopedic</option>
<option value="nerv">nervology</option>
<option value="pedia">pediatic</option>
<option value="derma">dermalogist</option>
</select>
<input type="submit" value="submit">
</form>
</body>
</html>