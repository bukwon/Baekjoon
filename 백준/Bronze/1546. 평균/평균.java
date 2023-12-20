import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] score = new double[N];
        double maxScore = score[0];
        double sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        for (double i: score) {
//            System.out.println(i);
            if (i > maxScore) maxScore = i;
        }
//        System.out.println(maxScore);

        for (int i = 0; i < score.length; i++) {
            score[i] = (((score[i]/maxScore))*100);
//            System.out.println(score[i]);
            sum += score[i];
        }
        sum /= N;
        String result = String.format("%.2f", sum);
        System.out.println(result);
    }
}

// 50 75 100