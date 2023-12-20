import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int countNum (int[] array, int N) {
        int count = 0;
        int v = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (v == array[i]) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) array[i] = sc.nextInt();
        System.out.println(countNum(array, N));
    }
}
