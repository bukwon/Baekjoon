import java.io.*;

public class Main {
    static char[] c;
    static int answer = 0;
    static String s;
    static char[] cry = {'q', 'u', 'a', 'c', 'k'};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        s = bf.readLine();
        c = s.toCharArray();
        implementation(c);
    }

    private static void implementation(char[] c) {
        if (s.length() % 5 != 0) {
            System.out.println(-1);
            return;
        }
        while (!s.isEmpty()) {
            int check = 0;  // 오리 울음소리 자리 체크
            boolean flag = false; // 한번도 안울었음을 방지하기 위함
            for (int i = 0; i < s.length(); i ++) {
                if (cry[check] == c[i]) {
                    check++;
                    c[i] = ' ';
                    if (check == 5) {
                        check = 0;
                        flag = true;
                    }
                }
            }
            if (!flag || check > 0) {
                answer = -1;
                break;
            } else {
                answer ++;
                s = String.valueOf(c).replaceAll(" ", "");
                c = s.toCharArray();
            }
        }
        System.out.println(s.isEmpty() ? answer : -1);
    }
}