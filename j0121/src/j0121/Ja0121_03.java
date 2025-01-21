package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// Card 52장을 생성한 후 1-13, Spade,Diamond,Heart,Clover
		// 출력하시오.
		Deck d  = new Deck();
		
		// 전체출력
		d.print_all(52);
		
		// 섞기실행
		d.shuffle();
		
		System.out.println("--------------------");
		// 10번쨰 카드를 선택
		Card c = d.pick(9);
		d.print_all(c);
		
		
		System.out.println("--------------------");
		// 전체출력
		d.print_all(5);
		
		
		
	}

}
