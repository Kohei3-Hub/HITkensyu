package curriculum.b;
import java.util.Scanner;//コンソールに入力出来るようにScannerクラスをインポート

public class Question2 {

	public static void main(String[] args) {
/*
 * Q1
 * */	
		int score = 75;//int型に変数scoreを宣言して75を代入
		
		if(score > 60) { System.out.println("合計です！"); }//scoreが60以上の場合"合格です！"と表示
		
		
/*
 * Q2
 * */
		int age = 25;//int型に変数ageを宣言して25を代入
		
		if(age >= 20 && age <= 30) {
			System.out.println("適正年齢です");//20以上かつ30以下なら適正年齢ですを表示
		} else {
			System.out.println("対象外です");//20以上かつ30以下で無ければ対象外ですを表示
		}
		
		
/*
 * Q3
 * */
		age = 18;//ageに18を代入
		
		if(age >= 20) {
			System.out.println("成人です");//20以上であれば成人ですと表示
		}else if(age >= 13 && age<= 19){
			System.out.println("ティーンエイジャーです");//13以上19以下であればティーンエイジャーと表示
		}else {
			System.out.println("子供です");//数字が該当しない場合は子供ですと表示
		}
		
		
	
/*
 * Q4
 * */
		int x = 30;//int型xに30を代入
		int y = 15;//int型yに15を代入
		int z = 50;//int型zに50を代入
		int maxNum = x;//初期値にｘを代入
		
		if(y >= maxNum) {//yがmaxNumより大きい場合に代入
			maxNum = y;
		}
		
		if(z >= maxNum) {//zがmaxNumより大きい場合に代入
			maxNum = z;
		}
		System.out.println(maxNum);//一番大きい数字をコンソールに表示
		
		
		
/*
 * Q5
 * */
		int num;//int型のnumを用意
        Scanner scanner = new Scanner(System.in);//インスタンスの作成(javaを使いやすくするためのプログラム？)
        int number = scanner.nextInt();//int型の正数をコンソールに入力出来るようにする
        num = number;//変数numにnumberを代入
        
        if(num > 0){//0よりnumが大きければ正の数ですと表示
        	System.out.println("正の数です");
        }else if(num < 0){//0よりnumが小さければ負の数ですと表示
        	System.out.println("負の数です");
        } else {//0の数字の場合は0ですと表示
        	System.out.println("0です");
        }
        
        
/*
 * 06
 * */    
        int value;

	}
}
