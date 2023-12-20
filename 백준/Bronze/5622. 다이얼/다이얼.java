import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initNum = 0;
        String S = sc.nextLine();

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    initNum += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    initNum +=4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    initNum += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    initNum +=6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    initNum +=7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    initNum += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    initNum += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    initNum += 10;
                    break;
                default:
                    initNum += 2;
            }
        }
        System.out.println(initNum);
    }
}