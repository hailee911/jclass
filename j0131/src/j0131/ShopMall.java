package j0131;

import java.util.Scanner;

public class ShopMall {

	public static void main(String[] args) {
		
		// 냉장고 - 120만원
		// 세탁기 - 90만원
		// 상품리스트보기
		
		// 상품관리 - Product - Tv,Computer,Refrigerator,Washer
		// 유저관리 - Buyer
		// 메소드 관리 - Shop_Deck
		// 메인 - ShopMall
		
		Scanner scan = new Scanner(System.in);
		Buyer user1;
		Shop_Deck sd = new Shop_Deck();
		int choice;
		
		sd.login(); // 로그인메소드호출
		loop: while(true) {
			choice = sd.mainPrint();
			
			switch(choice) {
			case 1:
				sd.buy(new Tv());
				break;
			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","BLACK"));
				break;
			case 3:
				sd.buy(new Computer());
				break;
			case 4:
				sd.buy(new Refrigerator());
				break;
			case 5:
				sd.buy(new Washer());
				break;
			case 6:
				break;
			case 7:
				//구매한 리스트 보기
				
				sd.basket();
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
		}
		
		

	}

}
