package j0117;

import java.util.Arrays;

public class Ja0117_02 {

	public static void main(String[] args) {
		//1명 학생 성적을 입력
		StuScore stu = new StuScore();
		stu.no = 1;
		stu.name = "홍길동";
		stu.kor = 100;
		stu.eng = 100;
		stu.cal_total();
		stu.cal_avg();
		
		StuScore s2 = new StuScore();
		s2.no = 2;
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.cal_total();
		s2.cal_avg();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.kor);
		System.out.println(stu.eng);
		System.out.println(stu.total);
		System.out.println(stu.avg);
		
		System.out.println(s2.no);
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.total);
		System.out.println(s2.avg);
		
		// 이순신 77 89
		StuScore s3 = new StuScore();
		s3.no = 3;
		s3.name = "이순신";
		s3.kor = 77;
		s3.eng = 89;
		s3.cal_total();
		s3.cal_avg();
		System.out.println(s3.no);
		System.out.println(s3.name);
		System.out.println(s3.kor);
		System.out.println(s3.eng);
		System.out.println(s3.total);
		System.out.println(s3.avg);
	}

}
