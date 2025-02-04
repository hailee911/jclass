<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지</title>
</head>
	<body>
	<%
		for(int i=0; i<10; i++){
			out.println(i+"<br/>");
		}
	%>
	<hr>
	<%
		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
				out.println(i+"*"+j+"="+i*j+"<br/>");
			}
			out.println("----------------");
			out.println("<br/>");
		}
	%>
	
	<%
		int k=0;
		while(k<10){
			out.println(k+"<br/>");
			k++;
		}
	%>
	
	</body>
</html>