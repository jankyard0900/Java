// 実行用ファイル
// 以下の実行結果になるように、コンパイルエラーのプログラム「Chapter15_3.java」にキャストを追加する。

// 実行結果
/*
123.0
12
0.5
-128
*/ 

package practice;

public class Chapter15_3 {
	public static void main(String[] args) {
		int i1 = 123;
		double d1 = i1;
		System.out.println(d1);

		double d2 = 12.345;
		int i2 = d2;
		System.out.println(i2);

		int i3 = 1;
		int i4 = 2;
		double d3 = i3 / i4;
		System.out.println(d3);

		int i5 = 128;
		byte b1 = i5;
		System.out.println(b1);
	}

}