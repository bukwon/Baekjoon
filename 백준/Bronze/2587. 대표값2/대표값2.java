import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int avg = 0;
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            avg += array[i];
        }
        avg /= 5;
        Arrays.sort(array);
        bw.write(avg + "\n" + array[2]);
        bw.flush(); bw.close(); bf.close();
    }
}