import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        long num1 = Integer.parseInt(st.nextToken());
        long num2 = Integer.parseInt(st.nextToken());


        long N = eucd(Math.max(num1, num2), Math.min(num1, num2));

        num1 = num1 / N;
        num2 = num2 / N;

        long M = num1 * num2 * N;

//            System.out.println(N); 최대 공약수
        bw.write(M + "");  // 최소 공배수
        bw.flush();
        bw.close();
        bf.close();
    }

    static public long eucd(long bn, long sn) {
        long r = bn % sn;
        if (r == 0) {
            return sn;
        } else {
            return eucd(sn, r);
        }
    }
}