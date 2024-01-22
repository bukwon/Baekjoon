import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        HashMap<String, String> array = new HashMap<String, String>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if (array.containsKey(name)) array.remove(name);
            else array.put(name, state);
        }
        ArrayList<String> list = new ArrayList<String>(array.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (String li : list) {
            bw.write(li + "\n");
        }
        bw.flush(); bw.close(); bf.close();
    }
}