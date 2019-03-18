<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view Reports</title>
</head>
<body>
 <form action="controller/viewReportsController" method="get">
<h1>View Retailer</h1>  
<table border="1" width="50%" cellpadding="2">  
<tr><th>Id</th><th>Score</th></tr>  
   <c:forEach items=" ${ viewReports }" var= "rc">   
   <tr>  
    
   <td>${rc.score}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   
</form>
</body>
</html>