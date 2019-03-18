<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<base href="/exam_portal/">
<title>Questions</title>
</head>
<h1>Test</h1>
<body style="background-color: #F4ECF7;text-align:center">
<center>
<h2>
	<form action="controller/submitQuestion" method="get">
		<%
		
			int i = 1;
		%>
		<table>
			<tr>
				<%-- ${ sessionScope.question[counter].question} --%>
				<td>Question:</td>
				<td>"${question.question}"</td><br> <br>

				<c:forEach items="${ sessionScope.question.options }" var="p"
					varStatus="v">
					<tr>
						<td><input type="radio" name="option"
							 value="${p.oid}">
						<td>${p.optionText}</td>
						
						


					</tr>
					<br>



				</c:forEach>
			</tr>
		</table>
		<button type=submit>Next</button>
		</h2>
	</form>
	</center>
	<%--  <a href="controller/fetchQuestion?levelName=${sessionScope.levelName}&subjectName=${sessionScope.subjectName }">Next</a> --%>
	
</html>