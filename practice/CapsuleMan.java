// 「Chapter12.java」を実行した結果が同じになるように、「NoCapsuleMan.java」を「CapsuleMan.java」に変更して、カプセル化したプログラムに変更する

package practice;

// クラス名もCapsuleManに変更になる
public class CapsuleMan {
    //privateに変更して隠蔽化
    private String name;
    private int age;

    public CapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ageのgetter
    public int getAge() {
        return age;
    }

    // ageのsetter
    public void setAge(int age) {
        this.age = age;
    }

    // nameのgetter
    public String getName() {
        return name;
    }
    
    // nameのsetterは不要なので定義しない
}

// 「Chapter12.java」の実行結果
/*
名前は小林です。
年齢は32です。
誕生日を迎えたので、年齢が33になりました。
*/