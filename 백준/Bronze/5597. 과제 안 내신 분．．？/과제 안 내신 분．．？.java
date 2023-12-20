import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[28];
        int[] check = new int[30];
        int submit = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 30; i++) {
            check[i] = i + 1;
            for (int j = 0; j < n.length; j++) {
                if (check[i] == n[j]) submit++;
            }
            if (submit == 0) System.out.println(check[i]);
            submit = 0;
        }
    }
}