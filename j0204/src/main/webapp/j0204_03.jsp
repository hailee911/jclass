<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>해당값 반복</title>
	</head>
	<body>
	
	<c:set var="st" value="${param.st}"/>
	<c:set var="ed" value="${param.ed}"/>

	<c:forEach begin="${st}" end="${ed}" step="1" var="i">
		<div>값 : ${i}</div>
    </c:forEach>
    
</body>
</html>