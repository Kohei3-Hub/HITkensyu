package curriculum.b;
public class Main {

	public static void main(String[] args) {
		//Q4メソッド呼び出し
		Greeting greeting = new Greeting();
		
		Greeting.sayHello();
		
		
		//Q5メソッド呼び出し
		Animal.setName("ライオン");
		Animal.setLength(2.1);
		Animal.setSpeed(80);
		
		//Animal.setで入力して
		Animal.showAnimal();

	}

}
