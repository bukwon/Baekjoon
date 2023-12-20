import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] S = sentence.split(" ");
        int result = 0;
        for (int i = 0; i < S.length; i++) {
            if(S[i].isEmpty()) continue;
            result++;
        }
        System.out.println(result);
    }
}