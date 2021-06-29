package examples;

//생성자 함수 : 객체를 생성할 때(new) 자동으로 호출되는 함수
//       용도 : 초기화(미리 실행할 코드)

class Book{
	int price = 1000;
	public void read() {
		System.out.println("책을 읽는다");
	}
	
	//생성자 함수 - 자동호출
	//패턴
	//public 반환형없음 class이름()
	public Book() {
		System.out.println("생성자함수 호출됨.");
		this.price = 2000;
	}
}

public class ex79 {

	public static void main(String[] args) {
		Book book = new Book();
		System.out.println(book.price);
	}

}
