package j0115;

import java.util.Scanner;

public class Ja0115_02배열예제 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아, 5개를 저장하고, 5개의 값을 출력하고 합계를 출력
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0; i<5; i++) {			
			System.out.println(i+1+"번째 숫자를 입력하세요. >> ");
			int input = scan.nextInt();
			arr[i] = input;
		}
		
		scan.close();

	}

}
