<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Question</title>
</head>
<body>
	<center>
		<form action="controller/addQuestionController" method="post">
			<h3>Adding Questions</h3>

			<table style="with: 50%">
				<tr>
					<td>Subject</td>
					<td> <select name="subjectName">
							<option value="JAVA">Java</option>
							<option value="C/C++">C/C++</option>
							<option value="Python">Python</option>
							<option value="SQL">SQL</option>
							<option value="C#/.net">C#/.net</option>
							<option value="PHP">PHP</option>
					</select>
					</td>
				</tr>

				<tr>
					<td>Level:</td>
					<td> <select name="levelName">
							<option value="level1" >Level1</option>
							<option value="level2" >Level2</option>
							<option value="level3" >Level3</option>
					</select>
					</td>
				</tr>

				<tr>
					<td>Question:</td>
					<td> <input type="text" name="question" /></td>
				</tr>

				<tr>
				<td>a.</td>
					<td> <input type="text" name="options[0]" /></td>
				</tr>
				<tr>
					<td>b.</td>
					<td> <input type="text" name="options[1]" /></td>
				</tr>
				<tr>
				<td>c.</td>
					<td><input type="text" name="options[2]" /></td>
				</tr>
				<tr>
				<td>d.</td>
					<td><input type="text" name="options[3]" /></td>
							
				</tr>
				<tr>
					<td>Correct Option:</td>
					<td> <select name="rightOptionNumber">
							<option value="1" >a</option>
							<option value="2" >b</option>
							<option value="3" >c</option>
							<option value="4" >d</option>
					</select>
					</td>
				</tr>


				

				 <tr>
				 <td></td>
					 <td> <center><input type="submit"  value="add" /></center> </td> 
					
				</tr>

			</table>
		</form>
	</center>
</body>
</html>