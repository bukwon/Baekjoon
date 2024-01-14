import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        String[] array = new String[N];

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            array[i] = bf.readLine();
        }

        Arrays.sort(array, (String s1, String s2) -> s1.length() - s2.length());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (array[i].length() == array[j].length()) {
                    if (array[j].compareTo(array[i]) < 0) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    if (array[i].equals(array[j]) && !Objects.equals(array[j], "-1")) {
                        array[j] = "-1";
                    }
                }
            }
        }

        for (String word: array) {
            if (word.equals("-1")) continue;
            bw.write(word + "\n");
        }
        bw.flush(); bw.close(); bf.close();
    }
}