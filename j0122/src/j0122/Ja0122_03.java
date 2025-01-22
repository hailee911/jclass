package j0122;

public class Ja0122_03 {

	public static void main(String[] args) {
		// CaptionTv - text, caption()
		CaptionTv c = new CaptionTv();
		c.text = "[뮤직비디오] 로제-APT";
		c.caption();
		System.out.println("자막 : "+c.text);
		// Tv - power, channel, power(), channelUp(), channelDown()
		Tv t = new CaptionTv(); // 다형성
		Tv t2 = new Tv();
		
		CaptionTv c3;
		c3 = (CaptionTv)t;
		c3.text = "aaa";
		
		//에러
//		c3 = (CaptionTv)t2;
//		c3.text = "bbb";
		
//		t.text = ""; // 에러
//		t2.text = "자막기능이 없음.";
		
//		CaptionTv c2 = new Tv(); // 자손의 참조변수 = 부모 객체 안됨

	}

}
