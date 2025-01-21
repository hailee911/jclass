package jjcard;

class Deck {
	
	final int CARD_NUM = 52; // 카드의 개수 - final 대문자 변수명은 상수로 취급  (값 변경 불가)
	Card[] c = new Card[CARD_NUM]; // 카드 52장 생성
	
	void input() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	} // input
	
	// 카드 개수 출력 - cnt는 출력 할 카드의 개수
	void print(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(c[i]); // c[i]는 Card 클래스의 toString() 메소드 호출
		}
	}
	
	// 해당 번호 출력
	void print(Card c) {
		System.out.println(c);
    }
	
	// 카드 섞기
	void shuffle() {
		Card temp = null;
		for(int i=0; i<300; i++) {
			int randomN = (int)(Math.random()*CARD_NUM);
			temp = c[0];
			c[0] = c[randomN];
			c[randomN] = temp;
		}
	}
	
	// 카드 뽑기
	Card pick(int no) {
		return c[no]; // no번째 카드 리턴
    }

		
	
}
