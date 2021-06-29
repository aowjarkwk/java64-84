package examples;

//싱글톤(singleton) : 메모리상의 유일한 객체를 의미함.

class Ring{ //일반 반지 - 여러개로 복제 가능
	
}
class KingRing{ //절대 반지 - 유일함. 하나밖에 없음
	
	private static KingRing singleton = new KingRing();
	
	//생성자 함수
	public KingRing() {
		System.out.println("유일 반지가 생성되었습니다.");
	}
	//getter
	static KingRing getInstance() {
		return singleton;
	}
}

public class ex76 {

	public static void main(String[] args) {
		Ring ring1 = new Ring();
		Ring ring2 = new Ring();
		Ring ring3 = new Ring(); //복제가능
		
		System.out.println(ring1);//주소값
		System.out.println(ring2);
		System.out.println(ring3);
		
		//싱글톤 사용
		KingRing kingring1 = KingRing.getInstance();
		System.out.println(kingring1);
		KingRing kingring2 = KingRing.getInstance();
		System.out.println(kingring2); // 주소값 안바뀜

	}

}
