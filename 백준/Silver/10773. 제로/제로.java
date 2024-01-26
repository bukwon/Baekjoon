import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(bf.readLine());
        long result = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while(i < K) {
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                int minus = stack.pop();
                result -= minus;
            }
            else {
                stack.push(num);
                result += num;
            }
            i++;
        }
        bw.write(result + "");
        bw.flush(); bw.close(); bf.close();
    }
}