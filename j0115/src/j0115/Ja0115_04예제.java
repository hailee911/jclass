package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04예제 {

	public static void main(String[] args) {
		// 1-100 랜덤숫자를 생성
		// 10번의 도전으로 해서 정답을 맞추면 종료
		// 랜덤숫자보다 큰수, 작은수입니다.
		// 입력한 숫자를 모두 출력
				
		// 랜덤숫자 : 55
		// 입력한 숫자 : 1,2,3,4,55
		// 도전 : 5
		
		int ran = (int)(Math.random()*100)+1; // 1-100 랜덤숫자
		int count = 0; // 도전 횟수
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("숫자를 입력하세요. >>");
			int input = scan.nextInt();
			arr[i] = input;
			count += 1;
			if (input == ran) {
				break;
			}else if (input > ran) {
				System.out.println("입력 숫자가 작습니다.");
			}else {
				System.out.println("입력 숫자가 큽니다.");
			}
		}
		System.out.printf("랜덤숫자 : %d \n",ran);
		System.out.println("입력숫자 : "+ Arrays.toString(arr));
		System.out.printf("도전 횟수 : %d \n",count);
		
		
		scan.close();

	}

}
