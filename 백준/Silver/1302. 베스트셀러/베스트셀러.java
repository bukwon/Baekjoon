import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        HashMap<String, Integer> books = new HashMap<>();
        String result = "";

        for (int i = 0; i < N; i++) {
            String book = bf.readLine();
            if (books.containsKey(book)) {
                int num = books.get(book) + 1;
                books.replace(book, num);
            }
            else {
                books.put(book, 1);
            }
        }

        List<String> keySet = new ArrayList<>(books.keySet());
        Collections.sort(keySet);

        int compare = 0;
        for (String s : keySet) {
            if (books.get(s) > compare) {
                compare = books.get(s);
                result = s;
            }
        }
        System.out.println(result);
    }
}