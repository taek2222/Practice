package money;

import java.text.DecimalFormat;

public class Money {
    public static int money = 20000000;// 기본 소지금 $ 20,000,000원

    public static void moneyprint() // 현재 금액 출력 객체
    {
        DecimalFormat df = new DecimalFormat("###,###"); // 숫자 천 단위 , 적용 클래스
        String Moneyprint;
        Moneyprint = df.format(getmoney()); // int > string 숫자 천 단위로 변환
        System.out.println("\t\t\t  현재 소지금 : " + Moneyprint);
    }
    public static int getmoney() { return money; }

}
