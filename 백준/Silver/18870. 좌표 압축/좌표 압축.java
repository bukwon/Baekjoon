import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        int[] array1 = new int[N];  // 원본 배열
        int[] array2 = new int[N];  // 정렬 배열
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array1[i] = array2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array2);
        // 키, 값 넣기
        int rank = 0;
        for (int num: array2) {
            if(!hashmap.containsKey(num)) {
                hashmap.put(num, rank);
                rank ++;
            }
        }
        
        // 출력

        StringBuilder sb = new StringBuilder();
        for (int num: array1) {
            if(hashmap.containsKey(num)) {
                sb.append(hashmap.get(num)).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush(); bw.close(); bf.close();
    }
}