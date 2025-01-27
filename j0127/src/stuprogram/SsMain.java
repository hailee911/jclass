package stuprogram;

import java.util.Scanner;

public class SsMain {

	public static void main(String[] args) {
		// 학생 성적 프로그램
		Scanner scan = new Scanner(System.in);
		StuMethod stm = new StuMethod(); // 클래스 선언
		while(true) {
			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 출력");
			System.out.println("3. 학생 성적 수정");
			System.out.println("4. 학생 성적 삭제");
			System.out.println("5. 학생 등수 처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------");
			System.out.print("원하는 번호 선택 >>");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				stm.input();
				break;
			case 2:
				stm.print();
				break;
			case 3:
				stm.modify();
				break;
			case 4:
				stm.delete();
				break;
			case 5:
				stm.rank();
				break;
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}

	}

}
