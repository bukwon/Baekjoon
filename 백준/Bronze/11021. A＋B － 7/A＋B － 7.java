import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int temp[] = new int[T];

        for (int i = 0; i < temp.length; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            temp[i] = A+B;
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + temp[i]);
        }
    }
}