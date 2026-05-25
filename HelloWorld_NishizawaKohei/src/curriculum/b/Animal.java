package curriculum.b;

public class Animal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();//オブジェクトを作成
		
		 // setterで値を設定
        setName("ライオン");
        setLength(2.1);
        setSpeed(80);
        
        //コンソール表示用のメソッドを呼び出し
        showAnimal();
       
			}
	
	//フィールドで名前、体調、速度を保存する器を用意
	private static String name;
	private static double length;
	private static int speed;
		
			
	//setterで値を入れるメソッドを用意
	public static void setName(String name) {
		Animal.name = name;//
	}
	
	public static void setLength(double length) {
		Animal.length = length;
	}
			
	public static void setSpeed(int speed) {
		Animal.speed = speed;
	}
			
			
	//getterで値を取り出すメソッドを用意
	public static String getName() {
		return Animal.name;//setterで入れたライオンを取り出す
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
