package examples;
//import영역
//class 영역
//세대별 프로그래밍 언어 
//1세대 : 절차지향언어 C, Fortran, Cobol, 어셈블리어
//      순차적인 수행 - 코드가 길어지면 관리가 힘들다. 재사용 힘들다.
//2세대 : 객체지향언어 Java, C++, C#, ObjectiveC, 
//      클래스(함수,변수)-코드뭉치 분리 - 재사용, 관리가 편하다.
//      설계가 복잡, 해석이 힘들다.
//3세대 : 함수지향언어 코틀린, 스위프트, Go, JavaScript
//      비동기처리 - 통신, UI Event
//OOP( Object Oriented Programming ) : 객체지향(클래스지향)
//클래스(함수+변수 코드뭉치) -> new(메모리에 생성)하면 객체 (인스턴스)
//자바는 클래스에서 시작해서 클래스에서 종료
//객체 => 사물이란 말.
//객체지향 프로그래밍(클래스지향 프로그래밍) -> 모든 사물을 클래스로 설계하자.
//사물 : 자동차
class Car {
	//속성 = 변수(필드) = 멤버변수
	int price = 1000;
	//행동 = 메소드(함수) = 멤버함수
	void run() {
		System.out.println("달린다.");
	}
}
public class ex70 {
	public static void main(String[] args) {
		//클래스를 객체(인스턴스)로 생성
		//클래스이름 객체이름 = new 클래스이름();
		Car objCar = new Car();
		//객체이름 뒤에 점을 찍으면, 멤버함수,멤버변수에 접근할 수 있다.
		System.out.println( objCar.price ); 
		//System.out.println( objCar.run() );  error
		objCar.run();
	}
}
//class 영역