class Main {
  public static void main(String[] args) {
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones", 27);
    printData("John Christopher", 65);
  }
  
  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "歳です");
  }
}

// 実行結果
/*
私の名前はKata Jonesです
年齢は27歳です
私の名前はJohn Christopherです
年齢は65歳です
*/ 