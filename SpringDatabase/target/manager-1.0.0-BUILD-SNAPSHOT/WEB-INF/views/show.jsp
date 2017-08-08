<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>   

<%@page session ="false" %>
<%@taglib prefix="myform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<font color = "Blue" size = "5px">Records are given below : </font> <br><br>
<table border = "1">
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>ContactNumber</th>
<th>E-Mail Address</th>
<th>Password</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach items ="${list}" var = "item">
<tr>
<td>${item.id }</td>
<td>${item.firstname}</td>
<td><c:out value="${item.lastname}" /> </td>
<td><c:out value="${item.contact}" /> </td>
<td><c:out value="${item.email}" /> </td>
<td><c:out value="${item.password}" /> </td>
<td><a href='<c:url value="#" />'>Edit</a></td>
<td><a href='<c:url value="#" />'>Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>