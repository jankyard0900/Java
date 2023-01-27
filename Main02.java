class Main {
  public static void main(String[] args) {
    // fullNameメソッドの結果を変数nameに代入してください
    String name = fullName("Kate", "Jones");
    
    // printDataの引数を書き換えてください
    printData("Kate Jones", 27);
    
    // こちらは書き換えないでください
    printData("John Christopher", 65);
  }
  
  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "歳です");
    
  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String lastName) {
    // 呼び出し元に値を返す戻り値設定
    return firstName + " " + lastName;
  }
  }
}

// 実行結果
/*
私の名前はKata Jonesです
年齢は27歳です
私の名前はJohn Christopherです
年齢は65歳です
*/ 