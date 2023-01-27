import number.auto;
import number.manual;
import number.search;
import win.*;

import java.util.ArrayList;
import java.util.Scanner;

import static money.Money.moneyprint;

public class Start { // 회차 메인 화면
    Scanner sc = new Scanner(System.in);

    int[] winnumber; // 로또 당첨 번호.
    int[][] number; // 로또 출력 번호.
    ArrayList<Integer> winnumbersave = new ArrayList<>(); // 로또 당첨된 번호 1차원 배열.
    manual manual = new manual(); // (수동) 객체 생성.
    auto auto = new auto(); // (자동) 객체 생성.
    search search = new search(); // (검색) 객체 생성.
    win win = new win(); // (당첨) 객체 생성.


    public void lottostart(int lottoturnnumber) { // 회차 메인 시작
        boolean autooption = false; // [수동, 자동] 판단 변수.
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
            System.out.println("\t ⑥ 다음 회차 진행");

            switch (sc.nextInt()){
                case 1:
                    number = manual.Manualstart(); // 수동 시작 메소드 호출.
                    autooption = false;
                    continue;
                case 2:
                    number = auto.Autostart(); // 자동 시작 메소드 호출.
                    autooption = true;
                    continue;
                case 3:
                    if(autooption)
                        search.numbersearch(number, 1); // (자동) 리스트 출력 메소드 호출.
                    else search.numbersearch(number, 0); // (수동) 리스트 출력 메소드 호출.
                    continue;
                case 4:
                    winnumber = win.winnumberprint(lottoturnnumber); // 당첨 번호 출력 및 생성 메소드 호출.
                    winnumbersave = win.winnumbercheck(number, winnumber); // 당첨 번호 비교 및 당첨 확인 메소드 호출.
                    continue;
                case 5:
                    winnumberprint(lottoturnnumber); // 당첨 번호 및 내역 조회 메소드 호출.
                    continue;
                case 6:
                    break;
                default:
                    System.out.println("번호를 잘못 입력하였습니다. 다시 입력바랍니다.");
            }
            break;
        }
    }


    public void winnumberprint(int lottoturnnumber) { // 당첨 번호 및 내역 조회 메소드.
        System.out.println("----------- 제 [" + lottoturnnumber +"]회 로또 당첨 조회 결과 -----------");
        System.out.print(lottoturnnumber + "회 당첨번호 : "); // *회차 당첨 번호 출력.
        for (int j : winnumber) System.out.print("[" + j + "] ");
        System.out.println();
        for (int i = 0; i < winnumbersave.size(); i++) { // 당첨 내역 출력.
            if ((i+1) % 7 == 0){ // 1차원 Array 동적 배열이기에 7개 단위로 줄바꿈 조건문.
                System.out.println(" * 보너스 번호 : " + winnumbersave.get(i));
                continue;
            }
            System.out.print("[" + winnumbersave.get(i) + "] ");
        }
    }
}
