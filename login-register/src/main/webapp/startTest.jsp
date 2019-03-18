<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start Test</title>
</head>
<body style="background-color: #F4ECF7;text-align:center">



<form action="controller/fetchQuestion" method="get">
<center><h1>Let's Explore </h1><br>
<h1>Select Level:</h1>
<select name="levelName">
						<h2>	<option value="level1">Level1</option>
							<option value="level2">Level2</option>
							<option value="Level3">Level3</option>
							</select><br> </h2>
							<input hidden="hidden" type=number value="0" name="counter"/>
							<h1>Select Subject Name:</h1>
					<select name="subjectName">
					<h2>		<option value="JAVA">Java</option>
							<option value="C/C++">C/C++</option>
							<option value="Python">Python</option>
							<option value="SQL">SQL</option>
							<option value="C#/.net">C#/.net</option>
							<option value="PHP">PHP</option>
					</select>
						<input hidden="hidden"  type=number value="0" name="score"/><br></h2><br>
<button type="submit"><h3>Start the Test!</h3></button>
</center>
</form>
</body>
</html>