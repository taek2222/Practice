package money;

import java.text.DecimalFormat;

public class Money {
    DecimalFormat df = new DecimalFormat("###,###"); // 숫자 천 단위 , 적용 클래스
    public int money;// 기본 소지금 $ 5,000원
    String Moneyprint;
    public Money() { money = 5000; }

    public void moneyprint() // 현재 금액 출력 객체
    {
        Moneyprint = df.format(getmoney()); // int > string 숫자 천 단위로 변환
        System.out.println("\t\t\t  현재 소지금 : " + Moneyprint);
    }

    public void setmoney(int money) { this.money = money; } // 머니 값 변경 객체
    public int getmoney() { return money; }

}
