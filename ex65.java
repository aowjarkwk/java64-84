package examples;

public class ex65 {

	public static void main(String[] args) {
		//함수 안에서 함수를 정의할 수 없다!
		
		// 함수의 4가지 패턴
		
		//1. 매개변수 X, 반환형 X
		func1();
		//2. 매개변수 O, 반환형 X
		func2(20);
		//3. 매개변수 X, 반환형 O
		int result = func3();
		System.out.println("반환값:"+result);
		//4. 매개변수 O, 반환형 O
		result = func4(20);
		System.out.println("반환값:"+result);
		
	}
	//static 예약어: 정적 변수(함수)를 정의하고,
	//               램메모리에 적재될 때, 일정한 메모리(static)에 올라가고,
	//               그 주소에 프로그램종료시까지 동일한 주소에 머문다.
	
	//static함수에서 static함수만 호출가능하다.
	//void : 반환형이 없다는 뜻
	static void func1() {
		System.out.println("func1() 호출됨");
		return;
	}
	static void func2(int param) {
		System.out.println("func2() 호출됨:"+param);
		return;
	}
	static int func3() {
		System.out.println("func3() 호출됨");
		return 10;
	}
	static int func4(int param) {
		System.out.println("func4() 호출됨"+ param);
		return param;
	}
}
