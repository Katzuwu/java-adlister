<%--
  Created by IntelliJ IDEA.
  User: ianarellano
  Date: 10/18/21
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<jsp:include page="/partials/head.jsp">
		<jsp:param name="title" value="Ads" />
	</jsp:include>
	<style>
		div{
			border: 1px solid black;
		}
	</style>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<h1>Ads: </h1>
	<div>
		<c:forEach var="ad" items="${ads}">
			<div>
				<p>${ad.userId}</p>
				<p>${ad.title}</p>
				<p>${ad.description}</p>
			</div>
		</c:forEach>
	</div>

</body>
</html>
