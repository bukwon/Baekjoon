import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i: scoville) Q.add(i);
        int tmp = 0, count = 0, answer = 0;
        while(Q.element() < K) {
            tmp = Q.remove() + (Q.remove() * 2);
            count ++;
            Q.add(tmp);
            if (Q.size() == 1) {
                if (Q.element() < K) return -1;
            }
        }
        answer = count;
        return answer;
    }
}