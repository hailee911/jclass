package stuproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> stu_list = new ArrayList<Stu>();
	
	
	void rank() {
		for (int i = 0; i < stu_list.size(); i++) {
			int rank = 1;
			for (int j = 0; j < stu_list.size(); j++) {
				if (stu_list.get(i).getTotal() < stu_list.get(j).getTotal()) {
					rank++;
				}
			}
			stu_list.get(i).setRank(rank);
		}
		System.out.println("등수처리가 완료되었습니다.");
	}
	
	void search() {
		System.out.println("[ 학생 성적 검색 ]");
		System.out.println("--------------------------------------------------------");
		System.out.println("검색할 학생 이름을 입력하세요. >> ");
		String name = scan.next();
		int temp = -1;
		for (int i = 0; i < stu_list.size(); i++) {
			if (stu_list.get(i).getName().equals(name)) {
				temp = i;
			}
		}
		if (temp == -1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("--------------------------------------------------------");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", stu_list.get(temp).getNo(),
				stu_list.get(temp).getName(), stu_list.get(temp).getKor(), stu_list.get(temp).getEng(),
				stu_list.get(temp).getMath(), stu_list.get(temp).getTotal(), stu_list.get(temp).getAvg(),
				stu_list.get(temp).getRank());
		System.out.println();
		
	}
	
	void delete() {
		System.out.println("[ 학생 성적 삭제 ]");
		System.out.println("--------------------------------------------------------");
		System.out.println("삭제할 학생 이름을 입력하세요. >> ");
		String name = scan.next();
		int temp = -1;
		for (int i = 0; i < stu_list.size(); i++) {
			if (stu_list.get(i).getName().equals(name)) {
				temp = i;
			}
		}
		if (temp == -1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.println(stu_list.get(temp).getName()+"학생을 삭제하시겠습니까? 1. 예 2. 아니오 >> ");
		int choice = scan.nextInt();
		if(choice == 1) {
            stu_list.remove(temp);
            System.out.println("삭제가 완료되었습니다.");
        }else {
        	System.out.println("삭제가 취소되었습니다.");
        }
	}
	
	void modify() {
		System.out.println("[ 학생 성적 수정 ]");
		System.out.println("--------------------------------------------------------");
		System.out.println("수정할 학생 이름을 입력하세요. >> ");
		String name = scan.next();
		int temp = -1;
		for(int i=0; i<stu_list.size(); i++) {
			if(stu_list.get(i).getName().equals(name)){
				temp = i;
			}
		}
		if(temp == -1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.println("수정할 과목을 선택하세요. 1. 국어, 2. 영어, 3. 수학 >>");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("새로운 국어 점수를 입력하세요.>>");
			stu_list.get(temp).setKor(scan.nextInt());
			stu_list.get(temp).setTotal(stu_list.get(temp).getKor()+stu_list.get(temp).getEng()+stu_list.get(temp).getMath());
			stu_list.get(temp).setAvg(stu_list.get(temp).getTotal()/3.0);
			break;
		case 2:
			System.out.println("새로운 영어 점수를 입력하세요.>>");
			stu_list.get(temp).setEng(scan.nextInt());
			stu_list.get(temp).setTotal(
					stu_list.get(temp).getKor() + stu_list.get(temp).getEng() + stu_list.get(temp).getMath());
			stu_list.get(temp).setAvg(stu_list.get(temp).getTotal() / 3.0);
			break;
		case 3:
			System.out.println("새로운 수학 점수를 입력하세요.>>");
			stu_list.get(temp).setMath(scan.nextInt());
			stu_list.get(temp).setTotal(
					stu_list.get(temp).getKor() + stu_list.get(temp).getEng() + stu_list.get(temp).getMath());
			stu_list.get(temp).setAvg(stu_list.get(temp).getTotal() / 3.0);
			break;
		}
		System.out.println("수정이 완료되었습니다.");
	}
	
	void show() {
		System.out.println("[ 학생 성적 출력 ]");
		System.out.println("--------------------------------------------------------");
		if(stu_list.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
		}else {
			System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("--------------------------------------------------------");
			for(int i=0; i<stu_list.size(); i++) {
				stu_list.get(i);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",stu_list.get(i).getNo(),stu_list.get(i).getName(),
						stu_list.get(i).getKor(),stu_list.get(i).getEng(),stu_list.get(i).getMath(),
						stu_list.get(i).getTotal(),stu_list.get(i).getAvg(),stu_list.get(i).getRank());
			}
			System.out.println();
		}
	}
	
	void register() {
		System.out.println("[ 학생 성적 입력 ]");
		loop:while(true) {
			Stu stu = new Stu();
			System.out.println("학생 이름을 입력하세요. >> (0.취소)");
			String name = scan.next();
			if(name.equals("0")) {
				break loop;
			}
			stu.setName(name);
			System.out.println("국어성적을 입력하세요. >> ");
			int kor = scan.nextInt();
			stu.setKor(kor);
			System.out.println("영어성적을 입력하세요. >> ");
			int eng = scan.nextInt();
			stu.setEng(eng);
			System.out.println("수학성적을 입력하세요. >> ");
			int math = scan.nextInt();
			stu.setMath(math);
			int total = kor+eng+math;
			double avg = total/3.0;
			stu.setTotal(total);
			stu.setAvg(avg);
			stu_list.add(stu);
			System.out.printf("%s 학생이 등록되었습니다.\n",stu.getName());
			
		}
	}
	
	int main() {
		while(true) {
			System.out.println("-------------------------");
			System.out.println("   [ 학생성적프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제"); 
			System.out.println("5. 학생성적검색");
			System.out.println("6. 학생등수정렬");
			System.out.println("7. 학생이름정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 파일저장");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			return choice;
		} // while
	}

}
