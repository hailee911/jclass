package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_04IO {

	public static void main(String[] args) throws Exception {
		
		// ----------------- 글을 파일에 저장 ---------------------------
		File f = new File("c:/save2");
		if(!f.exists()) {
			f.mkdirs(); // c:/save2/aaa/ -mkdirs 둘다 만들어줌 c:/save2/aaa -mkdir save2폴더 없으면 에러
			
		}
		
		FileInputStream fis = new FileInputStream("c:/save/rose.jpg");
		FileOutputStream fos = new FileOutputStream("c:/save2/rose.jpg");
		while(true) {
			int read = fis.read();
			if(read==-1) break;
			fos.write(read);
		}
		fis.close();
		fos.close();
		
		
		System.out.println("이미지 복사 프로그램 종료");
		
		// ----------------- 파일에 있는 글자를 읽어서 출력 -----------------
		// 파일을 읽어서 데이터 출력
//		byte[] b = new byte[1024];
//		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//		fis.read(b);
//		System.out.println(new String(b));
		
		
		// IO STREAM
		// 글을 가져와서 출력하는 기본형태
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			while((read=fis.read()) != -1) { // 읽을 데이터 있으면
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
