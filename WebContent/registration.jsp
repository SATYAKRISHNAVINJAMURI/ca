<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Ca" method="post">  
<input type="text" name="uname" placeholder="Name"/><br/>  
<input type="text" name="uemail"  placeholder="email"/><br/>  
<input type="text" name="courseName"  width=100 value=<%=request.getParameter("course") %>/><br/>  

<input type="text" name="phonenum" placeholder="phoneNumber"><br/>
<input type="number" name="10thmarks" placeholder= "xth marks"/><br/>
<input type="number" name="12thmarks" placeholder= "12th marks"/><br/>
<input type="number" name="entrancemarks" placeholder= "entrance marks"/><br/>
<input type="date" name="dob" placeholder="date of birth"/><br>
<input type="hidden" name="action" value="register"/>
<input type="submit" value="register"/>  
</form>  

</body>
</html>