package win;

import money.Money;

import java.util.ArrayList;
import java.util.Random;

public class win {
    static int listnumber = 0; // 한 회차에 몇번 당첨 횟수
    int[] check; // 당첨 번호
    static int[] usercheck = new int[7]; // 로또 번호


    public int[] winnumberprint(int lottoturn) { // 당첨 번호 뽑기 및 출력
        Random Rd = new Random(); // 랜덤 메소드 정의
        check = new int[7]; // 당첨 번호 저장 배열

        System.out.println("\t\t\t  [ 제" + lottoturn + "회 로또 당첨 번호 ]");
        check[0] = Rd.nextInt(45) + 1;
        System.out.print("["+ check[0] + "] ");
        for(int i = 1; i < 6; i++) {
            check[i] = Rd.nextInt(45) + 1;
            System.out.print("- ["+ check[i] + "] ");
        }
        check[6] = Rd.nextInt(45)+1;
        System.out.print(" * 보너스 번호 : ["+ check[6] + "] \n");

        return check;
    }

    public ArrayList<Integer> winnumbercheck(int[][] number, int[] check) {
        ArrayList<Integer> winnumbersave = new ArrayList<>();
        int wincount = 0;

        for(int i = 0; i < number.length; i++) { // 로또 번호 확인 후 count > 1 이면 금액 지급 반복문
            int count = 0, bonus = 0;
            System.out.print("\n" + (i + 1) + "번째 장 : ");

            for(int j = 0; j < number[i].length-1; j++) {
                usercheck[j] = number[i][j];
                System.out.print("[" + usercheck[j] + "] ");
                if(check[j] == usercheck[j])
                    count++;
            }
            usercheck[6] = number[i][6];
            System.out.print("* 보너스 번호 : [" + usercheck[6] + "] ");
            if(check[6] == usercheck[6])
                bonus++;
            if(count >= 1) {
                for(int k = 0; k < 7; k++)
                    winnumbersave.add(usercheck[k]);
                winpay(count, bonus);
                wincount++;
            }
        }
        return winnumbersave;
    }

    public static void winpay(int count, int bonus) {
        String[] Text = {"불일치", "일치"};
        System.out.println("\n총 6개 번호중 " + count + "일치 하였으며, 보너스 번호 " + Text[bonus]);
        switch (count) {
            case 6:
                System.out.print("* 1등 상품 지급 : 2,000,000,000");
                Money.money += 2000000000;
                listnumber++;
                break;
            case 5:
                if (bonus == 1) {
                    System.out.print("* 2등 상품 지급 : 100,000,000");
                    Money.money += 100000000;
                    listnumber++;
                    break;
                } else {
                    System.out.print("* 3등 상품 지급 : 5,000,000");
                    Money.money += 5000000;
                    listnumber++;
                    break;
                }
            case 4:
                System.out.print("* 4등 상품 지급 : 50,000");
                Money.money += 50000;
                listnumber++;
                break;
            case 1:
                System.out.print("* 5등 상품 지급 : 5,000");
                Money.money += 5000;
                listnumber++;
                break;
        }
    }
}
