package j0124;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {

	public static void main(String[] args) {
		
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동",100,100,99));
		
		//MAP
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "aaa"); // map 저장
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
		map.put("list", list);
		
//		System.out.println("id : "+map.get("userId")); //없으면 null
//		System.out.println("pw : "+map.get("userPw"));
//		System.out.println("list : "+map.get("list")); //주소값 출력
		Iterator i = map.entrySet().iterator(); //entrySet()은 key와 value를 묶어서 가져오는 메소드
		
		while (i.hasNext()) {
			System.out.println(i.next()); //key=value 형태로 출력
		}
		
		System.out.println(map.containsKey("userId")); //key가 있는지 확인 true/false
		System.out.println(map.containsValue("1111")); //value가 있는지 확인 true/false
		
		if (map.containsKey("userId") == true) {
			System.out.println(map.get("userId")); // map에서 key에 해당되는 값 출력
		}
		
		
		
		//list 컬렉션 출력 방법
//		ArrayList list2 = (ArrayList)map.get("list"); //형변환
//		
//		for (int i = 0; i < list2.size(); i++) {
//			Stu s = (Stu) list2.get(i); 
//			System.out.println(s.getNo() + "," + s.getName());
//		}
		
		
		
//		//set
//		HashSet set = new HashSet(); // HashSet은 중복을 허용하지 않음 (순서도 유지하지 않음)
//		set.add(1);
//		set.add(3);
//		set.add(2);
//		set.add(2); // 중복이므로 추가되지 않음
//		
//		Iterator i  = set.iterator(); // Iterator는 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 인터페이스
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		i = set.iterator(); //출력은 무조건 1번더 사용해야 함.
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		
//		ArrayList<Stu> list = new ArrayList<Stu>();
//		list.add(new Stu("홍길동",100,100,99));
//		list.add(new Stu("유관순",90,90,99));
//		list.add(new Stu("이순신",80,80,89));
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMath(88);
//		list.add(s1);
//		
//		for(int i=0; i<list.size(); i++) {
//			Stu s = (Stu)list.get(i); // list.get(i)는 Object타입이므로 형변환 필요
//			System.out.println(s.getNo()+","+s.getName());
//		}
//	}
		
	}

}
