import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sentences = new ArrayList<>();
        String s = "";
        while(true) {
            s = sc.nextLine();
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
