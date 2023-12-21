import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 모든 변의 길이가 0이면 종료
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 가장 긴 변 찾기
            int max = Math.max(Math.max(a, b), c);
            int sum = a + b + c - max;  // 가장 긴 변을 제외한 두 변의 길이의 합

            // 삼각형 조건 판별
            if (max < sum) {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }

        br.close();
    }
}