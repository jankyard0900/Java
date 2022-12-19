/* 
・プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
　・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
　・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
*/

public class Chapter05 {
    public static void main(String[] args) {
        long l = 10000000000L;
        System.out.println(l);
        double d = 3.14;
        System.out.println(d);
        boolean b = true;
        System.out.println(b);

        Integer i = 100;
        System.out.println(i);
        Float f = 1.4142f;
        System.out.println(f);
        Character c = 'う';
        System.out.println(c);

        int[] array = { 0, 10, 20, 30, 40 };
        System.out.println(array[3]);
    }
}

// 実行結果
/*
10000000000
3.14
true
100
1.4142
う
30
*/ 