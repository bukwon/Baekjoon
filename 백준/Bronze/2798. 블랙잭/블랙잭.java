import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        Integer[] array = new Integer[N];
        int result = 0;
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i = 0; i < N - 2; i++) {   // 카드는 3장 뽑아야 하므로 마무리 두 칸 전 이후 넘어가면 의미 없음
            for (int j = i + 1; j < N - 1; j++) {
                if (M < array[i] + array[j]) continue;
                for (int k = j + 1; k < N; k++) {
                    int temp =  array[i] + array[j] + array[k];
                    if (M >= temp && result < temp) {
                        result = temp;
                    }
                }
            }
        }
        bw.write(result+"");
        bw.flush(); bw.close(); bf.close();
    }
}