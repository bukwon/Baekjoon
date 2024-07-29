import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sentences = new ArrayList<>();
        String s = "";
        while(true) {
            s = bf.readLine();
            if (s.equals("END")) break;
            sentences.add(s);
        }
        StringBuilder sb = new StringBuilder();
        for (String tmp: sentences) {
            for (int i = tmp.length() - 1; i >= 0 ; i--) {
                sb.append(tmp.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}