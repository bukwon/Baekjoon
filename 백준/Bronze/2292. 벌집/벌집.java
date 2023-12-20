import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int floor = 1;
        if(N > 1) {
            int count1 = 1;
            int count2 = 1;
            while (true) {
                if (N >= count1 && N <= count2) break;
                count2 = count2 + (6 * floor);
                count1 = count2 - (6 * floor);
                floor++;
            }
        }
        System.out.println(floor);
    }
}
// 벌집 문제, 한 층 높아질 수록 6개 씩 개수 증가