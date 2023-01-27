import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // 메인.
        Scanner sc = new Scanner(System.in);
        Start[] lottoturn = new Start[100]; // 로또 회차를 배열로 선언.
        int lottoturnnumber = 0; // 로또 회차
        while (true) {
            System.out.println("\n--------------- LOTTO 메인 프로그램 ---------------"); // 로또 메인 안내.
            System.out.println("① 제 [" + (lottoturnnumber+1) + "]회 로또 복권 구매 / 당첨 시작");
            System.out.println("② 모든 회차 당첨 번호 확인");
            System.out.println("③ 프로그램 종료 ");

            switch (sc.nextInt()) {
                case 1:
                    lottoturn[lottoturnnumber] = new Start(); // 새로운 회차 배열 생성.
                    lottoturn[lottoturnnumber].lottostart(lottoturnnumber+1); // 회차 메뉴에 진입.
                    lottoturnnumber++; // 회차 종료시 다음 회차를 준비하기 위한 회차 값 증가.
                    continue;
                case 2:
                    for(int i = 0; i < lottoturnnumber; i++)
                        lottoturn[i].winnumberprint(i+1); // 반복문을 통해 회차 배열 0 ~ 시작해 당첨 번호 출력.
                    continue;
                case 3:
                    System.out.println("프로그램을 종료하겠습니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 선택하셨습니다. 다시 입려해주세요.");

            }
        }
    }

}