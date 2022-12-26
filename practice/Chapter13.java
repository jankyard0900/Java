// 実行用ファイル

// 「Chapter13.java」を実行した結果が以下になるように、「FlyingPhone.java」を作成

// 実行結果
/*
写真をとります。
000-1111-2222 から 99-8888-7777 に電話をかけます。
電源を切ります。
5 分間、飛びます。 
000-1111-2222 に電話します。通話できるのは飛んでいる間だけです。
飛んでいる場合は落下します。
*/ 

package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
    public static void main(String[] args) {
        // MobilePhoneインスタンスを生成
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
        mobilePhone.takePicture();
        Chapter13.staticCall(mobilePhone, "99-8888-7777");
        mobilePhone.powerOff();

        // flyingPhoneインスタンスを生成
        FlyingPhone flyingPhone = new FlyingPhone(5);
        flyingPhone.fly();
        Chapter13.staticCall(flyingPhone, "000-1111-2222");
        flyingPhone.powerOff();
    }

    public static void staticCall(Phone phone, String number) {
        phone.call(number);
    }
}