package j0120;

import java.util.Scanner;

public class Ja0120_학생성적 {

	public static void main(String[] args) {
		// 배열 X 객체 사용
		Scanner scan = new Scanner(System.in);
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		Stuscore[] s = new Stuscore[10];
		int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		String name = "";
		double avg = 0;
		int[] score = new int[3];
		int choice = 0, count = 0; // 번호선택, 학생수 확인
		
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("[ 학생성적 입력 ]");
				// 입력
				while(count<10) {
					System.out.printf("[ %d 번째 ]\n",count+1);
					System.out.println("이름을 입력하세요.(0.이전페이지 이동) ");
					name = scan.next();
					if (name.equals("0")) {
						break;
					}
					// 국어, 영어, 수학 성적 입력
					for (int i = 0; i < score.length; i++) {
						System.out.printf("%s 점수를 입력하세요.", title[i + 2]);
						score[i] = scan.nextInt();
					}
					s[count] = new Stuscore(name, score[0], score[1], score[2]);
					
					s[count].print(); // 클래스에서 프린트 메소드를 만들어서 출력
					System.out.println("학생성적이 저장되었습니다.");
					count++;
				}
				break;
		    case 2:
				System.out.println("[ 학생성적 출력 ]");
				System.out.println("-------------------------------------------------");
				for (int j = 0; j < title.length; j++) {
					System.out.printf("%s\t", title[j]);
				}
				System.out.println();
				System.out.println("-------------------------------------------------");
				for (int j = 0; j < count; j++) {
					System.out.print(s[j].no + "\t");
					System.out.print(s[j].name + "\t");
					System.out.print(s[j].kor + "\t");
					System.out.print(s[j].eng + "\t");
					System.out.print(s[j].math + "\t");
					System.out.print(s[j].total + "\t");
					System.out.printf("%.1f\t", s[j].avg);
					System.out.print(s[j].rank + "\t");
					System.out.println();
				}
				break;
				
	        case 3:
	        	System.out.println("[ 학생성적 수정 ]");
	        	System.out.println("수정할 학생의 이름을 입력하세요. >> ");
	        	String searchName = scan.next();
	        	int search = -1;
				for (int i = 0; i < count; i++) {
					if (searchName.equals(s[i].name)) {
						search = i;
						break;
					}
				}
				if (search == -1) {
					System.out.println("찾는 이름이 없습니다.");
                } else {
                    System.out.println("수정할 과목을 선택하세요.");
                    System.out.println("1. 국어 2. 영어 3. 수학");
                    int choice2 = scan.nextInt();
                    System.out.println("수정할 점수를 입력하세요. >> ");
                    int newScore = scan.nextInt();
                    switch (choice2) {
                    case 1:
                        s[search].kor = newScore;
                        break;
                    case 2:
                        s[search].eng = newScore;
                        break;
                    case 3:
                        s[search].math = newScore;
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                    }
                    s[search].total = s[search].kor + s[search].eng + s[search].math;
                    s[search].avg = s[search].total / 3.0;
                    
                    s[search].print(); // 수정된 성적 출력
                    System.out.println("수정이 완료되었습니다.");
                }
            	break;
            case 4:
            	System.out.println("[ 학생성적 등수처리 ]");
            	for (int i = 0; i < count; i++) {
            		rank = 1;
            		for (int j = 0; j < count; j++) {
            			if (s[i].total < s[j].total) {
            				rank++;
            			}
            		}
            		s[i].rank = rank;
            	}
            	System.out.println("등수처리가 완료되었습니다.");
            	break;
	        	
	        default:
	        	System.out.println("[프로그램 종료]");
	        	break loop;
			}
			
		}

	}

}
