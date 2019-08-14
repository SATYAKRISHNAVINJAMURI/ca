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

<table border='1'>
<tr>
<th>Name</th>
<th>userId</th>
<th>email</th>
<th>phone</th>
<th>department</th>
<th>joiningYear</th>
<th>department</th>
</tr>
<% List<Alumni> alumnilist =(List<Alumni>)request.getAttribute("alumni_list");
for(Alumni al: alumnilist){ %>

<tr>
 <td><%=al.getName() %></td>
 <td><%=al.getUser_id() %></td>
 <td><%=al.getEmail() %></td>
<td> <%=al.getPhone() %></td>
<td> <%=al.getDepartment() %></td>
<td> <%=al.getYearOfJoining() %></td>
<td><%=al.getDepartment() %></td></tr>

<% } %>
</table>

</body>
</html>