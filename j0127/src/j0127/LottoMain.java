package j0127;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1. ball 객체
		// 2. ball_deck 객체 (
		// - ball 45개 생성, ball 숫자 입력, ball 섞기
		// - 6개 로또번호 추출, 6개 숫자 입력, 로또번호와 입력번호 비교
		// - 출력화면이 있음.
		// 3. main에서 로또 프로그램을 실행해서
		// 6개 숫자입력, 로또 번호와 비교해서 몇개를 맞췄는지 확인
		
		Scanner scan = new Scanner(System.in);
		Ball_Deck bd = new Ball_Deck(); // 45개의 볼 생성
		Ball[] my_ball = new Ball[6];
		int count = 0; 
		
		while(true) {
			System.out.println("[ 로또 프로그램]");
			System.out.println("1. 로또 번호 생성");
			System.out.println("2. 로또 번호 섞기");
			System.out.println("3. 로또 시작");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 로또 번호 생성 ]");
				bd.input();
				System.out.println("로또 번호 생성 완료!");
				break;
			case 2:
				System.out.println("[ 로또 번호 섞기 ]");
				bd.shuffle();
				bd.print(6);
				System.out.println("로또 번호 섞기 완료!");
				break;
			case 3:
				System.out.println("번호를 입력하세요.>> ");
				for (int i = 0; i < 6; i++) {
					// 로또 번호 6개 뽑아오기
					int num = scan.nextInt();
					my_ball[i] = new Ball(num);
					for(int j=0; j<6; j++) {
						if (my_ball[i].number == bd.ball[j].number) {						
							count++;
						}
					}
				}
				
				System.out.println("로또 번호: ");
				bd.print(6);
				System.out.println("내가 입력한 번호: ");
				for (int i = 0; i < 6; i++) {
					System.out.print(my_ball[i].number + " ");
				}
				System.out.println();
				System.out.println("맞춘 갯수: "+count);
				break;
				
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
				
			} // switch
		} // while
		
		
		

	}

}
