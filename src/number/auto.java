package number;

import money.Money;
import win.win;
import java.util.Random;
import java.util.Scanner;

public class auto {
    static Scanner Sc = new Scanner(System.in);
    static Random Rd = new Random();
    static int Sheets; // 로또 장수
    static int[][] number;

    public static void Autostart() {
        System.out.println("--------------- LOTTO 프로그램 ---------------");
        System.out.println("\t\t\t LOTTO 번호 뽑기 ( 자동 )");
        System.out.println("---------------------------------------------");
        while(true) {
            System.out.println("구입할 매수를 입력해주세요. [ 안내 : 1장당 5,000원 ]");
            Sheets = Sc.nextInt();
            System.out.println("구입할 장수가 " + Sheets + "장이 맞습니까? ex) ① 예 / ② 아니오");
            if(Sc.nextInt() == 1)
                if(Money.money < 1 * Sheets) {
                    System.out.println("현재 잔고의 금액이 부족합니다. 수량을 다시 입력해주세요. [ 안내 : 1장당 5,000원 ]");
                    continue;
                }
            break;
        }

        Money.money -= 1*Sheets;
        number = new int[Sheets][7]; // 로또 번호 입력 2차원 배열 생성.

        for(int i = 0; i < Sheets; i++) {
            System.out.println((i+1) + "번째장의 로또 번호를 자동 출력하겠습니다.");
            for(int j = 0; j < 7; j++) {
                number[i][j] = Rd.nextInt(45)+1;
            }
            System.out.print("[" + (i+1) + "] 장 로또 번호 : ");
            search.lottonumberprint(number, i);

        }
        System.out.println(" 총 " + Sheets + "장의 로또가 성공적으로 구매되었습니다. \n");
    }

    public static void searchconnection(){ search.numberserch(number, 1); }
    public static void wincheck(int lottoturn){
        win.winnumberprint(lottoturn);
        win.winnumbercheck(number, Sheets);
    }
}
