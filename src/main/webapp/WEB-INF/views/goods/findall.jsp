<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${goodslist}" var="item" varStatus="vs">
		<ul>
			<li>${item.goodsname}</li>
			<li>${item.price}</li>
			<li>${item.memo}</li>
			<li>${item.createtime}</li>
		</ul>

	</c:forEach>
</body>
</html>