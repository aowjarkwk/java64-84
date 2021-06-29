package examples;
//클래스의 개념
//1.상속
//2.생성자함수
//3.재정의(Override, 오버라이드)  <-> 오버로딩(확장)
//4.다형성
//5.추상화클래스
//6.인터페이스
//7.익명함수-인터페이스 오버라이딩

//클래스의 상속
// : 부모클래스의 자산(변수,함수)을 자녀클래스에게 물려주는 것.

class Animal{
	//속성
	int age = 10;
	//행동
	void eat() {
		System.out.println("먹는다");
	}
}

class Dog extends Animal{ //강아지 - 동물의 속성을 가짐
	
}
class Cat extends Animal{ //고양이 - 동물의 속성을 가짐
	
}
public class ex77 {

	public static void main(String[] args) {
		Dog objDog = new Dog();
		System.out.println(objDog.age);
		objDog.eat();
		
		Cat objCat = new Cat();
		System.out.println(objCat.age);
		objCat.eat();
	}

}
