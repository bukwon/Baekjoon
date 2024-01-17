import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int[] array = new int[N];
        int start_index = 0; int end_index = N - 1;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        int sum = array[0] + array[N - 1];
        int count = 0;
        while(end_index != start_index) {
            if (sum < M) {
                sum -= array[start_index];
                start_index ++;
                sum += array[start_index];
            } else if (sum > M) {
                sum -= array[end_index];
                end_index--;
                sum += array[end_index];
            } else {
                count ++;
                sum -= array[end_index];
                end_index --;
                sum += array[end_index];
            }
        }
        bw.write(count + "");
        bw.flush(); bw.close(); bf.close();
    }
}