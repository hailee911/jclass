package j0121;

public class Triangle extends Shape {
	
	// 생성자 : 클래스명과 동일한 이름을 가진 메소드
	Triangle(){}
	Triangle(Point[] p){
		this.p = p;
	}
	Triangle(Point p1, Point p2, Point p3){
		p = new Point[] {p1, p2, p3};
	}
	
	// 인스턴수 변수 선언
	Point[] p;
}
