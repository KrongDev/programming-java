import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class Silver4_10816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String num = st.nextToken();
            if(Objects.isNull(result.get(num))) result.put(num,1);
            else result.put(num, result.get(num) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            String num = st.nextToken();
            if (Objects.isNull(result.get(num))) sb.append(0).append(" ");
            else sb.append(result.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}
