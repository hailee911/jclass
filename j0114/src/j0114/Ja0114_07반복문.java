package j0114;

import java.util.Scanner;

public class Ja0114_07반복문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//while 구구단 출력
		int i = 2;
		while (i <= 9) {
			System.out.println(i + "단");
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d * %d = %d \n", i,j,i*j);
				j++;
			}
			i++;
		}
		
		// while문
//		int i = 1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		
//		for(int j=1; j<=5; j++) {
//			System.out.println("안녕"+i);
//		}
				
		
		// 3,5 입력하면 3단에서 5단까지 5,3 입력해도 3단에서 5단까지 출력하는 프로그램을 구현하시오.
//		System.out.println("숫자를 입력하세요. ");
//		int num = scan.nextInt();
//		int num2 = scan.nextInt();
//		int max,min;
//		
//		max = Math.max(num, num2);
//		min = Math.min(num, num2);
		
//		if(num>num2) {
//            max = num;
//            min = num2;
//          } else {
//				max = num2;
//				min = num;
//            }
		
//		for (int i = min; i <= max; i++) {
//			System.out.println( i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
		
		
		// 입력받은 숫자부터 9단까지 출력하는 프로그램을 구현하시오.
//		int num = scan.nextInt();
//		for (int i = num; i <= 9; i++) {
//			System.out.println("구구단 " + i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
		
		// 구구단
//		for (int i = 2; i <= 9; i++) {
//			System.out.println("구구단 " + i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
		
		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오.
//		System.out.println("영문자를 입력하세요. ");
//		String input = scan.next();
		
		//for
//		for(;;) { // 무한반복
//			 System.out.println("안녕");
//		}
		
		 
		// 1. 영문자인지 확인
		// 2. 글자를 1개씩 출력
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//				System.out.println(ch);
//			} else {
//				System.out.println("영문자가 아닙니다.");
//				break;
//			}
//		}
//		

		
		
//		for(int i=0; i < input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}
		
//		String input = "abcdefghijk";
//		System.out.println(input.length());
//		System.out.println(input.charAt(4)); // 4번째 글자
//		System.out.println(input.charAt(input.length()-1)); // 마지막 글자
//		
//		// 단어를 1개씩 출력
//		for(int i=0; i<input.length(); i++) { 
//			System.out.println(input.charAt(i));
//		}
		
//		System.out.println("글자를 입력하세요. (영문자만 입력가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch > 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//			System.out.println("출력 : "+ch);
//		} else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.!!");
//		}
		
		scan.close();
		
		
		// 반복문
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//			System.out.println(i);
//		}
//		System.out.println("합계 : " + sum);

	}

	}

