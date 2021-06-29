package examples;

//스태틱 클래스 static class
//스태틱 함수/변수
//프로그램 구동시 자동으로 메모리에 적재(new)

//전체프로그램에서 코드가 단일코드일 때, 복제가 더이상 필요없을때
//유틸리티 코드를 제작.
class BallFactory{
	static int amountEveryDay = 100;
	static void make() {
		System.out.println("축구공 만들기");
	}
}
class FoodFactory{
	int amountDay = 200;
	void make() {
		System.out.println("도시락 만들기");
	}
}

public class ex72 {

	public static void main(String[] args) {
		//클래스이름 뒤에 점찍고 접근가능함.
		System.out.println(BallFactory.amountEveryDay);
		BallFactory.make();
		
		BallFactory ball1 = new BallFactory();
		BallFactory ball2 = new BallFactory();
		
		FoodFactory obj1 = new FoodFactory();
		FoodFactory obj2 = new FoodFactory();
		FoodFactory obj3 = new FoodFactory();
	}

}
