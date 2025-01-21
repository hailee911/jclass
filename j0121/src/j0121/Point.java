package j0121;

public class Point {
	
	Point(){this(0,0);} // 매개변수가 있는 생성자 호출 : this(값, 값) : 생성자에서 다른 생성자 호출)
	Point(int x, int y){ // 지역변수 : 메소드 내 선언된 변수
		this.x = x; // 인스턴스 변수를 가리킴 : this.변수명.
		this.y = y;
	}
	
	int x; // 인스턴스변수 : 객체 선언 후 참조변수명.변수명
	int y;

}
