package j0113;

public class Ja0113_08 {

	public static void main(String[] args) {
		// 연산자
		System.out.println(10/3.0); // 3.3333333333333335
		
		// %d - 정수형 byte, short, int, long , %f - 실수형 float, double
		// %s - 문자열 String, %c - 문자형 char
		// 자리수 표시, 천단위 표시가능, 16진수, 8진수 출력가능
		System.out.printf("%.3f \n", 10/3.0); // 3.333
		System.out.printf("%,d \n", 1000000000); // 1,000,000 - 천단위 표시
		System.out.printf("나이 : %d, 생년 : %d \n", 14, 2017); // 나이 : 14, 생년 : 2017
		System.out.printf("%05d \n", 100); // 00100
		System.out.printf("%5d \n", 100); //   100 - 5자리 확보
		
		// ---------------------------------------------------
		System.out.println("나이 : " + 14 + ", 생년 : " + 2017); // 나이 : 14, 생년 : 2017
	
		
		System.out.printf("%d \n", 0x1A); // 26 - 16진수
		System.out.printf("%#X", 65); // 0X41
		
		
	}

}
