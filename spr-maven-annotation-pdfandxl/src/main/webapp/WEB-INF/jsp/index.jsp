<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report</title>
</head>
<body>
 <table border="1" >
  <thead>
   <tr>
    <td>Id</td>
    <td>Emp Name</td>
    <td>Emp Salary</td>
   </tr>
  </thead> 
  <tbody>
   <c:forEach items="${empList}" var="emp" >
    <tr>
     <td>${emp.id }</td>
     <td>${emp.name }</td>
     <td>${emp.salary }</td>
    </tr>
   </c:forEach>
  </tbody>
 </table>
 
 <spring:url value="/?type=xls" var="xlsURL" />
 <spring:url value="/?type=pdf" var="pdfURL" />
 <a href="${xlsURL}">Download Excel</a>
 <a href="${pdfURL}">Download PDF</a>
 
</body>
</html>