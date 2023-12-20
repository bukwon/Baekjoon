import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 공 1~N 의 곻들
        int M = sc.nextInt();   // 시도 횟수
        int[] array = new int[N];

        for (int i = 0; i < M; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int ball = sc.nextInt();
            for (int j = num1; j <= num2; j++) {
                array[j - 1] = ball;
            }
        }
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}