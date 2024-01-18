import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> array = new HashMap<>();

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array.put(st1.nextToken(), 0);
        }

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            if(array.get(st2.nextToken()) != null) sb.append("1 ");
            else sb.append("0 ");
        }
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}