package stuproject;


public class StuMain {

	public static void main(String[] args) {
		StuDeck sd = new StuDeck();
		
		loop:while(true) {
			int choice = sd.main();
			switch(choice) {
				case 1:
					sd.register();
					break;
				case 2:
					sd.show();
					break;
				case 3:
					sd.modify();
					break;
				case 4:
					sd.delete();
					break;
				case 5:
					sd.search();
					break;
				case 6:
					// 미완 등수정렬
					break;
				case 7:
					// 미완 이름정렬
					break;
				case 8:
					sd.rank();
					break;
				case 9:
					// 파일저장
					break;
				case 0:
					System.out.println("[ 프로그램 종료 ]");
					break loop;
			} //switch
		}//while
		
		

	}

}
