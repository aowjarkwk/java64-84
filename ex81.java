package examples;

//생성자함수에 매개변수를 줘서 초기화를 할 수 있다.

class Robot2{
	String color = "빨강";
	
	//기본생성자
	public Robot2() {
		System.out.println("기본생성자 호출됨.");
	}
	//매개변수가 있는 생성자
	public Robot2(String color) {
		System.out.println("매개변수가 있는 생성자 호출됨.");
		this.color = color;
	}
}

public class ex81 {

	public static void main(String[] args) {
		//기본생성자를 통한 객체 생성
		Robot2 robot1 = new Robot2();
		System.out.println(robot1.color);
		//매개변수를 통한 생성자함수를 통한 객체 생성
		Robot2 robot2 = new Robot2("파랑");
			System.out.println(robot2.color);
	}

}
