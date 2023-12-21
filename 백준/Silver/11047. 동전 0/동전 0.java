import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int medeium = 0;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(coin);

        for (int i = N - 1; i >= 0; i--) {
            medeium = K / coin[i];
            K %= coin[i];
            result += medeium;
        }
        bw.write(result + " ");
        bw.flush(); bf.close();
        bw.close();
    }
}