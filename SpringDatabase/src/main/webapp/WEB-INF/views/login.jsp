<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ page session="false" %>
 <%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action= "${pageContext.request.contextPath }/login" method = "POST" modelAttribute="ma">
<font color ="Green" size="6">Login Page :</font>
<br>
<br>

<table border=1>
<tr><td>UserName:&nbsp;<form:input path="username"/></td> <td><form:errors path = "username" element = "div"/></td></tr> 
<tr><td>Password:&nbsp;&nbsp;<form:password path="password"/></td> <td> <form:errors path = "password" element = "div"/> </td></tr>
<tr><td><center><input type = "submit" value = "SUBMIT"></center></td></tr>
</table>

</form:form>
</body>
</html>