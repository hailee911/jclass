package j0122;

import java.util.Calendar;
import java.util.Date;

public class Ja0122_02 {

	public static void main(String[] args) {
		
//		Date d = new Date();
//		System.out.println(d.toString()); // 현재 시간 출력
//		Date d2 = new Date();
//		System.out.println(d2.toString());
//		
//		Calendar c1 = Calendar.getInstance(); // 모두 같은 시간 출력을 위해 Calendar 클래스 사용 (싱글톤 패턴)
//		System.out.println(c1.getTime());
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c2.getTime());
		
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance(); // Singleton 클래스의 객체 선언
		System.out.println("s1 : "+s1.getNum());
		
		Singleton s2 = Singleton.getInstance(); // 주소값이 같음 (Singleton 클래스의 객체는 하나만 생성됨)
		System.out.println("s2 : "+s2.getNum());
		
		Singleton s3 = Singleton.getInstance();
		System.out.println("s3 : "+s3.getNum());
		
		Singleton s4 = Singleton.getInstance();
		System.out.println("s4 : "+s4.getNum());
		
		s1.setNum(100);
		System.out.println("s1의 num값을 변경");
		System.out.println("s2 : "+s2.getNum());
		System.out.println("s4 : "+s4.getNum()); // 같은 주소값을 바라보고 있기 때문에 s1의 값을 변경해도 다 같은 값이 출력됨
		
		Car cc1 = new Car();
		Car cc2 = new Car(); // 주소값이 다름 (기본 클래스의 객체는 여러개 생성됨)
		
		
		Time t1 = new Time();
		
		// 관계가 없는 객체는 형변환이 안됨. > cc1 = (Car)t1; (X)
		
		
		int a = 10;
		long b = 100;
		a = (int)b; // 강제 형변환
		
	}

}
