<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인</title>
	</head>
	<body>
	  <h2>로그인확인</h2>
	  <%
	  String id = request.getParameter("id");
	  	    String pw = request.getParameter("pw");
	  	    session.setAttribute("session_id", id); // session_id라는 이름으로 id를 세션에 저장
	  	    if(id.equals("aaa") && pw.equals("1111")) {
		  	  response.sendRedirect("mainPage.jsp"); // 바로 보내기
	  		} else {
	  		  response.sendRedirect("login.jsp");
	  		}
	  %>
	  
	</body>
</html>