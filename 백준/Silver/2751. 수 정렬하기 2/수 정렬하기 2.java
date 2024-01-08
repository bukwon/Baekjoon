import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        Integer[] array = new Integer[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < N; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush(); bw.close(); bf.close();
    }
}