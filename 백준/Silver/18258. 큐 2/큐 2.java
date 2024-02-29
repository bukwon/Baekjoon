import java.io.*;
import java.util.Deque;
import java.util.LinkedList; //import
import java.util.Queue; //import

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String word = bf.readLine();
            if (word.contains("push")) {
                String[] temp = word.split(" ");
                int tempNum = Integer.parseInt(temp[1]);
                queue.add(tempNum); deque.add(tempNum);
            } else if (word.equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                    deque.poll();
                }
            } else if (word.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (word.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (word.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}