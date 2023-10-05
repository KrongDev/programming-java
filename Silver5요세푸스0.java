import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver5요세푸스0 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        //
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        sb.append("<");

        for (int i = 1; i<=N; i++) {
            if(i==K) {

                sb.append(i);
                continue;
            }
            queue.add(i);
        }
        for (int j = 0; j < K-1; j++) {
            queue.add(queue.poll());
        }
        int j = 0;
        while (!queue.isEmpty()) {
            j++;
            if(j == K) {
                int poll = queue.poll();
                sb.append(", ").append(poll);
                j = 0;
                continue;
            }
            queue.add(queue.poll());
        }
        sb.append(">");
        System.out.println(sb);
    }

}
