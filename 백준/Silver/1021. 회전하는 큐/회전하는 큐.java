import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) num[i] = sc.nextInt();
        System.out.println(solution(n, m, num));
    }

    private static int solution(int n, int m, int[] num) {
        int answer = 0;
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            deque1.add(i);
            deque2.add(i);
            arr[i] = i;
        }

        int[] left = new int[m];
        int[] right = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            int tmp = deque1.pollFirst();
            while (num[i] != tmp) {
                deque1.offerLast(tmp);
                count ++;
                tmp = deque1.pollFirst();
            }
            left[i] = count;
            count = 0;
        }

        count = 1;
        for (int i = 0; i < m; i++) {
            int tmp = deque2.pollLast();
            while (num[i] != tmp) {
                deque2.offerFirst(tmp);
                count ++;
                tmp = deque2.pollLast();
            }
            right[i] = count;
            count = 1;
        }

        for (int i = 0; i < m; i++) answer += Math.min(left[i], right[i]);
        return answer;
    }
}