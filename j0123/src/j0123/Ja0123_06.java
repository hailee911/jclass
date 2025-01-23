package j0123;

import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner scan = new Scanner(System.in);
		
		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		System.out.println(a+2+"aaa");
		System.out.println(str.append(2));
		
//		String a = "a";
//		for(int i=0; i<10; i++) {
//			a += i;
//		}
		
		
		//indexOf
//		String str = "bbaaccAABBCCaaddeeffAAaa";
//		System.out.println(str.indexOf("aa",0));
//		System.out.println(str.indexOf("aa",3));
//		int count = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.indexOf("aa",i) != -1) {
//				i = str.indexOf("aa",i);
//				System.out.println("aa가 존재하는 위치 : "+i);
//				count++;
//			}else
//				break;
//		}
//		System.out.println("aa가 존재하는 개수 : "+count);
		
		
		//ValueOf : 문자열로 변경
//		int a = 10;
//		double b = 3.14;
//		String.valueOf(a);
//		String.valueOf(b); // double -> String
//		String a1 = ""+a;
//		String a2 = ""+b;
		
//		String str = "1조1234567";
//		//substring : 문자열의 일부분을 추출
//		System.out.println(str.substring(2,6));
//		String[] arr = {"홍길동임","유관순입니다.","이순신이다","강감찬일까요","김구에요","홍길순임","홍길자다"};
//		// 첫글자와 마지막 글자 빼고 모두 출력하시오.
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].substring(1, arr[i].length()-1));
//		}
		
		
//		String str = "       안녕  하세   요 ";
//		System.out.println(str);
//		System.out.println(str.trim()); // 앞뒤 공백 제거
		// replace: 문자를 다른 문자로 대체 - 원본은 변경되지 않음
//		System.out.println(str.replace(" ", "")); // 공백 제거
		
		//length() : 문자의 길이
