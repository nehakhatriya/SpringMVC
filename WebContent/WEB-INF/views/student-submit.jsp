<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
<body>
	<h1>Student Registered</h1>
	Student: ${student.firstName} ${student.lastName} <br>
	from ${student.country}, <br>
	language ${student.language}<br>
	Operating Systems:<br>
	<ul>
	<c:forEach var="temp" items="${student.operSystem}">
	<li>${temp}</li>
	</c:forEach>
	</ul>
</body>
</head>
</html>