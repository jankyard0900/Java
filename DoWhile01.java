public class DoWhile01 {
  public static void main(String[] args) {
	  int number = 1;
	  do {
		  number *= 2;
		  System.out.println("DoWhile01 = " + number);
	  } while (number < 50);
  }
}

// 実行結果
/*
DoWhile01 = 2
DoWhile01 = 4
DoWhile01 = 8
DoWhile01 = 16
DoWhile01 = 32
DoWhile01 = 64
*/ 