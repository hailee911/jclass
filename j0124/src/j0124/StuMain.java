package j0124;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice=0, temp=0, count=0;
		
		StuDeck stuDeck = new StuDeck();
		stuDeck.fileRead(); // 파일 읽어오기
        
		while(true) {
			System.out.println("------------------------");
			System.out.println("	[ 학생성적프로그램 ]");
			System.out.println("------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 학생성적검색");
			System.out.println("6. 학생등수정렬");
			System.out.println("7. 학생이름정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 학생파일저장");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				break;
			case 2:
				System.out.println("[ 학생성적출력 ]");
				stuDeck.listPrint();
				break;
			case 3:
				System.out.println("[ 학생성적수정 ]");
				break;
			case 4:
				System.out.println("[ 학생성적삭제 ]");
				System.out.println("삭제하실 학생 이름을 입력하세요. >>");
				String stu = scan.next();
				//입력값이 0이면 break
				if (stu.equals("0")) {
					break;
				}
				// 입력값이 0이 아니면 학생이름을 찾아서 삭제
				for (int i = 0; i < stuDeck.list.size(); i++) {
					if (stuDeck.list.get(i).getName().equals(stu)) {
						temp = 1;
						if (temp == 1) {
							System.out.println(stu+"학생 성적을 삭제하시겠습니까? (1:삭제, 2:취소)");
							temp = scan.nextInt();
							if (temp == 1) {
								stuDeck.list.remove(i);
								System.out.println(stu + "학생 성적이 삭제되었습니다.");
							} else {
								System.out.println("삭제가 취소되었습니다.");
							} break;
						} 
					} else {
						temp = 0;
					}
				}
				if (temp == 0) {
					System.out.println("학생이 없습니다.");
				}
				
			case 5:
				System.out.println("[ 학생성적검색 ]");
				break;
			case 6:
				System.out.println("[ 학생등수정렬 ]");
				break;
			case 9:
				System.out.println("[ 학생파일저장 ]");
				//파일생성
				File file = new File("c:/save2/StuInfo.txt");
				if(!file.exists()) {
					file.createNewFile();
					System.out.println("파일이 생성되었습니다.");
				}
				FileWriter fw = new FileWriter("c:/save2/StuInfo.txt");	
				BufferedWriter bw = new BufferedWriter(fw);
				for (int i = 0; i < stuDeck.list.size(); i++) {
					stuDeck.list.get(i);
					String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", stuDeck.list.get(i).getNo(),
							stuDeck.list.get(i).getName(), stuDeck.list.get(i).getKor(), stuDeck.list.get(i).getEng(),
							stuDeck.list.get(i).getMath(), stuDeck.list.get(i).getTotal(), stuDeck.list.get(i).getAvg(),
							stuDeck.list.get(i).getRank());
					bw.write(str);
				}
				System.out.println("프로그램 종료");
				bw.close();
				fw.close();
				
			}
		}

	}

}
