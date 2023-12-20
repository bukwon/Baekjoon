import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chessNum = {1, 1, 2, 2, 2, 8};
        int[] chessCheck = new int[6];

        for (int i = 0; i < chessCheck.length; i++) {
            chessCheck[i] = sc.nextInt();
        }

        for (int i = 0; i < chessCheck.length; i++) {
            int result = 0;
            result = chessNum[i] - chessCheck[i];
            System.out.print(result + " ");
        }
    }
}
