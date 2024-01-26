import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < N) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int menu = Integer.parseInt(st.nextToken());

            if(menu == 1) {
                int input = Integer.parseInt(st.nextToken());
                stack.push(input);
            } else if (menu == 2) {
                if (stack.empty()) sb.append(-1 + "\n");
                else {
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                }
            } else if (menu == 3) {
                sb.append(stack.size()).append("\n");
            } else if (menu == 4) {
                if (stack.empty()) sb.append(1+"\n");
                else sb.append(0+"\n");
            } else if (menu == 5) {
                if (stack.empty()) sb.append(-1 + "\n");
                else sb.append(stack.peek()).append("\n");
            }
            i++;
        }
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}