import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        int[] num = new int[T];
        for (int i = 0; i < num.length; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            num[i] = A + B;
        }
        for (int i = 0; i < num.length; i++) System.out.println(num[i]);
    }
}