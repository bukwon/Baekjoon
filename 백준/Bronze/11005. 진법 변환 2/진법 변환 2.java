import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer =
                new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        boolean end = false;
        List<Integer> list = new ArrayList<>();

        do {
            if (N < B) end = true;
            int value = N % B;
            list.add(value);
            N = N / B;
        } while(!end);

        int[] array = new int[list.size()];

        for (int i = list.size() - 1; i >= 0; i--) {
            array[i] = list.get(i);
            if (list.get(i) >= 10) {
                array[i] += 55;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] >= 10) System.out.print((char) array[i]);
            else System.out.print(array[i]);
        }
    }
}
// A = 10, B = 11, C = 12, ....., Z = 25