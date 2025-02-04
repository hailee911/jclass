<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
	  <h2>회원가입</h2>
	  <form action="j0204_07.jsp" method="post">
	    <label>아이디</label>
	    <input type="text" name="id"><br>
	    <label>비밀번호</label>
	    <input type="text" name="pw"><br>
	    <label>이름</label>
	    <input type="text" name="name"><br>
	    <label>전화번호</label><br>
	    <input type="text" name="tel">
	    <label>성별</label><br>
	    <input type="radio" name="gender" id="man" value="man">
	    <label for="man">남자</label>
	    <input type="radio" name="gender" id="woman" value="woman">
	    <label for="woman">여자</label>
	    
	    <label>취미</label>
	    <input type="checkbox" id="game" name="hobby" value="게임" <c:if test="${fn:contains(list[0].hobby,'게임')}">checked</c:if>>
	 	<label for="game">게임</label>
	 
		<input type="checkbox" id="golf" name="hobby" value="골프" <c:if test="${fn:contains(list[0].hobby,'골프')}">checked</c:if>>
		<label for="golf">골프</label>
		 
		<input type="checkbox" id="swim" name="hobby" value="수영" <c:if test="${fn:contains(list[0].hobby,'수영')}">checked</c:if>>
		<label for="swim">수영</label>
		 
		<input type="checkbox" id="run" name="hobby" value="조깅" <c:if test="${fn:contains(list[0].hobby,'조깅')}">checked</c:if>>
		<label for="run">조깅</label>
		 
		<input type="checkbox" id="book" name="hobby" value="독서" <c:if test="${fn:contains(list[0].hobby,'독서')}">checked</c:if>>
		<label for="book">독서</label>
	    
	    
	    
	    <br>
	  </form>
	
	</body>
</html>