package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		// 카드게임
		// 카드게임을 실행합니다.
		// 컴퓨터 랜덤으로 1개를 뽑고
		// my 1-52 카드중에 내가 1개를 뽑아서
		// 무늬가 Spade, Heart, Diamond, Clover
		// 숫자가 높은 사람이 승리해서
		// 100만원을 지급하는 프로그램을 구현하시오.
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); 
		Card my_card = d.pick(1);
		Card com_card = d.pick(1);
		int my_money = 0;
		while(true) {
			System.out.println("[ 카드게임 ]");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("카드를 섞었습니다.");
				System.out.println("--------------------------");
				d.shuffle();
				d.print_all(52);
				break;
			case 2:
				System.out.println("카드 한장 뽑기");
				// 내 카드 저장하기
				System.out.println("--------------------------");
				int random = (int)(Math.random()*52);
				d.pick(random);
				break;
			case 3:
				System.out.println("컴퓨터 카드 뽑기");
				// 컴퓨터 카드 저장하기
				System.out.println("--------------------------");
				d.print_all(com_card);
				break;
			case 4:
				System.out.println("승부결정");
				System.out.println("--------------------------");
				// 승부결정
				if (my_card.number > com_card.number) {
					System.out.println("당신이 이겼습니다.");
					my_money += 1000000;
					System.out.println("당신의 돈 : " + my_money);
				} else if (my_card.number < com_card.number) {
					System.out.println("컴퓨터가 이겼습니다.");
					my_money -= 1000000;
					System.out.println("당신의 돈 : " + my_money);
				} else {
					System.out.println("무승부입니다.");
					System.out.println("당신의 돈 : " + my_money);
				}
				break;
			case 0:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}
			
			// 클래스 != 객체 : 클래스는 객체를 만들기 위한 틀
			// Deck 클래스
			
		}

	}

}
