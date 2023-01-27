class Main {
  public static void main(String[] args) {
    Person01.printData(Person01.fullName("Kate", "Jones"), 27, 1.6, 50.0);
    Person01.printData(Person01.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }
}

// 実行結果
/*
私の名前はKate Jonesです
年齢は27歳です
身長は1.6mです
体重は50.0kgです
BMIは20です
健康です
私の名前はJohn Christopher Smithです
年齢は65歳です
身長は1.75mです
体重は80.0kgです
BMIは26です
健康ではありません
*/