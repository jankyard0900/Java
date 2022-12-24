// 実行用ファイル

package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
    public static void main(String[] args) {
        Human sugimoto = new Human("杉本", 16);
        System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

        Student sato = new Student("佐藤", 17, 70);
        System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
        System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

        Human human = new Employee("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

        Employee tanaka = (Employee) human;
        System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

        Extend01.printName(sugimoto);
        Extend01.printName(sato);
        Extend01.printName(tanaka);
    }

    public static void printName(Human human) {
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
    }
}

// 実行用ファイル
/*
Humanクラスのメソッド：名前は、杉本
Humanクラスのメソッド：名前は、佐藤
Studentクラスのメソッド：プロフィールを紹介します。年齢は17です。学生で、テストの点数は70点です。
Humanクラスのメソッド：名前は、田中
Employeeクラスのメソッド：プロフィールを紹介します。年齢は28です。サラリーマンで、部署はシステム部です。
Humanクラスのメソッド：名前は、杉本
Humanクラスのメソッド：名前は、佐藤
Humanクラスのメソッド：名前は、田中
*/ 