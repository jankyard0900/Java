/*
if文を使って記述
・距離を表すint型の変数を定義し、任意の値で初期化する
・ 距離が5km以下の場合は "とても近いです" を出力する
・距離が5kmより長く10km以下の場合は "近いです" を出力する
・距離が10kmより長く15km以下の場合は "遠いです" を出力する
・距離が15kmより長い場合は "とても遠いです" を出力する
*/ 

public class Chapter07 {
  public static void main(String[] args) {
	  int distance = 12;
	  if (distance <= 5) {
		  System.out.println("とても近いです");
	  } else if (distance <= 10) {
		  System.out.println("近いです");
	  } else if (distance <= 15) {
		  System.out.println("遠いです");
	  } else {
		  System.out.println("とても遠いです");
	  }
  }
}

// 実行結果
/*
遠いです
*/ 