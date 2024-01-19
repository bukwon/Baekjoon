import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] word = bf.readLine().toCharArray();
        int count = 0;

        st = new StringTokenizer(bf.readLine());
        int[] check = new int[4];       // 비밀번호 부분 번호의 조건
        for (int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }

        int[] countTemp = new int[4];
        for (int i = 0; i < P; i++) {
            switch (word[i]) {
                case 'A' : countTemp[0] ++; break;
                case 'C' : countTemp[1] ++; break;
                case 'G' : countTemp[2] ++; break;
                case 'T' : countTemp[3] ++; break;
            }
        }

        for (int i = 0; i <= S-P; i++) {
            boolean flag = false;

            for (int j = 0; j < 4; j++) {
                if (countTemp[j] < check[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) count++;
            if (i+P >= S) break;

            countTemp[checkCount(word[i])]--;
            countTemp[checkCount(word[i+P])]++;
        }
        bw.write(count + "");
        bw.flush(); bw.close(); bf.close();
    }

    static int checkCount (char word) {
        switch (word) {
            case 'A' : return 0;
            case 'C' : return 1;
            case 'G' : return 2;
            case 'T' : return 3;
        }
        return -1;
    }
}
