package curriculum.b;
import java.util.Scanner;//コンソールに入力出来るようにScannerクラスをインポート

public class Question4 {

	public static void main(String[] args) {
		
/*
 * Q1
 * */
		int[] array = {1,2,3,4,5};//int型の配列を作成、1～5の数字を格納
		
		for(int num : array) {
			System.out.println(num);
		}
		
		
/*
 * Q2
 * */		
		int[] array1 = {10,20,30,40,50};//int型の配列を作成、10～50の数字を格納

		for(int i = array1.length - 1; i>= 0; i--) {//for文の初期化式に配列数より1少なく設定して４回ループさせる。処理後に-1
			System.out.println(array1[i]);
	}
		
/*
 * Q3
 * */
		int[] array2 = {3,5,7,9,11};//int型の配列を作成、3, 5, 7, 9, 11の数字を格納
		int sum = 0;//合計数の器を用意
		
		for(int i = 0; i< array2.length; i++ ) {//iが配列数の数になるまでループ
			sum += array2[i];//ループ毎に合計＋配列の数字が足される
			
		}
		System.out.println(sum);
		
		
/*
 * Q4
 * */
		int[] array3 = {12,7,9,21,5,18};//int型の配列を作、12,7,9,21,5,18の数字を格納
		int arrayMax = array3[0];//最大値を入れる器を用意
		int arrayMin = array3[0];//最小値を入れる器を用意
		
		for(int i = 0; i< array3.length; i++) {//iが配列数の数になるまでループ
			if(arrayMax < array3[i]) {//arrayMaxより大きければ
				arrayMax = array3[i];//array3の値を代入
			}
			
			if(arrayMin > array3[i]) {//arrayMinより小さければ
				arrayMin = array3[i];//array3の値を代入
			}
		}
		System.out.println("最大値は" + arrayMax + "です");
		System.out.println("最少値は" + arrayMin + "です");
		
/*
 * Q5
 * */
		int[] array4 = {1,2,3,4,5};//int型の配列を作成、1～5の数字を格納
		for(int i = 0; i< array4.length; i++) {//iが配列数の数になるまでループ
			
			array4[i] *= 2;//配列の数を２倍にする
			}
			for(int num2: array4) {//拡張for文で全配列を順番に表示
				System.out.println(num2);
		}
		
			
/*
 * Q6
 * */
		int[] array5 = {4,7,10,15,20};//int型の配列を作成、4, 7, 10, 15, 20の数字を格納
		Scanner scanner = new Scanner(System.in);//インスタンスの作成(使いまわせるように設定)
		boolean judgment = false;//boolean型のjudgmentに初期値falseを設定
		
		String number = scanner.nextLine();//String型でコンソールへ入力
		int num3 = Integer.parseInt(number);//String型からint型へ型変換
		

		
		for(int i = 0; i < array5.length; i++) {//iが配列数の数になるまでループ
			if(num3 == array5[i]) {//num3とarray5[i]が等しければtrue
				judgment = true;
			}
		}
			System.out.println(judgment ? num3 + "は配列に含まれています" : num3 + "は配列に含まれていません");//trueなら含まれていると表示、falseなら含まれていません
		
			
/*
 * Q7
 * */
			int[][] array6 = {{1,2},{3,4},{5,6}};//２次元配列で３行×２列で格納
			
			for(int i = 0; i< array6.length; i++) {//2重でループして、行数をカウント
				for(int j = 0; j< array6[i].length; j++) {//列をループ
					System.out.println(array6[i][j]);//
				}
			}
			
			
/*
 * Q8
 * */
			int[][] array7 = {{10,20,30},{40,50,60},{70,80,90}};//2次元配列で３行×3列で格納
			 sum = 0;//合計数の器を用意
			 
			 for(int i = 0; i<array7.length; i++) {//2重でループして、行数をカウント
				 for(int j = 0; j<array7[i].length; j++) {//列をループ
		
					 sum += array7[i][j]; //sumに全ての配列を足される
				 }
			 }
			System.out.println(sum);
			
			
/*
 * Q9
 * */
			int[][] array8 = {{12,15,8},{6,19,25},{30,2,10}}; //2次元配列で３行×3列で格納
			int arrayMax2 = array8[0][0];//最大値を入れる器を用意
			int arrayMin2 = array8[0][0];//最小値を入れる器を用意
			
			for(int i = 0; i<array8.length; i++) {//2重でループして、行数をカウント
				for(int j = 0; j<array8[i].length; j++) {//列をループ
					
					if(arrayMax2< array8[i][j]) {//もしarrayMax2がarray8[i][j]より小さければ
						arrayMax2 = array8[i][j];//arrayMax2に数値を代入 
					}
					if(arrayMin2> array8[i][j]) {//もしarrayMax2がarray8[i][j]より大きければ
						arrayMin2 = array8[i][j];//arrayMax2に数値を代入 
					}
				}
			}
			System.out.println("最大値は" + arrayMax2 + "です");
			System.out.println("最小値は" + arrayMin2 + "です");	
			
			
/*
 * Q10
 * */
			int[][][] array9 =  {{{1,2},{3,4}},{{5,6},{7,8}}};//多次元配列で4行×2列で格納
			
			for(int i = 0; i< array9.length; i++) {//{{{1,2},{3,4}},{{5,6},{7,8}}}を確認
				for(int j = 0; j< array9[i].length; j++) {//{{1,2},{3,4}},{{5,6},{7,8}}を確認
					for(int k = 0; k< array9[i][j].length; k++) {//ループで１つずつ数を確認
						System.out.println(array9[i][j][k]);
					}
				}
			}
			scanner.close();//scannerオブジェクトを閉じる
	}

}
