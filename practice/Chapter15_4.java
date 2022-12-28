// 以下の実行結果になるように、「Chapter15_4.java」と「ThreadSample.java」を作成する。
// 実行結果 ※出力される順序は実行するごとに変わる
/*
ThreadSample2のスレッド : 1回目
Chapter15_4のスレッド : 1回目
ThreadSample1のスレッド : 1回目
ThreadSample2のスレッド : 2回目
ThreadSample1のスレッド : 2回目
Chapter15_4のスレッド : 2回目
ThreadSample2のスレッド : 3回目
Chapter15_4のスレッド : 3回目
ThreadSample1のスレッド : 3回目
*/ 

package practice;

public class Chapter15_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			// ThreadSampleクラスのインスタンスを生成
			ThreadSample mt = new ThreadSample(i);
			// Threadクラスのインスタンスを作成
			Thread thread = new Thread(mt);
			// Threadクラスのstartメソッドを呼び出す
			thread.start();
		}

		for (int i = 1; i <= 3; i++) {
			try {
				// Thread.sleepは、指定したミリ秒間スリープするメソッド
				Thread.sleep(1000);
				// 1000ミリ秒（1秒）間スリープしてメッセージを表示
				System.out.println("Chapter15_4のスレッド：" + i + "回目");
			// Thread.sleepの例外処理
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
