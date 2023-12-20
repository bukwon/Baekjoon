import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] angle = new int[3];
        int result = 0; int angle_sum = 0;
        for (int i = 0; i < 3; i++) {
            angle[i] = Integer.parseInt(bf.readLine());
            angle_sum += angle[i];
        }

        if (angle_sum != 180) bw.write("Error");
        else {
            for (int i = 0; i < 2; i++) {
                for (int j = i; j < 3; j++) {
                    if (i == j) continue;
                    if (angle[i] == angle[j]) result ++;
                }
            }
            if(result ==  0) bw.write("Scalene");
            else if(result ==  1) bw.write("Isosceles");
            if(result ==  3) bw.write("Equilateral");
        }
        bw.flush(); bw.close(); bf.close();
    }
}