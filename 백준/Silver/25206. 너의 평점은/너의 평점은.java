import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Grade> array = new ArrayList<>();
        float tempResult = 0;
        float totalCourseScore = 0;

        for (int i = 0; i < 20; i++) {
            String courseName = sc.next();
            float courseScore = sc.nextFloat();
            String total = sc.next();

            Grade grade = new Grade(courseName, courseScore, total);
            if (!total.equals("P"))
                totalCourseScore += courseScore;
            array.add(grade);
        }

        for (int i = 0; i < array.size(); i++) {
            switch (array.get(i).total) {
                case "A+":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 4.5));
                    break;
                case "A0":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 4.0));
                    break;
                case "B+":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 3.5));
                    break;
                case "B0":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 3.0));
                    break;
                case "C+":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 2.5));
                    break;
                case "C0":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 2.0));
                    break;
                case "D+":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 1.5));
                    break;
                case "D0":
                    tempResult = (float) (tempResult + (array.get(i).courseScore * 1.0));
                    break;
                case "F":
                    break;
            }
        }
        float result = tempResult/totalCourseScore;
        System.out.println(String.format("%.6f", result));
    }
}

class Grade{
    String courseName;
    float courseScore;
    String total;

    Grade(String courseName, float courseScore, String total) {
        this.courseName = courseName;
        this.courseScore = courseScore;
        this.total = total;
    }
}