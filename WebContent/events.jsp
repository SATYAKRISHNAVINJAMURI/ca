<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> This is Event page.</h1>
<%@ page import= "com.ca.classes.Event,java.util.List" %> 

<table border='1'>
<tr>
<th>Event Name</th>
<th>Description</th>
<th>Time</th>
<th>Venue</th>
</tr>
<% List<Event> Eventlist =(List<Event>)request.getAttribute("events_list");
for(Event al: Eventlist){ %>

<tr>
 <td><%=al.getName() %></td>
 <td><%=al.getDescription() %></td>
 <td><%=al.getTime() %></td>
<td> <%=al.getVenue() %></td>

<% } %>
</table>

</body>
</html>