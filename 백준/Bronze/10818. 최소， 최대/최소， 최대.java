import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 입력 수
        int[] array = new int[N];

        for (int i = 0; i < N; i++) array[i] = sc.nextInt();

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) if (array[i] > max) max = array[i];
        for (int i = 0; i < array.length; i++) if (array[i] < min) min = array[i];
        System.out.println(min + " " + max);
    }
}
