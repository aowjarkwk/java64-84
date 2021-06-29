package examples;
class Robot{
	String Color = "빨강";
	void walk() {
		System.out.println("걷는다");
	}
	public Robot() {
		this.Color="흰색";
	}
}
public class ex80 {

	public static void main(String[] args) {
		Robot robot = new Robot();
		System.out.println(robot.Color);
	}

}
