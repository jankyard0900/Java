// 「Chapter12.java」を実行した結果が同じになるように、「NoCapsuleMan.java」を「CapsuleMan.java」に変更して、カプセル化したプログラムに変更する

package practice;

public class NoCapsuleMan {
    public String name;
    public int age;

    public NoCapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 「Chapter12.java」の実行結果
/*
名前は小林です。
年齢は32です。
誕生日を迎えたので、年齢が33になりました。
*/