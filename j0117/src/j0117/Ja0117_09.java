package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	
	//메소드
//	int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	// void 리턴값이 없을 때
//	boolean power; //인스턴스변수 - 객체선언 후, 참조변수명.변수명
//	void power() {
//		power = !power;
//		return;
//	}

	public static void main(String[] args) {
		
		// 2개의 값을 넘겨주면
		// 메소드 3개
		// a,b -> a,b 각각 10 더해서 두수를 더하기를 해서 리턴
		// a,b -> a,b 각각 10 곱해서 두수를 더하기 해서 리턴
		// a,b -> a,b 곱해서 리턴
		
		Cal2 c = new Cal2();
		
		int a = 10;
		int b = 10;
		
		// 입력이 -1 들어오면 프로그램을 종료.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("숫자1 입력 : ");
			a = scan.nextInt();
			if(a == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("숫자2 입력 : ");
			b = scan.nextInt();
			System.out.println("10더하고 더하기 : "+c.add(a, b));
			System.out.println("10곱하고 더하기 : "+c.mult(a, b));
			System.out.println("a*b : "+c.multiply(a, b));
			System.out.println();
		}
		
		scan.close();
		
		
		
		
//		int a = 0; //지역변수
//		Ja0117_09 j = new Ja0117_09(); // 객체선언
//		j.power = true;
//		System.out.println(j.power);
		
//		Cal c = new Cal(); // 객체선언
//		
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+ result2);
//		
//		c.mult(num, num2);
		
	}

}
