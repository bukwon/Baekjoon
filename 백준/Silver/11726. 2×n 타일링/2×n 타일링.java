import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        long[] array = new long[n];
        long result = 0;
        if (n > 2) {
            array[0] = 1; array[1] = 2;
            for (int i = 2; i < n; i++) {
                array[i] = (array[i - 1] + array[i - 2]) % 10007;
            }
            result = array[n - 1];
        } else if (n == 2) {
            result = 2;
        } else if (n == 1) result = 1;

        bw.write(result + "");
        bw.flush(); bw.close(); bf.close();
    }
}