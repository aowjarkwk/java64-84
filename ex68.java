package examples;

public class ex68 {
	//연습문제
	//자동차 가격정보 출력함수를 만들어 보자
	//함수이름: carPrice
	// 자동차 이름을 매개변수로 넣으면, 가격을 반환하는
	// 메소드를 설계해 보자.
	// "모닝"  => 1000   => "모닝은 1000만원입니다."
	// "싼타페"  => 2000   => "싼타페은 2000만원입니다."
	// "BMW"   => 3000   => "BMW은 3000만원입니다."
	// "벤츠" => 4000    => "벤츠은 4000만원입니다."
	static void carPrice(String param) {
		if(param.equals("모닝")) {
			System.out.println("모닝은 1000만원입니다.");
		}else if(param.equals("싼타페")){
			System.out.println("싼타페는 2000만원입니다.");
		}else if(param.equals("BMW")) {
			System.out.println("BMW는 3000만원입니다.");
		}else if(param.equals("벤츠")) {
			System.out.println("벤츠는 4000만원입니다.");
		}else {
			System.out.println("잘못된 값 입니다");
		}
	}
	public static void main(String[] args) {
		carPrice("모닝");
		carPrice("싼타페");
		carPrice("BMW");
		carPrice("벤츠");

	}

}
