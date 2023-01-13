import money.Money;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Money doll = new Money();
        Scanner sc = new Scanner(System.in);

        int lottonumber = 1;
        int age;

        while (true) {
            System.out.println("--------------- LOTTO 프로그램 ---------------");
            System.out.println("\t\t\t  [ 제 " + lottonumber + "회 로또 추첨 ]");
            doll.moneyprint();
            System.out.println("---------------------------------------------");

            System.out.println("[ LOTTO 프로그램 기능을 선택해주세요. ]");
            System.out.println("① LOTTO 번호 뽑기 ( 수동 )");
            System.out.println("② LOTTO 번호 뽑기 ( 자동 )");
            System.out.println("③ LOTTO 당첨 번호 확인");
            System.out.println("④ LOTTO 프로그램 안내");
            age = sc.nextInt();

            switch (age){
                case 1:
                case 2:
                case 3:
                case 4:
                default:
                    System.out.println("번호를 잘못 입력하였습니다. 다시 입력바랍니다.");
            }
            break;
        }
    }
}