package text;

public class text {
    public static void lottonumberprint(int[][] number, int i){
        System.out.print("["+number[i][0] + "]");
        for(int j = 1; j < number[i].length; j++) {
            System.out.print(", ["+number[i][j] + "]");
        }
        System.out.println();
    }
}
