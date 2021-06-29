package examples;
//접근 권한 키워드
//public : 다른 클래스(파일)에서 접근 가능(read/write)
//protected : 상속관계의 클래스에서만 접근 가능 + 같은 패키지 가능
//default(무명) : 같은 패키지내(폴더)에서만 접근 가능
//private : 다른 클래스에서 접근 불가 - 캡슐화, 은닉
//클래스, 함수(메소드), 변수 앞에 기술.
class Access {
	String name = "홍길동"; //디폴트
	public int age = 30; //공용
	protected int korScore = 80; //상속관계
	private int engScore = 70; //접근 불가 - 은닉 - 캡슐화
	//Getter함수 : 멤버변수를 외부에서 접근가능하도록 오픈해주는 함수.
	public int getEngScore() {
		return engScore;
	}
	//Setter함수 : 멤버변수를 외부에서 접근가능하도록 오픈해주는 함수.
	public void setEngScore(int engScore) {
		//this는 자기 클래스를 의미
		this.engScore = engScore;
	}
}
public class ex74 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}