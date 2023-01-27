class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    
    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
    double bmi = bmi(height, weight);
    
    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
    System.out.println("BMIは" + bmi + "です");
    
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }
  
  // bmiメソッドを定義してください
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }
  
}

// 実行結果
/*
私の名前はKate Jonesです
年齢は27歳です
身長は1.6mです
体重は50.0kgです
BMIは19.53125です
私の名前はJohn Christopher Smithです
年齢は65歳です
身長は1.75mです
体重は80.0kgです
BMIは26.122448979591837です
*/ 