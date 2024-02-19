import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i * i <= n; i++) {
            result ++;
        }
        bw.write(result + "");
        bw.flush(); bw.close(); bf.close();
    }
}