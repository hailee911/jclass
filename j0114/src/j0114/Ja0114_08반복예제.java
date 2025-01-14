package j0114;

import java.util.Scanner;

public class Ja0114_08반복예제 {

	public static void main(String[] args) {
		
		// 조건문 : if, switch
		// 반복문 : for, while, do while
		// == 등가비교
		
		Scanner scan = new Scanner(System.in);
		// break : 반복문을 중지
		// continue : 1번만 중지
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==3) {
					continue;
				}
				System.out.printf("%d * %d = %d \n", i,j,i*j);
			}
		}
		
//		String str = "홍길동";
//		System.out.println("이름을 입력하세요.>> ");
//		String input = scan.next();
//		
//		if(str == input) {
//			System.out.println("홍길동이 맞습니다.");
//		}else if(str.equals(input)) {
//			System.out.println("홍길동이 맞습니다.equals");
//		} else {
//			System.out.println("홍길동이 아닙니다.");
//		}
		
		scan.close();
	
		
//		String str = "안녕하세요.";
//		String str2 = "안녕";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		if (str == str4) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
//		
//		// 8가지 기본형 타입 이외 비교 .equals()
//		if (str.equals(str4)) {
//			System.out.println("equals 비교 같습니다.");
//		} else {
//			System.out.println("equals 비교 다릅니다.");
//		}
				
//		if(str==str2) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
//		
//		System.out.println("---------------------");
//		if(str==str3) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
//			
//		
//		int num = 10;
//		int num2 = 10;
//		
//		if(num == num2) {
//			System.out.println("같습니다.");
//        } else {
//            System.out.println("다릅니다.");
//        }
		
		
		
		// 1-100까지 랜덤숫자를 입력받아, 10번을 입력해서 숫자맞추기 게임을 구현하시오.
		// 10번 이후에는 정답 공개를 하시오.
//		Scanner scan = new Scanner(System.in);
//		int ran = (int)(Math.random()*100)+1;
//		for (int i = 0; i < 10; i++) {
//			System.out.println("숫자를 입력하세요. >> ");
//			int num = scan.nextInt();
//			if (num == ran) {
//				System.out.println("정답입니다.");
//				break;
//			} else if (num > ran) {
//				System.out.println("더 작은수를 입력하세요.");
//			} else {
//				System.out.println("더 큰수를 입력하세요.");
//			}
//		}
//		System.out.println("정답은 " + ran + "입니다.");
//		
		
		// 1-100
//		for(int i=0; i<20; i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);			
//		}
		
//		double num = Math.random(); // 0.000000000 <= x < 1.000000
//		System.out.println(num);
		
		// 반복문을 사용해서
		// 000 ~ 999 까지 출력하시오.
		// 000,001,002,...,010,011,...,999
//		int num = 0;
//		while(num<1000) {
//			System.out.printf("%03d \n", num);
//			num ++;
//		}
		
	}

}
