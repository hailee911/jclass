package jjcard;

class Card {
	
	
	// 기본 생성자
	Card(){
		shape = 0;
		number = 1;
	}
	// 입력받은 숫자를 카드 변수로 저장하기 위한 생성자 -> 실행 시 카드가 한 장씩 생성됨
	Card(int shape, int number){
		this.number = number;
        this.shape = shape;
    }
	
	// 카드변수
	int number;
	int shape;
	// 카드 모양과 숫자를 배열로 저장
	String[] s = {"Spade","Heart","Clover","Diamond"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	@Override // toString() 메소드 재정의 : System.out.println(c[i]); 원래는 주소값 출력
	public String toString() {
		return String.format("[%s, %s]", s[shape], n[number]); // 카드 모양과 숫자를 출력
	}

	

}
