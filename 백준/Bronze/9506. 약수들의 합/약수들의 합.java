import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list2 = new ArrayList<>();

        while(true) {
            List<Integer> list1 = new ArrayList<>();
            int n = sc.nextInt();
            int num1 = 0;
            if(n == -1) break;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    num1 += i;
                    list1.add(i);
                }
            }
            if (n == num1)  // n = 입력 값, num1 = 합
            {
                String result = n + " = ";
                for (int i = 0; i < list1.size(); i++) {
                    if(i  == list1.size()-1) result += String.valueOf(list1.get(i));
                    else result = result + String.valueOf(list1.get(i)) + " + ";
                }
                list2.add(result);
            }
            else list2.add(n + " is NOT perfect.");
        }

        for (String s : list2) {
            System.out.println(s);
        }
    }
}