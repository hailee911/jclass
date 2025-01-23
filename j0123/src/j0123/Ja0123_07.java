package j0123;

import java.util.ArrayList;

public class Ja0123_07 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		
		list.add(4,100); // 4번째 index에 100 추가
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //값출력
		}
		
		list.remove(2); // 2번째 index 삭제
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //값출력
		}
		
		for (int i = 0; i < list.size(); i++) { //거꾸로 삭제 (사실 그냥 clear() 쓰면 됨)
			list.remove(i);
		}
		System.out.println("----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //값출력
		}
		
		
		
//		List list2 = new ArrayList();
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		Integer i4 = new Integer(4);
//		list.add(i1);
//		list.add(i2);
//		list.add(i3);
//		list.add(i4);
		
//		list.add(1); // 순서O, 중복O
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.remove(3); // index 번호 삭제
//		System.out.println("--------------------");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.clear(); // 전체삭제
//		System.out.println("--------------------");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		if(list.isEmpty()) { // 값이 있는지 확인
//            System.out.println("파일이 없습니다.");
//		}
	}

}
