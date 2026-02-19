package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
/*
 * Q1. 各型の変数を宣言し、初期値を設定
 * */
		//変数byteNumの初期値を設定
		byte byteNum;
		//変数shortNumの初期値を設定
		short shortNum;
		//変数intNumの初期値を設定
		int intNum;
		//変数longNumの初期値を設定
		long longNum;
		//変数floatNumの初期値を設定
		float floatNum;
		//変数doubleNumの初期値を設定
		double doubleNum;
		//変数letterの初期値を設定
		char letter;
		//変数lettersの初期値を設定
		String letters;
		//変数isBooleanの初期値を設定
		boolean isBoolean;
		

/*
 * Q2. 1で宣言した各型の変数に指定された値を代入してください 
 * */
		byteNum = 10;//変数byteNumに10を代入
		
		shortNum = 100;//変数shortNumに100を代入
		
		intNum = 1000;//変数intNumに1000を代入
		
		longNum = 10000;//変数longNumに10000を代入
		
		floatNum = 9.5f;//数floatNumに9.5fを代入
		
		doubleNum = 10.5;//変数doubleNumに10.5を代入
		
		letter = 'a';//変数letterに"a"を代入
		
		letters = "ハロー";//変数lettersに"ハロー"を代入
		
		isBoolean = true;//変数isBooleanにtrueを代入

		
/*
 *Q3. 値を代入した変数を用いて出力をしてください
 * */
		//11110を出力
		long p = byteNum + shortNum + intNum + longNum;// xでbyteNum～longNumを全て合計して再代入
		System.out.println(p);
		
		//20を出力
		int y = 2;
		
		y = y * byteNum;//yの現在の値(2)に10をかけて、xに再代入
		System.out.println(y);
		
		//a ハロー trueを出力
		String letterBoolean = letter + letters + isBoolean;
		System.out.println(letterBoolean);
		
		//数字を全て足して出力
		double z = byteNum + shortNum + intNum + longNum + floatNum + doubleNum;// xでbyteNum～longNumを全て合計して再代入
		long i = (long)z;
		System.out.println(i);
		//小数点以外の数字を全てかけて出力
		long q = byteNum * shortNum * intNum * longNum;
		System.out.println(q);
		
		//10.5割る100をして出力
		double w = doubleNum / shortNum;
		System.out.println(w);
		
		//10引く100をすして出力
		int m = byteNum - shortNum;
		System.out.println(m);
		
/*
 * Q4. name という String型の変数 を宣言しその変数に "山田太郎" という値を代入してください。
 * */
		String name = "山田太郎";//nameに山田太郎を宣言
		System.out.println("こんにちは、" + name + "さん！");//コンソールに出力
		

/*
 * Q5.age という int型の変数 を宣言しその変数に 25 を代入してください。 
 * */		
		int age = 25;//ageに25を代入
		System.out.println("年齢;" + age + "歳");//コンソールに出力
		
		
/*
 * Q6.num1 という int型の変数 を宣言し、10 を代入、num2 という int型の変数 を宣言し、5 を代入
 * */				
		int num1 = 10;//num1にint型の変数 を宣言し、10 を代入
		int num2 = 5;//num2にint型の変数 を宣言し、5 を代入
		int sum = num1 + num2;//num1 と num2 を足した結果を sum という変数に代入
		System.out.println(sum);//コンソールに出力
		
		
/*
 * Q7.score という int型の変数 を宣言し、80 を代入、score に 20 を加えて、更新する
 * */
		int score = 80;//scoreにint型の変数 を宣言し、80 を代入
		score += 20;//変数の値を更新
		System.out.println(score);//コンソールを表示
		

/*
 * Q8. price という double型の変数 を宣言し、99.99 を代入
 * */
		double price = 99.99;//double型の変数 を宣言し、99.99 を代入
		int d = (int)price;//doubleからintへ型変換して小数点を切り捨て
		System.out.println("整数価格;" + d);//コンソールを表示
		
		
/*
 * 09.String 型の変数 numStr に "123" を代入
 * */
		String numStr = "123";//123を文字データで宣言
		int str = Integer.parseInt(numStr);//数値 → 文字列へ変換
		System.out.println(str + 10);//コンソールを表示
		
		
/*
 * 10.int 型の変数 num に 50 を代入
 * */
		int num = 50;//numを数値で宣言
		String l = String.valueOf(num);//文字列 → 数値へ変換
		System.out.println("得点:" + l + "点");//コンソールを表示
		
		
/*
 * 11.次の条件を満たすプログラムを条件演算子を使用して作成してください。
 * */
		int a = 10;//int型の変数aを宣言し、10を代入
		int b = 20;//int型の変数bを宣言し、20を代入
		boolean result = b < a;//aよりbが小さい場合はtrue
		System.out.println(result);//false
/*
 * 12.条件演算子（三項演算子）を使用してください。
 * */		
		int x = 15;//int型の変数xを宣言し、15を代入
		String xResult = ( x >= 10) ? "OK" : "NG";//xが10以上の場合はOK
		System.out.println(xResult);//OK
		
		
/*
 * 13.String text = "私はJavaが好きです。Javaは楽しい！";という文章の中にある 「Java」 を 「Python」 に置き換えて表示させてください
 * */
		String text = "私はJavaが好きです。Javaは楽しい！";//String型で変数textを宣言
		String textReset = text.replace("Java" , "Python");//replaceで文字を置き換え
		System.out.println(textReset);//コンソールを表示
		
	}
}
