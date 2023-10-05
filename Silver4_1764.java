import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver4_1764 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> result = new HashMap<>();
        while (N --> 0) {
            result.put(br.readLine(), 1);
        }

        List<String> list = new ArrayList<>();
        while (M --> 0) {
            String name = br.readLine();
            if(result.getOrDefault(name, 0) > 0) {
                list.add(name);
            }
        }

        list.sort(Comparator.naturalOrder());

        sb.append(list.size()).append("\n");

        for(String s: list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
