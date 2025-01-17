package j0117;

public class Ja0117_01 {

	public static void main(String[] args) {
		// 객체지향언어
		// 객체는 속성(변수)과 기능(메소드)로 이루어짐
		
		Tv t1 = new Tv();
		t1.color = "red";
		t1.power = false;
		t1.channel = 7;
		
		t1.power();
		t1.channelUp();
		
		System.out.println("현재채널 : "+t1.channel); //8
		
		

	}

}
