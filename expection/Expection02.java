package exception;

public class Expection02 {
  public static void main(String[] args) {
	  try {
		  System.out.println("100 ÷ 0 は？");
		  int result = 100 / 0;
		  System.out.println("計算結果" + result);
	  } catch (ArithmeticException e) {
		  System.out.println("例外が発生");
	  } finally {
		  System.out.println("プログラム終了");
	  }
  }
}


// 実行結果
/*
100 ÷ 0 は？
例外が発生
プログラム終了
*/ 