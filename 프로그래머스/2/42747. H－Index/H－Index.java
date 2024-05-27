import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int tmp =  citations.length - i;
            if (citations[i] >= tmp) {
                answer = tmp;
                break;
            }
        }
        return answer;
    }
}