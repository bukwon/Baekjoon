// 배열 안에 순차적으로 숫자를 넣고
// i, j를 통해 숫자 자리를 바꾼다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 바구니 수
        int M = sc.nextInt();   // 시도 횟수
        int[] array = new int[N];
        int temp = 0;

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            temp = array[num1 - 1];
            array[num1 - 1] = array[num2 - 1];
            array[num2 - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}