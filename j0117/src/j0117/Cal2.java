package j0117;

public class Cal2 {
	// a,b -> a,b 각각 10 더해서 두수를 더하기를 해서 리턴
			// a,b -> a,b 각각 10 곱해서 두수를 더하기 해서 리턴
			// a,b -> a,b 곱해서 리턴
	int add(int a, int b) {
		int result = (a+10)+(b+10);
		return result;
	}
	
	int mult(int a, int b) {
		int result = (a*10)+(b*10);
		return result;
	}
	
	int multiply(int a, int b) {
		int result = a*b;
		return result;
	}

}
