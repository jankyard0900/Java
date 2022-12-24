// 実行用ファイル

package practice;

public class Chapter12 {
    public static void main(String[] args) {
        CapsuleMan man = new CapsuleMan("小林", 32);
        
        // getter,setterメソッドを呼び出すように変更します。
        System.out.println("名前は" + man.getName() + "です。");
        System.out.println("年齢は" + man.getAge() + "です。");
        man.setAge(33);
        System.out.println("誕生日を迎えたので、年齢が" + man.getAge() + "になりました。");
    }
}


// 実行結果
/*
名前は小林です。
年齢は32です。
誕生日を迎えたので、年齢が33になりました。
*/ 