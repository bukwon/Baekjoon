import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int[] tree = new int[N];
        int[] treeDistance = new int[N - 1];    // 나무 간 사이 간격

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < N - 1; i++) {
            treeDistance[i] = tree[i + 1] - tree[i];
        }

        int gcd = treeDistance[0];
        for (int i = 1; i < N - 1; i++) {
            gcd = euclid(gcd, treeDistance[i]);
        }

        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            result += (treeDistance[i] / gcd) - 1;
        }

        bw.write( result + "");
        bw.flush(); bw.close(); bf.close();
    }
    static int euclid(int num1, int num2) {
        int gcd = num1 % num2;
        if (gcd == 0) return num2;
        else {
            return euclid(num2, gcd);
        }
    }
}
