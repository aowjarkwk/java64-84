package examples;
public class ex69 {
	//기술면접
	//메소드 오버로딩(Overloading) : 
	//         매개변수를 다르게 함으로 함수의 기능을 확장. 확장.
	//         장점: 함수이름을 계속 만들지 않고, 매개변수 달리 해서 사용.
	//메소드 오버라이딩(Overriding) : 
	//         상속관계에서 자식클래스가 부모클래스의 함수를 재정의하는 것. 재정의.
	static void echo() {
		System.out.println("echo() 매개변수없음");
	}
	static void echo(String message) {
		System.out.println("echo() 매개변수:"+message);
	}
	static void echo(int number) {
		System.out.println("echo() 매개변수:"+number);
	}
	//println() 함수도 확장(오버로딩)이 되는 함수이다.
	public static void main(String[] args) {
		echo();
		echo("에코!");
		echo( 10 );
		System.out.println();
		System.out.println("에코!");
		System.out.println( 10 );
	}
}