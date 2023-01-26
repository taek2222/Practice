import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Start[] lottoturn = new Start[100]; // 로또 회차
        int lottoturnnumber = 0;
        while (true) {
            System.out.println("\n--------------- LOTTO 메인 프로그램 ---------------");
            System.out.println("① 제 [" + (lottoturnnumber+1) + "]회 로또 복권 구매 / 당첨 시작");
            System.out.println("② 모든 회차 당첨 번호 확인");
            System.out.println("③ 프로그램 종료 ");

            switch (sc.nextInt()) {
                case 1:
                    lottoturn[lottoturnnumber] = new Start();
                    lottoturn[lottoturnnumber].lottostart(lottoturnnumber+1);
                    lottoturnnumber++;
                    continue;
                case 2:
                    for(int i = 0; i < lottoturnnumber; i++)
                        lottoturn[i].winnumberprint(i+1);
                    continue;
                case 3:
                    System.out.println("프로그램을 종료하겠습니다.");
                    break;
                default:
                    System.out.println("번호를 잘못 선택하셨습니다. 다시 입려해주세요.");

            }
        }
    }

}