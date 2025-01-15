package j0115;

import java.util.Arrays;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10까지 랜덤숫자를 저장하는데 동일한 번호가 없게 저장하시오.
		
		int[] num = new int[10];
		
		int i = 0;
		
		loop:while(i<10) {
			int ran = (int)(Math.random()*10)+1;
			num[i] = ran;
			for(int j=0; j<i; j++) {
				if (num[j] == ran) {
					System.out.println("중복 번호 : "+ran);
					continue loop;
				}
			}
			i++;
		}
		System.out.println();
		System.out.print("로또 번호 : "+ Arrays.toString(num));
		
//		int[] num2 = new int[10];
//		
//		int temp = 0;
//		for(int j=0; j<300; j++) {
//			int ran = (int)(Math.random()*10);
//			temp = num2[0];
//			num2[0] = num2[ran];
//			num2[ran] = temp;
//		}
//		
//		System.out.println();
//		System.out.print("로또 번호 : "+ Arrays.toString(num2));
//
	}

}
