package j0116;

import java.util.Scanner;

public class Ja0116_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		// 5,5 배열을 생성
		String[][] arr = new String[5][5];
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		// 섞기
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		
//		System.out.println(Arrays.toString(num)); // 1차원 번호 배열
		
		String[][] arr2 = new String[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr2[i][j] = num[5*i+j]+""; // int -> str
				
			}
		}
		
		// 뽑기 입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {				
				arr[i][j] = "뽑기";
			}
		}
		
		// 뽑기출력
		int no = 0;
		while(no<10) {
			System.out.println("	       [ 뽑기 게임 ]");
			System.out.println("-------------------------------------------");
			System.out.printf("좌표 | \t0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------------");
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%d   |\t",i);
				for(int j=0; j<arr[i].length; j++) {
					System.out.printf(arr[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("-------------------------------------------");
			
			// 좌표입력
			System.out.print(" (행) X 좌표를 입력하세요. (종료: -1) >> ");
			int x = scan.nextInt();
			if(x==-1){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print(" (열) Y 좌표를 입력하세요. >> ");
			int y = scan.nextInt();
			System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
			
			if(x>=0 && x<=4 && y>=0 && y<=4) {
				break;
			}else {
				System.out.println("좌표를 잘못 입력하셨습니다. 다시 입력하세요.");
			}
			
			if(arr2[x][y].equals("1")) {
				arr[x][y] = "당첨!";
				money += 1;
				
			}else {
				arr[x][y] = "꽝.";
				money += 0;
			}
			System.out.printf("결과 : %s \n",arr[x][y]);
			System.out.printf("당신의 머니 : %d 억",money);
			
			no++;
		}
		
		
		
		// 번호출력
//		System.out.println("	       [ 뽑기 게임 ]");
//		System.out.println("-------------------------------------------");
//		System.out.printf("좌표 | \t0\t1\t2\t3\t4\n");
//		System.out.println("-------------------------------------------");
//		for(int i=0; i<arr2.length; i++) {
//			System.out.printf("%d   |\t",i);
//			for(int j=0; j<arr2[i].length; j++) {
//				System.out.printf(arr2[i][j]+"\t");
//			}
//			System.out.println();
//		}

		
		
	}

}
