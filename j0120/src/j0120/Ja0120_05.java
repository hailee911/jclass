package j0120;

public class Ja0120_05 {

	public static void main(String[] args) {
		String[] name = new String[3];
		int[] kor = new int[3];
		Cal4 c4 = new Cal4(); // 객체선언
		// name,kor 보내서 데이터를 입력받아
		// main 메소드에서 출력하시오.
		c4.input(name, kor);
		for(int i=0; i<3; i++) {
			System.out.printf("[%s, %d]\n",name[i],kor[i]);
		}
		

	}

}
