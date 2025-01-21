package jjcard;

//import java.util.Scanner;
import java.util.*;

public class JaMain {

	public static void main(String[] args) {
		
//		Card c = new Card(); // 카드 객체 생성 -> s0,n1 출력
//		System.out.println(c); // [Spade, A] 테스트
		
        
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); // 52장의 카드 생성 
		Card[] my_card = new Card[5]; // 내 카드 5장 생성
		int choice = 0;
		while(true) {
			System.out.println("[ 카드 게임 ]");
			System.out.println("1. 카드 생성-번호부여");
			System.out.println("2. 카드 출력");
			System.out.println("3. 카드 섞기");
			System.out.println("4. 내 카드 5장 받기");
			System.out.println("5. 내 카드 보기");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 카드 생성 ]");
				d.input(); // 카드 번호 부여
				break;
			case 2:
				System.out.println("[ 52장 카드 출력 ]");
				System.out.println("--------------------------");
				d.print(52); // 카드 출력
				break;
			case 3:
				d.shuffle(); // 카드 섞기
				System.out.println("[ 카드를 섞기 완료! ]");
				System.out.println("--------------------------");
				break;
			case 4:
				for (int i = 0; i < 5; i++) {
					my_card[i] = d.pick(i);
				}
				System.out.println("[ 카드 5개 받기 완료! ]");
				System.out.println("--------------------------");
			case 5:
				System.out.println("[ 내 카드 출력 ]");
				System.out.println("--------------------------");
				for(int i=0; i<5; i++) {
					System.out.println(my_card[i]);
				}
			case 6:
				System.out.println("몇번째 카드를 가져오시겠습니까?");
				int no = scan.nextInt();
				Card c_pick = d.pick(no);
				d.print(c_pick);
				break;
			case 0:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		} // while
		

		
	} // main

} // class
