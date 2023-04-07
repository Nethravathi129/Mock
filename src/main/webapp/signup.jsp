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
<body>
<form:form action="insert" modelAttribute="empobject">
<form:input path="email" placeholder="email"/><br>
<form:input path="pwd" placeholder="pwd"/><br>
<form:input path="name" placeholder="name"/><br>
<form:input path="phone" placeholder="phone"/><br>
<form:input path="role" placeholder="role"/><br>
<form:button>submit</form:button>
<form:button>Cancel</form:button>
</form:form>
</body>
</body>
</html>