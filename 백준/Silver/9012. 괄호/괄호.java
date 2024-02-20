import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack;
        String[] vpsTemp;
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(bf.readLine());

        for (int i = 0; i < count; i++) {
            String vps = bf.readLine();
            vpsTemp = vps.split("");
            stack = new Stack<>();
            stack.add("start");
            boolean flag = false;
            for (int j = 0; j < vpsTemp.length; j++) {
                if (vpsTemp[j].equals("(")) stack.add(vpsTemp[j]);
                else {
                    stack.pop();
                    if (!stack.contains("start")) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag && stack.pop().equals("start")) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}