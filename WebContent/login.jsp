<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
	a{
		font-size: 30px;
	}
	a:link
	{ color:blue;}
	a:visited{
	color:green;
	}
	a:hover{
		text-decoration: underline;
		font:size:50px;
	}
	input[type="text"],input[type="password"]
,input[type="submit"]
{
    width: 20%;
    padding: 12px 20px;
    margin: 8px 50;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
	border-radius:15px;
	text-align: center;
}
#form
{
    border: 3px solid #f1f1f1;
	width:20%;
	padding:60px;
	border-radius:15px;
	margin: 0 auto;
}
#s:hover {
    opacity: 0.5;
	background-color:rgb(22, 100, 54);
}
	
	#errormsg
	{
		color:red;
		font-size:18px;
		text-align: center;
	}
	
</style>
</head>
<body>
		<script>
			function check()
			{
				email = form1.email.value;
				password = form1.password.value;
				if(email=="") { //alert('email cannot be empty');
					document.getElementById("errormsg").innerHTML='email cannt be empty';
					return false;
				}
				if(password==""){ //alert('password cannot be empty');
					document.getElementById("errormsg").innerHTML='password cannt be empty';
						return false;
				}return true;
				//alert("form submitted");
			}
		
		</script>
	<div id="errormsg"></div>
	<form name="form1"  action="Ca" method="post" onsubmit='return check()'/>
	<input type="text" name="id" placeholder="Enter Id"/><br>
	<input type="password" name="password" placeholder="Enter password"/><br>
	<input type="submit" name="action" value="login"/>
	</form> 
	

</body>
</html>