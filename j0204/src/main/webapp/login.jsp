<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
	</head>
	<body>
	  <h2>로그인</h2>
	 <form action="doLogin.jsp" method="post">
	 <label>아이디</label>
	 <input type="text" name="id"><br>
	 <label>패스워드</label>
	 <input type="text" name="pw"><br>
	 <input type="submit" value="로그인">
	 </form>
	
	</body>
</html>