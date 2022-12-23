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
			Chapter10.validTndex(array, 2);
			Chapter10.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExpectionが発生しました");
			e.printStackTrace();
		}

		// try-catch文を記述
		// ・throwSQLExceptionメソッドを呼び出し
		// ・SQL Exceptionをキャッチしてメッセージとスタットレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力

		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// 。サイズの範囲外なら、IllegalArgumentExceptionをスロー

	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}