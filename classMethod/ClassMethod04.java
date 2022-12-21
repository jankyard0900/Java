package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		// Human04インスタンスを生成すると、こんすとらくたないの処理が実行させる
		Human04 yamada = new Human04("山田");

		// 静的メンバーは、インスタンス生成せずに直接使用できる
		Human04.staticMethodPrint();

		// static名クラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);

		// インスタンスメンバーは直接使用できない
		// Human04.instanceMethodPrint();
		// System.out.println(Human04.name);

		// インスタンスメンバーはインスタンス生成してから使用する
		yamada.instanceMethodPrint();
	}
}

// 実行結果
/*
人の数は1
こんにちは
名前は山田
*/ 