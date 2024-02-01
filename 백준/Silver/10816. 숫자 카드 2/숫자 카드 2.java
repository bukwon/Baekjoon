import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        HashMap<Integer, Integer> result = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            result.merge(num, 1, Integer::sum);
        }

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if(result.get(num) == null) sb.append(0).append(" ");
            else sb.append(result.get(num)).append(" ");
        }

        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}