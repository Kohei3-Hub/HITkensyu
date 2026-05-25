package curriculum.b;

public class Animal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		 // setterで値を設定
        setName("ライオン");
        setLength(2.1);
        setSpeed(80);
        
        showAnimal();
       
			}
	
	//フィールド
	private static String name;
	private static double length;
	private static int speed;
		
			
	//setter
	public static void setName(String name) {
		Animal.name = name;
	}
	
	public static void setLength(double length) {
		Animal.length = length;
	}
			
	public static void setSpeed(int speed) {
		Animal.speed = speed;
	}
			
			
	//getter
	public static String getName() {
		return Animal.name;
	}
			
	 public static double getLength() {
	     return Animal.length;
	 }

	  public static int getSpeed() {
	     return Animal.speed;
	 }
	  
	  public static void showAnimal() {
	  // getterで値を取得して表示
      System.out.println("動物名：" + getName());
      System.out.println("体長：" + getLength() + "m");
      System.out.println("速度：" + getSpeed() + "km/h");
	  
	  }
}
