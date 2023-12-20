import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
        String reverseStr1 = sb1.reverse().toString();
        String reverseStr2 = sb2.reverse().toString();
        int result = Math.max(Integer.parseInt(reverseStr1),Integer.parseInt(reverseStr2));
        System.out.println(result);
    }
}