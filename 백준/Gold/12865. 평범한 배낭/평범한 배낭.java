import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] arr; // x - 가치, y - 무게
    static int N, K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();   // 물품 수
        K = sc.nextInt(); // 최대 무게
        arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();   // 무게
            arr[i][1] = sc.nextInt();   // 가치
        }

        System.out.println(solution());
    }

    private static int solution() {
        int[][] value = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (j >= arr[i - 1][0]) {
                    value[i][j] = Math.max(value[i - 1][j], value[i - 1][j - arr[i - 1][0]] + arr[i - 1][1]);
                } else {
                    value[i][j] = value[i - 1][j];
                }
            }
        }
        return value[N][K];
    }
}
