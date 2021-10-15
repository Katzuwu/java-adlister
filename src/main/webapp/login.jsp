<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/15/21
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login"/>
    </jsp:include>
<body>
<%@include file="partials/navbar.jsp"%>
<form method="POST">
    <label for="username">Username:</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password">
    <input type="submit" value="Submit">
</form>
<% String username = request.getParameter("username");
   String password = request.getParameter("password");
    if (Objects.equals(username, "admin") && Objects.equals(password, "password")) {
        String redirect = "http://localhost:8080/profile.jsp";
        response.sendRedirect(redirect);
    }
%>
</body>
</html>
