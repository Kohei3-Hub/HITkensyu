package curriculum.b;
import java.util.Scanner;//コンソールに入力出来るようにScannerクラスをインポート

public class Qes1_3 {

	public static void main(String[] args) {
/*
 * Q1∼2
 * */
		Scanner scanner = new Scanner(System.in);//インスタンスの作成(使いまわせるように設定)
		String name = scanner.nextLine();//String型をコンソールに入力
		
		if(name.length() > 10) {//.lengthで文字数をカウントし10文字より多ければ“名前を10文字以内にしてください”と表示
			System.out.println("名前を10文字以内にしてください");
		}else if(name.length() <= 0) {//0文字以下もしくはnullなら“名前を入力してください”と表示
			System.out.println("名前を入力してください");
		}else if(!(name.matches("[0-9a-zA-z]"))){
			System.out.println("半角英数字のみで入力してください");
		}
		else {//それら以外であれば入力した文字を表示
			System.out.println("ユーザー名「" + name + "」を登録しました");
		}
		
		
/*
 * Q3
 * */
		

	}

}
