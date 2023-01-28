class Person {
  private static int count = 0;
  private String firstName;
  // インスタンスフィールドmiddleNameを定義してください
  private String middleName;

  private String lastName;
  private int age;
  private double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  // middleNameを受け取るコンストラクタを定義してください
  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    // this()を用いて、コンストラクタを呼び出してください
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  public String fullName() {
    // 以下を、middleNameがない場合とある場合で条件分岐を行ってください
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}