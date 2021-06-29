package examples;
//연습문제
//책상(Desk)을 클래스로 설계해보자
//get함수, set함수를 생성해보자
// 속성 : 변수 price = 1000 
//      : private로 정하자.
// 책상의 가격을 2000으로 바꾸고, 가격을 출력해보자.
class Desk {
	private int price = 1000; //정보의 은닉, 캡슐화
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//마우스 우클릭 -> Source -> Generate Getters/Setters
}
public class ex75 {
	public static void main(String[] args) {
		Desk obj = new Desk();
		System.out.println( obj.getPrice() );
		obj.setPrice( 2000 );
		System.out.println( obj.getPrice() );
	}
}