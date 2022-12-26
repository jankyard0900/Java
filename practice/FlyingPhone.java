// 修正ファイル

// 「Chapter13.java」を実行した結果が以下になるように、「FlyingPhone.java」を作成

// 実行結果
/*
写真をとります。
000-1111-2222 から 99-8888-7777 に電話をかけます。
電源を切ります。
5 分間、飛びます。 
000-1111-2222 に電話します。通話できるのは飛んでいる間だけです。
飛んでいる場合は落下します。
*/ 


package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	// プログラムを作成
  private int minutes;
  
  // コンストラクタ。引数でメンバ変数を初期化。
  public FlyingPhone(int minutes) {
      this.minutes = minutes;
  }

  // Phoneインターフェースのメソッドをオーバーライド
  public void call(String number) {
      System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
  }
  
  // Flyingインターフェースのメソッドをオーバーライド
  public void fly() {
      System.out.println(minutes + " 分間、飛びます。 ");
  }

  // オーバーライドしないとコンパイルエラー
  public void powerOff() {
      // Flyingのdefaultメソッドを呼び出す
      Flying.super.powerOff();
  }
}
