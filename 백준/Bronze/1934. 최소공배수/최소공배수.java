import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        long[] num1 = new long[T];
        long[] num2 = new long[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            num1[i] = Integer.parseInt(st.nextToken());
            num2[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int check = 2; // 검사 용
        long result = 1; // 결과 값 배출
        while(i < T) {
            long max = Math.max(num1[i], num2[i]);
            if (num1[i] % check == 0 && num2[i] % check == 0) {
                result *= check;
                num1[i] /= check; num2[i] /= check;
                check = 2;
            } else check ++;
            if (check > max) {
                result = result * num1[i] * num2[i];
                bw.write(result + "\n");
                i ++;
                check = 2; result = 1;
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}