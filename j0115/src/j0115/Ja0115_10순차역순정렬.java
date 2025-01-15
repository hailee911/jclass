package j0115;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;


public class Ja0115_10순차역순정렬 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] ball = new String[45];  // 번호 45개
		int[] result = new int[6]; 
		
		//1-45 번호저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1+""; // 숫자 -> 문자열 변환
		}
		
		int c = 0;
		while(c < 6) {
			System.out.println("	  [ 로또 맞추기 ]");
			for(int i=0; i<ball.length; i++) {
				if(i%5 == 0) {
					System.out.println();
				}
				System.out.print(ball[i]+"\t");			
			}
			
			System.out.println();
			System.out.printf("입력: %d번째 >> ",c+1);
			int input = scan.nextInt();
			result[c] = input;
			// 입력한 번호 5 -> 5번자리 X 입력
			ball[input-1] = "X";
			c++;
		}
		// 입력번호 : 모두출력되도록 하시오.
		System.out.println("입력번호 : "+Arrays.toString(result));
		
		scan.close();
		
//		int[] num = {1,9,3,8,5,2,7};
//		Integer[] num2 = {1,9,3,8,5,2,7};
//		System.out.println(Arrays.toString(num));
//		//순차정렬
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		//역순정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));
		

	}

}
