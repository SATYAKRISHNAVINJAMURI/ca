<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> This is Merit page.</h1>
<%@ page import= "com.ca.classes.Merit,java.util.List" %> 

<table border='1'>
<tr>
<th> Name</th>
<th>Course Name</th>
<th>Phone</th>
<th>Email</th>
</tr>
<% List<Merit> meritlist =(List<Merit>)request.getAttribute("merit_list");
for(Merit al: meritlist){ %>

<tr>
 <td><%=al.getName() %></td>
 <td><%=al.getCourseName() %></td>
 <td><%=al.getPhone() %></td>
<td> <%=al.getEmail() %></td>

<% } %>
</table>

</body>
</html>