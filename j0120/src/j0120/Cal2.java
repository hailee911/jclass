package j0120;

import java.util.Scanner;

public class Cal2 {
	String[] strPrint() {
		String[] input = new String[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("이름 입력 >> ");
			input[i] = scan.next();
		}
		scan.close();
		return(input);
	}
}
