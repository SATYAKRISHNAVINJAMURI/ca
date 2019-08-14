<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello Welcome. </h1>
<%@ page import= "com.ca.classes.Branches,java.util.List" %> 
<a href="login.jsp">Login</a>
<table border='1'>
<% List<Branches> branchList=(List<Branches>)request.getAttribute("branchList"); %>
<h1>List of Courses we offer</h1>
<%
for(Branches branch:branchList){
String s="";
String s1=branch.getBranch_course();
for(int i=0;i<s1.length();i++){
	if(s1.charAt(i) !=' ')
		s += s1.charAt(i);
}
%>  
	<tr>
	
	<td><a href="registration.jsp?course=<%=s %>>"  value=<%branch.getBranch_course(); %>><%= branch.getBranch_course() %></a></td>
	</tr>
<% }%>

</table>
<h1>click the below link to check the merit list</h1>
<form action="Ca" method="get">
<input type="button" name="action" value="merit"/></form>

</body>
</html>