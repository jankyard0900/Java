package exception;

public class Expection01 {
	public static void main(String[] args) {
		System.out.println("100 ÷ 0 は？");
		// 0で割り算するので、例外が発生
		int result = 100 / 0;
		// 例外が発生した以降の処理は実行されない
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
	}
}

// 実行結果
/*
100 ÷ 0 は？
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Exception01.main(Exception01.java:5)
*/
// 例外が発生する