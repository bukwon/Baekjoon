import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;

        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            if (x > max_x) max_x=x;
            if (y > max_y) max_y=y;
            if (x < min_x) min_x=x;
            if (y < min_y) min_y=y;
        }

        if (N == 1) {
            bw.write("0\n");
        } else {
            long result = (long) (max_x - min_x) * (max_y - min_y);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}