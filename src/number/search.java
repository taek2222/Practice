package number;

public class search {

    public static void numberserch(int[][] number, int t){
        String[] tell= {"수동", "자동"};
        System.out.println("LOTTO *" + tell[t] +"* 으로 구매한 번호 전체 출력");
        for(int i = 0; i < number.length; i++) {
            System.out.print((i+1) + "번째 장의 번호 : ");
            System.out.print("["+number[i][0] + "]");
            for(int j = 1; j < number[i].length; j++)
                System.out.print(", ["+number[i][j] + "]");
            System.out.println();
        }
        System.out.println();
    }
    public static void lottonumberprint(int[][] number, int i){
        System.out.print("["+number[i][0] + "]");
        for(int j = 1; j < number[i].length; j++) {
            System.out.print(", ["+number[i][j] + "]");
        }
        System.out.println();
    }
}
