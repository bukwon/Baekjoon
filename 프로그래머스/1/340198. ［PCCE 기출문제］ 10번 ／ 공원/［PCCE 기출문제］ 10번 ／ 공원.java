import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        List<Integer> list = new ArrayList<>(); // 어떤 돗자리가 제일 큰지 저장하는 공간
        
        // 공원 크기
        int n = park.length;
        int m = park[0].length;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                // 펼 수 있는 돗자리의 자리 탐색
                if (park[i][j].equals("-1")) {
                    for(int k = 0; k < mats.length; k++) {
                        int num = mats[k];
                        int count = 0;
                        for (int x = i; x < i + num; x++) {
                            for (int y = j; y < j + num; y ++) {
                                if (x < 0 || x >= n || y < 0 || y >= m) {
                                    continue;
                                }
                                if (park[x][y].equals("-1")) {
                                    count ++;
                                }
                            }
                        }
                        // 한 셀 기준으로 탐색하며
                        // 돗자리 크기와 한 셀 기준으로 탐색한 n*m의 크기가 같다면 list에 삽입
                        if (count == num*num) {
                            list.add(num);
                        }
                    }
                }
            }
        }
        
        if (list.size() == 0) {
            return -1;
        } else {
            Collections.sort(list);
            answer = list.get(list.size() - 1);
        }
        
        return answer;
    }
}