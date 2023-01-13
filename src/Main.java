import money.Money;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Money doll = new Money();
        DecimalFormat df = new DecimalFormat("###,###"); // 숫자 천 단위 , 적용 클래스
        Scanner sc = new Scanner(System.in);

        int lottonumber = 1;
        int age;
        String Moneyprint;

        while (true) {
            System.out.println("--------------- LOTTO 프로그램 ---------------");
            System.out.println("\t\t\t  [ 제 " + lottonumber + "회 로또 추첨 ]");
            Moneyprint = df.format(doll.money); // int > string 숫자 천 단위로 변환
            System.out.println("\t\t\t  현재 소지금 : " + Moneyprint);
            System.out.println("---------------------------------------------");

            System.out.println("[ LOTTO 프로그램 기능을 선택해주세요. ]");
            System.out.println("① LOTTO 번호 뽑기 ( 수동 )");
            System.out.println("② LOTTO 번호 뽑기 ( 자동 )");
            System.out.println("③ LOTTO 당첨 번호 확인");
            System.out.println("④ LOTTO 프로그램 안내");
            age = sc.nextInt();

            switch (age){
                case 1:

            }
            break;
        }
    }
}