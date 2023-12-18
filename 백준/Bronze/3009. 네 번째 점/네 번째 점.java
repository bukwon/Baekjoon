import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>[] list = new ArrayList[2];
        int result1 = 0; int result2 = 0;

        for (int i = 0; i < 2; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i <= 2; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            list[0].add(num1); list[1].add(num2);
        }

        for (int i = 0; i < 3; i++) {
            boolean flag1 = false;
            boolean flag2 = false;
            for (int j = 0; j <= 2; j++) {
                if (i == j) continue;
                if (Objects.equals(list[0].get(i), list[0].get(j))) flag1 = true;
                if (Objects.equals(list[1].get(i), list[1].get(j))) flag2 = true;
            }
            if (!flag1) result1=list[0].get(i);
            if (!flag2) result2=list[1].get(i);
        }

        System.out.println(result1 + " " + result2);
        bf.close();
    }
}