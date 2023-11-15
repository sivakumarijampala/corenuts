<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<body>
	<h1 align="center">Student Registration</h1>
	<form:form action="insert" method="POST" modelAttribute="obj">
		<div align="center">
			<label>Name:</label><br>
			<form:input path="name"  />
			<form:errors path="name" cssClass="error"></form:errors>
			<br>
			<br> <label>Age:</label><br>
			<form:input path="age" />
			<form:errors path="age" cssClass="error"></form:errors>
			<br>
			<br> <label>stdClass:</label><br>
			<form:input path="stdClass" />
			<form:errors path="stdClass" cssClass="error"></form:errors>
			<br>
			<br> <label>Subject1</label><br>
			<form:input path="subject1" />
			<form:errors path="subject1" cssClass="error"></form:errors>
			<br>
			<br> <label>Subject2</label><br>
			<form:input path="subject2" />
			<form:errors path="subject2" cssClass="error"></form:errors>
			<br>
			<br><label>Subject3</label> <br>
			<form:input path="subject3" />
			<form:errors path="subject3" cssClass="error"></form:errors>
			<br>
			
			<br> <input type="submit" value="AddStudent">
			
		</div>
	</form:form>
</body>
</html>