import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[5];
        ArrayList<Character>[] list = new ArrayList[5];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            word[i] = sc.next();
            list[i] = new ArrayList<Character>();
            if (word[i].length() > max) max = word[i].length();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                list[i].add(word[i].charAt(j));
            }
            while(list[i].size() < max) list[i].add('\0');
        }

        int i = 0;
        while(i < max) {
            for (int j = 0; j < 5; j++) {
                if(list[j].get(i) == '\0') continue;
                System.out.print(list[j].get(i));
            }
            i++;
        }
    }
}