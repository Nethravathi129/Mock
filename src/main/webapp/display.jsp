<%@page import="com.jsp.dto.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>email</th>
<th>name</th>
<th>phone</th>
<th>pwd</th>
<th>role</th>
</tr>
<%
EmpDto dto=(EmpDto) request.getAttribute("requestKey");
%>
<tr>
<td><%=dto.getEmail() %></td>
<td><%=dto.getName() %></td>
<td><%=dto.getPhone() %></td>

<td><%=dto.getPwd() %></td>
<td><%=dto.getRole() %></td>
</tr>

</table>
</body>
</body>
</html>