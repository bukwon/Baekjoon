import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int result = 0;

        int i = 0;
        while (i < N) {
            result = i; // 자연수 구하기 위해 비교 용
            String str1 = String.valueOf(i);
            char[] num = str1.toCharArray();
            for (int j = 0; j < num.length; j++) {
                result += Integer.parseInt(String.valueOf(num[j]));
            }
            if (N == result) {
                bw.write(i+"");
                break;
            }
            i++;
            result = 0;
            bw.flush();
        }
        if(result == 0) bw.write(result + "");
        bw.flush(); bw.close(); bf.close();
    }
}