package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1-5까지의 랜덤숫자를 생성해서
		// 5번 입력받아 랜덤숫자를 몇번 맞췄는지 개수를 출력하시오.
		// 입력했던 숫자도 모두 출력하시오.
		
		// 랜덤숫자 : 3
		// 정답횟수 : 1
		// 입력숫자 : 1,2,3,4,5
		
		int ran = (int)(Math.random()*5)+1;
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int count = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("숫자를 입력하세요.>> ");
			int input = scan.nextInt();
			arr[i] = input;
			if (input == ran) {
				count += 1;
			}
		}
		System.out.println("랜덤숫자 : "+ran);
		System.out.println("정답횟수 : "+ count);
		System.out.println("입력숫자 : "+ arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);
		System.out.println("입력숫자 : "+ Arrays.toString(arr)); // 배열 한번에 출력
		scan.close();
		
	}

}
