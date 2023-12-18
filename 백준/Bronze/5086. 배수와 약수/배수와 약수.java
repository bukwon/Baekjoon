import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        List<Integer> list = new ArrayList<>();

        while(true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num1 == 0 && num2 == 0) break;
            result = calculator(num1, num2);
            list.add(result);
        }

        for (Integer integer : list) {
            System.out.println(resultNum(integer));
        }
    }
    static int calculator(int num1, int num2) {
        int result = 0;
        if(num1 < num2) {   // 첫 번째 숫자가 두 번째 숫자의 약수인 경우
            if (num2 % num1 == 0) result = 1;
            else result = 3;
        }
        else {
            if (num1 % num2 == 0) result = 2;
            else result = 3;
        }
        return result;
    }

    static String resultNum(int result) {
        String word = "";
        if (result == 1) word = "factor";
        else if(result == 2) word = "multiple";
        else word = "neither";
        return word;
    }
}