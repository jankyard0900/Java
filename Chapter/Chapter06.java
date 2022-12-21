/*
　・「int」の変数「val」を「2 足す 5」を演算した結果で初期化して、値を出力
　・インクリメントした変数「val」の値を出力
　・「5」を掛けた変数「val」の値を出力
　・「boolean」の変数「bool」に「valは50と等しい」を演算した結果を代入して、値を出力
　・変数「bool」に「valは50より小さい AND valを10で割った余りが0」を演算した結果を代入して、値を出力
*/ 

public class Chapter06 {
	public static void main(String[] args) {
		int val = 2 + 5;
		System.out.println(val);

		val++;
		System.out.println(val);

		val *= 5;
		System.out.println(val);

		boolean bool = (val == 50);
		System.out.println(bool);

		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}

}

// 実行結果
/*
7
8
40
false
true
*/ 