import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = String.valueOf(bf.readLine());
        boolean breakFlag = false;
        StringBuilder result = new StringBuilder();
        String[] divide = word.split("\\.");
        if (word.contains(".") && divide.length != 0) {
            for (int i = 0; i < divide.length; i++) {
                int wordLen = divide[i].length();
                while (true) {
                    if (wordLen >= 4) {
                        result.append("AAAA");
                        wordLen -= 4;
                    } else if (wordLen == 2) {
                        result.append("BB");
                        wordLen -= 2;
                    } else if (wordLen % 2 == 1) {
                        result = new StringBuilder("-1");
                        breakFlag = true;
                        break;
                    }
                    if (wordLen <= 0 || divide[i] == null) {
                        if ((i == divide.length - 1 && result.length() != word.length())) {
                            do {
                                result.append(".");
                            } while (word.length() != result.length());
                        }
                        if (result.length() == word.length()) {
                            breakFlag = true;
                            break;
                        }
                        result.append(".");
                        break;
                    }
                }
                if (breakFlag) break;
            }
        } else if (divide.length == 0 || word.contains(".")) {
            do {
                result.append(".");
            } while (word.length() != result.length());
        } else {
            int wordLen = word.length();
            while (true) {
                if (wordLen >= 4) {
                    result.append("AAAA");
                    wordLen -= 4;
                } else if (wordLen == 2) {
                    result.append("BB");
                    break;
                } else if (wordLen % 2 == 1) {
                    result = new StringBuilder("-1");
                    break;
                } else break;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        bf.close();
    }
}