//		System.out.println("10자이내로 글자를 입력하세요.>>");
//		while(true) {
//			String str = scan.next();
//			if (str.length()>10) {
//				System.out.println("10자 이내로 입력하세요.");
//			}else {
//				System.out.println("입력한 글자는 >>");
//				System.out.println(str);
//			}
//		}
		
		
		// contains : 문자열이 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
		
		// arr의 배열에서 홍 있는 이름을 출력하시오.
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].contains(input)) {
//				System.out.println(arr[i]);
//				System.out.println("있는 위치 : "+str.indexOf(input));
//			}
//		}
		
		
		
//		String str = "1,홍길동,100,100,100,0,0,0,0";
		// 학번 : 1
		// 이름 : 홍길동
		// 국어 : 100
		
//		String[] arr = str.split(",");
//		int no = Integer.parseInt(arr[0]); // 문자열을 숫자로 변환
//		String name = arr[1];
//		int kor = Integer.parseInt(arr[2]);
//		int math = Integer.parseInt(arr[3]);
//		int eng = Integer.parseInt(arr[4]);
//		int sum = kor + math + eng;
//		double avg = sum / 3;
//		System.out.println("학번 : "+no);
//		System.out.println("이름 : "+name);
//		System.out.println("국어 : "+arr[2]);
//		System.out.println("수학 : "+arr[3]);
//		System.out.println("영어 : "+arr[4]);
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
//		
		
		
		
//		String str = "5";
//		int n = Integer.parseInt(str);
		
//		System.out.print("숫자를 입력 > 10,9 ");
//		// 두수의 합,곱을 구하시오.
//		String num = scan.nextLine();
//		String[] arr = num.split(",");
//		int a = Integer.parseInt(arr[0]); //문자열을 숫자로 변환
//		int b = Integer.parseInt(arr[1]);
//		System.out.println("합 : " + (a+b));
//		System.out.println("곱 : " + (a*b));
		
		
		
		//split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//concat : 문자열 합치기
//		String str = "안녕";
//		String str2 = "반가워";
//		System.out.println(str.concat(str2));
		
		//charAt() : 문자열에서 해당 인덱스의 문자를 반환
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
		
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		if(str.equalsIgnoreCase(str2)) { //대소문자 구분하지 않고 비교
//			System.out.println("같은 문자열입니다.");			
//		} else {
//			System.out.println("다른 문자열입니다.");
//		}
				
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone(); //객체복사
//		Point p3 = new Point(p1); //객체복사
//		
//		//값을 변경
//		p1.x = 10;
//		p2.x = 100;
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		Stu s = new Stu();
//		System.out.println(s); //주소값
//
//		Class s2 = Stu.class;
//		System.out.println(s2.getName()); //클래스 이름
//		
//		int a = 10;
//		int b = 1;
//		a += b; // a = a + b
		
		
//		String txt = "이번 설 연휴에는 귀성길 전국에 많은 눈이 내리고 설날에는 강추위가 찾아올 것으로 보여 날씨로 인한 불편이 우려됩니다.\r\n"
//				+ "\r\n"
//				+ "기상청은 본격적인 설 연휴가 시작되는 이번 주말과 휴일 내륙은 대체로 맑고 온화하겠지만, 동해안과 제주도 산간에는 비와 눈이 오겠다고 밝혔습니다.\r\n"
//				+ "\r\n"
//				+ "이후 다음 주 월요일과 화요일에는 한기를 동반한 저기압이 유입되면서 전국에 눈비가 오겠고, 중부 내륙과 남부 산간에는 대설특보 수준의 많은 양의 눈이 내려 쌓일 수 있어 미끄럼 사고가 우려됩니다.\r\n"
//				+ "\r\n"
//				+ "특히 설날에는 서울 아침 기온이 -6도까지 떨어지고, 한낮에도 영하권에 머무는 강추위가 예상됩니다.\r\n"
//				+ "\r\n"
//				+ "또 지형효과가 더해지는 충남과 호남 서해안, 제주도는 설날까지 눈과 내리고, 해안과 해상에는 강풍과 풍랑이 지속할 가능성 있어 도로 교통 불편은 물론 항공기와 배편 지연·결항이 우려됩니다.";
//		
//		String txt2 = "이번 설 연휴에는 귀성길 전국에 많은 눈이 내리고 설날에는 강추위가 찾아올 것으로 보여 날씨로 인한 불편이 우려됩니다.\r\n"
//				+ "\r\n"
//				+ "기상청은 본격적인 설 연휴가 시작되는 이번 주말과 휴일 내륙은 대체로 맑고 온화하겠지만, 동해안과 제주도 산간에는 비와 눈이 오겠다고 밝혔습니다.\r\n"
//				+ "\r\n"
//				+ "이후 다음 주 월요일과 화요일에는 한기를 동반한 저기압이 유입되면서 전국에 눈비가 오겠고, 중부 내륙과 남부 산간에는 대설특보 수준의 많은 양의 눈이 내려 쌓일 수 있어 미끄럼 사고가 우려됩니다.\r\n"
//				+ "\r\n"
//				+ "특히 설날에는 서울 아침 기온이 -6도까지 떨어지고, 한낮에도 영하권에 머무는 강추위가 예상됩니다.\r\n"
//				+ "\r\n"
//				+ "또 지형효과가 더해지는, 충남과 호남 서해안, 제주도는 설날까지 눈과 내리고, 해안과 해상에는 강풍과 풍랑이 지속할 가능성 있어 도로 교통 불편은 물론 항공기와 배편 지연·결항이 우려됩니다.";
//				
//		String txt3 = "안녕하세요";				
//		
//		String str1 = new String(txt2);
//		String str2 = new String(txt2);
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		

//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		if(s1.equals(s2)) {
//            System.out.println("같은 학생입니다.");
//        }else {
//            System.out.println("다른 학생입니다.");
//        }
//		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		System.out.println(p1);
//		
//		if(p1.equals(p2)) {
//            System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		}

}
