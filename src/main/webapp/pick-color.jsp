<%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/18/21
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Color Picking</title>
</head>
<body>
<h3>Enter your favorite color</h3>
<form action="/pick-color" method="post">
	<input type="text" name="color">
	<button type="submit">Submit</button>
</form>
</body>
</html>
