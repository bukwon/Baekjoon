import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 단어 하나 씩 검사 생성
        // 2. 대문자 알파벳 존재 시 우선 소문자로 반환하여 검사
        // 3. 가장 많이 나온 알파벳 대문자로 변환(+65)

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char[] temp = S.toCharArray();  // 알파벳 검사를 위해 문자열로 나누기
        int[] array = new int[26];    // 단어 속 알파벳 해당하는 것이 있다면 +1
        int max = 0;

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] >= 65 && temp[i] <= 90) temp[i] += 32;
            for (int j = 97; j <= 122; j++) {
                if(temp[i] == j) {array[j-97]++; break;}
            }
        }

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {max = array[i]; result = i;}
        }

        int checkCount = 0;
        for (int i = 0; i < array.length; i++) {
            if(max == array[i]) checkCount++;
        }

        if(checkCount >= 2) System.out.println("?");
        else System.out.println((char)(result+65));
    }
}