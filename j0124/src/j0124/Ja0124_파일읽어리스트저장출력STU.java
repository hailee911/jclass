package j0124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Ja0124_파일읽어리스트저장출력STU {

	public static void main(String[] args) throws Exception {
		// c:/save/stu.txt 파일을 읽어와서
		// list 컬렉션에 데이터를 입력하시오.
		ArrayList<Stu> list = new ArrayList<Stu>();
		int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		String name = "";
		double avg = 0;
	
		
		FileReader fr = new FileReader("c:/save2/stu.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			// 문자열 -> 숫자로 변형해서 입력을 시켜야 계산이 가능함.
			// Integer.parseInt() : 문자열 -> 정수
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no, name, kor, eng, math, total, avg, rank));
			
			}
		br.close();
		fr.close();
		
		// list 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d]\n", list.get(i).getNo(), list.get(i).getName(),
					list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath(), 
					list.get(i).getTotal(),list.get(i).getAvg(), list.get(i).getRank());
		}
		System.out.println("프로그램 종료");

	}

}
