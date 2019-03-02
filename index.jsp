<%@ page language="java" contentType="text/html;"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page -Web Component</title>
</head>
<body>
<h3>Calling the HttpServlet using Hyperlink</h3>
<a href="HttpServletDemo">HttpServlet</a>

<h3>Calling the HttpServlet using Get Method</h3>
<form action="HttpServletDemo"method="get">
<input type="submit"value="SUBMIT-GET"></form>

<h3>Calling the HttpServlet using Form Method</h3>
<form action="HttpServletDemo"method="post">
<input type="submit"value="SUBMIT-POST"></form>


</body>
</html>