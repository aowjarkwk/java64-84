package examples;
//연습문제
//카페라는 객체를 클래스로 설계해 보자
//클래스이름 : Cafe
//속성: menuCount      10개의 메뉴이다.
//행동: sale           출력값은 "커피를 판다"
class Cafe{
    int menuCount = 10;
	void sale() {
		System.out.println("커피를판다");
	}
}

public class ex71 {

	public static void main(String[] args) {
		Cafe objcaf = new Cafe();
		System.out.println(objcaf.menuCount);
		objcaf.sale();

	}

}
