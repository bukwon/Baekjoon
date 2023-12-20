import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());

        bw.write(A*B + "");
        bw.flush(); bw.close();
        bf.close();
    }
}