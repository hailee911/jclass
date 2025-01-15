package j0115;

public class Ja0115_01배열 {

	public static void main(String[] args) {
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것 : 배열
		
		// score 배열 100개를 만들어서, 1-100까지 숫자를 입력해서 출력하시오.
		// 배열에 들어가 있는 숫자 합계를 출력하시오.
		int[] score = new int[100];
		int sum = 0;
		// 1-10까지의 랜덤 숫자를 입력해서 합계를 출력하시오.
		for (int i=0; i<100; i++) {
			int ran = (int)(Math.random()*10)+1;
			score[i] = ran;
			System.out.println("랜덤숫자 : "+score[i]);
			sum += score[i];
		}
		
		System.out.println("합계 :" +sum);
		
		
		// 배열에 값을 저장하는 방법들 (3가지)
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
		
//		int[] score2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		int[] score3 = new int[10];
//		for(int i=0; i<10; i++) {
//			score3[i] = i+1;
//		}
		
//		int[] score = new int[5]; // 배열의 선언과 생성
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;                                                                                       
//		score[4] = 5;
//		
//		int[] num = new int[10];
//		for (int i=0; i<10; i++) {
//			num[i] = i;
//		}
//		
//		for(int i=0; i<10; i++) {
//			System.out.println(num[i]);
//        }
//		
//		int[] score1; // 배열의 선언 (배열의 생성은 따로 해야함)
		
		
//		System.out.println(score[0]); // 1
//		System.out.println(score); // 주소값 출력
		
		
		
		
// -----------------------------------------------------
		
//		String str =  new String("abc");
//		String str2 = "abc"; // 주소값을 저장하는 변수 : 참조형 변수
//		System.out.println(str);
		
//		if(str == str2) {
//            System.out.println("같다");
//		}
		
//		if (str.equals(str2)) {
//			System.out.println("같다");
//		}

		
		
// -----------------------------------------------------	
	}

}
