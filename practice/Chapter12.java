// 実行用ファイル

package practice;

public class Chapter12 {
    public static void main(String[] args) {
        NoCapsuleMan man = new NoCapsuleMan("小林", 32);
        System.out.println("名前は" + man.name +  "です。");
        System.out.println("年齢は" + man.age + "です。");
        man.age = 33;
        System.out.println("誕生日を迎えたので、年齢が" + man.age + "になりました。");
    }
}

// 実行結果
/*
名前は小林です。
年齢は32です。
誕生日を迎えたので、年齢が33になりました。
*/ 