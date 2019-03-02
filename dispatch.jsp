<%@ page language="java" contentType="text/html;"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Dispatcher Check</title>
</head>
<body>
<form action="HttpServletDemoRequestDispatch" method="get">
	<table><center>
		<tr bgcolor="pink">
			<td colspan="2"> Login Here </td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" name="username" required/></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" required/></td>
		</tr>
		<tr>
			<td colspan="2">
			<center><input type="submit" value="Sign in"/></center>
			</td>
		</tr>
		</center>
	</table></form>

</body>
</html>