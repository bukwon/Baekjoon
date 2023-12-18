import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int cal = 0;
            for (int j = 1; j <= array[i]; j++) {
                if(array[i] % j == 0) cal++;
            }
            if(cal == 2) result++;
        }
        System.out.println(result);
    }
}
