package j0115;

public class Ja0115_06 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개
		
		//1-45 번호 저장
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		// 1-45까지 순차출력
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
		System.out.println();

		
		// 랜덤 숫자
		
		// 배열 섞기
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ranNum = (int)(Math.random()*45); // 0-44
			temp = ball[0]; // temp로 0번째 값 옮기기
			ball[0] = ball[ranNum]; // 빈 공간에 랜덤 값 이동
			ball[ranNum] = temp; // 옮긴 빈 공간에 다시 값 옮기기
		}		
		
		// 섞은 배열을 출력
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
		System.out.println();

	}

}
