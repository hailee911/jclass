package j0115;

import java.util.Scanner;

public class Ja0115_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] title = {"국어", "영어", "수학", "합계", "평균"};
		
		// 국어,영어,수학, 합계 3명 [4]
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		
		// 1. 입력
		for(int i=0; i<score.length; i++) {
			// 이름
			System.out.println("이름을 입력하세요. >>");
			name[i] = scan.next();
			
			int total = 0;
			for(int j=0; j<score[i].length-1; j++) {
				System.out.printf("[%s] 점수를 입력하세요.",title[j]);
				score[i][j] = scan.nextInt();
				total += score[i][j];
				if(j==2) {
					score[i][j+1] = total;
					avg[i] = total/3.0;
				}
			}
		}
		
		// 2. 출력
		System.out.print("이름"+"\t");
		System.out.printf("%s\t %s\t %s\t %s\t %s\n",title[0],title[1],title[2],title[3],title[4]);
		System.out.println("----------------------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			
			System.out.println(avg[i]+"\t");
		}
		

	}

}
