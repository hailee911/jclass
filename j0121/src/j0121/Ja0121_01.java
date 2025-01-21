package j0121;

public class Ja0121_01{
	
	// 클래스간의 관계 - 상속관계 (Inheritance) : 부모클래스의 멤버변수, 메소드를 자식클래스에서 사용할 수 있도록 하는 것 : extends
	// 클래스간의 관계 - 포함관계(composite) : 클래스 안에 다른 클래스를 포함하는 경우 (객체 선언)

	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		// 원 넓이 = 반지름 * 반지름 * 3.14
		double di = c1.r * c1.r * 3.14;
		System.out.println("원의 넓이 : " + di);
		c1.draw();
		
		//Point[] p : 3개의 꼭지점을 알아야 넒이를 구할 수 있음.
		Point[] p = new Point[3];
		p[0] = new Point(100,100);
		p[1] = new Point(140,50);
		p[2] = new Point(200,100);
		Triangle t1 = new Triangle(p);
		t1.draw();
		
		// Circle(Point center, int r) 생성자 호출
//		Point center = new Point(150,150); -> new Circle(center, 50);
		
//		Circle c2 = new Circle(new Point(150,150),50);
		
		
//		Circle c = new Circle();
//		c.x = 100;
//		System.out.println(c.x);
		
		// 객체선언 - 포함관계
//		Point p = new Point(); // Point클래스의 객체 생성
//		p.x = 10;
//		p.y = 5;
		

	}

}
