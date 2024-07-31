import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp;
        int star = 1;
        for (int i = 0; i < N; i++) {
            tmp = N + i;
            for (int j = 1; j <= tmp; j++) {
                if (j > tmp - star) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            star += 2;
        }
    }
}
