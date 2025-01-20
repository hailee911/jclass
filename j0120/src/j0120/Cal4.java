package j0120;

import java.util.Scanner;

public class Cal4 {
	void input(String[] name, int[] kor) {
		//이름 3명, 국어점수 3개를 입력
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("이름 >>");
			name[i] = scan.next();
			System.out.println("국어점수 >>");
			kor[i] = scan.nextInt();
		}
		scan.close();
	}

}
