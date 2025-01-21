package jcard;

public class Deck {
	
	// 생성자
	Deck(){
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[i * 13 + j] = new Card(s[i], j + 1); // c[52] = new Card(모양4번반복, 12+1) -> 
			}
		}
	}
	
	Card c[] = new Card[52];
	String[] s = {"Clover","Diamond","Heart","Spade"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	// 카드 전체 출력 메소드
		void print_all(int no) {
			System.out.printf("[ %d 장 출력 ]\n", no);
			for(int i=0; i<no; i++) {
				System.out.printf("[%s,%s]\n", c[i].shape, n[c[i].number]);
			}
		}
	
	
	

	

}
