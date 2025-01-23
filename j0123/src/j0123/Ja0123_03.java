package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
//        Exception e = new Exception("에러 발생;");
//        throw new Exception("에러 발생"); // 에러발생;
		// 외부 자원을 사용할 때는 예외처리를 해야한다.
		try { // 정상적으로 돌아가는 프로그램 구현
			System.out.println(3/0); //에러발생
			System.out.println(4);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // 에러메세지 출력
			System.out.println("에러발생3-1");
			System.out.println("에러발생4-1");
		}
		System.out.println(5);
		System.out.println(6);
		
		
		// 오타 : 컴파일에러
//		Scanner scan = new Scanner(System.in);
//		int[] n = new int[3];
//		for (int i = 0; i < 4; i++) {
//			System.out.println("숫자를 입력하세요.");
//			n[i] = scan.nextInt(); // 런타임에러
//		}
		

	}

}
