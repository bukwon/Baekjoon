import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        long[] a = new long[n+1];
        st = new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++){
            a[i] = a[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<cnt;i++){
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k =  Integer.parseInt(st.nextToken());
            System.out.println(a[k]-a[j-1]);
        }


    }
}