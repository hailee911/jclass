package j0121;

public class Deck {
	// 카드에 사용되는 메소드
	
	// 생성자
	Deck(){
		for(int i = 0;i<4;i++){
			for (int j = 0; j < 13; j++) {
				c[i * 13 + j] = new Card(s[i], j + 1);
			}
		}
	}
	
	// 변수선언
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade", "Heart", "Diamond", "Clover"};
	
	// 카드 전체 출력 메소드
	void print_all(int no) {
		System.out.printf("[ %d 장 출력 ]\n", no);
		for(int i=0; i<no; i++) {
			System.out.printf("[%s,%s]\n", c[i].shape, n[c[i].number]);
		}
	}
	
	// 오버로딩
	void print_all(Card c) {
		System.out.printf("[ 카드 확인 ]\n");
		System.out.printf("[%s,%s]\n", c.shape, n[c.number]);
	}
	
	// 카드 섞기 메소드
	void shuffle() {
		Card temp = null;
        int randomN = 0;
        for(int i=0; i<300; i++) {
            randomN = (int)(Math.random()*52);
            temp = c[0];
            c[0] = c[randomN];
            c[randomN] = temp;
        }
    }
	
	Card pick(int no) {
		if(no>=1 && no<=52) {
		return c[no];
		
		}else {
			System.out.println("[경고] 번호 확인을 하셔야 합니다.");
            return c[0];
		}
	}
	
	
		
}	

