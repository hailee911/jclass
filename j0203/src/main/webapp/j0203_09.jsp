<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		  String name = URLEncoder.encode(request.getParameter("name"), "UTF-8"); //인코딩
		  // 파라미터로 데이터 전달시 URLEncoder utf-8로 인코딩을 해줘야 함.
		  String sage = request.getParameter("age");
		  int age = Integer.parseInt(sage);
		  
		  if(age>=20) {
			  //이름 나이 같이 전달
			  response.sendRedirect("./pass.jsp?name="+name+"&age="+age);
		  }else{
			  response.sendRedirect("./fail.jsp?name="+name+"&age="+age);
		  }

		%>
	</body>
</html>