import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] num = new int[26];

        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (num[ch - 'a'] == -1) num[ch - 'a'] = i;
        }
        for (int var : num) {
            System.out.print(var + " ");
        }
    }
}
// charat 이용