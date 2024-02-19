import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[246913];
        StringBuilder sb = new StringBuilder();
        
        isPrime(prime);
        // 소수 구하기
        while (true) {
            int result = 0;
            int n = Integer.parseInt(bf.readLine());
            if (n == 0) break;

            for (int i = n + 1; i <= n * 2; i++) {
                if (!prime[i]) result ++;
            }
            sb.append(result).append("\n");
        }
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
    static void isPrime(boolean[] prime) {
        prime[0] = true;    // true는 not 소수, false는 소수
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}