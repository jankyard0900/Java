// java.util.Scannerを読み込んでください
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("名前：");
    // 文字列の入力を受け取ってください
    String firstName = scanner.next();
    
    System.out.print("名字：");
    // 文字列の入力を受け取ってください
    String lastName = scanner.next();
    
    System.out.print("年齢：");
    // 整数の入力を受け取ってください
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    // 小数の入力を受け取ってください
    double height = scanner.nextDouble();
    
    System.out.print("体重(kg)：");
    // 小数の入力を受け取ってください
    double weight = scanner.nextDouble();
    
    Person01.printData(Person01.fullName(firstName, lastName), age, height, weight);
  }
}

// 実行結果（入力したオブジェクトが入ります）
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