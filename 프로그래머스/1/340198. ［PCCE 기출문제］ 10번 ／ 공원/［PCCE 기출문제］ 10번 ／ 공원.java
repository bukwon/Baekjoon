import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        int answer = 0;
        Set<Integer> available_mats = new HashSet<>();
        int n = park.length;
        int m = park[0].length;
        
        // 공원 y측 길이
        for (int i = 0; i < n; i ++) {
            // 공원 x측 길이
            for (int j = 0; j < m; j ++) {
                for (int mat = 0; mat < mats.length; mat ++) {
                    
                    int num = mats[mat];
                    int total = num*num;
                    int count = 0;
                    for (int x = i; x < i + num; x ++) {
                        for (int y = j; y < j + num; y ++) {
                            if (x < 0 || x >= n || y < 0 || y >= m) {
                                continue;
                                }
                            if (park[x][y].equals("-1")) {
                                count ++;
                            }
                        }
                    }
                    
                    if (count == total) {
                        available_mats.add(num);
                    }
                }
            }
        }
        
        if (available_mats.isEmpty()) {
            return -1;
        } else {
            List<Integer> list = new ArrayList<>(available_mats);
            Collections.sort(list, Collections.reverseOrder());
            
            return list.get(0);
        }
    }
}