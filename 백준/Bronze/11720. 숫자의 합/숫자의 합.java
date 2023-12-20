import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        String[] M = new String[N];
        String num = sc.next();
        M = num.split("");

        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(M[i]);
        }
        System.out.println(result);
    }
}