package win;

import money.Money;
import java.util.Random;

public class win {
    static Random Rd = new Random();
    static int[] check = new int[7];
    public static void winnumberprint(int lottoturn) {
        System.out.println("\t\t\t  [ 제" + lottoturn + "회 로또 당첨 번호 ]");
        check[0] = Rd.nextInt(45) + 1;
        System.out.print("\t ["+ check[0] + "] ");
        for(int i = 1; i < 6; i++) {
            check[i] = Rd.nextInt(45) + 1;
            System.out.print("- ["+ check[i] + "] ");
        }
        check[6] = Rd.nextInt(45)+1;
        System.out.print(" * 보너스 번호 : ["+ check[6] + "] \n");
    }

    public static void winnumbercheck(int[][] number, int sheets) {
        for(int i = 0; i < sheets; i++) {
            int count = 0, bonus = 0;
            System.out.print((sheets + 1) + "번째 장 : ");
            for(int j = 0; j < number[i].length-1; j++) {
                System.out.print("[" + number[i][j] + "] ");
                if(check[j] == number[i][j])
                    count++;
            }
            System.out.print(" 보너스 번호 : [" + number[i][6] + "] ");
            if(check[6] == number[i][6])
                bonus++;
            winpay(count, bonus);
        }
    }

    public static void winpay(int count, int bonus) {
        String[] text= {"불일치", "일치"};
        System.out.print("\n총 6개 번호중 " + count + "일치 하였으며, 보너스 번호 ");
        System.out.println(text[bonus]);
        switch (count){
            case 6:
                System.out.println("* 1등 상품 지급 : 2,000,000,000");
                Money.money += 2000000000;
                break;
            case 5:
                if(bonus == 1) {
                    System.out.println("* 2등 상품 지급 : 100,000,000");
                    Money.money += 100000000;
                    break;
                }
                else
                {
                    System.out.println("* 3등 상품 지급 : 5,000,000");
                    Money.money += 5000000;
                    break;
                }
            case 4:
                System.out.println("* 4등 상품 지급 : 50,000");
                Money.money += 50000;
                break;
            case 3:
                System.out.println("* 5등 상품 지급 : 5,000");
                Money.money += 5000;
                break;
        }
    }

}
