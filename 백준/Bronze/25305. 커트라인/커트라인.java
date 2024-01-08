import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        Integer[] array = new Integer[N];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(array, Collections.reverseOrder());

        bw.write(array[k - 1] + "");
        bw.flush(); bw.close(); bf.close();
    }
}