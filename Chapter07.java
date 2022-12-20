/*
switch文を使って記述
・信号の色を表すString型の変数を定義し、 redyellowblueのいずれかで初期化する
・色がredの場合は "赤信号です" を出力する
・色がyellowの場合は "黄信号です" を出力する
・色がblueの場合は "青信号です" を出力する
・上記以外の色の場合は "信号の色ではありません" を出力する
*/

public class Chapter07 {
	public static void main(String[] args) {
		String color = "red";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}


// 実行結果
/*
赤信号です
*/