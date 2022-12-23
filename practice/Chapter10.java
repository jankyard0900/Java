// 「Chapter10.java」を実行した結果が以下になるように、プログラムを作成
// 実行結果
/*
インデックス 2 の要素は 5 です
IllegalArgumentExceptionが発生しました
java.lang.IllegalArgumentException: 3 はサイズの範囲外です
    at practice.Chapter10.validIndex(Chapter10.java:xxxx)
    at practice.Chapter10.main(Chapter10.java:xxxx)
SQLExceptionが発生しました
java.sql.SQLException: SQLエラーです
    at practice.Chapter10.throwSQLException(Chapter10.java:xxxx)
    at practice.Chapter10.main(Chapter10.java:xxxx)
throwSQLExceptionの呼び出し終了
mainメソッド終了

*/

// ※「xxxx」は、プログラムの行番号が出力される

package practice;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {

		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);

			// Exceptionが発生しない場合は出力される
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExpectionが発生しました");
			// スタックトレースを出力
			e.printStackTrace();
		}

		// try-catch文を記述
		// ・throwSQLExceptionメソッドを呼び出し
		// ・SQL Exceptionをキャッチしてメッセージとスタットレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
	    try {
	    	Chapter10.throwSQLException();
	    } catch (SQLException e) {
	    	System.out.println("SQLExceptionが発生しました");
	    	// printlnStaclTraceでスタックトレースを出力
	    	e.printStackTrace();
	    } finally {
	    	// 例外発生しても出力するため、finallyブロックに記述
	    	System.out.println("throwSQLExceptionの呼び出し終了");
	    }

		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// 。サイズの範囲外なら、IllegalArgumentExceptionをスロー
	public static void validIndex(int[] array, int index) {
		// 配列のサイズは、lebgthで取得
		if (array.length <= index) {
			// throw文で、例外をスロー
			throw new IllegalArgumentException(index + " はサイズの範囲外です");
		}
		System.out.println("インデックス" + index + " の要素は " + array[index] + "です");
	}

	// スローされる例外が検査例外なので、throws分が必要
	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
}
