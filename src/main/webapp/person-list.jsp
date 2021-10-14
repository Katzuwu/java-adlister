<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Person" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/14/21
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% List<Person> personList = new ArrayList<>(Arrays.asList(
		new Person(1, "Bob", "Smith", 44),
        new Person(2, "John", "Doe", 23),
        new Person(3, "Steve", "Mcgee", 15)
));
request.setAttribute("personList", personList);%>
<html>
<head>
    <title>entity.Person List</title>
    <style>
        <%@include file="style/person-list-stylesheet.css"%>
    </style>
</head>
<body>
<h1>List of People</h1>
    <table>
        <tr>
            <th>Person First Name</th>
            <th>Person Last Name</th>
            <th>Person Age</th>
        </tr>
        <c:forEach var="person" items="${personList}">
            <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.age}</td>
            </tr>
        </c:forEach>
    </table>
<%@include file="display-extra-person.jsp"%>
</body>
</html>
