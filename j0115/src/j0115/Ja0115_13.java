package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 1-45까지 로또번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		
		//1. 변수선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[6]; // 로또번호
		int[] input = new int[6]; // 입력 숫자
		int[] ball = new int[45]; // 1-45
		int[] result = new int[6]; // 맞은 숫자
		int count = 0;
		
		//2. 1-45 번호저장
		for (int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		//3. 배열섞기
		int temp = 0;
		for (int i=0; i<300; i++) {
			int ran = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}

		
		//4. 6개 로또번호
		for (int i=0; i<6; i++) {
			int ran = (int)(Math.random()*45)+1;
			lotto[i] = ball[ran];
			for(int j=0; j<6; j++) {
				if (lotto[i]==lotto[j]) {
					lotto[j] = ball[ran];
				}
			}
		}
		//5. 입력창만들기
		System.out.println("[ 로또 ]");
		for (int i=0; i<6; i++) {
			System.out.println((i+1)+"번 숫자 입력 >>");
			input[i] = scan.nextInt();
			for (int j=0; j<6; j++) {
				if (input[i] == lotto[j]) {
					result[i] = input[i];
					count++;
				}
			}
		}
		System.out.println("로또 번호 : "+Arrays.toString(lotto));
		System.out.println("내 번호 : "+ Arrays.toString(input));
		System.out.println("맞춘 번호 : "+ Arrays.toString(result));
		System.out.println("맞춘 개수 : "+ count);
		
		scan.close();
		
		// 6. 맞춘번호 확인 - input,lotto
		// 7. 출력

	}

}
