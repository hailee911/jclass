package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요. ");
		char str = scan.next().charAt(0);
		
		// 대문자로 출력하시오.
		str = (char)(str-32);
		System.out.println(str);
		
		scan.close();
		
		
//		char ch1 = 'a';
//		char ch2 = (char)(ch1-32);
//		System.out.println(ch2); // A
//		
//		char ch3 = 'A';
//		char ch4 = (char)(ch3+32);
//		System.out.println(ch4); // a
		
//		char c1 = 'a';
//		char c2 = (char)(c1+1);
//		System.out.println(c2); // b
//		
//		int n1 = c1 + 1;
//		System.out.println(n1); // 98
//		
//		char c3 = ++c1;
//		System.out.println(c3); // b
//		
//		int n2 = 'B' -  'A';
//		System.out.println(n2); // 1
//		
//		int n3 = '9' - '0';
//		System.out.println(n3); // 9
//		
//		int n4 = '2' - '0';
//		System.out.println(n4); // 2
		
		
		// byte, short, char 사칙연산을 하면 int타입이 변경됨.
		
//		byte a = 1;
//		byte b = 2;
//		byte c =(byte)(a+b);
//		System.out.println(c);
//		byte d = (byte)a + (byte)b; // 에러
		
//		char ch = 'a'; // 아스키코드값 97
//		char ch2 = 'b'; // 아스키코드값 98
//		int ch3 = ch+ch2; // 195
//		System.out.println(ch3);
		// 이항연산자의 특징
		// 연산을 수행하기 전에 피연산자의 타입을 일치시킨다.
		// int보다 크기가 작은 타입은 int로 변환된다. (byte, short, char)
		// 피연산자 중 표현범위가 큰 타입으로 형변환 한다. (long, float, double)
		
//		double d1 = 3.14;
//		int num = (int)(d1);
//		System.out.println(num);
		
//		int a = 10000000;
//		int b = 20000000;
//		long c = (long)a*b; // int * int = int, int * long = long 
//		System.out.println(c);
		
//		int n1 = 2100000000;
//		int n2 = 2000000000;
//		long n3 = (long)n1 + n2;
//		System.out.println(n3);	
		
		
//		int a = 10;
//		a++; // a를 1 증가
//		int b = a; // a의 값을 b에 대입
//		System.out.println("a : "+ a); // 11
//		System.out.println("b : "+ b); // 11
	}

}
