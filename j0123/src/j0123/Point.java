package j0123;

public class Point implements Cloneable {
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
        this.y = y;
	}
	
	Point(Point p){ 
        this.x = p.x;
        this.y = p.y;
        }
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override // Object클래스 메소드 재정의
	// toString() : 객체의 정보를 문자열로 반환
	// 사용예시: System.out.println(p1); // p1.toString() 자동호출
	public String toString() {
		return String.format("[%d,%d]", x,y);
	}
}
