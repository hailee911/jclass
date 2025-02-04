<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그아웃</title>
	</head>
	<body>
	  <%
	    session.invalidate(); // 모든 세션 종료
	    // removeAttribute("session_id"); // session_id라는 이름의 세션만 종료
	    response.sendRedirect("mainPage.jsp"); // 메인페이지로 이동
	  %>
	
	</body>
</html>