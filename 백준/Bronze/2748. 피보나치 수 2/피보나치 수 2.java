import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        long[] array = new long[n + 1];
        array[0] = 0; array[1] = 1;
        long result = array[0];
        if (n == 1) result = array[1];
        else if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            result = array[n];
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        bf.close();
    }
}