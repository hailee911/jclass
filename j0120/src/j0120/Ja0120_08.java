package j0120;

import java.util.Scanner;

public class Ja0120_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[3]; //배열선언
		for (int i = 0; i < s.length; i++) {
			System.out.println("학생이름을 입력 >> ");
			String name = scan.next();
			System.out.println("국어점수를 입력 >> ");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력 >> ");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력 >> ");
			int math = scan.nextInt();
			s[i] = new Stuscore(name, kor, eng, math);
			s[i].print();
		}
		
		Stuscore s1 = new Stuscore();
		System.out.println(s1.count);
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total / 3.0;
		s1.print();
		scan.close();
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		c2 = c1; // 얕은 복사 같은 주소
//		Car c3 = new Car(c1); // 다른 주소 *별개
		
		// 객체선언 후, 1,홍길동,100,100,100 넣어서
		// 1,홍길동,100,100,100,300,100.0 을 출력하시오.
//		Stuscore s = new Stuscore();
//		s.no = 1;
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 100;
//		s.total = s.kor + s.eng + s.math;
//		s.avg = s.total / 3.0;
//		System.out.printf("%d, %s, %d, %d, %d, %d, %.1f\n",s.no,s.name,s.kor,s.eng,s.math,s.total,s.avg);
//		s.print();
		
//		Stuscore s2 = new Stuscore(2,"유관순",98,97,99);
//		System.out.printf("%d, %s, %d, %d, %d, %d, %.1f\n",s2.no,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
//		s2.print();
		
		
		
//		Car c = new Car();
//		c.color = "White";
//		c.gearType = "auto";
//		c.door = 4;
//		
//		Car c2 = new Car("red","stick",6);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		
	}

}
