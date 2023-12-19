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

            // 조건식을 수정하여 최소/최대 값을 올바르게 갱신하도록 수정
            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
            min_x = Math.min(min_x, x);
            min_y = Math.min(min_y, y);
        }

        // N이 1일 때의 예외 처리를 bw.write로 변경
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
