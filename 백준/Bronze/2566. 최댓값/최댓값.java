import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int X = 0; //행
        int Y = 0;//열
        int max = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j]; X = i; Y = j;}
            }
        }
        System.out.println(max);
        System.out.println((X+1) + " " + (Y+1));
    }
}