package money;

import java.text.DecimalFormat;

public class Money {
    static DecimalFormat df = new DecimalFormat("###,###"); // 숫자 천 단위 , 적용 클래스
    public static int money = 20000;// 기본 소지금 $ 5,000원
    static String Moneyprint;

    public static void moneyprint() // 현재 금액 출력 객체
    {
        Moneyprint = df.format(getmoney()); // int > string 숫자 천 단위로 변환
        System.out.println("\t\t\t  현재 소지금 : " + Moneyprint);
    }
    public static int getmoney() { return money; }

}
