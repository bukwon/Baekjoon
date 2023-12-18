import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        int num = 0;
        boolean flag = false;
        List<Integer> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            num = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) num++;
            }
            if (num == 2) {
                flag = true;
                list.add(i);
            }
        }

        if (!flag) {
            int result = -1;
            bw.write(Integer.toString(result)); // Convert result to String before writing
        } else {
            int min = list.get(0);
            int sum = 0;
            for (int i : list) {
                if (min > i) min = i;
                sum += i;
            }
            bw.write(sum + "\n");
            bw.write(min + "");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}