import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 나의 솔루션
        // beforeSolution();
        
        int min_w = Math.min(wallet[0], wallet[1]);
        int max_w = Math.max(wallet[0], wallet[1]);
        int min_b = Math.min(bill[0], bill[1]);
        int max_b = Math.max(bill[0], bill[1]);
        
        while(true) {
            if (min_w < min_b || max_w < max_b) {
                max_b /= 2;
                answer ++;
            }
            
            if (max_b < min_b) {
                int temp = max_b;
                max_b = min_b;
                min_b = temp;
            }
            
            if (max_w >= max_b && min_w >= min_b) {
                break;
            }
        }
        
        return answer;
    }
    
//     void beforeSolution() {
//         int wallet_height = wallet[0];
//         int wallet_width = wallet[1];
        
//         while (true) {
//             // 지폐가 지갑에 들어갈 수 있는지 검증
//             if ((wallet_height >= bill[0] && wallet_width >= bill[1]) ||
//                 (wallet_height >= bill [1] && wallet_width >= bill[0])) {
//                 break;
//             }
            
//             // 지갑에 들어갈 사이즈가 아니라면 반으로 접기
//             if (bill[0] > bill[1]) {
//                 bill[0] /= 2;
//             } else {
//                 bill[1] /= 2;
//             }
//             answer ++;
//         }
//     }
}