package j0124;

public class Ja0124_03쓰레드 {
	public static void main(String[] args) {
		// 싱글 쓰레드
//		for(int i=0; i<300; i++) {
//			System.out.println("i"+i);
//		}
		
		// 멀티 쓰레드
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();
		
		
	}

}
