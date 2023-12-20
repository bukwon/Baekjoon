import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = num[0];
        int maxNum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
                maxNum = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxNum);
    }
}