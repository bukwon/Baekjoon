class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int height = (n / w) + 1;
        int[][] arr = new int[height][w];
        // 1 ~ N 까지 값을 저장할 count
        int count = 1;
        // num의 위치를 저장할 column과 row
        int column = 0;
        int row = 0;
        
        for (int i = 0; i < height; i ++) {
            // i 가 0이거나 짝수면 정방향으로 배열 생성
            if (i % 2 == 0) {
                for (int j = 0; j < w; j ++) {
                    if(count > n) break;
                    
                    if(count == num) {
                        column = i;
                        row = j;
                    }
                    
                    arr[i][j] = count ++;
                }
            }  else { // i가 홀수면 역방향으로 배열을 생성
                    for (int j = w-1; j >= 0; j --) {
                        if (count > n) break;
                        
                        if (count == num) {
                            column = i;
                            row = j;
                        }
                        
                        arr[i][j] = count ++;
                    }
                }
        }
        
        for (int i = column; i < height; i ++) {
            if (arr[i][row] != 0) {
                answer++;
            }
        }
        return answer;
    }
    
    // 내 코드
//     void beforeSolution() {
//         int answer = 0;
        
//         int count = 1;
//         int height = n % w > 0 ? n / w + 1 : n / w;
//         int width = w;
//         // num이 위치한 장소
//         int point = 0;
        
//         for (int h = 1; h <= height; h ++) {
//             // if문: 홀수 층 전용
//             // else문: 짝수 층 전용
//             if (h % 2 == 1) {
//                 for (int x = 1; x <= width; x ++) {
//                     if (num == count) {
//                         point = x;
//                     } 
                    
//                     if (x == point) {
//                         answer ++;
//                     }
                    
//                     if (count == n)
//                         break;
                    
//                     count ++;
//                 }
//             } else {
//                 for (int x = width; x >= 1; x --) {
//                     if (num == count) {
//                         point = x;
//                     }
                    
//                     if (x == point) {
//                         answer ++;
                        
//                     }
                    
//                     if (count == n)
//                         break;
                    
//                     count ++;
//                 }
//             }
//         }
//     }
}