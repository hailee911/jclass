package j0120;

import java.util.Arrays;

public class Ja0120_02 {

	public static void main(String[] args) {
		// num 배열을 출력하시오.
		Arr arr = new Arr();
		System.out.println(Arrays.toString(arr.num));
		cal(arr.num);
		System.out.println(Arrays.toString(arr.num));
	}
	
	static void cal(int[] num) {
		// num의 배열에 10을 더해서 값을 돌려줌.
		for(int i=0; i <num.length; i++) {
			num[i] = num[i]+10;
		}
		
	}

}