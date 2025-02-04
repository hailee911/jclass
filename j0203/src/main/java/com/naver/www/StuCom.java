package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StuCom")
public class StuCom extends HttpServlet {
	
	// 학번,이름,국어,영어,수학,합계,평균을 콘솔창, 웹페이지로 출력하시오.
	// String -> int - Integer.parseInt
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 콘솔창 출력
		System.out.println("doAction 호출");
		String stuNo = request.getParameter("stuNo");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
		double avg = total/3.0;
		System.out.println("학번 : " + stuNo);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		
		// 웹페이지 출력
		response.setContentType("text/html; charset=UTF-8"); // 응답 데이터 타입 설정
		request.setCharacterEncoding("UTF-8"); // 한글인코딩
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>학생 성적</title></head>");
		writer.println("<body>");
		writer.println("<h2>회원가입 정보</h2>");
		writer.printf("<h4>학번 : %s </h4>\n", stuNo);
		writer.printf("<h4>이름 : %s </h4>\n", name);
		writer.printf("<h4>국어 : %s </h4>\n", kor);
		writer.printf("<h4>영어 : %s </h4>\n", eng);
		writer.printf("<h4>수학 : %s </h4>\n", math);
		writer.printf("<h4>합계 : %d </h4>\n", total);
		writer.printf("<h4>평균 : %.2f </h4>\n", avg);
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
