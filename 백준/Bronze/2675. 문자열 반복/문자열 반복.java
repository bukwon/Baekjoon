import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<Character> list = new ArrayList<>();
        char divide;

        int T = sc.nextInt();   // 테스트 케이스 개수
        String[] result = new String[T];

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            result[i] = "";
            for (int j = 0; j < S.length(); j++) {
                divide = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    result[i] += divide;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}