<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New User success</title>
</head>
<body>
	<form action="registerCustomer" method="post">
		<pre>
Id: <input type="text" name="id">
Name: <input type="text" name="name">
Email<input type="text" name="email">
<input type="submit" name="Register">
<%=request.getAttribute("status") %>
</pre>
	</form>

</body>
</html>