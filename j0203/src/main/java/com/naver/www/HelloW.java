package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/HelloW")
public class HelloW extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		// 프로그램 구현
		response.setContentType("text/html; charset=UTF-8"); // 응답 데이터 타입 설정
		request.setCharacterEncoding("UTF-8"); // 요청 데이터 인코딩 설정
		PrintWriter writer = response.getWriter(); // 응답 데이터 출력을 위한 PrintWriter 객체 생성
		writer.println("<html>");
		writer.println("<head><title>서블릿 페이지</title></head>");
		
		writer.println("<body>");
		writer.println("<h2>서블릿 페이지 오픈 </h2>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}

}
