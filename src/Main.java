import java.util.Scanner;

import static money.Money.*;

import number.auto;
import number.manual;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lottoturn = 1;
        int connection = 0;

        while (true) {
            System.out.println("--------------- LOTTO 프로그램 ---------------");
            System.out.println("\t\t\t  [ 제 " + lottoturn + "회 로또 추첨 ]");
            moneyprint(); // 현재 금액 출력
            System.out.println("---------------------------------------------\n");

            System.out.println("※ LOTTO 프로그램 기능을 선택해주세요 ※");
            System.out.println("\t ① LOTTO 번호 뽑기 ( 수동 )");
            System.out.println("\t ② LOTTO 번호 뽑기 ( 자동 )");
            System.out.println("\t ③ LOTTO 구매한 번호 조회");
            System.out.println("\t ④ LOTTO 당첨 번호 확인");
            System.out.println("\t ⑤ LOTTO 당첨 이력 조회");
            System.out.println("\t ⑥ LOTTO 프로그램 안내");

            switch (sc.nextInt()){
                case 1:
                    manual.Manualstart();
                    connection = 0;
                    continue;
                case 2:
                    auto.Autostart();
                    connection = 1;
                    continue;
                case 3:
                    if(connection == 0)
                        manual.searchconnection();
                    else auto.searchconnection();
                    continue;
                case 4:
                    auto.wincheck(lottoturn);
                    continue;
                default:
                    System.out.println("번호를 잘못 입력하였습니다. 다시 입력바랍니다.");
            }
            break;
        }
    }

}