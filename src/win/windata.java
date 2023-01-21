package win;

import java.util.ArrayList;

public class windata {
    public static userwinnumber[] number = new userwinnumber[10];
    public class userwinnumber {
            public int[] usernumber = { };
        public void setuserwinnumber(int number, int j) {
            usernumber[j] = number;
        }

        public void numberprint() {
            for(int i = 0; i < usernumber.length; i++)
                System.out.print("[" + usernumber[i] + "] ");
            System.out.println();
        }
    }

    public static void savenumber(ArrayList<Integer>[] list, int length) {
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
               number[i].setuserwinnumber(list[i].get(j), j);
            }
        }
    }

    public static void printnumber() {
        System.out.println("\t\t\t [ 당첨 이력 조회 ]");
        System.out.print(" 당첨 번호 : ");
        number[0].numberprint();
        number[1].numberprint();
        number[2].numberprint();

        System.out.println();
    }
}
