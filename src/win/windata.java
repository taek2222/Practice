package win;

public class windata {
    public static userwinnumber[] number = new userwinnumber[2];
    public static class userwinnumber {
        public static int[] usernumber = new int[7];

        public static void setuserwinnumber(int number, int j) {
            usernumber[j] = number;
        }

        public static void numberprint() {
            for(int i = 0; i < usernumber.length; i++)
                System.out.print("[" + usernumber[i] + "] ");
        }
    }

    public static void savenumber(int list[][]) {
        for(int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                number[i].setuserwinnumber(list[i][j], j);
            }
        }
    }

    public static void printnumber() {
        System.out.println("[ 당첨 이력 조회 ]");
        System.out.print(" 당첨 번호 : ");
        number[0].numberprint();
        System.out.println();
    }

}
