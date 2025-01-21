package jcard;

public class Card {
	// 생성자 (초기화를 위한 생성자)
	Card(String shape, int number) {
		this.number = number;
		this.shape = shape;
	}
	
	// 상태를 저장하기 위한 지역변수
	int number;
	String shape;

}
