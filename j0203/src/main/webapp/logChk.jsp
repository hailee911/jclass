<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 저장 및 삭제</title>
	</head>
	<body>
		<!-- html주석 : 소스보기에 나타남.  -->
		<%-- jsp주석 : html 소스보기에 안나타남. --%>
		<!-- 저장되었는지, 삭제되었는지 출력 -->
		
		<%
			String id = request.getParameter("id");
			String[] saveId = request.getParameterValues("idsave");
			if(saveId != null){
				Cookie cookie = new Cookie("cook_id",id);
				cookie.setMaxAge(60*60*24*365);
				response.addCookie(cookie);
		%>
		<div><%= saveId[0] %>가 저장되었습니다.</div>
		<%}else{
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("cook_id")){
				cookie.setMaxAge(0);
				response.addCookie(cookie);
				}
			}
		%>
		<div>쿠키에 저장되어 있는 cook_id 가 삭제되었습니다.</div>
		<%} %>
		
		<button onclick="javascript:location.href='logOk.jsp'">쿠키 정보 확인하러가기</button>
	
	</body>
</html>