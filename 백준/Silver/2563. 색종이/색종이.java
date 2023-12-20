import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[100][100];
        int result = 0;

        int x;
        int y;
        int count = 0;
        int num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }

        while (count < num) {
            x = sc.nextInt();
            y = sc.nextInt();
            int size_x = 0;
            for (int i = 0; i < array.length; i++) {
                int size_y = 0;
                boolean inputCheck = false;
                for (int j = 0; j < array[i].length; j++) {
                    if (i >= y && j >= x && size_x < 10 && size_y < 10) {
                        array[i][j]++;
                        size_y++;
                        inputCheck = true;
                    }
                }
                if (inputCheck) size_x++;
            }
            count++;
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (array[i][j] >= 1) result++;
            }
        }
        System.out.println(result);
    }
}