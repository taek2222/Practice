public class Main {
    public static void main(String[] args) {
        Start[] lottoturn = new Start[100]; // 로또 회차
        int lottoturnnumber = 0;

        while (true) {
            lottoturn[lottoturnnumber] = new Start();
            lottoturn[lottoturnnumber].lottostart(lottoturnnumber+1);
            break;
        }
    }

}