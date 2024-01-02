import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int temp = N;   // 턴 끝나면 초기화 하기 위해 수 저장
        int i = 0;
        int result = 0; // 봉지 개수

        while(true) {
            int firstCal = (N/5)-i;     // ex) 9는 5와 3가지고 못나눔. 다음턴 5는 0번 나눌 수 있고 3으로 3번 나눔
            if (N >= 5 && firstCal > 0) {
                int count = 0; // 제일 큰 수부터 횟수 들어가지만 다음 턴 땐 한 횟수를 줄여야 함
                while(N > 0) {
                    if (count < firstCal) {
                        N -= 5;
                        result++;
                        count ++;
                    }
                    else {
                        N -= 3; result ++;
                    }
                }
            } else {
                while(N > 0) {
                    N -= 3;
                    result++;
                }
            }

            if (N == 0 && result >= 1) {
                break;
            }
            if (firstCal <= 0 || result < 1) {
                result = -1; break;
            }
            N = temp; i++; result = 0;
        }
        bw.write(result+"");
        bw.flush();
        bw.close(); bf.close();
    }
}