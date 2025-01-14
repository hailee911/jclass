package j0114;

import java.util.Scanner;

public class Ja0114_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 3개의 숫자를 입력받아, 가장 큰수를 출력하시오.
		System.out.println("숫자1을 입력하세요.>> ");
		int score1 = scan.nextInt();
		System.out.println("숫자2을 입력하세요.>> ");
		int score2 = scan.nextInt();
		System.out.println("숫자3을 입력하세요.>> ");
		int score3 = scan.nextInt();
		
		// 3항연산자
		int maxNum = (score1>score2)?((score1>score3)?score1:score3):((score2>score3)?score2:score3);
		// 1이 2보다 크면 1과 3을 비교 1이 크면 1 3이 크면 3
		// 1이 2보다 작으면 2와 3을 비교 2가 크면 2 3이 크면 3
		System.out.println("가장 큰수는 "+maxNum+"입니다.");

		// 양수 0까지 포함, 음수
//		System.out.println("숫자를 입력하세요. >> ");
//		int score = scan.nextInt();
//		String result = score > 0 ? "양수" : (score==0) ? "음수" : "0";
//		System.out.println(result);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소문자를 입력하세요. ");
//		char input = scan.next().charAt(0);
//		if(input>='a' && input <= 'z') {
//			System.out.println("영문자입니다.");
//		} else {
//			System.out.println("영문자가 아닙니다.");
//		}
		
		
//		if(5>3) {
//			System.out.println("참");
//		}else{
//			System.out.println("거짓");
//			}
		
		// 올림 - ceil, 버림 - floor, 반올림 - round
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 3자리 실수를 입력하세요. ");
//		double input = scan.nextDouble();
//		
//		// 3자리에서 반올림해서 값을 출력하시오.
//		System.out.println(Math.round(input*100)/100.0);
//		
//		scan.close();
//		
//		System.out.println(Math.ceil(102.1345)); 
		
		// 반올림
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;
//		System.out.println(pi2);
		
		// 버림
//		float pi = 3.141592f;
//		float pi2 = (int)(pi*100)/100f;
//        System.out.println(pi2);
		
		scan.close();

	}

}
