<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Score board</title>
</head>
<body style="background-color: #F4ECF7;text-align:center">

<h1></h1>
<font face="Century Gothic">
		<center>
			<h1>
				<u>Score Board</u>
			</h1>
		</center>
		<table border="1" align="center" width="400">
			
			
			
			
				<th>Subject Name:</th>
			<td>${sessionScope.subjectName}</td>
			</tr>
			<tr>
				<th>Level Name</th>
			<td>${sessionScope.levelName}</td>
			</tr>
			<tr>
				<th>Score</th>
				<td>${sessionScope.score}</td>
			</tr>
			
		</table>
	</font>

	</center>
	<center><br><br><br>
<font face="Century Gothic"><a href="startTest.jsp">Take Another Test</a></font>
<br>
<br>
<font face="Century Gothic"><a href="description.jsp">View Description</a></font>

</center>
<%
session.removeAttribute("score");
session.removeAttribute("counter");
session.removeAttribute("levelName");
session.removeAttribute("subjectName");
session.removeAttribute("questions");
session.removeAttribute("question");
session.removeAttribute("isRight");
%>
</body>
</body>
</html>