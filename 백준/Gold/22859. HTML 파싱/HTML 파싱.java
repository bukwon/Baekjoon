import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        Matcher m1 = Pattern.compile("<div title=\"(\\w|_|\\s)*\"").matcher(s);
        Matcher m2 = Pattern.compile("<p>(\\w|\\s|</?[^p]>|</?\\w{2,}\\s?>|\\.)*</p>").matcher(s);

        Map<Integer, String> map = new HashMap<>();

        while (m1.find()) {
            String title = m1.group().split("\"")[1];
            map.put(m1.start(), "title : " + title + "\n");
        }

        while (m2.find()) {
            String p = m2.group().replaceAll("<[\\w\\s/]*>", "");
            String cleanedText = p.replaceAll("\\s{2,}", " ") + "\n";
            map.put(m2.start(), cleanedText);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (int i : list) {
            sb.append(map.get(i));
        }

        System.out.println(sb);
    }
}