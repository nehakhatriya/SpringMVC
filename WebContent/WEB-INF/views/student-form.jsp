<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>Student Regitration Form</h1>
	<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName" />
		<br>
		<br>
    Last Name*: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
	Language: <br>
	C++:<form:radiobutton path="language" value="C++" />
	JAVA:<form:radiobutton path="language" value="JAVA" />
	JS<form:radiobutton path="language" value="JS" />
		<br>
		<br>
	Operating System:<br>
	Windows: <form:checkbox path="operSystem" value="Windows" />
	LINUX: <form:checkbox path="operSystem" value="Linux" />
		<br>
		<br>
    Select Country: <form:select path="country">

			<form:options items="${student.countryoptions}" />

			<form:option value="France" label="France"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
		</form:select>
		<br>
		<br>
    Passes*: <form:input path="freepasses" />
		<form:errors path="freepasses" cssClass="error" />
		<br>
		<br>
		<br>
		<br>
    Postal code*: <form:input path="postalcode" />
    <form:errors path="postalcode" cssClass="error"/>
		<br>
		<br>
		<input type="submit" />
	</form:form>
</body>
</head>
</html>