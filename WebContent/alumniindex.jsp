<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> This is alumni page.</h1>
<%@ page import= "com.ca.classes.Alumni,java.util.List" %> 
<a href="login.jsp">Login</a>
<table border='1'>

<form action="Ca" method="post">
	<input type="text" name="name"/>
	<input type="submit" name="action" value="search_alumni"/>
</form>


<% List<Alumni> alumnilist =(List<Alumni>)request.getAttribute("alumni_list");
for(Alumni al: alumnilist){ %>
<h3> Name: </h3> <%=al.getName() %>
<h3> Id: </h3> <%=al.getUser_id() %>
<h3> Email: </h3> <%=al.getEmail() %>
<h3> Phone: </h3> <%=al.getPhone() %>
<h3> Department: </h3> <%=al.getDepartment() %>
<h3> BatchFrom: </h3> <%=al.getYearOfJoining() %>
<h3> BatchTo: </h3> <%=al.getDepartment() %>
<% } %>
</body>
</html>