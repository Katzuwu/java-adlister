<%@ page import="entity.Person" %><%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/14/21
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    Person hogan = new Person(4, "Hulk", "Hogan", 60);
    request.setAttribute("hogan", hogan);
%>
<html>
<head>
    <title>Separate Fragment</title>
</head>
<body>
<ul>
    <li>
        ${hogan.firstName}
    </li>
    <li>
        ${hogan.lastName}
    </li>
    <li>
        ${hogan.age}
    </li>
</ul>
</body>
</html>
