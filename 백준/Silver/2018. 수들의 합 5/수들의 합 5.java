import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // start_index && end_index 이용
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Integer.parseInt(bf.readLine());

        long start_index = 1;
        long end_index = 1;
        long count = 1;
        long sum = 1;

        // 15q
        while(end_index != N) {
            if (sum > N) {
                sum -= start_index;
                start_index ++;
            } else if (sum < N) {
                end_index ++;
                sum += end_index;
            } else {
                count ++;
                end_index ++;
                sum += end_index;
            }
        }
        bw.write(count + "");
        bw.flush(); bw.close(); bf.close();
    }
}