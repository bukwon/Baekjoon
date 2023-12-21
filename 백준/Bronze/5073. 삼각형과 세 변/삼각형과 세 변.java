import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new ArrayList<>();

        int[] angle = new int[3];

        while (true) {
            int zeroBase = 0;
            int maxNumTemp = 0;
            int check = 0;  // 두 변 길이가 같은 곳 체크

            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < 3; i++) {
                angle[i] = Integer.parseInt(st.nextToken());
                if (angle[i] == 0) zeroBase++;
            }

            int maxNum = Math.max(Math.max(angle[0], angle[1]), angle[2]);
            int minNum = Math.min(Math.min(angle[0], angle[1]), angle[2]);
            if (zeroBase == 3) {    // 만일 입력 0 이 3개일 시 break
                break;
            } else {   // 2. 3변의 길이가 같냐 아니냐
                if (angle[0] == angle[1] && angle[1] == angle[2]) {
                    list.add("Equilateral");
                } else {
                    // 3. 두 변만 같은가 모두 다 다른가
                    if (angle[0] != angle[1] && angle[1] != angle[2] && angle[0] != angle[2]) {
                        // 4. 가장 큰 수보다 두 면을 합친 값이 더 큰가
                        for (int i = 0; i < 3; i++) {
                            if (angle[i] == maxNum) continue;
                            maxNumTemp += angle[i];
                        }
                        if (maxNumTemp > maxNum) list.add("Scalene");
                        else list.add("Invalid");
                    } else {  // 두 변이 같고 그 값이 긴 변보다 긴가
                        // 우선 그 두변의 길이가 똑같은게 가장 큰 값과 같은 변인 것인가 아닌가
                        for (int i = 0; i < 3; i++) {
                            if (maxNum == angle[i]) check++;
                        }
                        if ((minNum * 2 > maxNum) || check >= 2 && ((maxNum + minNum) > maxNum)) list.add("Isosceles");
                        else list.add("Invalid");

                    }
                }
            }
        }

        for (String s : list) {
            bw.write(s + "\n");
        }

        bw.flush();bw.close();bf.close();
    }
}