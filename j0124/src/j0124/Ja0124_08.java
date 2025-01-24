package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_08 {

	public static void main(String[] args) throws Exception {
		// 폴더 확인 및 폴더 생성
		String folder = "c:/save4";
		File f = new File(folder);
		if(!f.exists()) {
			f.mkdirs(); // 폴더생성
			System.out.println("폴더가 생성되었습니다.");
		}
		//파일생성
		File file = new File(folder+"/ccc.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		}
		
		//FileOutputStream
		FileOutputStream fos = new FileOutputStream(folder+"/ccc.txt");
		
          
		
		String str = "1,hong홍,100,100,100,300,100.0,0";
		str += "2,yu유,90,90,90,270,90.0,0";
		byte[] bytes = str.getBytes();
		for(byte b:bytes) {
			fos.write(b);
		}
		
		
		
		//FileInputStream
//		try {
//			FileInputStream fis = new FileInputStream("c:/save2/bbb.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.println((char)read);
//			}
//			fis.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("프로그램 종료!");

	}

}
