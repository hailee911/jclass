package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ja0124_06 {

	public static void main(String[] args) throws Exception {
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동",100,100,99));
		list.add(new Stu("유관순",90,90,99));
		list.add(new Stu("이순신",80,80,99));
		
		// list파일에 들어 있는 내용을 stu.txt
		// 1,홍길동,100,100,100,300,100.0,0
		// 들어가 있는 3명의 학생성적을 stu.txt파일에 저장하시오.
		FileWriter fw = new FileWriter("c:/save2/stu.txt");	
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",list.get(i).getNo(), list.get(i).getName(),
					list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath(),
					list.get(i).getTotal(), list.get(i).getAvg(), list.get(i).getRank());
			bw.write(str);
		}
		System.out.println("프로그램 종료");
		bw.close();
		fw.close();
		
		//save2폴더에 stu.txt로 아래의 글을 저장하시오.
//		String[] str = new String[3];
//		str[0] = "1,홍길동,100,100,99";
//		str[1] = "2,유관순,90,90,99";
//	    str[2] = "3,이순신,80,80,99";
//	    
//	    FileWriter fw = new FileWriter("c:/save2/stu.txt");
//	    BufferedWriter bw = new BufferedWriter(fw);
//	    for(int i=0; i<str.length; i++) {
//	    	bw.write(str[i]+"\r\n");
//	    }
//	    bw.close();
//	    System.out.println("저장 완료");
//	    
//	    FileReader fr = new FileReader("c:/save2/stu.txt");
//	    BufferedReader br = new BufferedReader(fr);
//	    while(true) {
//			String line = br.readLine();
//			if(line==null) break;
//			System.out.println(line);
//	    }
//	    br.close();
//	    fr.close();
	    
//	    str[3] = "4,강감찬,70,70,79";
//	    FileWriter fw2 = new FileWriter("c:/save2/stu.txt",true); //true 이어쓰기, false 덮어쓰기
//	    BufferedWriter bw2 = new BufferedWriter(fw2);
//	    for(int i=3; i<4; i++) {
//        	bw2.write(str[i]+"\r\n");
//        }
//        bw2.close();
//        fw2.close();
	System.out.println("프로그램 종료");

	}

}
