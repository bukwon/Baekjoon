import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(bf.readLine()) ;
        int num = 2;
        int result = 2;
        list.add(result);
        for (int i = 0; i <= N; i++) {
            num = num + (int) Math.pow(2, i);
            result = (int)Math.pow(num,2);
            list.add(result);
        }
        System.out.println(list.get(N));
    }
}