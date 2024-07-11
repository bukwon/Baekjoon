import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader bf;
    static BufferedWriter bw;
    static int[][] bingo;
    static int pass = 0;
    static boolean flag;
    static ArrayList<Integer> total = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bingo = new int[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(bingoGame());
    }

    private static int bingoGame() throws IOException {
        int answer = 0;

        do {
            for (int i = 0; i < 5; i++) {
                st = new StringTokenizer(bf.readLine());
                int num;
                for (int j = 0; j < 5; j++) {
                    num = Integer.parseInt(st.nextToken());

                    check(num);
                    answer++;
                    if (flag) break;
                }
                if (flag) break;
            }
        } while (!flag);
        return answer;
    }

    private static void check(int num) {
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                if (bingo[k][l] == num) {
                    bingo[k][l] = 0;
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        flag = false;
        checkVertical();
        checkHorizontal();
        checkAxis1();
        checkAxis2();
        if (pass >= 3) flag = true;
        else pass = 0;
    }

    private static void checkVertical() {
        for (int i = 0; i < 5; i++) {
            int check = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) {
                    check ++;
                }
            }
            if (check == 5) pass++;
        }
    }
    private static void checkHorizontal() {
        for (int i = 0; i < 5; i++) {
            int check = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) {
                    check ++;
                }
            }
            if (check == 5) pass++;
        }
    }
    private static void checkAxis1() {
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) {
                check ++;
            }
        }
        if (check == 5) pass++;
    }
    private static void checkAxis2() {
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) {
                check ++;
            }
        }
        if (check == 5) pass++;
    }
}