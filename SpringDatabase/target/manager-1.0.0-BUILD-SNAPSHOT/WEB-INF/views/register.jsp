<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session ="false" %>
<%@taglib prefix="myform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<myform:form action ="${pageContext.request.contextPath}/storedata" method ="post" modelAttribute="ma">
<table cellpadding = "10" border ="1">
<tr> <td colspan = "2"> <h4><font color = "red" size = "20px"><center>Login page</center></font></h4> </td></tr>
<tr><td>FirstName:</td><td><myform:input path = "firstname" /></td></tr>
<tr><td>LastName:</td><td><myform:input path = "lastname" /> </td></tr>
<tr><td>Contact Number:</td><td><myform:input path = "contact" /> </td></tr>
<tr><td>Email Address:</td><td><myform:input path = "email" /> </td></tr>
<tr><td>Password:</td><td><myform:password path = "password" /> </td></tr>
<tr><td>Confirm password:</td><td><myform:password path = "confirmpassword" /> </td></tr>
<tr><td colspan="2"><input type = "submit" value ="submit"> &nbsp;&nbsp;
<input type = "reset" value ="clear"> </td></tr>
</table>
${msg}
</myform:form>
</body>
</html>