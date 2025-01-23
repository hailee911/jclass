package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	int count = 0; //학생수
	int no=0, kor=0, eng=0, math=0, total=0, rank=0;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	String name = "";
	double avg = 0;
	int choice = 0,temp = 0,rankC = 0;  //번호선택, 검색확인,등수
	
	//0. 상단메뉴 메소드
	int main_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("4. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	}
	
	//1. 입력메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		//입력
		while(true) {
			//번호
			System.out.printf("[ %d 번째 ]\n",list.size()+1);
			System.out.println("이름을 입력하세요. (0.종료) >> ");
			name = scan.next();
			//0인지 확인
			if(name.equals("0")) {
				break;
			}
			
			//국어,영어,수학
			System.out.println("국어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.\n");
			math = scan.nextInt();
			
			//list 저장
			list.add(new Stu(name,kor,eng,math));
			
			System.out.printf("%s 학생이 저장되었습니다. \n",name);
			count++;
		}//while
	} //input
	
	
	//2. 출력메소드
	void output() {
		System.out.println("[ 학생성적 출력 ]");
		
		//출력
		System.out.println("                       [ 학생성적 ]");
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); //Object
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println();
	} //output
	
	//3. 수정메소드
	void modify() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("수정할 학생의 이름을 입력하세요. >> ");
		String modiName = scan.next();
		for(int i=0; i<list.size(); i++) {
			if (modiName.equals(((Stu) list.get(i)).getName())) {
				System.out.println("수정할 과목을 선택하세요.");
				System.out.println("1.국어 2.영어 3.수학 >> ");
				int sub = scan.nextInt();
				System.out.println("수정할 점수를 입력하세요. >> ");
				int score = scan.nextInt();
				switch (sub) {
				case 1:
					((Stu) list.get(i)).setKor(score);
					break;
				case 2:
					((Stu) list.get(i)).setEng(score);
					break;
				case 3:
					((Stu) list.get(i)).setMath(score);
					break;
				}
				// 수정된 총점, 평균 다시 계산
				((Stu) list.get(i)).setTotal(
						((Stu) list.get(i)).getKor() + ((Stu) list.get(i)).getEng() + ((Stu) list.get(i)).getMath());
				((Stu) list.get(i)).setAvg(((Stu) list.get(i)).getTotal() / 3.0);
				System.out.println("수정되었습니다.");
			}
		}
	}

}
