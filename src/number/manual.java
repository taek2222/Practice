package number;
import money.Money;
import java.util.Scanner;

public class manual {

    public int[][] Manualstart() { // 로또 수동 뽑기 메소드.
        Scanner Sc = new Scanner(System.in);
        search search = new search();
        int[][] number;
        int Sheets; // 로또 장수

        System.out.println("--------------- LOTTO 프로그램 ---------------"); // (수동) 로또 구매 시작.
        System.out.println("\t\t\t LOTTO 번호 뽑기 ( 수동 )");
        System.out.println("---------------------------------------------");
        while (true) {
            System.out.println("구입할 매수를 입력해주세요. [ 안내 : 1장당 3,000원 ]");
            Sheets = Sc.nextInt();
            System.out.println("구입할 장수가 " + Sheets + "장이 맞습니까? ex) ① 예 / ② 아니오");
            if (Sc.nextInt() == 1) {
                if (Money.money < 3000 * Sheets) { // 금액 부족한지 확인 하는 구분.
                    System.out.println("현재 잔고의 금액이 부족합니다. 수량을 다시 입력해주세요. [ 안내 : 1장당 3,000원 ]");
                    continue;
                }
            }
            else continue; // 다시 재차 묻기
            break;
        }

        Money.money -= 3000 * Sheets; // 구매한 장수만큼 금액 차감.
        number = new int[Sheets][7]; // 로또 번호 입력 2차원 배열 생성.

        for (int i = 0; i < Sheets; i++) {
            System.out.println((i + 1) + "번째의 로또 번호를 입력하겠습니다.");
            for (int j = 0; j < 6; j++) {
                System.out.println("[ " + (j + 1) + "번째 로또 번호 입력. ]");
                number[i][j] = Sc.nextInt();
            }
            System.out.println("[ 마지막 보너스 번호 입력. ]");
            number[i][6] = Sc.nextInt();
            System.out.print("\n[" + (i + 1) + "] 장 로또 번호 : ");
            search.lottonumberprint(number, i);

        }
        System.out.println(" 총 " + Sheets + "장의 로또가 성공적으로 구매되었습니다.");
        return number;
    }
}
