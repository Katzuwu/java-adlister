<%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/22/21
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<jsp:include page="/WEB-INF/partials/head.jsp">
		<jsp:param name="title" value="Register Here" />
	</jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div>
	<h1>Register:</h1>
	<form method="post" action="/register">
		<div class="form-group">
			<label for="email">Email</label>
			<input id="email" name="email" class="form-control" type="text">
		</div>
		<div class="form-group">
			<label for="username">Username</label>
			<input id="username" name="username" class="form-control" type="text">
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input id="password" name="password" class="form-control" type="password">
		</div>
		<button type="submit" class="submit-btn">Register!</button>
	</form>
</div>
</body>
</html>
