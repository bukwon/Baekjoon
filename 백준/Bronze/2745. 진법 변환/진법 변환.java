import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String B = sc.next();
        int N = sc.nextInt();
        char[] c = new char[B.length()];
        double result = 0;

        for (int i = 0; i < B.length(); i++) {
            c[i] = B.charAt(i);
        }

        for (int i = 0; i < c.length; i++) {
            int code = 10;
            if ((int) c[i] > 64) {
                for (int j = 65; j <= 90; j++) {
                    if (c[i] == j || c[i] == j+32) {
                        result += (Math.pow(N, ((int) (c.length) - (i + 1)))) * (code);
                        break;
                    }
                    code++;
                }
            } else {
                result += (int)(c[i]-'0') * (Math.pow(N, c.length - (i+1))); // 진법^자리 수
            }

        }
        System.out.println((int) result);
    }
}