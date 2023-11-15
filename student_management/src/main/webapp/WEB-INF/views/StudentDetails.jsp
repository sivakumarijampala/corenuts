<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" 
href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
 crossorigin="anonymous">
 

<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" 
crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
     integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" 
     crossorigin="anonymous"></script>
         
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h1 >Student details</h1>
<h4>Total Students: ${obj.size()}</h4>

<table class="table" border="5">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">name</th>
      <th scope="col">Age</th>
      <th scope="col">Student class</th>
      <th scope="col">Subject1</th>
      <th scope="col">Subject2</th>
       <th scope="col">subject3</th>
       <th scope="col"><a href="studentPage" class="btn btn-success">Add Student</a></th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="stu" items="${obj}" >
    <tr>
      
      <td>${stu.id}</td>
      <td>${stu.name}</td>
      <td>${stu.age}</td>
      <td>${stu.stdClass}</td>
      <td>${stu.subject1}</td>
      <td>${stu.subject2}</td>
      <td>${stu.subject3}</td>
       <td>${stu.percentage}</td>
       <td>
         
      
      <a href="editing?id=${stu.id}"  class="btn btn-primary mr-2">Edit</a>
      <a href="delete?id=${stu.id}" onclick="return confirm('are u sure?')" class="btn btn-danger">Delete</a>
      </td>
     
      <td>
    </tr>
    </c:forEach>
  </tbody>
  
</table>


</body>
</html>