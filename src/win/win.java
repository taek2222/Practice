package win;

import money.Money;
import java.util.Random;

public class win {
    static Random Rd = new Random();
    static int[][] winlist = new int[2][7];
    static int listnumber = 0; // 한 회차에 몇번 당첨 횟수
    static int[] check = new int[7]; // 당첨 번호
    static int[] usercheck = new int[7]; // 로또 번호
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
        win.wininput(check);
    }

    public static void winnumbercheck(int[][] number, int sheets) {
        for(int i = 0; i < sheets; i++) {
            int count = 0, bonus = 0;
            System.out.print((i + 1) + "번째 장 : ");
            for(int j = 0; j < number[i].length-1; j++) {
                usercheck[j] = number[i][j];
                System.out.print("[" + usercheck[j] + "] ");
                if(check[j] == usercheck[j])
                    count++;
            }
            usercheck[6] = number[i][6];
            System.out.print(" 보너스 번호 : [" + usercheck[6] + "] ");
            if(check[6] == usercheck[6])
                bonus++;
            winpay(count, bonus);
        }
        windata.savenumber(winlist);
    }

    public static void winpay(int count, int bonus) {
        String[] Text= {"불일치", "일치"};
        System.out.print("\n총 6개 번호중 " + count + "일치 하였으며, 보너스 번호 ");
        System.out.println(Text[bonus]);
        switch (count){
            case 6:
                System.out.println("* 1등 상품 지급 : 2,000,000,000");
                Money.money += 2000000000;
                listnumber++;
                win.wininput(usercheck);
                break;
            case 5:
                if(bonus == 1) {
                    System.out.println("* 2등 상품 지급 : 100,000,000");
                    Money.money += 100000000;
                    listnumber++;
                    win.wininput(usercheck);
                    break;
                }
                else
                {
                    System.out.println("* 3등 상품 지급 : 5,000,000");
                    Money.money += 5000000;
                    listnumber++;
                    win.wininput(usercheck);
                    break;
                }
            case 4:
                System.out.println("* 4등 상품 지급 : 50,000");
                Money.money += 50000;
                listnumber++;
                win.wininput(usercheck);
                break;
            case 3:
                System.out.println("* 5등 상품 지급 : 5,000");
                Money.money += 5000;
                listnumber++;
                win.wininput(usercheck);
                break;
        }
    }
    public static void wininput(int[] number) {
        for(int i = 0; i < number.length; i++)
            winlist[listnumber][i] = number[i];
    }
}
