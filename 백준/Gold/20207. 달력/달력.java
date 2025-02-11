import java.util.Scanner;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[367];

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            for (int j = S; j <= E; j++) {
                arr[j] += 1;
            }
        }

        int x = 0;
        int y = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 1; i < 367; i++) {
            if (arr[i] >= 1) {
                x ++;
                y = Math.max(arr[i], y);
            } else {
                result += x * y;
                x = 0;
                y = 0;
            }
        }

        System.out.println(result);
    }
}