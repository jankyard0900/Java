public class While01 {
    public static void main(String[] args) {
        int number = 1;
        // while文：ループ開始
        // numberが50未満の場合、ブロックの処理を行なう
        while (number < 50) {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("While01 = " + number);
        }
    }
}

// 実行結果
/*
While01 =2
While01 =4
While01 =8
While01 =16
While01 =32
While01 =64
*/ 