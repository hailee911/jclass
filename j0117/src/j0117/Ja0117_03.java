package j0117;

public class Ja0117_03 {
	
	int num;

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t1.channel = 7;
		System.out.println("t1 채널 : "+t1.channel);
		t2.channel = 9;
		System.out.println("t2 채널 : "+t2.channel);
		
		t2 = t1; // 얕은 복사
		System.out.println("t2 채널 : "+t2.channel);
		t2.channel = 100;
		System.out.println("t1 채널 : "+t1.channel); // 100
		t1.channel = 50;
		System.out.println("t2 채널 : "+t2.channel); // 50
		System.out.println("t1 채널 : "+t1.channel);
		
//		Tv t = new Tv();
//		t.color = "흰색";
		
		//메소드 안 지역변수 값이 할당되지 않으면 사용할 수 없음.
//		int a;
//		int b = 10;
//		a = b;
//		System.out.println(a);
//		System.out.println(num); // 에러
		
//		Tv t3 = new Tv();
//		System.out.println(t3.channel); // default 값
	}

}
