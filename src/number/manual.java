package number;

import money.Money;
import java.util.Scanner;
import text.text;

public class manual {
    static Scanner sc = new Scanner(System.in);
    static int sheets; // 로또 장수

    public static void manualstart() {
        System.out.println("--------------- LOTTO 프로그램 ---------------");
        System.out.println("\t\t\t LOTTO 번호 뽑기 ( 수동 )");
        System.out.println("---------------------------------------------");
        while(true) {
            System.out.println("구입할 매수를 입력해주세요. [ 안내 : 1장당 5,000원 ]");
            sheets = sc.nextInt();
            System.out.println("구입할 장수가 " + sheets + "개가 맞습니까? ex) ① 예 / ② 아니오");
            if(sc.nextInt() == 1)
                if(Money.money < 5000 * sheets) {
                    System.out.println("현재 잔고의 금액이 부족합니다. 수량을 다시 입력해주세요. [ 안내 : 1장당 5,000원 ]");
                    continue;
                }
            break;
        }

        Money.money -= 5000*sheets;
        int[][] number = new int[sheets][7]; // 로또 번호 입력 2차원 배열 생성.

        for(int i = 0; i < sheets; i++) {
            System.out.println((i+1) + "번째의 로또 번호를 입력하겠습니다.");
            for(int j = 0; j < 6; j++) {
                System.out.println("[ " +(j+1) + "번째 로또 번호 입력. ]");
                number[i][j] = sc.nextInt();
            }
            System.out.println("[ 마지막 보너스 번호 입력. ]");
            number[i][6] = sc.nextInt();
            System.out.print("\n[" + (i+1) + "] 장 로또 번호 : ");
            text.lottonumberprint(number, i);

        }
        System.out.println(" 총 " + sheets + "장의 로또가 성공적으로 구매되었습니다.");
    }
}
