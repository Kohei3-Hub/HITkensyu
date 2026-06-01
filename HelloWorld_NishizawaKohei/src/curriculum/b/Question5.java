package curriculum.b;

public class Question5 {


	public static void main(String[] args) {
		//Q1
		helloWorld(); // メソッドを呼び出す
		 
		
		//Q2
		doubleValue(5);
		
		//Q3
		int num1 = 7;
		int num2 = 10;
		isEven(num1 , num2);
		
		
	}
	
	//Q1メソッドの定義
	public static void helloWorld() {
		
		  System.out.println("Hello,World!");
		 }

	
	//Q2
	public static void doubleValue(int num) {
		System.out.println(num + "を2倍すると" + (num * 2) + "です");

	}
	
	
	//Q3
	public static void isEven(int num1, int num2) {
		if(num1 % 2 == 0) {
			System.out.println(num1 + "は偶数です。");
		}else {
			System.out.println(num1 + "は奇数です。");
		}
		

		if(num2 % 2 == 0) {
			System.out.println(num2 + "は偶数です。");
		}else {
			System.out.println(num2 + "は奇数です。");
		}
	}	
}
