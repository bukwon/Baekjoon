import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;

        try {
            HashMap<String, String> array = new HashMap<>();
            for (int i = 0; i < N; i++) {
                array.put(bf.readLine(), "a");
            }

            for (int i = 0; i < M; i++) {
                if (array.get(bf.readLine()) != null) result ++;
            }
        } catch (NumberFormatException e) {
            bw.write("part1 Error!");
        } catch (Exception e) {
            bw.write("part2 Error!");
        }

        bw.write(result + "");
        bw.flush(); bw.close(); bf.close();
    }
}