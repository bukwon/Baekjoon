import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(bf.readLine());
        int result = 0;

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int i = N;
        int num = 0;
        while(i > 1) {
            queue.remove();
            i--;
            if (i > 1) {
                num = queue.poll();
                queue.add(num);
            }
        }
        result = queue.poll();
        bw.write(result + "");
        bw.flush(); bw.close(); bf.close();
    }
}
