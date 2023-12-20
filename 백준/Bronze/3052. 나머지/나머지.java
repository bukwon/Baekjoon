import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 10;  // 같은 값 카운트 할 변수
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            num %= 42;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() ; j++) {
                if (i == j) continue;
                if (list.get(i) == list.get(j)) {
                    list.set(j, -1);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == -1) count --;
        }
        System.out.println(count);
    }
}