package jbuy;

import java.util.Scanner;

public class Jamain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//로그인 구현
		// 보유한 금액, 보너스 포인트가 설정
		Buyer b = new Buyer();
		
		while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. Computer");
			System.out.println("3. Audio");
			System.out.println("9. 구매(cart)정보보기");
			System.out.println("0. 종료");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				b.buy(new Tv());
				System.out.println("Tv를 구매합니다.");
				System.out.printf("현재보유금액 : %d\n",b.money);
				System.out.printf("현재보유포인트 : %d\n",b.bonusPoint);
				break;
			case 2:
				b.buy(new Computer());
				System.out.println("Computer를 구매합니다.");
				System.out.printf("현재보유금액 : %d\n",b.money);
				System.out.printf("현재보유포인트 : %d\n",b.bonusPoint);
				break;
			case 3:
				b.buy(new Audio());
				System.out.println("Audio를 구매합니다.");
				System.out.printf("현재보유금액 : %d\n", b.money);
				System.out.printf("현재보유포인트 : %d\n", b.bonusPoint);
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				scan.close();
			}
			
		}//while
				
		
	}//main

}
