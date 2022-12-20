public class Continue01 {
  public static void main(String[] args) {
	  for (int count = 0; count < 5; count++) {
		  if (count == 2) {
			  // countが2の場合、この後に処理をスキップ
			  continue;
		  }
		  System.out.println("Continue01 = " + count);
	  }
  }
}

// 実行結果
/*
Continue01 = 0
Continue01 = 1
Continue01 = 3
Continue01 = 4
*/ 
// 2がスキップされている！