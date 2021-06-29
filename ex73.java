package examples;
//연습문제
//농장에 당근을 키우는 게임을 만들어보자.
//농장 Farm 클래스를 만들고,
//이 안에 현재 당근의 갯수를 담는 정수형 변수 carrot를 만들고,
//당근을 생산하는 메소드 plant()를 호출하면,
//당근을 하나씩 더 생산합니다.
//plant()메소드를 이용하여 5번 호출하여 당근을 생산해 봅시다.
//마지막에 당근의 갯수를 출력하시오.
class Farm{
	int carrot = 0;
	void plant(){
		carrot+=1;
	}
}

public class ex73 {

	public static void main(String[] args) {
		Farm objFarm1 = new Farm();
		objFarm1.plant();
		objFarm1.plant();
		objFarm1.plant();
		objFarm1.plant();
		objFarm1.plant();
		System.out.println(objFarm1.carrot);

		Farm objFarm2 = new Farm();
		objFarm2.plant();
		
		System.out.println(objFarm2.carrot);

	}

}
