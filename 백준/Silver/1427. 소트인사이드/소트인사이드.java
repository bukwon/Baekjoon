import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = String.valueOf(bf.readLine());
        long[] result = new long[N.length()];
        String[] temp = N.split("");
        Arrays.sort(temp, Collections.reverseOrder());
        for (int i = 0; i < N.length(); i++) {
            result[i] = Integer.parseInt(temp[i]);
        }
        for (long i: result) {
            bw.write(i+"");
        }
        bw.flush(); bw.close(); bf.close();
    }
}