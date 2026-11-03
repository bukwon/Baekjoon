class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        // 홀수 층 왼쪽에서 오른쪽
        // 짝수 층 오른쪽에서 왼쪽으로
        
        int count = 1;
        int height = n % w > 0 ? n / w + 1 : n / w;
        int width = w;
        // num이 위치한 장소
        int point = 0;
        
        for (int h = 1; h <= height; h ++) {
            // if문: 홀수 층 전용
            // else문: 짝수 층 전용
            if (h % 2 == 1) {
                for (int x = 1; x <= width; x ++) {
                    if (num == count) {
                        point = x;
                    } 
                    
                    if (x == point) {
                        answer ++;
                    }
                    
                    if (count == n)
                        break;
                    
                    count ++;
                }
            } else {
                for (int x = width; x >= 1; x --) {
                    if (num == count) {
                        point = x;
                    }
                    
                    if (x == point) {
                        answer ++;
                        
                    }
                    
                    if (count == n)
                        break;
                    
                    count ++;
                }
            }
        }
        return answer;
    }
}