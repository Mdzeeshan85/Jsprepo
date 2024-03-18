<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
Enter name<input type="text" name="username">
Enter city<input type="text" name="city">
Enter salary<input type="number" name="salary">
Mobile<input type="number" name="mobile">
<select name="course">
<option value="java">java</option>
<option value="spring">spring</option>
<option value="Html">Html</option>
</select>
Hobbies
<input type="checkbox" name="hobbies" value="sports">sports
<input type="checkbox" name="hobbies" value="music" >music
<input type="checkbox" name="hobbies" value="dance">dance
<input type="checkbox" name="hobbies" value="travel">travel
<input type="submit" value="submit">
</form>

</body>
</html>