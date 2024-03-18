<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateServlet">
Enter name<input type="text" name="doctorName" value="${doctor.doctorName}"><br>
Enter Id<input type="text" name="doctorId" value="${doctor.doctorId}"readonly><br>
Enter speciality<input type="text" name="speciality" value="${doctor.speciality }"><br>
Enter fees<input type="number" name="fees" value="${doctor.fees }"><br>
Enter ratings<input type="number" name="ratings" value="${doctor.ratings }"><br>
Enter experience<input type="number" name="experience" value="${doctor.experience }"><br>
<input type="submit" value="submit">
</form>
</body>
</html>