import number.auto;
import number.manual;
import number.search;
import win.*;

import java.util.ArrayList;
import java.util.Scanner;

import static money.Money.moneyprint;

public class Start {

    int[] winnumber; // 로또 당첨 번호
    int[][] number; // 로또 출력 번호
    ArrayList<Integer> winnumbersave = new ArrayList<>();
    manual manual = new manual();
    auto auto = new auto();
    Scanner sc = new Scanner(System.in);
    search search = new search();
    win win = new win();


    public void lottostart(int lottoturnnumber) {
        int connection = 0;
        while (true) {
            System.out.println("\n--------------- LOTTO 프로그램 ---------------");
            System.out.println("\t\t\t  [ 제 " + lottoturnnumber + "회 로또 추첨 ]");
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
                    number = manual.Manualstart();
                    connection = 0;
                    continue;
                case 2:
                    number = auto.Autostart();
                    connection = 1;
                    continue;
                case 3:
                    if(connection == 0)
                        search.numberserch(number, 0);
                    else search.numberserch(number, 1);
                    continue;
                case 4:
                    winnumber = win.winnumberprint(lottoturnnumber);
                    winnumbersave = win.winnumbercheck(number, winnumber);
                    continue;
                case 5:
                    winnumberprint(winnumbersave, lottoturnnumber);
                    continue;
                case 6:
                    break;
                default:
                    System.out.println("번호를 잘못 입력하였습니다. 다시 입력바랍니다.");
            }
            break;
        }
    }
    public void winnumberprint(ArrayList<Integer> winnumbersave, int lottoturnnumber) {
        System.out.println("제 [" + lottoturnnumber +"]회 로또 당첨 조회 결과");
        for (int i = 0; i < winnumbersave.size(); i++) {
            if (i % 7 == 0)
                System.out.println();
            System.out.print("[" + winnumbersave.get(i) + "] ");
        }
    }
}
