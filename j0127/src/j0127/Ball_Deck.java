package j0127;

public class Ball_Deck {
	Ball[] ball = new Ball[45];
	
	void input() {
		for(int i=0; i<45; i++) {
			ball[i] = new Ball(i+1); // 1~45까지의 볼 생성
		}
	}
	
	void shuffle() {
		for(int i=0; i<300; i++) {
            int r = (int)(Math.random()*45); // 0~44까지의 랜덤값
            Ball temp = ball[0]; // ball[0]과 ball[r]의 값을 바꾸기 위한 임시변수
            ball[0] = ball[r];
            ball[r] = temp; 
        }
	}
	
	void print(int num) {
		for(int i=0; i<num; i++) {
			System.out.println(ball[i].number);		
		}
	}
	

}
