package examples;
//연습문제 - 상속
//부모클래스 - 나무     Wood
//            속성 가격 int price = 1000
//            행동 불탄다 burn() 
//자식클래스 - 나무책상 WoodDesk
//            속성  color
//            행동  study
//       - 나무의자 WoodChair
//            속성  color
//            행동  sit
class Wood{
	int price = 1000;
	void burn() {
		System.out.println("불탄다");
	}
}
class WoodDesk extends Wood{
	String color = "brown";
	void study() {
		System.out.println("공부한다");
	}
}
class WoodChair extends Wood{
	String color = "brown";
	void sit() {
		System.out.println("앉는다");
	}
}
public class ex78 {

	public static void main(String[] args) {
		WoodDesk objWoodDesk = new WoodDesk();
		objWoodDesk.burn();
		System.out.println(objWoodDesk.price);
		WoodChair objWoodChair = new WoodChair();
		objWoodChair.burn();
		System.out.println(objWoodChair.price);

	}

}
