package curriculum.b;
import java.util.Scanner;//コンソールに入力出来るようにScannerクラスをインポート

public class Question2 {

	public static void main(String[] args) {
/*
 * Q1
 * */	
		int score = 75;//int型に変数scoreを宣言して75を代入
		
		if(score > 60) { System.out.println("合格です！"); }//scoreが60以上の場合"合格です！"と表示
		
		
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
        Scanner scanner = new Scanner(System.in);//インスタンスの作成(使いまわせるように設定)
        String number = scanner.nextLine();//String型でコンソールへ入力
        int num = Integer.parseInt(number);//String型からint型へ型変換
        
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
        String numberQ6  = scanner.nextLine();//String型でコンソールへ入力
        int value = Integer.parseInt(numberQ6);//

        if(value%2 == 0) {//入力した値%2で計算し余りが0なら偶数
        	System.out.println("偶数です");
        }else {//入力した値/2で余りが出た場合奇数
        	System.out.println("奇数です");
        }
        
        
/*
 * 07
 * */
        String scoreQ7 = scanner.nextLine();//String型でコンソールへ入力
        int numberQ7 = Integer.parseInt(scoreQ7);//String型からint型へ型変換
        
        if(numberQ7 >= 90) {
        	System.out.println("優");
        }else if(numberQ7 >= 70){
        	System.out.println("良");
        }else if(numberQ7 >= 50){
        	System.out.println("可");
        }else {
        	System.out.println("不可");
        }
        
        
/*
 * Q8
 * */	
        String strQ8 = scanner.nextLine();//String型でコンソールへ入力
      
        if(strQ8.isEmpty()) {
        	System.out.println("入力が無効です");
        }else {
        	System.out.println(strQ8);
        }
        
        
/*
 * Q9
 * */        
        String day = scanner.nextLine();//String型でコンソールへ入力
        int dayQ9 = Integer.parseInt(day);//String型からint型へ型変換
        
        switch(dayQ9) {//1～７の数字を入力し、曜日を表示
        case 1:
        	System.out.println("月曜日");
        	break;
        	
        case 2:
        	System.out.println("火曜日");
        	break;
        	
        case 3:
        	System.out.println("水曜日");
        	break;
        	
        case 4:
        	System.out.println("木曜日");
        	break;
        	
        case 5:
        	System.out.println("金曜日");
        	break;
        	
        case 6:
        	System.out.println("土曜日");
        	break;
        	
        case 7:
        	System.out.println("日曜日");
        	break;
        	
        default://1～7以外の場合に無効な入力ですと表示
        	System.out.println("無効な入力です");
        	break;
        }
        
        
/*
 * Q10
 * */
        String month = scanner.nextLine();//String型でコンソールへ入力
        int monthQ10 = Integer.parseInt(month);//String型からint型へ型変換
        
        switch(monthQ10) {//1～12を入力して季節を表示
        case 12:
        case 1:
        case 2:
        	System.out.println("冬");
        	break;
        	
        case 3:
        case 4:
        case 5:
        	System.out.println("春");
        	break;
        	
        case 6:
        case 7:
        case 8:
        	System.out.println("夏");
        	break;
        	
        case 9:
        case 10:
        case 11:
        	System.out.println("秋");
        	break;
        	
        default://1～12以外の場合に無効な月ですと表示
        	System.out.println("無効な月です");
        	break;
        }
	}	
}
