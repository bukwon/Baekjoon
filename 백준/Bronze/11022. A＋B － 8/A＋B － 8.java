import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] A = new int[T];
        int[] B = new int[T];
        int temp[] = new int[T];

        for (int i = 0; i < temp.length; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            temp[i] = A[i]+B[i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + A[i] + " + " + B[i] + " = " + temp[i]);
        }
    }
}
