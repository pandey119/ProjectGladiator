<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
<style type="text/css">
body {
	background-color: rgb(234, 252, 251);
}

#head1 {
	text-align: center;
	font-weight: 400;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

.logindiv {
	margin-left: 35%;
	width: 300px;
	height: 300px;
	background-color: rgba(0, 0, 0, 0.5);
	border-radius: 10px;
}

.form1 {
	padding-top: 30px;
	text-align: center;
	font-size: 24px;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
		sans-serif;
}

.table1 {
	
}

.links {
	margin-left: 30%;
	padding-top: 10px;
}
</style>
</head>
<body>
	<h1 id='head1'>Welcome to our Login page!</h1>
	<form action="controller/studentLogin" method="post">
		<div class="logindiv">
			<table class="table1">
				<span>UserName:* </span>
				<input type="text" placeholder="Type your username" name="email" required>
				<br />
				<span>Password:* </span>
				<input type="password" placeholder="Type your password"
					name="password" required>
				<br>
				<br>
				<button type="submit">Login</button>

			</table>
			
			</div>
	</form>
	<div class="links">
		<a href="forgotpassword.jsp">Forgot Password?</a><br> <a
			href="register.jsp">Register here!</a>
	</div>
	</div>

</body>
</html>