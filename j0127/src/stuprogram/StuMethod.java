package stuprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMethod {
	String[] title = {"번호", "이름", "국어", "영어", "수학", "총점", "평균", "등수"};
	ArrayList<Students> list = new ArrayList<Students>(); // 학생 정보 배열
	Scanner scan = new Scanner(System.in);
	
	void input() {
		Students stu = new Students();
		System.out.println("[ 학생 성적 입력 ]");
		while(true) {
			System.out.println("이름을 입력하세요. (0.종료) >> ");
			stu.setName(scan.next());
			if (stu.getName().equals("0")) {
				break;
			}
			System.out.println("국어 점수를 입력하세요. >> ");
			stu.setKor(scan.nextInt());
			System.out.println("영어 점수를 입력하세요. >> ");
			stu.setEng(scan.nextInt());
			System.out.println("수학 점수를 입력하세요. >> ");
			stu.setMath(scan.nextInt());
			// 왜 배열에 저장하지 않고 ArrayList에 저장하는가? 배열은 크기가 고정되어 있기 때문에 ArrayList를 사용한다.
			list.add(new Students(stu.getName(), stu.getKor(), stu.getEng(), stu.getMath()));
			System.out.println(stu.getName() + " 학생이 저장되었습니다.");
		}
	} // input
	
	void print() {
		System.out.println("[ 학생 성적 출력 ]");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println("\n---------------------------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			// 학생 리스트 가져오기
			Students stu = list.get(i);
			System.out.println(stu.getNo() + "\t" + stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath() + "\t" + stu.getTotal() + "\t" + stu.getAvg() + "\t" + stu.getRank());
		System.out.println("--------------------------------");            
		}
	} // print
	
	void modify() {
		System.out.println("[ 학생 성적 수정 ]");
		System.out.println("수정할 학생의 이름을 입력하세요. >> ");
        String name = scan.next();
        int check = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				check = i;
			}
		}
		if (check == -1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.println("수정할 과목을 선택하세요.");
		System.out.println("1. 국어 2. 영어 3. 수학");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("현재 국어 점수 : " + list.get(check).getKor());
			System.out.println("수정할 점수를 입력하세요. >> ");
			list.get(check).setKor(scan.nextInt());
			list.get(check).setTotal(list.get(check).getKor() + list.get(check).getEng() + list.get(check).getMath());
			list.get(check).setAvg(list.get(check).getTotal() / 3.0);
			break;
		case 2:
			System.out.println("현재 영어 점수 : " + list.get(check).getEng());
			System.out.println("수정할 점수를 입력하세요. >> ");
			list.get(check).setEng(scan.nextInt());
			list.get(check).setTotal(list.get(check).getKor() + list.get(check).getEng() + list.get(check).getMath());
			list.get(check).setAvg(list.get(check).getTotal() / 3.0);
			break;
		case 3:
			System.out.println("현재 수학 점수 : " + list.get(check).getMath());
			System.out.println("수정할 점수를 입력하세요. >> ");
			list.get(check).setMath(scan.nextInt());
			list.get(check).setTotal(list.get(check).getKor() + list.get(check).getEng() + list.get(check).getMath());
			list.get(check).setAvg(list.get(check).getTotal() / 3.0);
			break;
		}
		System.out.println("수정이 완료되었습니다.");
	} // modify
	
	void delete() {
		System.out.println("삭제하고싶은 학생 이름을 입력하세요. >> ");
		String name = scan.next();
        int check = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				check = i;
			}
		}
		if (check == -1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.println(name+"학생을 삭제하시겠습니까? (1:삭제, 2:취소) >> ");
		int temp = scan.nextInt();
		if (temp == 1) {
			list.remove(check);
			System.out.println(name + "학생이 삭제되었습니다.");
		} else {
			System.out.println("삭제가 취소되었습니다.");
		}
	} // delete
	
	void rank() {
		for (int i = 0; i < list.size(); i++) {
			int rank = 1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getTotal() < list.get(j).getTotal()) {
					rank++;
				}
			}
			list.get(i).setRank(rank);
		}
		System.out.println("등수처리가 완료되었습니다.");
	} // rank
	
	
	

}
