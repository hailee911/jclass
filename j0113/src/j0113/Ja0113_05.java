package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		
		// boolean - true,false
		// char - ''표시, 아스키코드값 : 65 -> 'A', 97 -> 'a', 48 -> '0'
		// 정수형 - byte, short 거의 사용 안함 / 기본형 정수 int - 값을 입력
		// 정수형 - long - 접미사 L붙여야 함.
		// 실수형 - float - 접미사 F붙여야 함 / double - D 생략가능
		
		
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = '\u0041'; // 16*4 + 1 = 65 -> A
		System.out.println(ch2);
		
		char ch3 = 97; // -> a
		System.out.println(ch3);
		
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		boolean p = true;
		boolean p2 = false;
		System.out.println(p);
		System.out.println(p2);
		
		long l = 10000000000L;
		System.out.println(l);
		
		float f = 3.14F;
		float f2 = 100F;
		System.out.println(f);
		System.out.println(f2);

		double d = 3.14;
		System.out.println(d);
	}

}
