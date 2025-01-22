package j0121;

public class Circle extends Shape {
	
	// 생성자
	Circle(){
		this(new Point(0,0),100);
	}

	Circle(Point center, int r){
//		center = new Point(); // 지역변수 center
		this.center = center; // 인스턴스 변수 center
		this.r = r;
	}
	
	// 인스턴스 변수 선언
	Point center; // 클래스 변수 선언
	int r;
	
}