import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 예제 문자열
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String calc = String.valueOf(bf.readLine());
        //55-50+30+40-
        String[] substractPart =  calc.split("-");
        int sum = 0; int result = 0;
        int n = 0;

        for (String part: substractPart) { //  50 -> 40 20 -> 30 40 20 -> 30
            if(part.contains("+")) {
                String[] plusPart = part.split("\\+");
                for (int i = 0; i < plusPart.length; i++) {
                    sum += Integer.parseInt(plusPart[i]);
                }
                if(n < 1) {
                    result = sum;
                    sum=0;
                }
            }
            else {
                if (n < 1) {
                    result = Integer.parseInt(part);
                }
                else {
                    sum += Integer.parseInt(part);
                }
            }
            n++;
        }
        if (n > 1) result -= sum;
        bw.write(result+"");
        bw.flush(); bw.close(); bf.close();
    }
}