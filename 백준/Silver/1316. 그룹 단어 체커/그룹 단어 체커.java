import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuous = true;
        boolean uncontinuous = false;
         // 이미 연속했던 단어는 lock해버리자
        int N = sc.nextInt(); String[] word = new String[N];
        for (int i = 0; i < N; i++) {
            word[i] = sc.next();
        }
        int result = 0;

        for (String wordCheck:word) {
            for (int i = 0; i < wordCheck.length(); i++) {
                continuous = true;
                uncontinuous = false;
                for (int j = i; j < wordCheck.length(); j++) {
                    if (i==j) continue;
                    if (wordCheck.charAt(i) == wordCheck.charAt(j)) {
                        if(uncontinuous) continuous = false;}
                    else if(wordCheck.charAt(i) != wordCheck.charAt(j)) uncontinuous = true;
                }
                if(!continuous) break;
            }
            if(continuous) result++;
        }
        System.out.println(result);
    }
}