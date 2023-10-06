import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class Silver510815 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        //
        Map<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (N --> 0) {
            map.put(st.nextToken(), 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (M --> 0) {
            if(Objects.isNull(map.get(st.nextToken()))) {
                sb.append("0");
            }
            else {
                sb.append("1");
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
