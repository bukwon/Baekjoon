import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();


        int N = Integer.parseInt(bf.readLine());

        while (true) {
            if(N <= 1) return;
            boolean flag = false;
            if (N >= 4) {
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        list.add(i);
                        N /= i;
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                list.add(N);
                break;
            }
        }
        Collections.sort(list);
        for (int i:list) {
            System.out.println(i);
        }
    }
}
