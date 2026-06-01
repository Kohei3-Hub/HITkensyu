package curriculum.b;
import java.util.Random;
import java.util.Scanner;//コンソールに入力出来るようにScannerクラスをインポート

public class Question3 {

	public static void main(String[] args) {
/*
 * Q1
 * */
		for(int i = 1; i <= 10; i++) {//10になるまでループし処理ごとに+1になる
			System.out.println(i);//増えた数を表示
		}
		
/*
 * Q2
 * */
		for(int i = 1; i <= 20; i++ ) {//20になるまでループし処理ごとに+1になる
			if(i % 2 == 0) {// iを2で割り算をし、余りが0の場合表示
				System.out.println(i);				
			}
		}
		
/*
 * Q3
 * */
		for(int i = 10; i >= 1; i--) {//1になるまでループし処理ごとに-1になる
			System.out.println(i);//カウントダウンを表示
		}
		
/*
 * Q4
 * */		
		int sum = 0;//足した合計を入れるためにint型の値0を用意する
		for(int i = 1; i <= 100; i++) {//100回繰り返すようにループを用意する
			sum += i;//ループ毎にsumにiを足していく
		}
			System.out.println(sum);//合計を表示
	
/*
 * Q5
 * */
	int row = 5;//行数の数を指定する
	//2重ループ(多重ループ)
	for(int i = 1; i<= row; i++) {//ループをrowの回数まで行い処理後に+1する
		for(int j = 1; j <= i; j++) {//iループの中で*を増やすためにループを行い処理後に+1する
			System.out.print("*");//改行せずに表示
			}
		System.out.println();//改行しながら表示
		}
	
/*
 * Q6
 * */	
	int count = 1;//カウンターの数を初期化
	while(count <= 10) {//countが10になるまでループ
		System.out.println(count);//コンソールに表示
		count++;//countを1ずつ増やす
	}
	
/*
 * Q7
 * */	
	count = 1;
	while(count <= 20) {//countが20になるまでループ
		if(count % 2 == 0) {// iを2で割り算をし、余りが0の場合表示
			System.out.println(count);//コンソールに偶数だけ表示
		}
		count++;//countを1ずつ増やす
	}
	
/*
 * Q8
 * */	
	count = 10;
	while(count >= 1) {//countが1以上の場合ループ
		System.out.println(count);//コンソールに数を表示
		count--;//countを1ずつ減らす
	}
	
/*
 * Q9
 * */	
	count = 1;
	sum = 0;//足した合計を入れるためにint型の値0を用意する
	while(count <= 100) {//countが100になるまでループ
		 sum += count;//sumにcountを足す
		 count++;//countを1増やす
	}
	 System.out.println(sum);//コンソールに合計数を表示
	 
/*
 * Q10
 * */
	 Scanner scanner = new Scanner(System.in);//インスタンスの作成
	 String number = scanner.nextLine();//String型でコンソールへ入力
	 int num = Integer.parseInt(number);//String型からint型へ型変換
	 
	 while(num != 0) {//numが0じゃない場合に"数値を入力してください"を表示して0が入力されるまでループ
		 System.out.println("数値を入力してください");
		 num = Integer.parseInt(scanner.nextLine());
		 
	 }

	 	System.out.println("終了しました");
	 	
/*
 * Q11
 * */
	 	for(int i = 1; i <= 9; i++) {//行数を9になるまでループ
	 		for(int j = 1; j<= 9; j++) {//列数を9になるまでループ
	 			System.out.printf("|%02d*%02d=%02d|",i,j,i*j);//"%02dで数字を0埋めで表示"
	 		}
	 			System.out.println();	
	 	}
	 	
/*
 * Q12
 * */
	 	
	 	Random random = new Random();//ランダムの数字を出すためにインスタンス作成
	 	int tvNum = random.nextInt(12);//テレビの値を0～11まで数字が出るように設定
	 	int displayNum = 11 - tvNum;//ディスプレイはテレビの数と合計で11に
	 		
	 	
	 	String homeApp = scanner.nextLine();//家電の名前を入力
	 	String[] input = homeApp.split("、");//、で区切る際にcase名を分割する
	 	

	 	for(String home : input) {//拡張for文で変数homeを設定し、inputで「、」を入力しても区別できるように設定
	 		
		 	
	 		switch(home.trim()) {//空白を取り除き処理を実行する
	 		case "パソコン"://商品名が入力されたら実行する
	 			System.out.println( home + "の残り台数は"+ random.nextInt(12) + "台です");//商品の数を0～11で表示
	 			break;
	 		
	 		case "冷蔵庫":
	 			System.out.println( home + "の残り台数は" + random.nextInt(12) +  "台です");
	 			break;

	 		case "扇風機":
	 			System.out.println( home + "の残り台数は" + random.nextInt(12) + "台です");
	 			break;
	 			
	 		case "洗濯機":
	 			System.out.println( home + "の残り台数は" + random.nextInt(12) + "台です");
	 			break;
	 			
	 		case "加湿器":
	 			System.out.println( home + "の残り台数は" + random.nextInt(12) + "台です");
	 			break;
	 			
	 		case "テレビ":
	 		case "ディスプレイ":
	 			
	 			System.out.println( home +  "の残り台数は" + (home.trim().equals("テレビ") ? tvNum : displayNum) + "台です");//三項演算子を用いてtrueならテレビの数を表示、falseならディスプレイの数を表示
	 			break;
	 			
	 		default://上記以外の商品名が入力された場合は表示する
	 			System.out.println("『" + home + "』は指定の商品ではありません");
	 			break;
	 				
	 		}
	 		
	 	}
	 		scanner.close();
	 	
	}
}	