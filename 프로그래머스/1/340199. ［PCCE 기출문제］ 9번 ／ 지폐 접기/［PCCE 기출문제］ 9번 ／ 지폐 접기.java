import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int wallet_height = wallet[0];
        int wallet_width = wallet[1];
        
        while (true) {
            // 지폐가 지갑에 들어갈 수 있는지 검증
            if ((wallet_height >= bill[0] && wallet_width >= bill[1]) ||
                (wallet_height >= bill [1] && wallet_width >= bill[0])) {
                break;
            }
            
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer ++;
        }
        
        return answer;
    }
}