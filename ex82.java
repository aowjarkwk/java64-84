package examples;

//기본생성자,매개변수생성자에서
//상속관계에서의 생성자에 대해서

class Energy {
	int price = 1000;
	public Energy() {
		System.out.println("Energy 기본생성자");
	}
	public Energy(int price) {
		System.out.println("Energy 매개변수 생성자:" + price);
		this.price = price;
	}
}

class WindEnergy extends Energy{
	int price = 2000;
	
	public WindEnergy() {
		System.out.println("WindEnergy 기본생성자");
	}
	public WindEnergy(int price) {
		System.out.println("WindEnergy 매개변수 생성자:" + price);
		this.price = price;
	}
}


public class ex82 {

	public static void main(String[] args) {
		WindEnergy wind = new WindEnergy();
		
		WindEnergy wind2 = new WindEnergy(3000);

	}

}
