package j0122;

import stu.Shape; // 다른 패키지의 클래스를 사용하기 위해 import

public class Ja0122_01 {

	public static void main(String[] args) {
		
		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		System.out.println(t1.getHour());
		
		// 17 35 30 입력, 출력하시오.
		Time t2 = new Time(17,35,30);
		System.out.println(t2.getHour() + ", " + t2.getMinute() + ", " + t2.getSecond());
		
		
		//private - 같은 클래스, default - 같은 클래스/패키지, protected - 같은 클래스/패키지/자손클래스, public - 모든 클래스
//		Car c = new Car();
//		System.out.println(c.getColor()); // null
//		Car c2 = new Car("white", "auto", 5);
//		System.out.println(c2.getColor()); // white
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor()); // 5
//		Shape s = new Shape();

	}

}
