package j0123;

import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3); // 순서X 중복X
		set.add(2);
		set.add(1);
		set.add(1); //안됨.
		set.add(4);
		
		System.out.println("개수 : "+set.size());
		
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		ArrayList list = new ArrayList();
//		
//		for(int i=0; i<10; i++) {
//			list.add(i+1);
//		}
//
//		//기본형태
//		Iterator<?> i1 = list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		// 편하게 사용하는 형태
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

	}

}